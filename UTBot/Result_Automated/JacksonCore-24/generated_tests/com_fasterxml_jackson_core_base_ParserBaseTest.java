package com.fasterxml.jackson.core.base;

import org.junit.Test;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Reader;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.util.RequestPayload;
import com.fasterxml.jackson.core.json.DupDetector;
import java.io.DataInput;
import java.util.HashSet;
import java.io.InputStream;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonParseException;
import java.util.LinkedList;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_base_ParserBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.version
    
    ///region Errors report for version
    
    public void testVersion_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#close()}
 * @utbot.executesCondition {@code (!_closed): False}
 *  */
    @Test
    public void testClose__closed() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._closed = true;
        
        uTF8DataInputJsonParser.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!_closed): True}
    /// invoke:
    ///     {@link java.lang.Math#max(int,int)} twice,
    ///     {@link com.fasterxml.jackson.core.base.ParserBase#_closeInput()} twice,
    ///     {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ByteQuadsCanonicalizer _symbols = ((ByteQuadsCanonicalizer) createInstance("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols", _symbols);
        uTF8DataInputJsonParser._inputPtr = 255;
        uTF8DataInputJsonParser._inputEnd = 256;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        uTF8DataInputJsonParser.close();
        
        boolean finalUTF8DataInputJsonParser_closed = uTF8DataInputJsonParser._closed;
        int finalUTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        
        assertTrue(finalUTF8DataInputJsonParser_closed);
        
        assertEquals(256, finalUTF8DataInputJsonParser_inputPtr);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ByteQuadsCanonicalizer _symbols = ((ByteQuadsCanonicalizer) createInstance("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(_symbols, "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer", "_parent", _symbols);
        setField(_symbols, "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer", "_hashShared", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols", _symbols);
        uTF8DataInputJsonParser._inputPtr = 255;
        uTF8DataInputJsonParser._inputEnd = 256;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = new char[11][];
        _charBuffers[0] = ((char[]) null);
        _charBuffers[1] = ((char[]) null);
        _charBuffers[2] = ((char[]) null);
        _charBuffers[3] = ((char[]) null);
        _charBuffers[4] = ((char[]) null);
        _charBuffers[5] = ((char[]) null);
        _charBuffers[6] = ((char[]) null);
        _charBuffers[7] = ((char[]) null);
        _charBuffers[8] = ((char[]) null);
        _charBuffers[9] = ((char[]) null);
        _charBuffers[10] = ((char[]) null);
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        TextBuffer textBuffer = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] initialUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer_textBuffer_allocator_textBuffer_allocator_charBuffers, 2));
        
        uTF8DataInputJsonParser.close();
        
        boolean finalUTF8DataInputJsonParser_closed = uTF8DataInputJsonParser._closed;
        int finalUTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        TextBuffer textBuffer1 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer1_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer1, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer1_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer1_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers0 = ((char[]) get(textBuffer1_textBuffer_allocator_textBuffer_allocator_charBuffers, 0));
        TextBuffer textBuffer2 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer2_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer2, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer2_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer2_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers1 = ((char[]) get(textBuffer2_textBuffer_allocator_textBuffer_allocator_charBuffers, 1));
        TextBuffer textBuffer3 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer3_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer3, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer3_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer3_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer3_textBuffer_allocator_textBuffer_allocator_charBuffers, 2));
        TextBuffer textBuffer4 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer4_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer4, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer4_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer4_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers3 = ((char[]) get(textBuffer4_textBuffer_allocator_textBuffer_allocator_charBuffers, 3));
        TextBuffer textBuffer5 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer5_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer5, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer5_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer5_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers4 = ((char[]) get(textBuffer5_textBuffer_allocator_textBuffer_allocator_charBuffers, 4));
        TextBuffer textBuffer6 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer6_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer6, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer6_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer6_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers5 = ((char[]) get(textBuffer6_textBuffer_allocator_textBuffer_allocator_charBuffers, 5));
        TextBuffer textBuffer7 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer7_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer7, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer7_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer7_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers6 = ((char[]) get(textBuffer7_textBuffer_allocator_textBuffer_allocator_charBuffers, 6));
        TextBuffer textBuffer8 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer8_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer8, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer8_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer8_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers7 = ((char[]) get(textBuffer8_textBuffer_allocator_textBuffer_allocator_charBuffers, 7));
        TextBuffer textBuffer9 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer9_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer9, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer9_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer9_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers8 = ((char[]) get(textBuffer9_textBuffer_allocator_textBuffer_allocator_charBuffers, 8));
        TextBuffer textBuffer10 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer10_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer10, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer10_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer10_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers9 = ((char[]) get(textBuffer10_textBuffer_allocator_textBuffer_allocator_charBuffers, 9));
        TextBuffer textBuffer11 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer11_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer11, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer11_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer11_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers10 = ((char[]) get(textBuffer11_textBuffer_allocator_textBuffer_allocator_charBuffers, 10));
        TextBuffer textBuffer12 = uTF8DataInputJsonParser._textBuffer;
        int finalUTF8DataInputJsonParser_textBuffer_inputStart = ((Integer) getFieldValue(textBuffer12, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        TextBuffer textBuffer13 = uTF8DataInputJsonParser._textBuffer;
        char[] finalUTF8DataInputJsonParser_textBuffer_currentSegment = ((char[]) getFieldValue(textBuffer13, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2 == finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2);
        
        assertTrue(finalUTF8DataInputJsonParser_closed);
        
        assertEquals(256, finalUTF8DataInputJsonParser_inputPtr);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers0);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers1);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers3);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers4);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers5);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers6);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers7);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers8);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers9);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers10);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_textBuffer_inputStart);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_currentSegment);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ByteQuadsCanonicalizer _symbols = ((ByteQuadsCanonicalizer) createInstance("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols", _symbols);
        uTF8DataInputJsonParser._inputPtr = 255;
        uTF8DataInputJsonParser._inputEnd = 256;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        uTF8DataInputJsonParser.close();
        
        boolean finalUTF8DataInputJsonParser_closed = uTF8DataInputJsonParser._closed;
        int finalUTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        TextBuffer textBuffer = uTF8DataInputJsonParser._textBuffer;
        int finalUTF8DataInputJsonParser_textBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        
        assertTrue(finalUTF8DataInputJsonParser_closed);
        
        assertEquals(256, finalUTF8DataInputJsonParser_inputPtr);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_textBuffer_inputStart);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ByteQuadsCanonicalizer _symbols = ((ByteQuadsCanonicalizer) createInstance("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols", _symbols);
        uTF8DataInputJsonParser._inputPtr = 255;
        uTF8DataInputJsonParser._inputEnd = 256;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = new char[11][];
        _charBuffers[0] = ((char[]) null);
        _charBuffers[1] = ((char[]) null);
        _charBuffers[2] = ((char[]) null);
        _charBuffers[3] = ((char[]) null);
        _charBuffers[4] = ((char[]) null);
        _charBuffers[5] = ((char[]) null);
        _charBuffers[6] = ((char[]) null);
        _charBuffers[7] = ((char[]) null);
        _charBuffers[8] = ((char[]) null);
        _charBuffers[9] = ((char[]) null);
        _charBuffers[10] = ((char[]) null);
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        TextBuffer textBuffer = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] initialUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer_textBuffer_allocator_textBuffer_allocator_charBuffers, 2));
        
        uTF8DataInputJsonParser.close();
        
        boolean finalUTF8DataInputJsonParser_closed = uTF8DataInputJsonParser._closed;
        int finalUTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        TextBuffer textBuffer1 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer1_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer1, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer1_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer1_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers0 = ((char[]) get(textBuffer1_textBuffer_allocator_textBuffer_allocator_charBuffers, 0));
        TextBuffer textBuffer2 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer2_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer2, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer2_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer2_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers1 = ((char[]) get(textBuffer2_textBuffer_allocator_textBuffer_allocator_charBuffers, 1));
        TextBuffer textBuffer3 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer3_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer3, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer3_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer3_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer3_textBuffer_allocator_textBuffer_allocator_charBuffers, 2));
        TextBuffer textBuffer4 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer4_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer4, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer4_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer4_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers3 = ((char[]) get(textBuffer4_textBuffer_allocator_textBuffer_allocator_charBuffers, 3));
        TextBuffer textBuffer5 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer5_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer5, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer5_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer5_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers4 = ((char[]) get(textBuffer5_textBuffer_allocator_textBuffer_allocator_charBuffers, 4));
        TextBuffer textBuffer6 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer6_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer6, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer6_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer6_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers5 = ((char[]) get(textBuffer6_textBuffer_allocator_textBuffer_allocator_charBuffers, 5));
        TextBuffer textBuffer7 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer7_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer7, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer7_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer7_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers6 = ((char[]) get(textBuffer7_textBuffer_allocator_textBuffer_allocator_charBuffers, 6));
        TextBuffer textBuffer8 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer8_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer8, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer8_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer8_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers7 = ((char[]) get(textBuffer8_textBuffer_allocator_textBuffer_allocator_charBuffers, 7));
        TextBuffer textBuffer9 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer9_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer9, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer9_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer9_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers8 = ((char[]) get(textBuffer9_textBuffer_allocator_textBuffer_allocator_charBuffers, 8));
        TextBuffer textBuffer10 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer10_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer10, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer10_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer10_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers9 = ((char[]) get(textBuffer10_textBuffer_allocator_textBuffer_allocator_charBuffers, 9));
        TextBuffer textBuffer11 = uTF8DataInputJsonParser._textBuffer;
        BufferRecycler textBuffer11_textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer11, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer11_textBuffer_allocator_textBuffer_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer11_textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers10 = ((char[]) get(textBuffer11_textBuffer_allocator_textBuffer_allocator_charBuffers, 10));
        TextBuffer textBuffer12 = uTF8DataInputJsonParser._textBuffer;
        int finalUTF8DataInputJsonParser_textBuffer_inputStart = ((Integer) getFieldValue(textBuffer12, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        TextBuffer textBuffer13 = uTF8DataInputJsonParser._textBuffer;
        char[] finalUTF8DataInputJsonParser_textBuffer_currentSegment = ((char[]) getFieldValue(textBuffer13, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2 == finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers2);
        
        assertTrue(finalUTF8DataInputJsonParser_closed);
        
        assertEquals(256, finalUTF8DataInputJsonParser_inputPtr);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers0);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers1);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers3);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers4);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers5);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers6);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers7);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers8);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers9);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_allocator_charBuffers10);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_textBuffer_inputStart);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_currentSegment);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.invokes {@link java.lang.Math#max(int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_closeInput()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._inputPtr = 26;
        uTF8DataInputJsonParser._inputEnd = 26;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.close] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty(TextBuffer.java:166)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:141)
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:469)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._releaseBuffers(UTF8DataInputJsonParser.java:176)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:373) */
        uTF8DataInputJsonParser.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isNaN()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#isNaN()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) != 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN__numTypesValidBitwiseAndNR_DOUBLEEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#isNaN()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN__currTokenNotEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isNaN()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_currToken == JsonToken.VALUE_NUMBER_FLOAT): True},
    ///     {@code ((_numTypesValid & NR_DOUBLE) != 0): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} once
    /// return from: {@code return Double.isNaN(d) || Double.isInfinite(d);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(d) || Double.isInfinite(d);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsInfinite() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -247;
        uTF8StreamJsonParser._numberDouble = java.lang.Double.NaN;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(d) || Double.isInfinite(d);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsInfinite_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -247;
        uTF8StreamJsonParser._numberDouble = java.lang.Double.NEGATIVE_INFINITY;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(d) || Double.isInfinite(d);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsInfinite_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -247;
        uTF8StreamJsonParser._numberDouble = -2.0000000000000004;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset(boolean, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#reset(boolean,int,int,int)}
 * @utbot.executesCondition {@code (fractLen < 1): True}
 * @utbot.executesCondition {@code (expLen < 1): False}
 * @utbot.returnsFrom {@code return resetFloat(negative, intLen, fractLen, expLen);}
 *  */
    @Test
    public void testReset_ExpLenGreaterOrEqual1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        JsonToken actual = readerBasedJsonParser.reset(false, -254, 0, 1);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_FLOAT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        int finalReaderBasedJsonParser_expLength = readerBasedJsonParser._expLength;
        
        assertEquals(-254, finalReaderBasedJsonParser_intLength);
        
        assertEquals(1, finalReaderBasedJsonParser_expLength);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#reset(boolean,int,int,int)}
 * @utbot.executesCondition {@code (fractLen < 1): False}
 * @utbot.returnsFrom {@code return resetFloat(negative, intLen, fractLen, expLen);}
 *  */
    @Test
    public void testReset_FractLenGreaterOrEqual1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = -254;
        uTF8DataInputJsonParser._intLength = -254;
        uTF8DataInputJsonParser._fractLength = -255;
        uTF8DataInputJsonParser._expLength = 1;
        
        JsonToken actual = uTF8DataInputJsonParser.reset(false, -255, 1, 1);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_FLOAT;
        
        assertEquals(expected, actual);
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int finalUTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int finalUTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        
        assertEquals(0, finalUTF8DataInputJsonParser_numTypesValid);
        
        assertEquals(-255, finalUTF8DataInputJsonParser_intLength);
        
        assertEquals(1, finalUTF8DataInputJsonParser_fractLength);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#reset(boolean,int,int,int)}
 * @utbot.executesCondition {@code (fractLen < 1): True}
 * @utbot.executesCondition {@code (expLen < 1): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#resetInt(boolean,int)}
 * @utbot.returnsFrom {@code return resetInt(negative, intLen);}
 *  */
    @Test
    public void testReset_ExpLenLessThan1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        JsonToken actual = readerBasedJsonParser.reset(false, 1, 0, 0);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        
        assertEquals(1, finalReaderBasedJsonParser_intLength);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.enable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enable(com.fasterxml.jackson.core.JsonParser$Feature)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#enable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FNotEqualsFeatureSTRICT_DUPLICATE_DETECTION() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        JsonParser.Feature feature = JsonParser.Feature.AUTO_CLOSE_SOURCE;
        
        ReaderBasedJsonParser actual = ((ReaderBasedJsonParser) readerBasedJsonParser.enable(feature));
        
        Reader actual_reader = ((Reader) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actual_reader);
        
        char[] actual_inputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        CharsToNameCanonicalizer actual_symbols = ((CharsToNameCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int readerBasedJsonParser_hashSeed = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actual_hashSeed = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(readerBasedJsonParser_hashSeed, actual_hashSeed);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        long readerBasedJsonParser_nameStartOffset = ((Long) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        long actual_nameStartOffset = ((Long) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        assertEquals(readerBasedJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int readerBasedJsonParser_nameStartRow = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        assertEquals(readerBasedJsonParser_nameStartRow, actual_nameStartRow);
        
        int readerBasedJsonParser_nameStartCol = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        assertEquals(readerBasedJsonParser_nameStartCol, actual_nameStartCol);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int readerBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(readerBasedJsonParser_inputPtr, actual_inputPtr);
        
        int readerBasedJsonParser_inputEnd = readerBasedJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(readerBasedJsonParser_inputEnd, actual_inputEnd);
        
        long readerBasedJsonParser_currInputProcessed = readerBasedJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(readerBasedJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int readerBasedJsonParser_currInputRow = readerBasedJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(readerBasedJsonParser_currInputRow, actual_currInputRow);
        
        int readerBasedJsonParser_currInputRowStart = readerBasedJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(readerBasedJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long readerBasedJsonParser_tokenInputTotal = readerBasedJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(readerBasedJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int readerBasedJsonParser_tokenInputRow = readerBasedJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(readerBasedJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int readerBasedJsonParser_tokenInputCol = readerBasedJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(readerBasedJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int readerBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(readerBasedJsonParser_numTypesValid, actual_numTypesValid);
        
        int readerBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(readerBasedJsonParser_numberInt, actual_numberInt);
        
        long readerBasedJsonParser_numberLong = readerBasedJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(readerBasedJsonParser_numberLong, actual_numberLong);
        
        double readerBasedJsonParser_numberDouble = readerBasedJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(readerBasedJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int readerBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(readerBasedJsonParser_intLength, actual_intLength);
        
        int readerBasedJsonParser_fractLength = readerBasedJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(readerBasedJsonParser_fractLength, actual_fractLength);
        
        int readerBasedJsonParser_expLength = readerBasedJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(readerBasedJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int readerBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(readerBasedJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#enable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.executesCondition {@code (_parsingContext.getDupDetector() == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable__parsingContextGetDupDetectorNotEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -254);
        JsonParser.Feature feature = JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.enable(feature));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector uTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        Object actual_parsingContext_dups_source = getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        assertNull(actual_parsingContext_dups_source);
        
        String actual_parsingContext_dups_firstName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
        assertNull(actual_parsingContext_dups_firstName);
        
        String actual_parsingContext_dups_secondName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
        assertNull(actual_parsingContext_dups_secondName);
        
        HashSet actual_parsingContext_dups_seen = ((HashSet) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
        assertNull(actual_parsingContext_dups_seen);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8DataInputJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8DataInputJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_index, actual_parsingContext_index);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#enable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.executesCondition {@code (_parsingContext.getDupDetector() == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#rootDetector(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable__parsingContextGetDupDetectorEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        JsonParser.Feature feature = JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
        
        JsonReadContext jsonReadContext = uTF8StreamJsonParser._parsingContext;
        DupDetector initialUTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        UTF8StreamJsonParser actual = ((UTF8StreamJsonParser) uTF8StreamJsonParser.enable(feature));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8StreamJsonParser_quad1 = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(uTF8StreamJsonParser_quad1, actual_quad1);
        
        int uTF8StreamJsonParser_nameStartOffset = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        int actual_nameStartOffset = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        assertEquals(uTF8StreamJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int uTF8StreamJsonParser_nameStartRow = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        assertEquals(uTF8StreamJsonParser_nameStartRow, actual_nameStartRow);
        
        int uTF8StreamJsonParser_nameStartCol = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        assertEquals(uTF8StreamJsonParser_nameStartCol, actual_nameStartCol);
        
        InputStream actual_inputStream = ((InputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_inputStream);
        
        byte[] actual_inputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8StreamJsonParser_inputPtr = uTF8StreamJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8StreamJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8StreamJsonParser_inputEnd = uTF8StreamJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8StreamJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8StreamJsonParser_currInputProcessed = uTF8StreamJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8StreamJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8StreamJsonParser_currInputRow = uTF8StreamJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8StreamJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8StreamJsonParser_currInputRowStart = uTF8StreamJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8StreamJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8StreamJsonParser_tokenInputTotal = uTF8StreamJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8StreamJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8StreamJsonParser_tokenInputRow = uTF8StreamJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8StreamJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8StreamJsonParser_tokenInputCol = uTF8StreamJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8StreamJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8StreamJsonParser_parsingContext = uTF8StreamJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector uTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        Object uTF8StreamJsonParser_parsingContext_dups_source = getFieldValue(uTF8StreamJsonParser_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        Object actual_parsingContext_dups_source = getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        JsonToken actual_parsingContext_dups_source_nextToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actual_parsingContext_dups_source_nextToken);
        
        TextBuffer actual_parsingContext_dups_source_textBuffer = ((TextBuffer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actual_parsingContext_dups_source_textBuffer);
        
        char[] actual_parsingContext_dups_source_nameCopyBuffer = ((char[]) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actual_parsingContext_dups_source_nameCopyBuffer);
        
        boolean actual_parsingContext_dups_source_nameCopied = ((Boolean) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actual_parsingContext_dups_source_nameCopied);
        
        ByteArrayBuilder actual_parsingContext_dups_source_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actual_parsingContext_dups_source_byteArrayBuilder);
        
        byte[] actual_parsingContext_dups_source_binaryValue = ((byte[]) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actual_parsingContext_dups_source_binaryValue);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_numTypesValid = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actual_parsingContext_dups_source_numTypesValid = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numTypesValid, actual_parsingContext_dups_source_numTypesValid);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_numberInt = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actual_parsingContext_dups_source_numberInt = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numberInt, actual_parsingContext_dups_source_numberInt);
        
        long uTF8StreamJsonParser_parsingContext_dups_source_numberLong = ((Long) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actual_parsingContext_dups_source_numberLong = ((Long) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numberLong, actual_parsingContext_dups_source_numberLong);
        
        double uTF8StreamJsonParser_parsingContext_dups_source_numberDouble = ((Double) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actual_parsingContext_dups_source_numberDouble = ((Double) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numberDouble, actual_parsingContext_dups_source_numberDouble, 1.0E-6);
        
        BigInteger actual_parsingContext_dups_source_numberBigInt = ((BigInteger) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actual_parsingContext_dups_source_numberBigInt);
        
        BigDecimal actual_parsingContext_dups_source_numberBigDecimal = ((BigDecimal) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actual_parsingContext_dups_source_numberBigDecimal);
        
        boolean actual_parsingContext_dups_source_numberNegative = ((Boolean) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actual_parsingContext_dups_source_numberNegative);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_intLength = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actual_parsingContext_dups_source_intLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_intLength, actual_parsingContext_dups_source_intLength);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_fractLength = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actual_parsingContext_dups_source_fractLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_fractLength, actual_parsingContext_dups_source_fractLength);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_expLength = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actual_parsingContext_dups_source_expLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_expLength, actual_parsingContext_dups_source_expLength);
        
        JsonToken actual_parsingContext_dups_source_currToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_parsingContext_dups_source_currToken);
        
        JsonToken actual_parsingContext_dups_source_lastClearedToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_parsingContext_dups_source_lastClearedToken);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_features = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_parsingContext_dups_source_features = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_features, actual_parsingContext_dups_source_features);
        
        RequestPayload actual_parsingContext_dups_source_requestPayload = ((RequestPayload) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_parsingContext_dups_source_requestPayload);
        
        String actual_parsingContext_dups_firstName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
        assertNull(actual_parsingContext_dups_firstName);
        
        String actual_parsingContext_dups_secondName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
        assertNull(actual_parsingContext_dups_secondName);
        
        HashSet actual_parsingContext_dups_seen = ((HashSet) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
        assertNull(actual_parsingContext_dups_seen);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8StreamJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8StreamJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8StreamJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8StreamJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8StreamJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8StreamJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8StreamJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8StreamJsonParser_parsingContext_index, actual_parsingContext_index);
        
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        
        JsonReadContext jsonReadContext1 = uTF8StreamJsonParser._parsingContext;
        DupDetector finalUTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext1, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        assertFalse(initialUTF8StreamJsonParser_parsingContext_dups == finalUTF8StreamJsonParser_parsingContext_dups);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enable(com.fasterxml.jackson.core.JsonParser$Feature)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#enable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _features |= f.getMask();
 *  */
    @Test
    public void testEnable_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.enable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.enable(ParserBase.java:261) */
        uTF8DataInputJsonParser.enable(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#enable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser.Feature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getDupDetector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.getDupDetector() == null
 *  */
    @Test
    public void testEnable_ThrowNullPointerException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        JsonParser.Feature feature = JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.enable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.enable(ParserBase.java:263) */
        uTF8StreamJsonParser.enable(feature);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.disable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method disable(com.fasterxml.jackson.core.JsonParser$Feature)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#disable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_FNotEqualsFeatureSTRICT_DUPLICATE_DETECTION() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        JsonParser.Feature feature = JsonParser.Feature.AUTO_CLOSE_SOURCE;
        
        ReaderBasedJsonParser actual = ((ReaderBasedJsonParser) readerBasedJsonParser.disable(feature));
        
        Reader actual_reader = ((Reader) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actual_reader);
        
        char[] actual_inputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        CharsToNameCanonicalizer actual_symbols = ((CharsToNameCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int readerBasedJsonParser_hashSeed = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actual_hashSeed = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(readerBasedJsonParser_hashSeed, actual_hashSeed);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        long readerBasedJsonParser_nameStartOffset = ((Long) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        long actual_nameStartOffset = ((Long) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        assertEquals(readerBasedJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int readerBasedJsonParser_nameStartRow = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        assertEquals(readerBasedJsonParser_nameStartRow, actual_nameStartRow);
        
        int readerBasedJsonParser_nameStartCol = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        assertEquals(readerBasedJsonParser_nameStartCol, actual_nameStartCol);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int readerBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(readerBasedJsonParser_inputPtr, actual_inputPtr);
        
        int readerBasedJsonParser_inputEnd = readerBasedJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(readerBasedJsonParser_inputEnd, actual_inputEnd);
        
        long readerBasedJsonParser_currInputProcessed = readerBasedJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(readerBasedJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int readerBasedJsonParser_currInputRow = readerBasedJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(readerBasedJsonParser_currInputRow, actual_currInputRow);
        
        int readerBasedJsonParser_currInputRowStart = readerBasedJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(readerBasedJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long readerBasedJsonParser_tokenInputTotal = readerBasedJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(readerBasedJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int readerBasedJsonParser_tokenInputRow = readerBasedJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(readerBasedJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int readerBasedJsonParser_tokenInputCol = readerBasedJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(readerBasedJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int readerBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(readerBasedJsonParser_numTypesValid, actual_numTypesValid);
        
        int readerBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(readerBasedJsonParser_numberInt, actual_numberInt);
        
        long readerBasedJsonParser_numberLong = readerBasedJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(readerBasedJsonParser_numberLong, actual_numberLong);
        
        double readerBasedJsonParser_numberDouble = readerBasedJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(readerBasedJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int readerBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(readerBasedJsonParser_intLength, actual_intLength);
        
        int readerBasedJsonParser_fractLength = readerBasedJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(readerBasedJsonParser_fractLength, actual_fractLength);
        
        int readerBasedJsonParser_expLength = readerBasedJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(readerBasedJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int readerBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(readerBasedJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalReaderBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertEquals(-256, finalReaderBasedJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#disable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_FEqualsFeatureSTRICT_DUPLICATE_DETECTION() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        JsonParser.Feature feature = JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.disable(feature));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8DataInputJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8DataInputJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_index, actual_parsingContext_index);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalUTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertEquals(-2303, finalUTF8DataInputJsonParser_features);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method disable(com.fasterxml.jackson.core.JsonParser$Feature)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#disable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _features &= ~f.getMask();
 *  */
    @Test
    public void testDisable_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.disable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.disable(ParserBase.java:272) */
        uTF8DataInputJsonParser.disable(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#disable(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser.Feature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.withDupDetector(null);
 *  */
    @Test
    public void testDisable_ThrowNullPointerException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        JsonParser.Feature feature = JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.disable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.disable(ParserBase.java:274) */
        uTF8StreamJsonParser.disable(feature);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getCurrentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getCurrentValue()}
 * @utbot.returnsFrom {@code return _parsingContext.getCurrentValue();}
 *  */
    @Test
    public void testGetCurrentValue_JsonReadContextGetCurrentValue() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        Object actual = readerBasedJsonParser.getCurrentValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getCurrentValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parsingContext.getCurrentValue();
 *  */
    @Test
    public void testGetCurrentValue_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getCurrentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentValue(ParserBase.java:245) */
        uTF8DataInputJsonParser.getCurrentValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.setCurrentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setCurrentValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#setCurrentValue(java.lang.Object)}
 *  */
    @Test
    public void testSetCurrentValue_JsonReadContextSetCurrentValue() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        
        uTF8StreamJsonParser.setCurrentValue(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCurrentValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setCurrentValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#setCurrentValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setCurrentValue(v);
 *  */
    @Test
    public void testSetCurrentValue_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.setCurrentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.setCurrentValue(ParserBase.java:250) */
        uTF8DataInputJsonParser.setCurrentValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getTokenLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getTokenLocation()}
 * @utbot.returnsFrom {@code return new JsonLocation(_getSourceReference(), // bytes, chars
 * -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());}
 *  */
    @Test
    public void testGetTokenLocation_Return() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._tokenInputTotal = 8L;
        nonBlockingJsonParser._tokenInputRow = 4;
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 1);
        
        JsonLocation actual = nonBlockingJsonParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, 8L, -1L, 4, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getTokenLocation()}
 * @utbot.returnsFrom {@code return new JsonLocation(_getSourceReference(), // bytes, chars
 * -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());}
 *  */
    @Test
    public void testGetTokenLocation_Return_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        nonBlockingJsonParser._tokenInputTotal = 0L;
        nonBlockingJsonParser._tokenInputCol = -1;
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        JsonLocation actual = nonBlockingJsonParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, 0L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentLocation()}
 * @utbot.returnsFrom {@code return new JsonLocation(_getSourceReference(), // bytes, chars
 * -1L, _currInputProcessed + _inputPtr, _currInputRow, col);}
 *  */
    @Test
    public void testGetCurrentLocation_Return_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._inputPtr = -4;
        nonBlockingJsonParser._currInputProcessed = -9223372036854775807L;
        nonBlockingJsonParser._currInputRowStart = -2;
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 1);
        
        JsonLocation actual = nonBlockingJsonParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 9223372036854775805L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentLocation()}
 * @utbot.returnsFrom {@code return new JsonLocation(_getSourceReference(), // bytes, chars
 * -1L, _currInputProcessed + _inputPtr, _currInputRow, col);}
 *  */
    @Test
    public void testGetCurrentLocation_Return() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        nonBlockingJsonParser._inputPtr = -4;
        nonBlockingJsonParser._currInputProcessed = 1L;
        nonBlockingJsonParser._currInputRowStart = -2;
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -256);
        
        JsonLocation actual = nonBlockingJsonParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -3L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.setFeatureMask
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFeatureMask(int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changes != 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangesEqualsZero() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.setFeatureMask(-255));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changes != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangesNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        UTF8StreamJsonParser actual = ((UTF8StreamJsonParser) uTF8StreamJsonParser.setFeatureMask(-2));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8StreamJsonParser_quad1 = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(uTF8StreamJsonParser_quad1, actual_quad1);
        
        int uTF8StreamJsonParser_nameStartOffset = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        int actual_nameStartOffset = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        assertEquals(uTF8StreamJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int uTF8StreamJsonParser_nameStartRow = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        assertEquals(uTF8StreamJsonParser_nameStartRow, actual_nameStartRow);
        
        int uTF8StreamJsonParser_nameStartCol = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        assertEquals(uTF8StreamJsonParser_nameStartCol, actual_nameStartCol);
        
        InputStream actual_inputStream = ((InputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_inputStream);
        
        byte[] actual_inputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8StreamJsonParser_inputPtr = uTF8StreamJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8StreamJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8StreamJsonParser_inputEnd = uTF8StreamJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8StreamJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8StreamJsonParser_currInputProcessed = uTF8StreamJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8StreamJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8StreamJsonParser_currInputRow = uTF8StreamJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8StreamJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8StreamJsonParser_currInputRowStart = uTF8StreamJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8StreamJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8StreamJsonParser_tokenInputTotal = uTF8StreamJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8StreamJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8StreamJsonParser_tokenInputRow = uTF8StreamJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8StreamJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8StreamJsonParser_tokenInputCol = uTF8StreamJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8StreamJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8StreamJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8StreamJsonParser_numberInt, actual_numberInt);
        
        long uTF8StreamJsonParser_numberLong = uTF8StreamJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8StreamJsonParser_numberLong, actual_numberLong);
        
        double uTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8StreamJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8StreamJsonParser_intLength = uTF8StreamJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8StreamJsonParser_intLength, actual_intLength);
        
        int uTF8StreamJsonParser_fractLength = uTF8StreamJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8StreamJsonParser_fractLength, actual_fractLength);
        
        int uTF8StreamJsonParser_expLength = uTF8StreamJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8StreamJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8StreamJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalUTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertEquals(-2, finalUTF8StreamJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changes != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangesNotEqualsZero_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        UTF8StreamJsonParser actual = ((UTF8StreamJsonParser) uTF8StreamJsonParser.setFeatureMask(254));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8StreamJsonParser_quad1 = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(uTF8StreamJsonParser_quad1, actual_quad1);
        
        int uTF8StreamJsonParser_nameStartOffset = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        int actual_nameStartOffset = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        assertEquals(uTF8StreamJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int uTF8StreamJsonParser_nameStartRow = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        assertEquals(uTF8StreamJsonParser_nameStartRow, actual_nameStartRow);
        
        int uTF8StreamJsonParser_nameStartCol = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        assertEquals(uTF8StreamJsonParser_nameStartCol, actual_nameStartCol);
        
        InputStream actual_inputStream = ((InputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_inputStream);
        
        byte[] actual_inputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8StreamJsonParser_inputPtr = uTF8StreamJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8StreamJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8StreamJsonParser_inputEnd = uTF8StreamJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8StreamJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8StreamJsonParser_currInputProcessed = uTF8StreamJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8StreamJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8StreamJsonParser_currInputRow = uTF8StreamJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8StreamJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8StreamJsonParser_currInputRowStart = uTF8StreamJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8StreamJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8StreamJsonParser_tokenInputTotal = uTF8StreamJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8StreamJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8StreamJsonParser_tokenInputRow = uTF8StreamJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8StreamJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8StreamJsonParser_tokenInputCol = uTF8StreamJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8StreamJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8StreamJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8StreamJsonParser_numberInt, actual_numberInt);
        
        long uTF8StreamJsonParser_numberLong = uTF8StreamJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8StreamJsonParser_numberLong, actual_numberLong);
        
        double uTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8StreamJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8StreamJsonParser_intLength = uTF8StreamJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8StreamJsonParser_intLength, actual_intLength);
        
        int uTF8StreamJsonParser_fractLength = uTF8StreamJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8StreamJsonParser_fractLength, actual_fractLength);
        
        int uTF8StreamJsonParser_expLength = uTF8StreamJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8StreamJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8StreamJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalUTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertEquals(254, finalUTF8StreamJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changes != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangesNotEqualsZero_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 134);
        
        UTF8StreamJsonParser actual = ((UTF8StreamJsonParser) uTF8StreamJsonParser.setFeatureMask(-135));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8StreamJsonParser_quad1 = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(uTF8StreamJsonParser_quad1, actual_quad1);
        
        int uTF8StreamJsonParser_nameStartOffset = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        int actual_nameStartOffset = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        assertEquals(uTF8StreamJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int uTF8StreamJsonParser_nameStartRow = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        assertEquals(uTF8StreamJsonParser_nameStartRow, actual_nameStartRow);
        
        int uTF8StreamJsonParser_nameStartCol = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        assertEquals(uTF8StreamJsonParser_nameStartCol, actual_nameStartCol);
        
        InputStream actual_inputStream = ((InputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_inputStream);
        
        byte[] actual_inputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8StreamJsonParser_inputPtr = uTF8StreamJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8StreamJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8StreamJsonParser_inputEnd = uTF8StreamJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8StreamJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8StreamJsonParser_currInputProcessed = uTF8StreamJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8StreamJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8StreamJsonParser_currInputRow = uTF8StreamJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8StreamJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8StreamJsonParser_currInputRowStart = uTF8StreamJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8StreamJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8StreamJsonParser_tokenInputTotal = uTF8StreamJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8StreamJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8StreamJsonParser_tokenInputRow = uTF8StreamJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8StreamJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8StreamJsonParser_tokenInputCol = uTF8StreamJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8StreamJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8StreamJsonParser_parsingContext = uTF8StreamJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8StreamJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8StreamJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8StreamJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8StreamJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8StreamJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8StreamJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8StreamJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8StreamJsonParser_parsingContext_index, actual_parsingContext_index);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8StreamJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8StreamJsonParser_numberInt, actual_numberInt);
        
        long uTF8StreamJsonParser_numberLong = uTF8StreamJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8StreamJsonParser_numberLong, actual_numberLong);
        
        double uTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8StreamJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8StreamJsonParser_intLength = uTF8StreamJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8StreamJsonParser_intLength, actual_intLength);
        
        int uTF8StreamJsonParser_fractLength = uTF8StreamJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8StreamJsonParser_fractLength, actual_fractLength);
        
        int uTF8StreamJsonParser_expLength = uTF8StreamJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8StreamJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8StreamJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        JsonReadContext jsonReadContext = uTF8StreamJsonParser._parsingContext;
        DupDetector finalUTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        int finalUTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertNull(finalUTF8StreamJsonParser_parsingContext_dups);
        
        assertEquals(-135, finalUTF8StreamJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changes != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangesNotEqualsZero_3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 129);
        
        JsonReadContext jsonReadContext = uTF8StreamJsonParser._parsingContext;
        DupDetector initialUTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        UTF8StreamJsonParser actual = ((UTF8StreamJsonParser) uTF8StreamJsonParser.setFeatureMask(-134));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8StreamJsonParser_quad1 = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(uTF8StreamJsonParser_quad1, actual_quad1);
        
        int uTF8StreamJsonParser_nameStartOffset = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        int actual_nameStartOffset = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        assertEquals(uTF8StreamJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int uTF8StreamJsonParser_nameStartRow = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        assertEquals(uTF8StreamJsonParser_nameStartRow, actual_nameStartRow);
        
        int uTF8StreamJsonParser_nameStartCol = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        assertEquals(uTF8StreamJsonParser_nameStartCol, actual_nameStartCol);
        
        InputStream actual_inputStream = ((InputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_inputStream);
        
        byte[] actual_inputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8StreamJsonParser_inputPtr = uTF8StreamJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8StreamJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8StreamJsonParser_inputEnd = uTF8StreamJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8StreamJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8StreamJsonParser_currInputProcessed = uTF8StreamJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8StreamJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8StreamJsonParser_currInputRow = uTF8StreamJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8StreamJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8StreamJsonParser_currInputRowStart = uTF8StreamJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8StreamJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8StreamJsonParser_tokenInputTotal = uTF8StreamJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8StreamJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8StreamJsonParser_tokenInputRow = uTF8StreamJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8StreamJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8StreamJsonParser_tokenInputCol = uTF8StreamJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8StreamJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8StreamJsonParser_parsingContext = uTF8StreamJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector uTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        Object uTF8StreamJsonParser_parsingContext_dups_source = getFieldValue(uTF8StreamJsonParser_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        Object actual_parsingContext_dups_source = getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8StreamJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        JsonToken actual_parsingContext_dups_source_nextToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actual_parsingContext_dups_source_nextToken);
        
        TextBuffer actual_parsingContext_dups_source_textBuffer = ((TextBuffer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actual_parsingContext_dups_source_textBuffer);
        
        char[] actual_parsingContext_dups_source_nameCopyBuffer = ((char[]) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actual_parsingContext_dups_source_nameCopyBuffer);
        
        boolean actual_parsingContext_dups_source_nameCopied = ((Boolean) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actual_parsingContext_dups_source_nameCopied);
        
        ByteArrayBuilder actual_parsingContext_dups_source_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actual_parsingContext_dups_source_byteArrayBuilder);
        
        byte[] actual_parsingContext_dups_source_binaryValue = ((byte[]) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actual_parsingContext_dups_source_binaryValue);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_numTypesValid = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actual_parsingContext_dups_source_numTypesValid = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numTypesValid, actual_parsingContext_dups_source_numTypesValid);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_numberInt = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actual_parsingContext_dups_source_numberInt = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numberInt, actual_parsingContext_dups_source_numberInt);
        
        long uTF8StreamJsonParser_parsingContext_dups_source_numberLong = ((Long) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actual_parsingContext_dups_source_numberLong = ((Long) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numberLong, actual_parsingContext_dups_source_numberLong);
        
        double uTF8StreamJsonParser_parsingContext_dups_source_numberDouble = ((Double) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actual_parsingContext_dups_source_numberDouble = ((Double) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_numberDouble, actual_parsingContext_dups_source_numberDouble, 1.0E-6);
        
        BigInteger actual_parsingContext_dups_source_numberBigInt = ((BigInteger) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actual_parsingContext_dups_source_numberBigInt);
        
        BigDecimal actual_parsingContext_dups_source_numberBigDecimal = ((BigDecimal) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actual_parsingContext_dups_source_numberBigDecimal);
        
        boolean actual_parsingContext_dups_source_numberNegative = ((Boolean) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actual_parsingContext_dups_source_numberNegative);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_intLength = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actual_parsingContext_dups_source_intLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_intLength, actual_parsingContext_dups_source_intLength);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_fractLength = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actual_parsingContext_dups_source_fractLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_fractLength, actual_parsingContext_dups_source_fractLength);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_expLength = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actual_parsingContext_dups_source_expLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_expLength, actual_parsingContext_dups_source_expLength);
        
        JsonToken actual_parsingContext_dups_source_currToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_parsingContext_dups_source_currToken);
        
        JsonToken actual_parsingContext_dups_source_lastClearedToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_parsingContext_dups_source_lastClearedToken);
        
        int uTF8StreamJsonParser_parsingContext_dups_source_features = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_parsingContext_dups_source_features = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8StreamJsonParser_parsingContext_dups_source_features, actual_parsingContext_dups_source_features);
        
        RequestPayload actual_parsingContext_dups_source_requestPayload = ((RequestPayload) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_parsingContext_dups_source_requestPayload);
        
        String actual_parsingContext_dups_firstName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
        assertNull(actual_parsingContext_dups_firstName);
        
        String actual_parsingContext_dups_secondName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
        assertNull(actual_parsingContext_dups_secondName);
        
        HashSet actual_parsingContext_dups_seen = ((HashSet) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
        assertNull(actual_parsingContext_dups_seen);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8StreamJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8StreamJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8StreamJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8StreamJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8StreamJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8StreamJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8StreamJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8StreamJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8StreamJsonParser_parsingContext_index, actual_parsingContext_index);
        
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        assertTrue(deepEquals(uTF8StreamJsonParser, actual));
        
        JsonReadContext jsonReadContext1 = uTF8StreamJsonParser._parsingContext;
        DupDetector finalUTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext1, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        int finalUTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertFalse(initialUTF8StreamJsonParser_parsingContext_dups == finalUTF8StreamJsonParser_parsingContext_dups);
        
        assertEquals(-134, finalUTF8StreamJsonParser_features);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.isClosed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosed()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#isClosed()}
 * @utbot.returnsFrom {@code return _closed;}
 *  */
    @Test
    public void testIsClosed_Return_closed() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.isClosed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getParsingContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParsingContext()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getParsingContext()}
 * @utbot.returnsFrom {@code return _parsingContext;}
 *  */
    @Test
    public void testGetParsingContext_Return_parsingContext() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        JsonReadContext actual = uTF8DataInputJsonParser.getParsingContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.hasTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTextCharacters()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#hasTextCharacters()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasTextCharacters__currTokenEqualsJsonTokenVALUE_STRING() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.hasTextCharacters();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#hasTextCharacters()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): True}
 * @utbot.returnsFrom {@code return _nameCopied;}
 *  */
    @Test
    public void testHasTextCharacters__currTokenEqualsJsonTokenFIELD_NAME() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.hasTextCharacters();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#hasTextCharacters()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTextCharacters__currTokenNotEqualsJsonTokenFIELD_NAME() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.hasTextCharacters();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getNumberType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumberType()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getNumberType()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): True}
 * @utbot.returnsFrom {@code return NumberType.INT;}
 *  */
    @Test
    public void testGetNumberType__numTypesValidBitwiseAndNR_INTNotEqualsZero() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getNumberType()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): True}
 * @utbot.returnsFrom {@code return NumberType.BIG_DECIMAL;}
 *  */
    @Test
    public void testGetNumberType__numTypesValidBitwiseAndNR_BIGDECIMALNotEqualsZero() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 17;
        
        JsonParser.NumberType actual = uTF8DataInputJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.BIG_DECIMAL;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumberType()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getNumberType()}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_parseNumericValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parseNumericValue(NR_UNKNOWN);
 *  */
    @Test
    public void testGetNumberType_ThrowNullPointerException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumberType()
    
    @Test
    public void testGetNumberType1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType8() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType12() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberType13() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonParser.NumberType actual = readerBasedJsonParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNumberType()
    
    @Test
    public void testGetNumberType14() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:39)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType17() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType20() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 11);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType21() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType22() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:51)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType26() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType27() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 65);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 66 out of bounds for length 40]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType28() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType29() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType30() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType31() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType32() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType33() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:51)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType34() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType35() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NegativeArraySizeException: -2147483648]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:394)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType36() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType37() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType38() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType39() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 8388608);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType40() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType41() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    
    @Test
    public void testGetNumberType42() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberType] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:617) */
        readerBasedJsonParser.getNumberType();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberType()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType43() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getNumberType();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType44() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getNumberType();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType45() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getNumberType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getCurrentName()}
 * @utbot.returnsFrom {@code return parent.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName_ParentNotEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent", _parsingContext);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        String actual = uTF8DataInputJsonParser.getCurrentName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.returnsFrom {@code return _parsingContext.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        String actual = readerBasedJsonParser.getCurrentName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return _parsingContext.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName_ParentEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        String actual = uTF8DataInputJsonParser.getCurrentName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonReadContext parent = _parsingContext.getParent();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:339) */
        uTF8StreamJsonParser.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getCurrentName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parsingContext.getCurrentName();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:344) */
        uTF8StreamJsonParser.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonReadContext parent = _parsingContext.getParent();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:339) */
        uTF8StreamJsonParser.getCurrentName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBigIntegerValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getBigIntegerValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) == 0): True}
 * @utbot.returnsFrom {@code return _numberBigInt;}
 *  */
    @Test
    public void testGetBigIntegerValue__numTypesValidBitwiseAndNR_BIGINTEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = 16;
        
        BigInteger initialUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        BigInteger actual = uTF8StreamJsonParser.getBigIntegerValue();
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigInteger finalUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigInt == finalUTF8StreamJsonParser_numberBigInt);
        
        assertEquals(-251, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getBigIntegerValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) == 0): True}
 * @utbot.returnsFrom {@code return _numberBigInt;}
 *  */
    @Test
    public void testGetBigIntegerValue__numTypesValidBitwiseAndNR_BIGINTEqualsZero_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = 16L;
        
        BigInteger initialUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        BigInteger actual = uTF8StreamJsonParser.getBigIntegerValue();
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigInteger finalUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigInt == finalUTF8StreamJsonParser_numberBigInt);
        
        assertEquals(-250, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getBigIntegerValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) == 0): False}
 * @utbot.returnsFrom {@code return _numberBigInt;}
 *  */
    @Test
    public void testGetBigIntegerValue__numTypesValidBitwiseAndNR_BIGINTNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -251;
        
        BigInteger actual = uTF8StreamJsonParser.getBigIntegerValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getIntValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIntValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getIntValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) == 0): False}
 * @utbot.returnsFrom {@code return _numberInt;}
 *  */
    @Test
    public void testGetIntValue__numTypesValidBitwiseAndNR_INTNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        
        int actual = uTF8StreamJsonParser.getIntValue();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getIntValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) == 0): True}
 * @utbot.returnsFrom {@code return _numberInt;}
 *  */
    @Test
    public void testGetIntValue__numTypesValidBitwiseAndNR_INTEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = -255L;
        
        int actual = uTF8StreamJsonParser.getIntValue();
        
        assertEquals(-255, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int finalUTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        
        assertEquals(-253, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(-255, finalUTF8StreamJsonParser_numberInt);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getIntValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) == 0): True}
 * @utbot.returnsFrom {@code return _numberInt;}
 *  */
    @Test
    public void testGetIntValue__numTypesValidBitwiseAndNR_INTEqualsZero_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -248;
        uTF8StreamJsonParser._numberDouble = -5.06E-321;
        
        int actual = uTF8StreamJsonParser.getIntValue();
        
        assertEquals(0, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(-247, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getNumberValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumberValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getNumberValue()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): True}
 * @utbot.returnsFrom {@code return _numberBigDecimal;}
 *  */
    @Test
    public void testGetNumberValue__numTypesValidBitwiseAndNR_BIGDECIMALNotEqualsZero() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = -239;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        Number actual = uTF8DataInputJsonParser.getNumberValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getNumberValue()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): True}
 * @utbot.returnsFrom {@code return _numberBigInt;}
 *  */
    @Test
    public void testGetNumberValue__numTypesValidBitwiseAndNR_BIGINTNotEqualsZero() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = -252;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Number actual = readerBasedJsonParser.getNumberValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumberValue()
    
    @Test
    public void testGetNumberValue1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Long actual = ((Long) readerBasedJsonParser.getNumberValue());
        
        Long expected = 0L;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberValue2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) uTF8DataInputJsonParser.getNumberValue());
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberValue3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2097152;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Number actual = readerBasedJsonParser.getNumberValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNumberValue4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = -53328;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = -48;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = -528;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = -533328;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue8() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = 528;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = 48;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = 48;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = -53328;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue12() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        Integer actual = ((Integer) readerBasedJsonParser.getNumberValue());
        
        Integer expected = -48;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNumberValue()
    
    @Test
    public void testGetNumberValue13() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue14() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 65);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 66 out of bounds for length 40]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:51)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue17() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:39)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue20() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue21() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue22() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue26() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue27() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue28() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NegativeArraySizeException: -2147483648]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:394)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue29() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue30() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue31() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue32() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue33() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 8388608);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue34() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue35() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getNumberValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:584) */
        readerBasedJsonParser.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue36() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue37() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue38() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getNumberValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getDecimalValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDecimalValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDecimalValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): False}
 * @utbot.returnsFrom {@code return _numberBigDecimal;}
 *  */
    @Test
    public void testGetDecimalValue__numTypesValidBitwiseAndNR_BIGDECIMALNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        
        BigDecimal actual = uTF8StreamJsonParser.getDecimalValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDecimalValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): True}
 * @utbot.returnsFrom {@code return _numberBigDecimal;}
 *  */
    @Test
    public void testGetDecimalValue__numTypesValidBitwiseAndNR_BIGDECIMALEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = 0L;
        
        BigDecimal initialUTF8StreamJsonParser_numberBigDecimal = uTF8StreamJsonParser._numberBigDecimal;
        
        BigDecimal actual = uTF8StreamJsonParser.getDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigDecimal finalUTF8StreamJsonParser_numberBigDecimal = uTF8StreamJsonParser._numberBigDecimal;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigDecimal == finalUTF8StreamJsonParser_numberBigDecimal);
        
        assertEquals(-238, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDecimalValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): True}
 * @utbot.returnsFrom {@code return _numberBigDecimal;}
 *  */
    @Test
    public void testGetDecimalValue__numTypesValidBitwiseAndNR_BIGDECIMALEqualsZero_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        
        BigDecimal initialUTF8StreamJsonParser_numberBigDecimal = uTF8StreamJsonParser._numberBigDecimal;
        
        BigDecimal actual = uTF8StreamJsonParser.getDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigDecimal finalUTF8StreamJsonParser_numberBigDecimal = uTF8StreamJsonParser._numberBigDecimal;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigDecimal == finalUTF8StreamJsonParser_numberBigDecimal);
        
        assertEquals(-239, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDecimalValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDecimalValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) == 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToBigDecimal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: convertNumberToBigDecimal();
 *  */
    @Test(expected = RuntimeException.class)
    public void testGetDecimalValue_ThrowRuntimeException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -224;
        
        uTF8StreamJsonParser.getDecimalValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getBinaryValue
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.executesCondition {@code (_binaryValue == null): False}
 * @utbot.returnsFrom {@code return _binaryValue;}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} in: return _binaryValue;
 *  */
    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_ThrowJsonParseException() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        byte[] _binaryValue = {(byte) -127};
        nonBlockingJsonParser._binaryValue = _binaryValue;
        
        nonBlockingJsonParser.getBinaryValue(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void testGetBinaryValue1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue4() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue6() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue7() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue8() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        byte[] actual = nonBlockingJsonParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalNonBlockingJsonParser_binaryValue = nonBlockingJsonParser._binaryValue;
        
        assertFalse(initialNonBlockingJsonParser_binaryValue == finalNonBlockingJsonParser_binaryValue);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void testGetBinaryValue9() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2147483645);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 2147483645, length 4] */
        nonBlockingJsonParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue10() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 3);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.StringIndexOutOfBoundsException: offset 3, count 1073741824, length 2] */
        nonBlockingJsonParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue11() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue12() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue13() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue14() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue15() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        nonBlockingJsonParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getBinaryValue] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getBinaryValue(base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getLongValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getLongValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) == 0): False}
 * @utbot.returnsFrom {@code return _numberLong;}
 *  */
    @Test
    public void testGetLongValue__numTypesValidBitwiseAndNR_LONGNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = -255L;
        
        long actual = uTF8StreamJsonParser.getLongValue();
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getLongValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) == 0): True}
 * @utbot.returnsFrom {@code return _numberLong;}
 *  */
    @Test
    public void testGetLongValue__numTypesValidBitwiseAndNR_LONGEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._numberLong = 0L;
        
        long actual = uTF8StreamJsonParser.getLongValue();
        
        assertEquals(-255L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        long finalUTF8StreamJsonParser_numberLong = uTF8StreamJsonParser._numberLong;
        
        assertEquals(-253, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(-255L, finalUTF8StreamJsonParser_numberLong);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getLongValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) == 0): True}
 * @utbot.returnsFrom {@code return _numberLong;}
 *  */
    @Test
    public void testGetLongValue__numTypesValidBitwiseAndNR_LONGEqualsZero_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = -248;
        uTF8DataInputJsonParser._numberLong = 0L;
        uTF8DataInputJsonParser._numberDouble = -4.9E-324;
        
        long actual = uTF8DataInputJsonParser.getLongValue();
        
        assertEquals(0L, actual);
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        
        assertEquals(-246, finalUTF8DataInputJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLongValue()
    
    @Test
    public void testGetLongValue1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getLongValue();
        
        assertEquals(-5328L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetLongValue2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getLongValue();
        
        assertEquals(48L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetLongValue3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getLongValue();
        
        assertEquals(-48L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetLongValue4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getLongValue();
        
        assertEquals(-48L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLongValue()
    
    @Test
    public void testGetLongValue5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue8() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue9() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 4194312;
        uTF8StreamJsonParser._numberDouble = -1.8446744073709814E19;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue10() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 4;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:919)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue11() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = 2.68156158598852E154;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:931)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -3.6893488147419234E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 4194312;
        uTF8DataInputJsonParser._numberDouble = -1.8446744073709814E19;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._intLength = 27;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue17() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681643420753717E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue20() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815615859885194E154;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue21() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561586144607E154;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue22() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        uTF8StreamJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 8388608);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue26() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660) */
        readerBasedJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue27() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681725255518914E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue28() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue29() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6841802984748363E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue30() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[12];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561585988522E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue31() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815615859885194E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
            com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:283)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:677)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test
    public void testGetLongValue32() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815615859885194E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663) */
        uTF8DataInputJsonParser.getLongValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getLongValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue33() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 4194312;
        uTF8DataInputJsonParser._numberDouble = -1.8446744073709814E19;
        JsonToken _currToken = JsonToken.END_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue34() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -3.6893488147419234E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue35() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681602503371118E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue36() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561590983317E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue37() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue38() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.3158417847464555E77;
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue39() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815622253226225E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue40() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue41() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561585988672E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue42() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815615859885194E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue43() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getLongValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLongValue()
    
    @Test(expected = RuntimeException.class)
    public void testGetLongValue44() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 32;
        
        uTF8StreamJsonParser.getLongValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getFloatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFloatValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getFloatValue()}
 * @utbot.returnsFrom {@code return (float) value;}
 *  */
    @Test
    public void testGetFloatValue_ReturnValue() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -247;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        float actual = uTF8StreamJsonParser.getFloatValue();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getFloatValue()}
 * @utbot.returnsFrom {@code return (float) value;}
 *  */
    @Test
    public void testGetFloatValue_ReturnValue_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        float actual = uTF8StreamJsonParser.getFloatValue();
        
        org.junit.Assert.assertEquals(-255.0f, actual, 1.0E-6f);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-247, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getFloatValue()}
 * @utbot.returnsFrom {@code return (float) value;}
 *  */
    @Test
    public void testGetFloatValue_ReturnValue_3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = -255L;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        float actual = uTF8StreamJsonParser.getFloatValue();
        
        org.junit.Assert.assertEquals(-255.0f, actual, 1.0E-6f);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-246, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getFloatValue()}
 * @utbot.returnsFrom {@code return (float) value;}
 *  */
    @Test
    public void testGetFloatValue_ReturnValue_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        uTF8StreamJsonParser._numberDouble = 0.0;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", -255L);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        float actual = uTF8StreamJsonParser.getFloatValue();
        
        org.junit.Assert.assertEquals(-255.0f, actual, 1.0E-6f);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-231, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getDoubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDoubleValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDoubleValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): False}
 * @utbot.returnsFrom {@code return _numberDouble;}
 *  */
    @Test
    public void testGetDoubleValue__numTypesValidBitwiseAndNR_DOUBLENotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -247;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDoubleValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.returnsFrom {@code return _numberDouble;}
 *  */
    @Test
    public void testGetDoubleValue__numTypesValidBitwiseAndNR_DOUBLEEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = -255L;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(-255.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-246, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDoubleValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.returnsFrom {@code return _numberDouble;}
 *  */
    @Test
    public void testGetDoubleValue__numTypesValidBitwiseAndNR_DOUBLEEqualsZero_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(-255.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-247, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDoubleValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.returnsFrom {@code return _numberDouble;}
 *  */
    @Test
    public void testGetDoubleValue__numTypesValidBitwiseAndNR_DOUBLEEqualsZero_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -251;
        uTF8StreamJsonParser._numberDouble = 0.0;
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        uTF8StreamJsonParser._numberBigInt = _numberBigInt;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(-243, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDoubleValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.returnsFrom {@code return _numberDouble;}
 *  */
    @Test
    public void testGetDoubleValue__numTypesValidBitwiseAndNR_DOUBLEEqualsZero_3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        uTF8StreamJsonParser._numberDouble = 0.0;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(-231, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDoubleValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getDoubleValue()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.executesCondition {@code (_numTypesValid == NR_UNKNOWN): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) == 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: convertNumberToDouble();
 *  */
    @Test
    public void testGetDoubleValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -251;
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(_numberBigInt, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(_numberBigInt, "java.math.BigInteger", "mag", mag);
        uTF8StreamJsonParser._numberBigInt = _numberBigInt;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:970)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDoubleValue()
    
    @Test
    public void testGetDoubleValue1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(48.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(9, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetDoubleValue2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(-48.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(9, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetDoubleValue3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        double actual = uTF8StreamJsonParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(-48.0, actual, 1.0E-6);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(9, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDoubleValue()
    
    @Test
    public void testGetDoubleValue4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        String stringCache = "";
        setField(_numberBigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", -4503599627370496L);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "!\u0001";
        setField(_numberBigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NumberFormatException: For input string: "!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue8() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue9() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        readerBasedJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue11() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:4000)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue12() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._intLength = 27;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        readerBasedJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        uTF8DataInputJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue14() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(intVal, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        readerBasedJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        readerBasedJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue17() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:706) */
        uTF8StreamJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        readerBasedJsonParser.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703) */
        readerBasedJsonParser.getDoubleValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getDoubleValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue20() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getDoubleValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDoubleValue()
    
    @Test(expected = RuntimeException.class)
    public void testGetDoubleValue21() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 32;
        
        uTF8StreamJsonParser.getDoubleValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 *  */
    @Test
    public void testOverrideCurrentName() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        readerBasedJsonParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 *  */
    @Test
    public void testOverrideCurrentName_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser.overrideCurrentName(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = ctxt.getParent();
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName(ParserBase.java:351) */
        uTF8DataInputJsonParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = ctxt.getParent();
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName(ParserBase.java:351) */
        uTF8StreamJsonParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.setCurrentName(name);
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName(ParserBase.java:357) */
        readerBasedJsonParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.setCurrentName(name);
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName(ParserBase.java:357) */
        uTF8StreamJsonParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#setCurrentName(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#setCurrentName(java.lang.String)}
 * @utbot.caughtException {@code IOException e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in:  catch (IOException e) {
 *     throw new IllegalStateException(e);
 * }
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.overrideCurrentName(ParserBase.java:357) */
        uTF8StreamJsonParser.overrideCurrentName(_firstName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#setCurrentName(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#setCurrentName(java.lang.String)}
 * @utbot.caughtException {@code IOException e}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in:  catch (IOException e) {
 *     throw new IllegalStateException(e);
 * }
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOverrideCurrentName_ThrowIllegalStateException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _parent = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        short[] _source = {};
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        String _secondName = "\u0000";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName", _secondName);
        setField(_parent, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent", _parent);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.overrideCurrentName(_secondName);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method overrideCurrentName(java.lang.String)
    
    @Test
    public void testOverrideCurrentName1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _parent = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName", _firstName);
        setField(_parent, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent", _parent);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        String string = "\u0000";
        
        uTF8DataInputJsonParser.overrideCurrentName(string);
    }
    
    @Test
    public void testOverrideCurrentName2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName", _firstName);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        uTF8StreamJsonParser.overrideCurrentName(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method overrideCurrentName(java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testOverrideCurrentName3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _parent = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_parent, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent", _parent);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        String string = "";
        
        uTF8StreamJsonParser.overrideCurrentName(string);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testOverrideCurrentName4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        uTF8StreamJsonParser.overrideCurrentName(string);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testOverrideCurrentName5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _parent = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_parent, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent", _parent);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.overrideCurrentName(_firstName);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.overrideStdFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method overrideStdFeatures(int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedEqualsZero() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.overrideStdFeatures(-255, -255));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -7);
        
        ReaderBasedJsonParser actual = ((ReaderBasedJsonParser) readerBasedJsonParser.overrideStdFeatures(2, -5));
        
        Reader actual_reader = ((Reader) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actual_reader);
        
        char[] actual_inputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        CharsToNameCanonicalizer actual_symbols = ((CharsToNameCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int readerBasedJsonParser_hashSeed = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actual_hashSeed = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(readerBasedJsonParser_hashSeed, actual_hashSeed);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        long readerBasedJsonParser_nameStartOffset = ((Long) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        long actual_nameStartOffset = ((Long) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        assertEquals(readerBasedJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int readerBasedJsonParser_nameStartRow = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        assertEquals(readerBasedJsonParser_nameStartRow, actual_nameStartRow);
        
        int readerBasedJsonParser_nameStartCol = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        assertEquals(readerBasedJsonParser_nameStartCol, actual_nameStartCol);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int readerBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(readerBasedJsonParser_inputPtr, actual_inputPtr);
        
        int readerBasedJsonParser_inputEnd = readerBasedJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(readerBasedJsonParser_inputEnd, actual_inputEnd);
        
        long readerBasedJsonParser_currInputProcessed = readerBasedJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(readerBasedJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int readerBasedJsonParser_currInputRow = readerBasedJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(readerBasedJsonParser_currInputRow, actual_currInputRow);
        
        int readerBasedJsonParser_currInputRowStart = readerBasedJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(readerBasedJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long readerBasedJsonParser_tokenInputTotal = readerBasedJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(readerBasedJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int readerBasedJsonParser_tokenInputRow = readerBasedJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(readerBasedJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int readerBasedJsonParser_tokenInputCol = readerBasedJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(readerBasedJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int readerBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(readerBasedJsonParser_numTypesValid, actual_numTypesValid);
        
        int readerBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(readerBasedJsonParser_numberInt, actual_numberInt);
        
        long readerBasedJsonParser_numberLong = readerBasedJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(readerBasedJsonParser_numberLong, actual_numberLong);
        
        double readerBasedJsonParser_numberDouble = readerBasedJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(readerBasedJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int readerBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(readerBasedJsonParser_intLength, actual_intLength);
        
        int readerBasedJsonParser_fractLength = readerBasedJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(readerBasedJsonParser_fractLength, actual_fractLength);
        
        int readerBasedJsonParser_expLength = readerBasedJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(readerBasedJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int readerBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(readerBasedJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalReaderBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertEquals(2, finalReaderBasedJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -7);
        
        ReaderBasedJsonParser actual = ((ReaderBasedJsonParser) readerBasedJsonParser.overrideStdFeatures(-254, -5));
        
        Reader actual_reader = ((Reader) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actual_reader);
        
        char[] actual_inputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        CharsToNameCanonicalizer actual_symbols = ((CharsToNameCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int readerBasedJsonParser_hashSeed = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actual_hashSeed = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(readerBasedJsonParser_hashSeed, actual_hashSeed);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        long readerBasedJsonParser_nameStartOffset = ((Long) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        long actual_nameStartOffset = ((Long) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        assertEquals(readerBasedJsonParser_nameStartOffset, actual_nameStartOffset);
        
        int readerBasedJsonParser_nameStartRow = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        int actual_nameStartRow = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        assertEquals(readerBasedJsonParser_nameStartRow, actual_nameStartRow);
        
        int readerBasedJsonParser_nameStartCol = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        int actual_nameStartCol = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        assertEquals(readerBasedJsonParser_nameStartCol, actual_nameStartCol);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int readerBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(readerBasedJsonParser_inputPtr, actual_inputPtr);
        
        int readerBasedJsonParser_inputEnd = readerBasedJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(readerBasedJsonParser_inputEnd, actual_inputEnd);
        
        long readerBasedJsonParser_currInputProcessed = readerBasedJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(readerBasedJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int readerBasedJsonParser_currInputRow = readerBasedJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(readerBasedJsonParser_currInputRow, actual_currInputRow);
        
        int readerBasedJsonParser_currInputRowStart = readerBasedJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(readerBasedJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long readerBasedJsonParser_tokenInputTotal = readerBasedJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(readerBasedJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int readerBasedJsonParser_tokenInputRow = readerBasedJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(readerBasedJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int readerBasedJsonParser_tokenInputCol = readerBasedJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(readerBasedJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int readerBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(readerBasedJsonParser_numTypesValid, actual_numTypesValid);
        
        int readerBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(readerBasedJsonParser_numberInt, actual_numberInt);
        
        long readerBasedJsonParser_numberLong = readerBasedJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(readerBasedJsonParser_numberLong, actual_numberLong);
        
        double readerBasedJsonParser_numberDouble = readerBasedJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(readerBasedJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int readerBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(readerBasedJsonParser_intLength, actual_intLength);
        
        int readerBasedJsonParser_fractLength = readerBasedJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(readerBasedJsonParser_fractLength, actual_fractLength);
        
        int readerBasedJsonParser_expLength = readerBasedJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(readerBasedJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int readerBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(readerBasedJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalReaderBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertEquals(-254, finalReaderBasedJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 255);
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.overrideStdFeatures(-255, -2));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8DataInputJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8DataInputJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_index, actual_parsingContext_index);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        JsonReadContext jsonReadContext = uTF8DataInputJsonParser._parsingContext;
        DupDetector finalUTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        int finalUTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertNull(finalUTF8DataInputJsonParser_parsingContext_dups);
        
        assertEquals(-255, finalUTF8DataInputJsonParser_features);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 238);
        
        JsonReadContext jsonReadContext = uTF8DataInputJsonParser._parsingContext;
        DupDetector initialUTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.overrideStdFeatures(-239, -1));
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector uTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        Object uTF8DataInputJsonParser_parsingContext_dups_source = getFieldValue(uTF8DataInputJsonParser_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        Object actual_parsingContext_dups_source = getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        assertTrue(deepEquals(uTF8DataInputJsonParser_parsingContext_dups_source, actual_parsingContext_dups_source));
        JsonToken actual_parsingContext_dups_source_nextToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actual_parsingContext_dups_source_nextToken);
        
        TextBuffer actual_parsingContext_dups_source_textBuffer = ((TextBuffer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actual_parsingContext_dups_source_textBuffer);
        
        char[] actual_parsingContext_dups_source_nameCopyBuffer = ((char[]) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actual_parsingContext_dups_source_nameCopyBuffer);
        
        boolean actual_parsingContext_dups_source_nameCopied = ((Boolean) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actual_parsingContext_dups_source_nameCopied);
        
        ByteArrayBuilder actual_parsingContext_dups_source_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actual_parsingContext_dups_source_byteArrayBuilder);
        
        byte[] actual_parsingContext_dups_source_binaryValue = ((byte[]) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actual_parsingContext_dups_source_binaryValue);
        
        int uTF8DataInputJsonParser_parsingContext_dups_source_numTypesValid = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actual_parsingContext_dups_source_numTypesValid = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_numTypesValid, actual_parsingContext_dups_source_numTypesValid);
        
        int uTF8DataInputJsonParser_parsingContext_dups_source_numberInt = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actual_parsingContext_dups_source_numberInt = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_numberInt, actual_parsingContext_dups_source_numberInt);
        
        long uTF8DataInputJsonParser_parsingContext_dups_source_numberLong = ((Long) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actual_parsingContext_dups_source_numberLong = ((Long) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_numberLong, actual_parsingContext_dups_source_numberLong);
        
        double uTF8DataInputJsonParser_parsingContext_dups_source_numberDouble = ((Double) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actual_parsingContext_dups_source_numberDouble = ((Double) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_numberDouble, actual_parsingContext_dups_source_numberDouble, 1.0E-6);
        
        BigInteger actual_parsingContext_dups_source_numberBigInt = ((BigInteger) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actual_parsingContext_dups_source_numberBigInt);
        
        BigDecimal actual_parsingContext_dups_source_numberBigDecimal = ((BigDecimal) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actual_parsingContext_dups_source_numberBigDecimal);
        
        boolean actual_parsingContext_dups_source_numberNegative = ((Boolean) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actual_parsingContext_dups_source_numberNegative);
        
        int uTF8DataInputJsonParser_parsingContext_dups_source_intLength = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actual_parsingContext_dups_source_intLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_intLength, actual_parsingContext_dups_source_intLength);
        
        int uTF8DataInputJsonParser_parsingContext_dups_source_fractLength = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actual_parsingContext_dups_source_fractLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_fractLength, actual_parsingContext_dups_source_fractLength);
        
        int uTF8DataInputJsonParser_parsingContext_dups_source_expLength = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actual_parsingContext_dups_source_expLength = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_expLength, actual_parsingContext_dups_source_expLength);
        
        JsonToken actual_parsingContext_dups_source_currToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_parsingContext_dups_source_currToken);
        
        JsonToken actual_parsingContext_dups_source_lastClearedToken = ((JsonToken) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_parsingContext_dups_source_lastClearedToken);
        
        int uTF8DataInputJsonParser_parsingContext_dups_source_features = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_parsingContext_dups_source_features = ((Integer) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_dups_source_features, actual_parsingContext_dups_source_features);
        
        RequestPayload actual_parsingContext_dups_source_requestPayload = ((RequestPayload) getFieldValue(actual_parsingContext_dups_source, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_parsingContext_dups_source_requestPayload);
        
        String actual_parsingContext_dups_firstName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
        assertNull(actual_parsingContext_dups_firstName);
        
        String actual_parsingContext_dups_secondName = ((String) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
        assertNull(actual_parsingContext_dups_secondName);
        
        HashSet actual_parsingContext_dups_seen = ((HashSet) getFieldValue(actual_parsingContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
        assertNull(actual_parsingContext_dups_seen);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8DataInputJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8DataInputJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_index, actual_parsingContext_index);
        
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        assertTrue(deepEquals(uTF8DataInputJsonParser, actual));
        
        JsonReadContext jsonReadContext1 = uTF8DataInputJsonParser._parsingContext;
        DupDetector finalUTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext1, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        int finalUTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        
        assertFalse(initialUTF8DataInputJsonParser_parsingContext_dups == finalUTF8DataInputJsonParser_parsingContext_dups);
        
        assertEquals(-239, finalUTF8DataInputJsonParser_features);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getTokenLineNr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenLineNr()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getTokenLineNr()}
 * @utbot.returnsFrom {@code return _tokenInputRow;}
 *  */
    @Test
    public void testGetTokenLineNr_Return_tokenInputRow() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._tokenInputRow = -255;
        
        int actual = uTF8DataInputJsonParser.getTokenLineNr();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getTokenColumnNr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenColumnNr()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getTokenColumnNr()}
 * @utbot.executesCondition {@code ((col < 0)): False}
 * @utbot.returnsFrom {@code return (col < 0) ? col : (col + 1);}
 *  */
    @Test
    public void testGetTokenColumnNr_ColGreaterOrEqualZero() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        int actual = uTF8DataInputJsonParser.getTokenColumnNr();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getTokenColumnNr()}
 * @utbot.executesCondition {@code ((col < 0)): True}
 * @utbot.returnsFrom {@code return (col < 0) ? col : (col + 1);}
 *  */
    @Test
    public void testGetTokenColumnNr_ColLessThanZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._tokenInputCol = -1;
        
        int actual = uTF8StreamJsonParser.getTokenColumnNr();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._handleEOF
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleEOF()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_handleEOF()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#inRoot()}
 *  */
    @Test
    public void test_handleEOF_JsonReadContextInRoot() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        readerBasedJsonParser._handleEOF();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleEOF()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_handleEOF()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#inRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_parsingContext.inRoot()
 *  */
    @Test
    public void test_handleEOF_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:484) */
        uTF8DataInputJsonParser._handleEOF();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _handleEOF()
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser._handleEOF();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser._handleEOF();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        
        uTF8StreamJsonParser._handleEOF();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2097152);
        readerBasedJsonParser._parsingContext = _parsingContext;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        readerBasedJsonParser._handleEOF();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2097152);
        nonBlockingJsonParser._parsingContext = _parsingContext;
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        nonBlockingJsonParser._handleEOF();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        readerBasedJsonParser._parsingContext = _parsingContext;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        readerBasedJsonParser._handleEOF();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_handleEOF7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8StreamJsonParser._handleEOF();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.resetInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetInt(boolean, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#resetInt(boolean,int)}
 * @utbot.returnsFrom {@code return JsonToken.VALUE_NUMBER_INT;}
 *  */
    @Test
    public void testResetInt_ReturnJsonTokenVALUE_NUMBER_INT() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = -255;
        uTF8DataInputJsonParser._intLength = -255;
        uTF8DataInputJsonParser._fractLength = -255;
        uTF8DataInputJsonParser._expLength = -255;
        
        JsonToken actual = uTF8DataInputJsonParser.resetInt(false, -255);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_INT;
        
        assertEquals(expected, actual);
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int finalUTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int finalUTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        
        assertEquals(0, finalUTF8DataInputJsonParser_numTypesValid);
        
        assertEquals(0, finalUTF8DataInputJsonParser_fractLength);
        
        assertEquals(0, finalUTF8DataInputJsonParser_expLength);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _eofAsNextChar()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_eofAsNextChar()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_handleEOF()}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void test_eofAsNextChar_ParserBase_handleEOF() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        
        int actual = uTF8StreamJsonParser._eofAsNextChar();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _eofAsNextChar()
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        nonBlockingJsonParser._parsingContext = _parsingContext;
        
        nonBlockingJsonParser._eofAsNextChar();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        readerBasedJsonParser._eofAsNextChar();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        
        uTF8StreamJsonParser._eofAsNextChar();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 32768);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser._eofAsNextChar();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2097152);
        nonBlockingJsonParser._parsingContext = _parsingContext;
        
        nonBlockingJsonParser._eofAsNextChar();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2097152);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8DataInputJsonParser._eofAsNextChar();
    }
    
    @Test(expected = JsonEOFException.class)
    public void test_eofAsNextChar7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8StreamJsonParser._eofAsNextChar();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.resetFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetFloat(boolean, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#resetFloat(boolean,int,int,int)}
 * @utbot.returnsFrom {@code return JsonToken.VALUE_NUMBER_FLOAT;}
 *  */
    @Test
    public void testResetFloat_ReturnJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = -255;
        uTF8DataInputJsonParser._intLength = -255;
        uTF8DataInputJsonParser._fractLength = -255;
        uTF8DataInputJsonParser._expLength = -255;
        
        JsonToken actual = uTF8DataInputJsonParser.resetFloat(false, -255, -255, -255);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_FLOAT;
        
        assertEquals(expected, actual);
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        
        assertEquals(0, finalUTF8DataInputJsonParser_numTypesValid);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._releaseBuffers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _releaseBuffers()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _ioContext.releaseNameCopyBuffer(buf);
 *  */
    @Test
    public void test_releaseBuffers_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        BufferRecycler _bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_bufferRecycler", _bufferRecycler);
        char[] _nameCopyBuffer = {'\u0000'};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_nameCopyBuffer", _nameCopyBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._nameCopyBuffer = _nameCopyBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:132)
            com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer(IOContext.java:266)
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:473) */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _textBuffer.releaseBuffers();
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:469) */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _ioContext.releaseNameCopyBuffer(buf);
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        char[] _nameCopyBuffer = {' '};
        nonBlockingJsonParser._nameCopyBuffer = _nameCopyBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:473) */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        BufferRecycler _bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(_bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_bufferRecycler", _bufferRecycler);
        char[] _nameCopyBuffer = {' '};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_nameCopyBuffer", _nameCopyBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _bufferRecycler);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        char[] _nameCopyBuffer1 = {' '};
        nonBlockingJsonParser._nameCopyBuffer = _nameCopyBuffer1;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_4() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_7() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty(TextBuffer.java:166)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:137)
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:469) */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_6() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = new char[11][];
        _charBuffers[0] = ((char[]) null);
        _charBuffers[1] = ((char[]) null);
        _charBuffers[2] = ((char[]) null);
        _charBuffers[3] = ((char[]) null);
        _charBuffers[4] = ((char[]) null);
        _charBuffers[5] = ((char[]) null);
        _charBuffers[6] = ((char[]) null);
        _charBuffers[7] = ((char[]) null);
        _charBuffers[8] = ((char[]) null);
        _charBuffers[9] = ((char[]) null);
        _charBuffers[10] = ((char[]) null);
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _currentSegment = {' '};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        BufferRecycler _bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(_bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_bufferRecycler", _bufferRecycler);
        char[] _nameCopyBuffer = {'\u0000'};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_nameCopyBuffer", _nameCopyBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._nameCopyBuffer = _nameCopyBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser._releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_releaseBuffers_ThrowNullPointerException_8() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = new char[11][];
        _charBuffers[0] = ((char[]) null);
        _charBuffers[1] = ((char[]) null);
        _charBuffers[2] = ((char[]) null);
        _charBuffers[3] = ((char[]) null);
        _charBuffers[4] = ((char[]) null);
        _charBuffers[5] = ((char[]) null);
        _charBuffers[6] = ((char[]) null);
        _charBuffers[7] = ((char[]) null);
        _charBuffers[8] = ((char[]) null);
        _charBuffers[9] = ((char[]) null);
        _charBuffers[10] = ((char[]) null);
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _inputBuffer = {' '};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _inputBuffer);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._releaseBuffers] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser._releaseBuffers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _releaseBuffers()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_releaseBuffers()}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _ioContext.releaseNameCopyBuffer(buf);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_releaseBuffers_ThrowIllegalArgumentException() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        char[] _nameCopyBuffer = {'\u0000'};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_nameCopyBuffer", _nameCopyBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        char[] _nameCopyBuffer1 = {};
        nonBlockingJsonParser._nameCopyBuffer = _nameCopyBuffer1;
        
        nonBlockingJsonParser._releaseBuffers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.resetAsNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetAsNaN(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#resetAsNaN(java.lang.String,double)}
 * @utbot.returnsFrom {@code return JsonToken.VALUE_NUMBER_FLOAT;}
 *  */
    @Test
    public void testResetAsNaN_ReturnJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numTypesValid = -255;
        readerBasedJsonParser._numberDouble = 0.0;
        
        JsonToken actual = readerBasedJsonParser.resetAsNaN(null, java.lang.Double.NaN);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_FLOAT;
        
        assertEquals(expected, actual);
        
        TextBuffer textBuffer = readerBasedJsonParser._textBuffer;
        int finalReaderBasedJsonParser_textBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        TextBuffer textBuffer1 = readerBasedJsonParser._textBuffer;
        int finalReaderBasedJsonParser_textBuffer_inputLen = ((Integer) getFieldValue(textBuffer1, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        TextBuffer textBuffer2 = readerBasedJsonParser._textBuffer;
        int finalReaderBasedJsonParser_textBuffer_currentSize = ((Integer) getFieldValue(textBuffer2, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        double finalReaderBasedJsonParser_numberDouble = readerBasedJsonParser._numberDouble;
        
        assertEquals(-1, finalReaderBasedJsonParser_textBuffer_inputStart);
        
        assertEquals(0, finalReaderBasedJsonParser_textBuffer_inputLen);
        
        assertEquals(0, finalReaderBasedJsonParser_textBuffer_currentSize);
        
        assertEquals(8, finalReaderBasedJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalReaderBasedJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#resetAsNaN(java.lang.String,double)}
 * @utbot.returnsFrom {@code return JsonToken.VALUE_NUMBER_FLOAT;}
 *  */
    @Test
    public void testResetAsNaN_ReturnJsonTokenVALUE_NUMBER_FLOAT_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numberDouble = 0.0;
        
        JsonToken actual = uTF8DataInputJsonParser.resetAsNaN(null, java.lang.Double.NaN);
        
        JsonToken expected = JsonToken.VALUE_NUMBER_FLOAT;
        
        assertEquals(expected, actual);
        
        TextBuffer textBuffer = uTF8DataInputJsonParser._textBuffer;
        char[] finalUTF8DataInputJsonParser_textBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        TextBuffer textBuffer1 = uTF8DataInputJsonParser._textBuffer;
        int finalUTF8DataInputJsonParser_textBuffer_inputStart = ((Integer) getFieldValue(textBuffer1, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        TextBuffer textBuffer2 = uTF8DataInputJsonParser._textBuffer;
        int finalUTF8DataInputJsonParser_textBuffer_inputLen = ((Integer) getFieldValue(textBuffer2, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        TextBuffer textBuffer3 = uTF8DataInputJsonParser._textBuffer;
        boolean finalUTF8DataInputJsonParser_textBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer3, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        TextBuffer textBuffer4 = uTF8DataInputJsonParser._textBuffer;
        int finalUTF8DataInputJsonParser_textBuffer_segmentSize = ((Integer) getFieldValue(textBuffer4, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        TextBuffer textBuffer5 = uTF8DataInputJsonParser._textBuffer;
        char[] finalUTF8DataInputJsonParser_textBuffer_resultArray = ((char[]) getFieldValue(textBuffer5, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        double finalUTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_inputBuffer);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_textBuffer_inputStart);
        
        assertEquals(0, finalUTF8DataInputJsonParser_textBuffer_inputLen);
        
        assertFalse(finalUTF8DataInputJsonParser_textBuffer_hasSegments);
        
        assertEquals(0, finalUTF8DataInputJsonParser_textBuffer_segmentSize);
        
        assertNull(finalUTF8DataInputJsonParser_textBuffer_resultArray);
        
        assertEquals(8, finalUTF8DataInputJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalUTF8DataInputJsonParser_numberDouble, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetAsNaN(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#resetAsNaN(java.lang.String,double)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _textBuffer.resetWithString(valueStr);
 *  */
    @Test
    public void testResetAsNaN_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.resetAsNaN] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.resetAsNaN(ParserBase.java:556) */
        uTF8DataInputJsonParser.resetAsNaN(null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#resetAsNaN(java.lang.String,double)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _textBuffer.resetWithString(valueStr);
 *  */
    @Test
    public void testResetAsNaN_ThrowNullPointerException_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.resetAsNaN] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithString(TextBuffer.java:263)
            com.fasterxml.jackson.core.base.ParserBase.resetAsNaN(ParserBase.java:556) */
        uTF8DataInputJsonParser.resetAsNaN(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._parseNumericValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseNumericValue(int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseNumericValue(int)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.executesCondition {@code (len <= 9): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsInt(boolean)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_parseNumericValue_LenLessOrEqual9() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483646);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._intLength = 9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(-255);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int finalUTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(-48, finalUTF8StreamJsonParser_numberInt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseNumericValue(int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseNumericValue(int)}
 * @utbot.executesCondition {@code (len <= 9): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsInt(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = _textBuffer.contentsAsInt(_numberNegative);
 *  */
    @Test
    public void test_parseNumericValue_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._intLength = 9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748) */
        uTF8StreamJsonParser._parseNumericValue(-255);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseNumericValue(int)}
 * @utbot.executesCondition {@code (len <= 9): False}
 * @utbot.executesCondition {@code (len <= 18): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsLong(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long l = _textBuffer.contentsAsLong(_numberNegative);
 *  */
    @Test
    public void test_parseNumericValue_ThrowNullPointerException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseNumericValue(int)
    
    @Test
    public void test_parseNumericValue1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue8() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        nonBlockingJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numberNegative = true;
        uTF8DataInputJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue10() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483643);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseNumericValue(int)
    
    @Test
    public void test_parseNumericValue11() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue13() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 65);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 66 out of bounds for length 40]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue14() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue15() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue16() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue17() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue18() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483640);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:39)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue19() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue20() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue21() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 11);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue22() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue23() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775) */
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue24() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779) */
        uTF8StreamJsonParser._parseNumericValue(16);
    }
    
    @Test
    public void test_parseNumericValue25() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue26() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._intLength = 74;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue27() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775) */
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue28() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2097152);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:860)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:415)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:439)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779) */
        uTF8DataInputJsonParser._parseNumericValue(16);
    }
    
    @Test
    public void test_parseNumericValue29() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test
    public void test_parseNumericValue30() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseNumericValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775) */
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseNumericValue(int)
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue31() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue32() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue33() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue34() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = new char[16];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue35() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue36() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue37() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue38() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue39() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue40() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue41() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue42() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue43() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(16);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseNumericValue44() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser._parseNumericValue(16);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._parseIntValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseIntValue()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseIntValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsInt(boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = _textBuffer.contentsAsInt(_numberNegative);
 *  */
    @Test
    public void test_parseIntValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' ', ' '};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseIntValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:49)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:793) */
        readerBasedJsonParser._parseIntValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseIntValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsInt(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = _textBuffer.contentsAsInt(_numberNegative);
 *  */
    @Test
    public void test_parseIntValue_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._intLength = 9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseIntValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:793) */
        uTF8StreamJsonParser._parseIntValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.loadMore
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method loadMore()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#loadMore()}
 * @utbot.returnsFrom {@code protected }
 *  */
    @Test
    public void testLoadMore_Return() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.loadMore();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.growArrayBy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method growArrayBy([I, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#growArrayBy(int[],int)}
 * @utbot.executesCondition {@code (arr == null): False}
 * @utbot.invokes {@link java.util.Arrays#copyOf(int[],int)}
 * @utbot.returnsFrom {@code return Arrays.copyOf(arr, arr.length + more);}
 *  */
    @Test
    public void testGrowArrayBy_ArrNotEqualsNull() {
        int[] intArray = {1, 1};
        
        int[] actual = ParserBase.growArrayBy(intArray, -1);
        
        int[] expected = {1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#growArrayBy(int[],int)}
 * @utbot.executesCondition {@code (arr == null): True}
 * @utbot.returnsFrom {@code return new int[more];}
 *  */
    @Test
    public void testGrowArrayBy_ArrEqualsNull() {
        int[] actual = ParserBase.growArrayBy(null, 1);
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method growArrayBy([I, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#growArrayBy(int[],int)}
 * @utbot.executesCondition {@code (arr == null): False}
 * @utbot.invokes {@link java.util.Arrays#copyOf(int[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return Arrays.copyOf(arr, arr.length + more);
 *  */
    @Test
    public void testGrowArrayBy_ThrowNegativeArraySizeException() {
        int[] intArray = {1};
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.growArrayBy] produces [java.lang.NegativeArraySizeException: -128]
            java.base/java.util.Arrays.copyOf(Arrays.java:3585)
            com.fasterxml.jackson.core.base.ParserBase.growArrayBy(ParserBase.java:1166) */
        ParserBase.growArrayBy(intArray, -129);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#growArrayBy(int[],int)}
 * @utbot.executesCondition {@code (arr == null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new int[more];
 *  */
    @Test
    public void testGrowArrayBy_ThrowNegativeArraySizeException_1() {
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.growArrayBy] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.core.base.ParserBase.growArrayBy(ParserBase.java:1164) */
        ParserBase.growArrayBy(null, -256);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._decodeEscaped
    
    ///region Errors report for _decodeEscaped
    
    public void test_decodeEscaped_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertNumberToInt()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToInt()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): True}
 * @utbot.executesCondition {@code (((long) result) != _numberLong): False}
 *  */
    @Test
    public void testConvertNumberToInt_ResultEquals_numberLong() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._numberLong = -255L;
        
        uTF8StreamJsonParser.convertNumberToInt();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(-253, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToInt()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) != 0): True}
 * @utbot.executesCondition {@code (_numberDouble < MIN_INT_D): False}
 * @utbot.executesCondition {@code (_numberDouble > MAX_INT_D): False}
 *  */
    @Test
    public void testConvertNumberToInt__numberDoubleLessOrEqualMAX_INT_D() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -247;
        uTF8StreamJsonParser._numberDouble = -1.0118E-320;
        
        uTF8StreamJsonParser.convertNumberToInt();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertNumberToInt()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToInt()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_throwInternal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: _throwInternal();
 *  */
    @Test(expected = RuntimeException.class)
    public void testConvertNumberToInt_ThrowRuntimeException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        
        uTF8StreamJsonParser.convertNumberToInt();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method convertNumberToInt()
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = -9223372034707292160L;
        
        uTF8StreamJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.702511285879055E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -4.297064448E9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -4.294967296000122E9;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815615859885194E154;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -4.294967296001953E9;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt7() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -4.297064448E9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToInt8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[20];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561745822045E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertNumberToInt()
    
    @Test
    public void testConvertNumberToInt9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.6815615859885194E154;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:566)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test
    public void testConvertNumberToInt10() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -4.294971392E9;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:566)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test
    public void testConvertNumberToInt11() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 536870912);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -2.315841784746325E77;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test
    public void testConvertNumberToInt12() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 7.378697629483821E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test
    public void testConvertNumberToInt13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681582044679819E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test
    public void testConvertNumberToInt14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -6.805647338443528E38;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    
    @Test
    public void testConvertNumberToInt15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -4.294967296000001E9;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899) */
        uTF8DataInputJsonParser.convertNumberToInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseSlowFloat(int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseSlowFloat(int)}
 * @utbot.executesCondition {@code (expType == NR_BIGDECIMAL): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _numberDouble = _textBuffer.contentsAsDouble();
 *  */
    @Test
    public void test_parseSlowFloat_ThrowNullPointerException() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = -255;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseSlowFloat(int)}
 * @utbot.executesCondition {@code (expType == NR_BIGDECIMAL): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _numberBigDecimal = _textBuffer.contentsAsDecimal();
 *  */
    @Test
    public void test_parseSlowFloat_ThrowNullPointerException_1() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _parseSlowFloat(int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseSlowFloat(int)}
 * @utbot.executesCondition {@code (expType == NR_BIGDECIMAL): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} 
 *  */
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat_ThrowJsonParseException() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = -255;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseSlowFloat(int)
    
    @Test
    public void test_parseSlowFloat1() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2147483645);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 2147483645, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat2() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1073741827);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.StringIndexOutOfBoundsException: offset 1073741827, count 1073741824, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat3() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:860)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:415)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:439)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat4() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException] */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat5() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:860)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:415)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:439)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat6() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:860)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:415)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:439)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat7() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:843)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:415)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:439)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat8() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:841)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:415)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:439)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:818) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowFloat9() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:399)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseSlowFloat(int)
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat10() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[32];
        _resultArray[0] = '-';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat11() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat12() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat13() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat14() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat15() throws Throwable  {
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        char[] prevNO_CHARS = ((char[]) getStaticFieldValue(textBufferClazz, "NO_CHARS"));
        try {
            char[] noChars = {};
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", Integer.MIN_VALUE);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            
            Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
            Class intType = int.class;
            Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
            _parseSlowFloatMethod.setAccessible(true);
            java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
            _parseSlowFloatMethodArguments[0] = 16;
            try {
                _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat16() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat17() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 0;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat18() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat19() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat20() throws Throwable  {
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        char[] prevNO_CHARS = ((char[]) getStaticFieldValue(textBufferClazz, "NO_CHARS"));
        try {
            char[] noChars = {};
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            
            Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
            Class intType = int.class;
            Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
            _parseSlowFloatMethod.setAccessible(true);
            java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
            _parseSlowFloatMethodArguments[0] = 16;
            try {
                _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowFloat21() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowFloatMethod = parserBaseClazz.getDeclaredMethod("_parseSlowFloat", intType);
        _parseSlowFloatMethod.setAccessible(true);
        java.lang.Object[] _parseSlowFloatMethodArguments = new java.lang.Object[1];
        _parseSlowFloatMethodArguments[0] = 16;
        try {
            _parseSlowFloatMethod.invoke(uTF8StreamJsonParser, _parseSlowFloatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._parseSlowInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseSlowInt(int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseSlowInt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String numStr = _textBuffer.contentsAsString();
 *  */
    @Test
    public void test_parseSlowInt_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = -255;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseSlowInt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String numStr = _textBuffer.contentsAsString();
 *  */
    @Test
    public void test_parseSlowInt_ThrowNullPointerException() throws Throwable  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = -255;
        try {
            _parseSlowIntMethod.invoke(uTF8DataInputJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_parseSlowInt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String numStr = _textBuffer.contentsAsString();
 *  */
    @Test
    public void test_parseSlowInt_ThrowNullPointerException_1() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = -255;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseSlowInt(int)
    
    @Test
    public void test_parseSlowInt1() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2147483645);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 2147483645, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowInt2() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.NegativeArraySizeException: -2147483646]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:394)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowInt3() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4096);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_parseSlowInt4() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4096);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._parseSlowInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833) */
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseSlowInt(int)
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt5() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt6() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt7() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt8() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt9() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt10() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt11() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = JsonParseException.class)
    public void test_parseSlowInt12() throws Throwable  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        
        Class parserBaseClazz = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class intType = int.class;
        Method _parseSlowIntMethod = parserBaseClazz.getDeclaredMethod("_parseSlowInt", intType);
        _parseSlowIntMethod.setAccessible(true);
        java.lang.Object[] _parseSlowIntMethodArguments = new java.lang.Object[1];
        _parseSlowIntMethodArguments[0] = 0;
        try {
            _parseSlowIntMethod.invoke(uTF8StreamJsonParser, _parseSlowIntMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._finishString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _finishString()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_finishString()}
 * @utbot.returnsFrom {@code // Can't declare as deprecated, for now, but shouldn't be needed
 * protected void _finishString() throws IOException {
 * }}
 *  */
    @Test
    public void test_finishString_Return() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        nonBlockingJsonParser._finishString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method loadMoreGuaranteed()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#loadMoreGuaranteed()}
 * @utbot.executesCondition {@code (!loadMore()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#loadMore()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_reportInvalidEOF()}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} when: !loadMore()
 *  */
    @Test(expected = JsonEOFException.class)
    public void testLoadMoreGuaranteed_ThrowJsonEOFException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.loadMoreGuaranteed();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._checkStdFeatureChanges
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _checkStdFeatureChanges(int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & f) != 0): False}
 *  */
    @Test
    public void test_checkStdFeatureChanges_ChangedFeaturesBitwiseAndFEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._checkStdFeatureChanges(-255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & f) != 0): True}
 * @utbot.executesCondition {@code ((newFeatureFlags & f) != 0): False}
 *  */
    @Test
    public void test_checkStdFeatureChanges_NewFeatureFlagsBitwiseAndFEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._checkStdFeatureChanges(1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & f) != 0): True}
 * @utbot.executesCondition {@code ((newFeatureFlags & f) != 0): True}
 * @utbot.executesCondition {@code (_parsingContext.getDupDetector() == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 *  */
    @Test
    public void test_checkStdFeatureChanges__parsingContextGetDupDetectorNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        
        uTF8StreamJsonParser._checkStdFeatureChanges(-255, -255);
        
        JsonReadContext jsonReadContext = uTF8StreamJsonParser._parsingContext;
        DupDetector finalUTF8StreamJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        assertNull(finalUTF8StreamJsonParser_parsingContext_dups);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & f) != 0): True}
 * @utbot.executesCondition {@code ((newFeatureFlags & f) != 0): True}
 * @utbot.executesCondition {@code (_parsingContext.getDupDetector() == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#rootDetector(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 *  */
    @Test
    public void test_checkStdFeatureChanges__parsingContextGetDupDetectorEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        JsonReadContext jsonReadContext = uTF8DataInputJsonParser._parsingContext;
        DupDetector initialUTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        uTF8DataInputJsonParser._checkStdFeatureChanges(-256, -256);
        
        JsonReadContext jsonReadContext1 = uTF8DataInputJsonParser._parsingContext;
        DupDetector finalUTF8DataInputJsonParser_parsingContext_dups = ((DupDetector) getFieldValue(jsonReadContext1, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        
        assertFalse(initialUTF8DataInputJsonParser_parsingContext_dups == finalUTF8DataInputJsonParser_parsingContext_dups);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _checkStdFeatureChanges(int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & f) != 0): True}
 * @utbot.executesCondition {@code ((newFeatureFlags & f) != 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser.Feature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#getDupDetector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.getDupDetector() == null
 *  */
    @Test
    public void test_checkStdFeatureChanges_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._checkStdFeatureChanges] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._checkStdFeatureChanges(ParserBase.java:317) */
        uTF8StreamJsonParser._checkStdFeatureChanges(-255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.getTokenCharacterOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenCharacterOffset()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#getTokenCharacterOffset()}
 * @utbot.returnsFrom {@code return _tokenInputTotal;}
 *  */
    @Test
    public void testGetTokenCharacterOffset_Return_tokenInputTotal() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._tokenInputTotal = 1L;
        
        long actual = uTF8DataInputJsonParser.getTokenCharacterOffset();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._reportTooLongIntegral
    
    ///region OTHER: CHECKED EXCEPTIONS for method _reportTooLongIntegral(int, java.lang.String)
    
    @Test(expected = JsonParseException.class)
    public void test_reportTooLongIntegral1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "";
        
        uTF8StreamJsonParser._reportTooLongIntegral(2, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportTooLongIntegral2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "";
        
        uTF8StreamJsonParser._reportTooLongIntegral(0, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertNumberToLong()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToLong()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): True}
 *  */
    @Test
    public void testConvertNumberToLong__numTypesValidBitwiseAndNR_INTNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._numberLong = -255L;
        
        uTF8StreamJsonParser.convertNumberToLong();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(-253, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToLong()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) != 0): True}
 * @utbot.executesCondition {@code (_numberDouble < MIN_LONG_D): False}
 * @utbot.executesCondition {@code (_numberDouble > MAX_LONG_D): False}
 *  */
    @Test
    public void testConvertNumberToLong__numberDoubleLessOrEqualMAX_LONG_D() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = -246;
        readerBasedJsonParser._numberLong = 0L;
        readerBasedJsonParser._numberDouble = -8.900295434028808E-308;
        
        readerBasedJsonParser.convertNumberToLong();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertNumberToLong()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToLong()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_throwInternal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: _throwInternal();
 *  */
    @Test(expected = RuntimeException.class)
    public void testConvertNumberToLong_ThrowRuntimeException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        
        uTF8StreamJsonParser.convertNumberToLong();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method convertNumberToLong()
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.8446744073709556E19;
        JsonToken _currToken = JsonToken.END_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561587237219E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561587237219E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -7.9266848140492E28;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561585989129E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -6.805647338443528E38;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong7() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.3203649132321566E77;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.8446744073709617E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.145249268790816E155;
        JsonToken _currToken = JsonToken.END_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testConvertNumberToLong10() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561585989129E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertNumberToLong()
    
    @Test
    public void testConvertNumberToLong11() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:931) */
        uTF8StreamJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = -1.844674407370956E19;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8StreamJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong13() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = 2.68156158598852E154;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8StreamJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:311)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:197)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -3.703760333549496E19;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong16() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.68156158598852E154;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong17() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -2.681561585989129E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong18() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong19() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -2.460581896292969E77;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong20() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561586612869E154;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong21() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561586300694E154;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong22() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.8446744073709617E19;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:583)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong23() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.8446761665895596E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong24() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.8446744082299486E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong25() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.95996655783164E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong26() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 6.805647363771781E38;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong27() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561585989129E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong28() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -1.84467440737106E19;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong29() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = -6.805647338443528E38;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    
    @Test
    public void testConvertNumberToLong30() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.681561585989129E154;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927) */
        uTF8DataInputJsonParser.convertNumberToLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._getByteArrayBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _getByteArrayBuilder()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_getByteArrayBuilder()}
 * @utbot.executesCondition {@code (_byteArrayBuilder == null): True}
 * @utbot.returnsFrom {@code return _byteArrayBuilder;}
 *  */
    @Test
    public void test_getByteArrayBuilder__byteArrayBuilderEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        ByteArrayBuilder initialUTF8StreamJsonParser_byteArrayBuilder = uTF8StreamJsonParser._byteArrayBuilder;
        
        ByteArrayBuilder actual = uTF8StreamJsonParser._getByteArrayBuilder();
        
        ByteArrayBuilder expected = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        byte[] _currBlock = new byte[500];
        setField(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        
        BufferRecycler actual_bufferRecycler = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_bufferRecycler"));
        assertNull(actual_bufferRecycler);
        
        LinkedList expected_pastBlocks = ((LinkedList) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        LinkedList actual_pastBlocks = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        assertTrue(deepEquals(expected_pastBlocks, actual_pastBlocks));
        
        int expected_pastLen = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        int actual_pastLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        assertEquals(expected_pastLen, actual_pastLen);
        
        byte[] expected_currBlock = ((byte[]) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        byte[] actual_currBlock = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        int expected_currBlockSize = expected_currBlock.length;
        assertEquals(expected_currBlockSize, actual_currBlock.length);
        assertArrayEquals(expected_currBlock, actual_currBlock);
        
        int expected_currBlockPtr = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        int actual_currBlockPtr = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        assertEquals(expected_currBlockPtr, actual_currBlockPtr);
        
        ByteArrayBuilder finalUTF8StreamJsonParser_byteArrayBuilder = uTF8StreamJsonParser._byteArrayBuilder;
        
        assertFalse(initialUTF8StreamJsonParser_byteArrayBuilder == finalUTF8StreamJsonParser_byteArrayBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_getByteArrayBuilder()}
 * @utbot.executesCondition {@code (_byteArrayBuilder == null): False}
 * @utbot.returnsFrom {@code return _byteArrayBuilder;}
 *  */
    @Test
    public void test_getByteArrayBuilder__byteArrayBuilderNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
        uTF8StreamJsonParser._byteArrayBuilder = _byteArrayBuilder;
        
        ByteArrayBuilder actual = uTF8StreamJsonParser._getByteArrayBuilder();
        
        BufferRecycler actual_bufferRecycler = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_bufferRecycler"));
        assertNull(actual_bufferRecycler);
        
        LinkedList _byteArrayBuilder_pastBlocks = ((LinkedList) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        LinkedList actual_pastBlocks = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        assertTrue(deepEquals(_byteArrayBuilder_pastBlocks, actual_pastBlocks));
        
        int _byteArrayBuilder_pastLen = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        int actual_pastLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        assertEquals(_byteArrayBuilder_pastLen, actual_pastLen);
        
        byte[] actual_currBlock = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        assertNull(actual_currBlock);
        
        int _byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        int actual_currBlockPtr = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        assertEquals(_byteArrayBuilder_currBlockPtr, actual_currBlockPtr);
        
        ByteArrayBuilder byteArrayBuilder = uTF8StreamJsonParser._byteArrayBuilder;
        int finalUTF8StreamJsonParser_byteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        ByteArrayBuilder byteArrayBuilder1 = uTF8StreamJsonParser._byteArrayBuilder;
        int finalUTF8StreamJsonParser_byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder1, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        
        assertEquals(0, finalUTF8StreamJsonParser_byteArrayBuilder_pastLen);
        
        assertEquals(0, finalUTF8StreamJsonParser_byteArrayBuilder_currBlockPtr);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_getByteArrayBuilder()}
 * @utbot.executesCondition {@code (_byteArrayBuilder == null): False}
 * @utbot.returnsFrom {@code return _byteArrayBuilder;}
 *  */
    @Test
    public void test_getByteArrayBuilder__byteArrayBuilderNotEqualsNull_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
        uTF8StreamJsonParser._byteArrayBuilder = _byteArrayBuilder;
        
        ByteArrayBuilder actual = uTF8StreamJsonParser._getByteArrayBuilder();
        
        BufferRecycler actual_bufferRecycler = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_bufferRecycler"));
        assertNull(actual_bufferRecycler);
        
        LinkedList _byteArrayBuilder_pastBlocks = ((LinkedList) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        LinkedList actual_pastBlocks = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        assertTrue(deepEquals(_byteArrayBuilder_pastBlocks, actual_pastBlocks));
        
        int _byteArrayBuilder_pastLen = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        int actual_pastLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        assertEquals(_byteArrayBuilder_pastLen, actual_pastLen);
        
        byte[] actual_currBlock = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        assertNull(actual_currBlock);
        
        int _byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        int actual_currBlockPtr = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        assertEquals(_byteArrayBuilder_currBlockPtr, actual_currBlockPtr);
        
        ByteArrayBuilder byteArrayBuilder = uTF8StreamJsonParser._byteArrayBuilder;
        int finalUTF8StreamJsonParser_byteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        ByteArrayBuilder byteArrayBuilder1 = uTF8StreamJsonParser._byteArrayBuilder;
        int finalUTF8StreamJsonParser_byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder1, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        
        assertEquals(0, finalUTF8StreamJsonParser_byteArrayBuilder_pastLen);
        
        assertEquals(0, finalUTF8StreamJsonParser_byteArrayBuilder_currBlockPtr);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertNumberToBigInteger()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToBigInteger()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): True}
 *  */
    @Test
    public void testConvertNumberToBigInteger__numTypesValidBitwiseAndNR_LONGNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = -16L;
        
        BigInteger initialUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        uTF8StreamJsonParser.convertNumberToBigInteger();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigInteger finalUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigInt == finalUTF8StreamJsonParser_numberBigInt);
        
        assertEquals(-250, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToBigInteger()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): True}
 *  */
    @Test
    public void testConvertNumberToBigInteger__numTypesValidBitwiseAndNR_INTNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        
        BigInteger initialUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        uTF8StreamJsonParser.convertNumberToBigInteger();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigInteger finalUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigInt == finalUTF8StreamJsonParser_numberBigInt);
        
        assertEquals(-251, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToBigInteger()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): True}
 * @utbot.invokes {@link java.math.BigDecimal#toBigInteger()}
 *  */
    @Test
    public void testConvertNumberToBigInteger__numTypesValidBitwiseAndNR_BIGDECIMALNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "intVal", intVal);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        BigInteger initialUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        uTF8StreamJsonParser.convertNumberToBigInteger();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        BigInteger finalUTF8StreamJsonParser_numberBigInt = uTF8StreamJsonParser._numberBigInt;
        
        assertFalse(initialUTF8StreamJsonParser_numberBigInt == finalUTF8StreamJsonParser_numberBigInt);
        
        assertEquals(-235, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertNumberToBigInteger()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToBigInteger()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): True}
 * @utbot.invokes {@link java.math.BigDecimal#toBigInteger()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _numberBigInt = _numberBigDecimal.toBigInteger();
 *  */
    @Test
    public void testConvertNumberToBigInteger_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger(ParserBase.java:946) */
        uTF8StreamJsonParser.convertNumberToBigInteger();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertNumberToBigInteger()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToBigInteger()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_DOUBLE) != 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_throwInternal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: _throwInternal();
 *  */
    @Test(expected = RuntimeException.class)
    public void testConvertNumberToBigInteger_ThrowRuntimeException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -252;
        
        uTF8StreamJsonParser.convertNumberToBigInteger();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertNumberToBigInteger()
    
    @Test
    public void testConvertNumberToBigInteger1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = java.lang.Double.NaN;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger] produces [java.lang.NumberFormatException: Character N is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            java.base/java.math.BigDecimal.valueOf(BigDecimal.java:1368)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger(ParserBase.java:952) */
        uTF8StreamJsonParser.convertNumberToBigInteger();
    }
    
    @Test
    public void testConvertNumberToBigInteger2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1073741824);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", 9223367638808264701L);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            java.base/java.math.BigDecimal.bigTenToThe(BigDecimal.java:4095)
            java.base/java.math.BigDecimal.setScale(BigDecimal.java:2942)
            java.base/java.math.BigDecimal.toBigInteger(BigDecimal.java:3542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger(ParserBase.java:946) */
        uTF8StreamJsonParser.convertNumberToBigInteger();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertNumberToDouble()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): True}
 *  */
    @Test
    public void testConvertNumberToDouble__numTypesValidBitwiseAndNR_LONGNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -254;
        uTF8StreamJsonParser._numberLong = -255L;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        uTF8StreamJsonParser.convertNumberToDouble();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-246, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): True}
 *  */
    @Test
    public void testConvertNumberToDouble__numTypesValidBitwiseAndNR_INTNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -255;
        uTF8StreamJsonParser._numberInt = -255;
        uTF8StreamJsonParser._numberDouble = 0.0;
        
        uTF8StreamJsonParser.convertNumberToDouble();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-247, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): True}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 *  */
    @Test
    public void testConvertNumberToDouble__numTypesValidBitwiseAndNR_BIGINTNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -251;
        uTF8StreamJsonParser._numberDouble = 0.0;
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        uTF8StreamJsonParser._numberBigInt = _numberBigInt;
        
        uTF8StreamJsonParser.convertNumberToDouble();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(-243, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): True}
 * @utbot.invokes {@link java.math.BigDecimal#doubleValue()}
 *  */
    @Test
    public void testConvertNumberToDouble__numTypesValidBitwiseAndNR_BIGDECIMALNotEqualsZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        uTF8StreamJsonParser._numberDouble = 0.0;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", -255L);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        uTF8StreamJsonParser.convertNumberToDouble();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        double finalUTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        
        assertEquals(-231, finalUTF8StreamJsonParser_numTypesValid);
        
        org.junit.Assert.assertEquals(-255.0, finalUTF8StreamJsonParser_numberDouble, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertNumberToDouble()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): True}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _numberDouble = _numberBigInt.doubleValue();
 *  */
    @Test
    public void testConvertNumberToDouble_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -251;
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(_numberBigInt, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(_numberBigInt, "java.math.BigInteger", "mag", mag);
        uTF8StreamJsonParser._numberBigInt = _numberBigInt;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:970) */
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): True}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _numberDouble = _numberBigInt.doubleValue();
 *  */
    @Test
    public void testConvertNumberToDouble_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -251;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:970) */
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): True}
 * @utbot.invokes {@link java.math.BigDecimal#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _numberDouble = _numberBigDecimal.doubleValue();
 *  */
    @Test
    public void testConvertNumberToDouble_ThrowNullPointerException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -239;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968) */
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertNumberToDouble()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#convertNumberToDouble()}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGDECIMAL) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_BIGINT) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_LONG) != 0): False}
 * @utbot.executesCondition {@code ((_numTypesValid & NR_INT) != 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_throwInternal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: _throwInternal();
 *  */
    @Test(expected = RuntimeException.class)
    public void testConvertNumberToDouble_ThrowRuntimeException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = -248;
        
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertNumberToDouble()
    
    @Test
    public void testConvertNumberToDouble1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "!";
        setField(_numberBigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble] produces [java.lang.NumberFormatException: For input string: "!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968) */
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    
    @Test
    public void testConvertNumberToDouble2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "\u0001";
        setField(_numberBigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968) */
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    
    @Test
    public void testConvertNumberToDouble3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(intVal, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        uTF8StreamJsonParser._numberBigDecimal = _numberBigDecimal;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:968) */
        uTF8StreamJsonParser.convertNumberToDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._reportMismatchedEndMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportMismatchedEndMarker(int, char)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_reportMismatchedEndMarker(int,char)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#getParsingContext()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonReadContext#typeDesc()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (char) actCh
 *  */
    @Test
    public void test_reportMismatchedEndMarker_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._reportMismatchedEndMarker] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._reportMismatchedEndMarker(ParserBase.java:1016) */
        uTF8StreamJsonParser._reportMismatchedEndMarker(-255, ' ');
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _reportMismatchedEndMarker(int, char)
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        
        uTF8DataInputJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 65536);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8DataInputJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8StreamJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8StreamJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8StreamJsonParser._parsingContext = _parsingContext;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8StreamJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_reportMismatchedEndMarker8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        
        uTF8DataInputJsonParser._reportMismatchedEndMarker(0, '\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method convertNumberToBigDecimal()
    
    @Test
    public void testConvertNumberToBigDecimal1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = 11L;
        
        uTF8StreamJsonParser.convertNumberToBigDecimal();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(18, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testConvertNumberToBigDecimal2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 1;
        uTF8DataInputJsonParser._numberInt = 2;
        
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        
        assertEquals(17, finalUTF8DataInputJsonParser_numTypesValid);
    }
    
    @Test
    public void testConvertNumberToBigDecimal3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 4;
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(_numberBigInt, "java.math.BigInteger", "mag", mag);
        uTF8StreamJsonParser._numberBigInt = _numberBigInt;
        
        uTF8StreamJsonParser.convertNumberToBigDecimal();
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(20, finalUTF8StreamJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertNumberToBigDecimal()
    
    @Test
    public void testConvertNumberToBigDecimal4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:289)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8StreamJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 8;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:289)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 4;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:995) */
        uTF8StreamJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal7() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 524288);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:289)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal10() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test
    public void testConvertNumberToBigDecimal11() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
            com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:283)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:677)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:993) */
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertNumberToBigDecimal()
    
    @Test(expected = RuntimeException.class)
    public void testConvertNumberToBigDecimal12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser.convertNumberToBigDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testConvertNumberToBigDecimal13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.END_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testConvertNumberToBigDecimal14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testConvertNumberToBigDecimal15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testConvertNumberToBigDecimal16() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testConvertNumberToBigDecimal17() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.convertNumberToBigDecimal();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._handleUnrecognizedCharacterEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleUnrecognizedCharacterEscape(char)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_handleUnrecognizedCharacterEscape(char)}
 *  */
    @Test
    public void test_handleUnrecognizedCharacterEscape_ReturnCh() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 64);
        
        char actual = readerBasedJsonParser._handleUnrecognizedCharacterEscape(' ');
        
        assertEquals(' ', actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_handleUnrecognizedCharacterEscape(char)}
 * @utbot.executesCondition {@code (ch == '\''): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#isEnabled(com.fasterxml.jackson.core.JsonParser.Feature)}
 *  */
    @Test
    public void test_handleUnrecognizedCharacterEscape_ChEqualsChar() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 16);
        
        char actual = readerBasedJsonParser._handleUnrecognizedCharacterEscape('\'');
        
        assertEquals('\'', actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _handleUnrecognizedCharacterEscape(char)
    
    @Test(expected = JsonParseException.class)
    public void test_handleUnrecognizedCharacterEscape1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._handleUnrecognizedCharacterEscape(' ');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_handleUnrecognizedCharacterEscape2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._handleUnrecognizedCharacterEscape('\u0001');
    }
    
    @Test(expected = JsonParseException.class)
    public void test_handleUnrecognizedCharacterEscape3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._handleUnrecognizedCharacterEscape('\u01A0');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._throwUnquotedSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _throwUnquotedSpace(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_throwUnquotedSpace(int,java.lang.String)}
 * @utbot.executesCondition {@code (i > INT_SPACE): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#isEnabled(com.fasterxml.jackson.core.JsonParser.Feature)}
 *  */
    @Test
    public void test_throwUnquotedSpace_ILessOrEqualINT_SPACE() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        
        uTF8DataInputJsonParser._throwUnquotedSpace(32, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _throwUnquotedSpace(int, java.lang.String)
    
    @Test(expected = JsonParseException.class)
    public void test_throwUnquotedSpace1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        nonBlockingJsonParser._throwUnquotedSpace(128, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwUnquotedSpace2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        nonBlockingJsonParser._throwUnquotedSpace(416, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwUnquotedSpace3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        
        nonBlockingJsonParser._throwUnquotedSpace(127, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwUnquotedSpace4() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        
        nonBlockingJsonParser._throwUnquotedSpace(33, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwUnquotedSpace5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        
        nonBlockingJsonParser._throwUnquotedSpace(417, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#decodeBase64Char(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 47};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {0};
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 47 out of bounds for length 1]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:218)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 92};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,int,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowNullPointerException_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 114};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,int,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowNullPointerException_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 116};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,int,int)}
 * @utbot.executesCondition {@code (ch != '\\'): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_decodeEscaped()}
 * @utbot.throwsException {@link java.io.EOFException} in: int unescaped = _decodeEscaped();
 *  */
    @Test(expected = EOFException.class)
    public void test_decodeBase64Escape_ThrowEOFException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    @Test
    public void test_decodeBase64Escape1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 114);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        Object uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn = getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "in");
        int finalUTF8DataInputJsonParser_inputDataBinInPeekb = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn, "java.io.ObjectInputStream$PeekInputStream", "peekb"));
        
        assertEquals(-1, finalUTF8DataInputJsonParser_inputDataBinInPeekb);
    }
    
    @Test
    public void test_decodeBase64Escape2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 98);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        Object uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn = getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "in");
        int finalUTF8DataInputJsonParser_inputDataBinInPeekb = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn, "java.io.ObjectInputStream$PeekInputStream", "peekb"));
        
        assertEquals(-1, finalUTF8DataInputJsonParser_inputDataBinInPeekb);
    }
    
    @Test
    public void test_decodeBase64Escape3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 102);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        Object uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn = getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "in");
        int finalUTF8DataInputJsonParser_inputDataBinInPeekb = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn, "java.io.ObjectInputStream$PeekInputStream", "peekb"));
        
        assertEquals(-1, finalUTF8DataInputJsonParser_inputDataBinInPeekb);
    }
    
    @Test
    public void test_decodeBase64Escape4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 110);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        Object uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn = getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "in");
        int finalUTF8DataInputJsonParser_inputDataBinInPeekb = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin_inputDataBinIn, "java.io.ObjectInputStream$PeekInputStream", "peekb"));
        
        assertEquals(-1, finalUTF8DataInputJsonParser_inputDataBinInPeekb);
    }
    
    @Test
    public void test_decodeBase64Escape5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 128);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 64);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(1, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    @Test
    public void test_decodeBase64Escape6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 114
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[14];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 1);
        
        assertEquals(0, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(9, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    @Test
    public void test_decodeBase64Escape7() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 116
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(9, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    @Test
    public void test_decodeBase64Escape8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", Integer.MIN_VALUE);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2483)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) -64
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(UTF8DataInputJsonParser.java:2546)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2508)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape10() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) -32
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(UTF8DataInputJsonParser.java:2546)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2508)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape11() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) -16
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(UTF8DataInputJsonParser.java:2546)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2508)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape12() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 117
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2514)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 34
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:218)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 117);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2514)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 116
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:218)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 1);
    }
    
    @Test
    public void test_decodeBase64Escape16() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        Object _inputData = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 122);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        ObjectInputStream this$0 = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", this$0);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2912)
            java.base/java.io.ObjectInputStream$PeekInputStream.readFully(ObjectInputStream.java:2924)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3113)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2483)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape17() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        Object _inputData = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 121);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        ObjectInputStream this$0 = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", this$0);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.clear(ObjectInputStream.java:1667)
            java.base/java.io.ObjectInputStream.handleReset(ObjectInputStream.java:2565)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3130)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2483)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1069) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test
    public void test_decodeBase64Escape18() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 102
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), 92, 1);
    }
    
    @Test
    public void test_decodeBase64Escape19() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 102
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:218)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1077) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 1);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    @Test(expected = JsonParseException.class)
    public void test_decodeBase64Escape20() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void test_decodeBase64Escape21() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        Object _inputData = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        ObjectInputStream this$0 = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", this$0);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 0);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape22() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0000');
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 130, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '$');
        
        readerBasedJsonParser._decodeBase64Escape(base64Variant, 36, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape24() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._decodeBase64Escape(((Base64Variant) null), 5, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape25() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 114
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[14];
        _asciiToBase64[13] = Integer.MIN_VALUE;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, 92, 1);
    }
    ///endregion
    
    ///region Errors report for _decodeBase64Escape
    
    public void test_decodeBase64Escape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (index == 0): True}
    /// return from: {@code return -1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void test_decodeBase64Escape_ReturnNegative1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 110};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(2, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void test_decodeBase64Escape_ReturnNegative1_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 102};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(2, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void test_decodeBase64Escape_ReturnNegative1_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 114};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(2, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (index == 0): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.core.Base64Variant#decodeBase64Char(char)} once
    /// execute conditions:
    ///     {@code (null): True}
    /// return from: {@code return bits;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.returnsFrom {@code return bits;}
 *  */
    @Test
    public void test_decodeBase64Escape_ReturnBits() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 98};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {
            3, 3, 3, 3, 3, 3, 3, 3,
            0
        };
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', -255);
        
        assertEquals(0, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(2, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.executesCondition {@code (bits != Base64Variant.BASE64_VALUE_PADDING): False}
 * @utbot.executesCondition {@code (index < 2): False}
 * @utbot.returnsFrom {@code return bits;}
 *  */
    @Test
    public void test_decodeBase64Escape_IndexGreaterOrEqual2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 98};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            -2
        };
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 2);
        
        assertEquals(-2, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(2, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#decodeBase64Char(char)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 34};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {};
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 0]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:213)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1099) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', -255);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowNullPointerException1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 110};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1099) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 1);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowNullPointerException_11() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 34};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1099) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 2);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int bits = b64variant.decodeBase64Char(unescaped);
 *  */
    @Test
    public void test_decodeBase64Escape_ThrowNullPointerException_21() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {(byte) 0, (byte) 98};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1099) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant,char,int)}
 * @utbot.executesCondition {@code (ch != '\\'): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserBase#_decodeEscaped()}
 * @utbot.throwsException {@link java.io.EOFException} in: char unescaped = _decodeEscaped();
 *  */
    @Test(expected = EOFException.class)
    public void test_decodeBase64Escape_ThrowEOFException1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    
    @Test
    public void test_decodeBase64Escape26() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 116
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(9, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    @Test
    public void test_decodeBase64Escape27() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 524288);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 64);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(1, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    
    @Test
    public void test_decodeBase64Escape28() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 98
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        int actual = uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
        
        assertEquals(-1, actual);
        
        DataInput uTF8DataInputJsonParser_inputData = ((DataInput) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object uTF8DataInputJsonParser_inputData_inputDataBin = getFieldValue(uTF8DataInputJsonParser_inputData, "java.io.ObjectInputStream", "bin");
        int finalUTF8DataInputJsonParser_inputDataBinPos = ((Integer) getFieldValue(uTF8DataInputJsonParser_inputData_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "pos"));
        
        assertEquals(9, finalUTF8DataInputJsonParser_inputDataBinPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    
    @Test
    public void test_decodeBase64Escape29() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 1073741824);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2483)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape30() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 117
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2514)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape31() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) -16
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(UTF8DataInputJsonParser.java:2546)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2508)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape32() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) -32
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(UTF8DataInputJsonParser.java:2546)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2508)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape33() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) -64
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(UTF8DataInputJsonParser.java:2546)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2508)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape34() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {};
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1025);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2912)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2483)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape35() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 47
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:213)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1099) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test
    public void test_decodeBase64Escape36() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 114
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:213)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1099) */
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 1);
    }
    
    @Test
    public void test_decodeBase64Escape37() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 121);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(_inputData, "java.io.ObjectInputStream", "depth", 0L);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.clear(ObjectInputStream.java:1667)
            java.base/java.io.ObjectInputStream.handleReset(ObjectInputStream.java:2565)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3130)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeEscaped(UTF8DataInputJsonParser.java:2483)
            com.fasterxml.jackson.core.base.ParserBase._decodeBase64Escape(ParserBase.java:1091) */
        uTF8DataInputJsonParser._decodeBase64Escape(((Base64Variant) null), '\\', 0);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    
    @Test(expected = JsonParseException.class)
    public void test_decodeBase64Escape38() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_decodeBase64Escape39() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void test_decodeBase64Escape40() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        ObjectInputStream this$0 = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", this$0);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _decodeBase64Escape(com.fasterxml.jackson.core.Base64Variant, char, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape41() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '!');
        
        uTF8StreamJsonParser._decodeBase64Escape(base64Variant, '!', 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape42() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._decodeBase64Escape(((Base64Variant) null), '\u0011', 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape43() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 34
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[34] = -2;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape44() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 98
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            -2
        };
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape45() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 98
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            Integer.MIN_VALUE
        };
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape46() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 34
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[34] = Integer.MIN_VALUE;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_decodeBase64Escape47() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 110
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[11];
        _asciiToBase64[10] = -2;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64Escape(base64Variant, '\\', 1);
    }
    ///endregion
    
    ///region Errors report for _decodeBase64Escape
    
    public void test_decodeBase64Escape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._handleBase64MissingPadding
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleBase64MissingPadding(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_handleBase64MissingPadding(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#missingPaddingMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _reportError(b64variant.missingPaddingMessage());
 *  */
    @Test
    public void test_handleBase64MissingPadding_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._handleBase64MissingPadding] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleBase64MissingPadding(ParserBase.java:1139) */
        uTF8DataInputJsonParser._handleBase64MissingPadding(null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _handleBase64MissingPadding(com.fasterxml.jackson.core.Base64Variant)
    
    @Test(expected = JsonParseException.class)
    public void test_handleBase64MissingPadding1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0000');
        
        readerBasedJsonParser._handleBase64MissingPadding(base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase._getSourceReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _getSourceReference()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_getSourceReference()}
 * @utbot.executesCondition {@code (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(_features)): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_getSourceReference_NotJsonParserFeatureINCLUDE_SOURCE_IN_LOCATIONEnabledIn() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 1);
        
        Object actual = uTF8StreamJsonParser._getSourceReference();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_getSourceReference()}
 * @utbot.executesCondition {@code (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(_features)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#getSourceReference()}
 * @utbot.returnsFrom {@code return _ioContext.getSourceReference();}
 *  */
    @Test
    public void test_getSourceReference_JsonParserFeatureINCLUDE_SOURCE_IN_LOCATIONEnabledIn() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        Object actual = uTF8StreamJsonParser._getSourceReference();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _getSourceReference()
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#_getSourceReference()}
 * @utbot.executesCondition {@code (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(_features)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser.Feature#enabledIn(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#getSourceReference()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _ioContext.getSourceReference();
 *  */
    @Test
    public void test_getSourceReference_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase._getSourceReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._getSourceReference(ParserBase.java:1156) */
        uTF8StreamJsonParser._getSourceReference();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.reportInvalidBase64Char
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportInvalidBase64Char(com.fasterxml.jackson.core.Base64Variant, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserBase#reportInvalidBase64Char(com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String)}
 * @utbot.executesCondition {@code (ch <= INT_SPACE): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#usesPaddingChar(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b64variant.usesPaddingChar(ch)
 *  */
    @Test
    public void testReportInvalidBase64Char_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserBase.reportInvalidBase64Char] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.reportInvalidBase64Char(ParserBase.java:1122) */
        uTF8StreamJsonParser.reportInvalidBase64Char(null, 33, -255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reportInvalidBase64Char(com.fasterxml.jackson.core.Base64Variant, int, int, java.lang.String)
    
    @Test
    public void testReportInvalidBase64Char1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '!');
        
        IllegalArgumentException actual = uTF8StreamJsonParser.reportInvalidBase64Char(base64Variant, 33, 0, null);
        
        IllegalArgumentException expected = ((IllegalArgumentException) createInstance("java.lang.IllegalArgumentException"));
        
    }
    
    @Test
    public void testReportInvalidBase64Char2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        IllegalArgumentException actual = uTF8StreamJsonParser.reportInvalidBase64Char(null, 4, 0, null);
        
        IllegalArgumentException expected = ((IllegalArgumentException) createInstance("java.lang.IllegalArgumentException"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserBase.reportInvalidBase64Char
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reportInvalidBase64Char(com.fasterxml.jackson.core.Base64Variant, int, int)
    
    @Test
    public void testReportInvalidBase64Char3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '$');
        
        IllegalArgumentException actual = nonBlockingJsonParser.reportInvalidBase64Char(base64Variant, 36, 0);
        
        IllegalArgumentException expected = ((IllegalArgumentException) createInstance("java.lang.IllegalArgumentException"));
        
    }
    
    @Test
    public void testReportInvalidBase64Char4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        IllegalArgumentException actual = uTF8StreamJsonParser.reportInvalidBase64Char(null, 0, 0);
        
        IllegalArgumentException expected = ((IllegalArgumentException) createInstance("java.lang.IllegalArgumentException"));
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1027736998819700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1027736998819700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1027736998825600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027736998819700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027736998825600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027736999162400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027736999162400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027736999164400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027736999162400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027736999164400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1027737004252400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027737004252400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027737004254800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027737004252400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027737004254800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027737005003500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027737005003500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027737005004900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027737005003500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027737005004900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

