package com.fasterxml.jackson.core.io;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_io_IOContextTest {
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.getEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEncoding()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#getEncoding()}
 * @utbot.returnsFrom {@code return _encoding;}
 *  */
    @Test
    public void testGetEncoding_Return_encoding() {
        IOContext iOContext = new IOContext(null, null, false);
        
        JsonEncoding actual = iOContext.getEncoding();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.setEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEncoding(com.fasterxml.jackson.core.JsonEncoding)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#setEncoding(com.fasterxml.jackson.core.JsonEncoding)}
 *  */
    @Test
    public void testSetEncoding() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.setEncoding(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseWriteEncodingBuffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): False}
 *  */
    @Test
    public void testReleaseWriteEncodingBuffer_BufEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.releaseWriteEncodingBuffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseByteBuffer(int,byte[])}
 *  */
    @Test
    public void testReleaseWriteEncodingBuffer_BufNotEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        byte[][] _byteBuffers = {
            null,
            null
        };
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127, (byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        
        BufferRecycler bufferRecycler1 = iOContext._bufferRecycler;
        byte[][] bufferRecycler1_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler1, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] initialIOContext_bufferRecycler_byteBuffers1 = ((byte[]) get(bufferRecycler1_bufferRecycler_byteBuffers, 1));
        
        iOContext.releaseWriteEncodingBuffer(_writeEncodingBuffer);
        
        BufferRecycler bufferRecycler2 = iOContext._bufferRecycler;
        byte[][] bufferRecycler2_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler2, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers0 = ((byte[]) get(bufferRecycler2_bufferRecycler_byteBuffers, 0));
        BufferRecycler bufferRecycler3 = iOContext._bufferRecycler;
        byte[][] bufferRecycler3_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler3, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers1 = ((byte[]) get(bufferRecycler3_bufferRecycler_byteBuffers, 1));
        byte[] finalIOContext_writeEncodingBuffer = iOContext._writeEncodingBuffer;
        
        assertFalse(initialIOContext_bufferRecycler_byteBuffers1 == finalIOContext_bufferRecycler_byteBuffers1);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers0);
        
        assertNull(finalIOContext_writeEncodingBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseWriteEncodingBuffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseByteBuffer(int,byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER, buf);
 *  */
    @Test
    public void testReleaseWriteEncodingBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        byte[][] _byteBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseByteBuffer(BufferRecycler.java:104)
            com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer(IOContext.java:224) */
        iOContext.releaseWriteEncodingBuffer(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER, buf);
 *  */
    @Test
    public void testReleaseWriteEncodingBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer(IOContext.java:224) */
        iOContext.releaseWriteEncodingBuffer(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER, buf);
 *  */
    @Test
    public void testReleaseWriteEncodingBuffer_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer(IOContext.java:224) */
        iOContext.releaseWriteEncodingBuffer(_writeEncodingBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method releaseWriteEncodingBuffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _verifyRelease(buf, _writeEncodingBuffer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWriteEncodingBuffer_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        byte[] byteArray = {(byte) -127};
        
        iOContext.releaseWriteEncodingBuffer(byteArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method releaseWriteEncodingBuffer([B)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseWriteEncodingBuffer(byte[])}
     */
    @Test
    public void testReleaseWriteEncodingBufferThrowsNPEWithNonEmptyPrimitiveArray() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:274)
            com.fasterxml.jackson.core.io.IOContext.releaseWriteEncodingBuffer(IOContext.java:222) */
        iOContext.releaseWriteEncodingBuffer(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.constructTextBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructTextBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#constructTextBuffer()}
 * @utbot.returnsFrom {@code return new TextBuffer(_bufferRecycler);}
 *  */
    @Test
    public void testConstructTextBuffer_Return() throws Exception  {
        IOContext iOContext = new IOContext(null, null, false);
        
        TextBuffer actual = iOContext.constructTextBuffer();
        
        TextBuffer expected = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        
        BufferRecycler actual_allocator = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        assertNull(actual_allocator);
        
        char[] actual_inputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        int expected_inputStart = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int actual_inputStart = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        assertEquals(expected_inputStart, actual_inputStart);
        
        int expected_inputLen = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int actual_inputLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        assertEquals(expected_inputLen, actual_inputLen);
        
        ArrayList actual_segments = ((ArrayList) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_segments"));
        assertNull(actual_segments);
        
        boolean actual_hasSegments = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        assertFalse(actual_hasSegments);
        
        int expected_segmentSize = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int actual_segmentSize = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        assertEquals(expected_segmentSize, actual_segmentSize);
        
        char[] actual_currentSegment = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        assertNull(actual_currentSegment);
        
        int expected_currentSize = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        int actual_currentSize = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        assertEquals(expected_currentSize, actual_currentSize);
        
        String actual_resultString = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString"));
        assertNull(actual_resultString);
        
        char[] actual_resultArray = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        assertNull(actual_resultArray);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseNameCopyBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): False}
 *  */
    @Test
    public void testReleaseNameCopyBuffer_BufEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.releaseNameCopyBuffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 *  */
    @Test
    public void testReleaseNameCopyBuffer_BufNotEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
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
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        char[] _nameCopyBuffer = {' ', ' '};
        iOContext._nameCopyBuffer = _nameCopyBuffer;
        
        BufferRecycler bufferRecycler1 = iOContext._bufferRecycler;
        char[][] bufferRecycler1_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] initialIOContext_bufferRecycler_charBuffers3 = ((char[]) get(bufferRecycler1_bufferRecycler_charBuffers, 3));
        
        iOContext.releaseNameCopyBuffer(_nameCopyBuffer);
        
        BufferRecycler bufferRecycler2 = iOContext._bufferRecycler;
        char[][] bufferRecycler2_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers0 = ((char[]) get(bufferRecycler2_bufferRecycler_charBuffers, 0));
        BufferRecycler bufferRecycler3 = iOContext._bufferRecycler;
        char[][] bufferRecycler3_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler3, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers1 = ((char[]) get(bufferRecycler3_bufferRecycler_charBuffers, 1));
        BufferRecycler bufferRecycler4 = iOContext._bufferRecycler;
        char[][] bufferRecycler4_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler4, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers2 = ((char[]) get(bufferRecycler4_bufferRecycler_charBuffers, 2));
        BufferRecycler bufferRecycler5 = iOContext._bufferRecycler;
        char[][] bufferRecycler5_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler5, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers3 = ((char[]) get(bufferRecycler5_bufferRecycler_charBuffers, 3));
        BufferRecycler bufferRecycler6 = iOContext._bufferRecycler;
        char[][] bufferRecycler6_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler6, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers4 = ((char[]) get(bufferRecycler6_bufferRecycler_charBuffers, 4));
        BufferRecycler bufferRecycler7 = iOContext._bufferRecycler;
        char[][] bufferRecycler7_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler7, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers5 = ((char[]) get(bufferRecycler7_bufferRecycler_charBuffers, 5));
        BufferRecycler bufferRecycler8 = iOContext._bufferRecycler;
        char[][] bufferRecycler8_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler8, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers6 = ((char[]) get(bufferRecycler8_bufferRecycler_charBuffers, 6));
        BufferRecycler bufferRecycler9 = iOContext._bufferRecycler;
        char[][] bufferRecycler9_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler9, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers7 = ((char[]) get(bufferRecycler9_bufferRecycler_charBuffers, 7));
        BufferRecycler bufferRecycler10 = iOContext._bufferRecycler;
        char[][] bufferRecycler10_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler10, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers8 = ((char[]) get(bufferRecycler10_bufferRecycler_charBuffers, 8));
        char[] finalIOContext_nameCopyBuffer = iOContext._nameCopyBuffer;
        
        assertFalse(initialIOContext_bufferRecycler_charBuffers3 == finalIOContext_bufferRecycler_charBuffers3);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers0);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers1);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers2);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers4);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers5);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers6);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers7);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers8);
        
        assertNull(finalIOContext_nameCopyBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseNameCopyBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_NAME_COPY_BUFFER, buf);
 *  */
    @Test
    public void testReleaseNameCopyBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        char[] _nameCopyBuffer = {' '};
        iOContext._nameCopyBuffer = _nameCopyBuffer;
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:132)
            com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer(IOContext.java:258) */
        iOContext.releaseNameCopyBuffer(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_NAME_COPY_BUFFER, buf);
 *  */
    @Test
    public void testReleaseNameCopyBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _nameCopyBuffer = {' '};
        iOContext._nameCopyBuffer = _nameCopyBuffer;
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer(IOContext.java:258) */
        iOContext.releaseNameCopyBuffer(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_NAME_COPY_BUFFER, buf);
 *  */
    @Test
    public void testReleaseNameCopyBuffer_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _nameCopyBuffer = {' '};
        iOContext._nameCopyBuffer = _nameCopyBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer(IOContext.java:258) */
        iOContext.releaseNameCopyBuffer(_nameCopyBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method releaseNameCopyBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _verifyRelease(buf, _nameCopyBuffer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReleaseNameCopyBuffer_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _nameCopyBuffer = {' '};
        iOContext._nameCopyBuffer = _nameCopyBuffer;
        char[] charArray = {' '};
        
        iOContext.releaseNameCopyBuffer(charArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method releaseNameCopyBuffer([C)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseNameCopyBuffer(char[])}
     */
    @Test
    public void testReleaseNameCopyBufferThrowsNPEWithNonEmptyPrimitiveArray() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        char[] charArray = {'\u0003', '?'};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:279)
            com.fasterxml.jackson.core.io.IOContext.releaseNameCopyBuffer(IOContext.java:256) */
        iOContext.releaseNameCopyBuffer(charArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseConcatBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): False}
 *  */
    @Test
    public void testReleaseConcatBuffer_BufEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.releaseConcatBuffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 *  */
    @Test
    public void testReleaseConcatBuffer_BufNotEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {
            null,
            null
        };
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        char[] _concatCBuffer = {' ', ' '};
        iOContext._concatCBuffer = _concatCBuffer;
        
        BufferRecycler bufferRecycler1 = iOContext._bufferRecycler;
        char[][] bufferRecycler1_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] initialIOContext_bufferRecycler_charBuffers1 = ((char[]) get(bufferRecycler1_bufferRecycler_charBuffers, 1));
        
        iOContext.releaseConcatBuffer(_concatCBuffer);
        
        BufferRecycler bufferRecycler2 = iOContext._bufferRecycler;
        char[][] bufferRecycler2_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers0 = ((char[]) get(bufferRecycler2_bufferRecycler_charBuffers, 0));
        BufferRecycler bufferRecycler3 = iOContext._bufferRecycler;
        char[][] bufferRecycler3_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler3, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers1 = ((char[]) get(bufferRecycler3_bufferRecycler_charBuffers, 1));
        char[] finalIOContext_concatCBuffer = iOContext._concatCBuffer;
        
        assertFalse(initialIOContext_bufferRecycler_charBuffers1 == finalIOContext_bufferRecycler_charBuffers1);
        
        assertNull(finalIOContext_bufferRecycler_charBuffers0);
        
        assertNull(finalIOContext_concatCBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseConcatBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_CONCAT_BUFFER, buf);
 *  */
    @Test
    public void testReleaseConcatBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        char[] _concatCBuffer = {' '};
        iOContext._concatCBuffer = _concatCBuffer;
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:132)
            com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer(IOContext.java:249) */
        iOContext.releaseConcatBuffer(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_CONCAT_BUFFER, buf);
 *  */
    @Test
    public void testReleaseConcatBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _concatCBuffer = {' '};
        iOContext._concatCBuffer = _concatCBuffer;
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer(IOContext.java:249) */
        iOContext.releaseConcatBuffer(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_CONCAT_BUFFER, buf);
 *  */
    @Test
    public void testReleaseConcatBuffer_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _concatCBuffer = {' '};
        iOContext._concatCBuffer = _concatCBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer(IOContext.java:249) */
        iOContext.releaseConcatBuffer(_concatCBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method releaseConcatBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _verifyRelease(buf, _concatCBuffer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReleaseConcatBuffer_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _concatCBuffer = {' '};
        iOContext._concatCBuffer = _concatCBuffer;
        char[] charArray = {' '};
        
        iOContext.releaseConcatBuffer(charArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method releaseConcatBuffer([C)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseConcatBuffer(char[])}
     */
    @Test
    public void testReleaseConcatBufferThrowsNPEWithNonEmptyPrimitiveArray() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        char[] charArray = {'\u0001', '?'};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:279)
            com.fasterxml.jackson.core.io.IOContext.releaseConcatBuffer(IOContext.java:247) */
        iOContext.releaseConcatBuffer(charArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocWriteEncodingBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_writeEncodingBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER));
 *  */
    @Test
    public void testAllocWriteEncodingBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:86)
                com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer(IOContext.java:160) */
            iOContext.allocWriteEncodingBuffer();
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_writeEncodingBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER));
 *  */
    @Test
    public void testAllocWriteEncodingBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer(IOContext.java:160) */
        iOContext.allocWriteEncodingBuffer();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocWriteEncodingBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_writeEncodingBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBuffer_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        
        iOContext.allocWriteEncodingBuffer();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocWriteEncodingBuffer()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer()}
     */
    @Test
    public void testAllocWriteEncodingBuffer() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, true);
        
        byte[] actual = iOContext.allocWriteEncodingBuffer();
        
        byte[] expected = new byte[8000];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocWriteEncodingBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_writeEncodingBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER, minSize));
 *  */
    @Test
    public void testAllocWriteEncodingBuffer_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer(IOContext.java:168) */
            iOContext.allocWriteEncodingBuffer(0);
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_writeEncodingBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER, minSize));
 *  */
    @Test
    public void testAllocWriteEncodingBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer(IOContext.java:168) */
            iOContext.allocWriteEncodingBuffer(8000);
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_writeEncodingBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_WRITE_ENCODING_BUFFER, minSize));
 *  */
    @Test
    public void testAllocWriteEncodingBuffer_ThrowNullPointerException1() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocWriteEncodingBuffer(IOContext.java:168) */
        iOContext.allocWriteEncodingBuffer(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocWriteEncodingBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_writeEncodingBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBuffer_ThrowIllegalStateException1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _writeEncodingBuffer = {(byte) -127};
        iOContext._writeEncodingBuffer = _writeEncodingBuffer;
        
        iOContext.allocWriteEncodingBuffer(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocWriteEncodingBuffer(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocWriteEncodingBuffer(int)}
     */
    @Test
    public void testAllocWriteEncodingBuffer1() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        
        byte[] actual = iOContext.allocWriteEncodingBuffer(65);
        
        byte[] expected = new byte[8000];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseReadIOBuffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): False}
 *  */
    @Test
    public void testReleaseReadIOBuffer_BufEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.releaseReadIOBuffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseByteBuffer(int,byte[])}
 *  */
    @Test
    public void testReleaseReadIOBuffer_BufNotEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        byte[][] _byteBuffers = {null};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        
        BufferRecycler bufferRecycler1 = iOContext._bufferRecycler;
        byte[][] bufferRecycler1_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler1, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] initialIOContext_bufferRecycler_byteBuffers0 = ((byte[]) get(bufferRecycler1_bufferRecycler_byteBuffers, 0));
        
        iOContext.releaseReadIOBuffer(_readIOBuffer);
        
        BufferRecycler bufferRecycler2 = iOContext._bufferRecycler;
        byte[][] bufferRecycler2_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler2, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers0 = ((byte[]) get(bufferRecycler2_bufferRecycler_byteBuffers, 0));
        byte[] finalIOContext_readIOBuffer = iOContext._readIOBuffer;
        
        assertFalse(initialIOContext_bufferRecycler_byteBuffers0 == finalIOContext_bufferRecycler_byteBuffers0);
        
        assertNull(finalIOContext_readIOBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseReadIOBuffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseByteBuffer(int,byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER, buf);
 *  */
    @Test
    public void testReleaseReadIOBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        byte[][] _byteBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseByteBuffer(BufferRecycler.java:104)
            com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer(IOContext.java:213) */
        iOContext.releaseReadIOBuffer(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER, buf);
 *  */
    @Test
    public void testReleaseReadIOBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer(IOContext.java:213) */
        iOContext.releaseReadIOBuffer(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER, buf);
 *  */
    @Test
    public void testReleaseReadIOBuffer_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer(IOContext.java:213) */
        iOContext.releaseReadIOBuffer(_readIOBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method releaseReadIOBuffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _verifyRelease(buf, _readIOBuffer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReleaseReadIOBuffer_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        byte[] byteArray = {(byte) -127};
        
        iOContext.releaseReadIOBuffer(byteArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method releaseReadIOBuffer([B)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseReadIOBuffer(byte[])}
     */
    @Test
    public void testReleaseReadIOBufferThrowsNPEWithNonEmptyPrimitiveArray() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        byte[] byteArray = {(byte) 0, java.lang.Byte.MAX_VALUE};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:274)
            com.fasterxml.jackson.core.io.IOContext.releaseReadIOBuffer(IOContext.java:211) */
        iOContext.releaseReadIOBuffer(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocNameCopyBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocNameCopyBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_nameCopyBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_NAME_COPY_BUFFER, minSize));
 *  */
    @Test
    public void testAllocNameCopyBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer(IOContext.java:199) */
            iOContext.allocNameCopyBuffer(199);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocNameCopyBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_nameCopyBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_NAME_COPY_BUFFER, minSize));
 *  */
    @Test
    public void testAllocNameCopyBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer(IOContext.java:199) */
            iOContext.allocNameCopyBuffer(200);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocNameCopyBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_nameCopyBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_NAME_COPY_BUFFER, minSize));
 *  */
    @Test
    public void testAllocNameCopyBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocNameCopyBuffer(IOContext.java:199) */
        iOContext.allocNameCopyBuffer(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocNameCopyBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocNameCopyBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_nameCopyBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBuffer_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _nameCopyBuffer = {' '};
        iOContext._nameCopyBuffer = _nameCopyBuffer;
        
        iOContext.allocNameCopyBuffer(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocNameCopyBuffer(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocNameCopyBuffer(int)}
     */
    @Test
    public void testAllocNameCopyBuffer() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        
        char[] actual = iOContext.allocNameCopyBuffer(67);
        
        char[] expected = new char[200];
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseBase64Buffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): False}
 *  */
    @Test
    public void testReleaseBase64Buffer_BufEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.releaseBase64Buffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseByteBuffer(int,byte[])}
 *  */
    @Test
    public void testReleaseBase64Buffer_BufNotEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        byte[][] _byteBuffers = {
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
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        byte[] _base64Buffer = {(byte) -127, (byte) -127};
        iOContext._base64Buffer = _base64Buffer;
        
        BufferRecycler bufferRecycler1 = iOContext._bufferRecycler;
        byte[][] bufferRecycler1_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler1, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] initialIOContext_bufferRecycler_byteBuffers3 = ((byte[]) get(bufferRecycler1_bufferRecycler_byteBuffers, 3));
        
        iOContext.releaseBase64Buffer(_base64Buffer);
        
        BufferRecycler bufferRecycler2 = iOContext._bufferRecycler;
        byte[][] bufferRecycler2_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler2, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers0 = ((byte[]) get(bufferRecycler2_bufferRecycler_byteBuffers, 0));
        BufferRecycler bufferRecycler3 = iOContext._bufferRecycler;
        byte[][] bufferRecycler3_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler3, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers1 = ((byte[]) get(bufferRecycler3_bufferRecycler_byteBuffers, 1));
        BufferRecycler bufferRecycler4 = iOContext._bufferRecycler;
        byte[][] bufferRecycler4_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler4, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers2 = ((byte[]) get(bufferRecycler4_bufferRecycler_byteBuffers, 2));
        BufferRecycler bufferRecycler5 = iOContext._bufferRecycler;
        byte[][] bufferRecycler5_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler5, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers3 = ((byte[]) get(bufferRecycler5_bufferRecycler_byteBuffers, 3));
        BufferRecycler bufferRecycler6 = iOContext._bufferRecycler;
        byte[][] bufferRecycler6_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler6, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers4 = ((byte[]) get(bufferRecycler6_bufferRecycler_byteBuffers, 4));
        BufferRecycler bufferRecycler7 = iOContext._bufferRecycler;
        byte[][] bufferRecycler7_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler7, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers5 = ((byte[]) get(bufferRecycler7_bufferRecycler_byteBuffers, 5));
        BufferRecycler bufferRecycler8 = iOContext._bufferRecycler;
        byte[][] bufferRecycler8_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler8, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers6 = ((byte[]) get(bufferRecycler8_bufferRecycler_byteBuffers, 6));
        BufferRecycler bufferRecycler9 = iOContext._bufferRecycler;
        byte[][] bufferRecycler9_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler9, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers7 = ((byte[]) get(bufferRecycler9_bufferRecycler_byteBuffers, 7));
        BufferRecycler bufferRecycler10 = iOContext._bufferRecycler;
        byte[][] bufferRecycler10_bufferRecycler_byteBuffers = ((byte[][]) getFieldValue(bufferRecycler10, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers"));
        byte[] finalIOContext_bufferRecycler_byteBuffers8 = ((byte[]) get(bufferRecycler10_bufferRecycler_byteBuffers, 8));
        byte[] finalIOContext_base64Buffer = iOContext._base64Buffer;
        
        assertFalse(initialIOContext_bufferRecycler_byteBuffers3 == finalIOContext_bufferRecycler_byteBuffers3);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers0);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers1);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers2);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers4);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers5);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers6);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers7);
        
        assertNull(finalIOContext_bufferRecycler_byteBuffers8);
        
        assertNull(finalIOContext_base64Buffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseBase64Buffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseByteBuffer(int,byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_BASE64_CODEC_BUFFER, buf);
 *  */
    @Test
    public void testReleaseBase64Buffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        byte[][] _byteBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        byte[] _base64Buffer = {(byte) -127};
        iOContext._base64Buffer = _base64Buffer;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseByteBuffer(BufferRecycler.java:104)
            com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer(IOContext.java:232) */
        iOContext.releaseBase64Buffer(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_BASE64_CODEC_BUFFER, buf);
 *  */
    @Test
    public void testReleaseBase64Buffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _base64Buffer = {(byte) -127};
        iOContext._base64Buffer = _base64Buffer;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer(IOContext.java:232) */
        iOContext.releaseBase64Buffer(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_BASE64_CODEC_BUFFER, buf);
 *  */
    @Test
    public void testReleaseBase64Buffer_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _base64Buffer = {(byte) -127};
        iOContext._base64Buffer = _base64Buffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer(IOContext.java:232) */
        iOContext.releaseBase64Buffer(_base64Buffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method releaseBase64Buffer([B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _verifyRelease(buf, _base64Buffer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReleaseBase64Buffer_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _base64Buffer = {(byte) -127};
        iOContext._base64Buffer = _base64Buffer;
        byte[] byteArray = {(byte) -127};
        
        iOContext.releaseBase64Buffer(byteArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method releaseBase64Buffer([B)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseBase64Buffer(byte[])}
     */
    @Test
    public void testReleaseBase64BufferThrowsNPEWithNonEmptyPrimitiveArray() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        byte[] byteArray = {(byte) 3, java.lang.Byte.MAX_VALUE};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:274)
            com.fasterxml.jackson.core.io.IOContext.releaseBase64Buffer(IOContext.java:230) */
        iOContext.releaseBase64Buffer(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext._verifyRelease
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyRelease([C, [C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.executesCondition {@code (toRelease != src): True}
 * @utbot.executesCondition {@code (toRelease.length <= src.length): False}
 *  */
    @Test
    public void test_verifyRelease_ToReleaseLengthGreaterThanSrcLength() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] charArray = {' '};
        char[] charArray1 = {};
        
        iOContext._verifyRelease(charArray, charArray1);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.executesCondition {@code (toRelease != src): False}
 *  */
    @Test
    public void test_verifyRelease_ToReleaseEqualsSrc() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext._verifyRelease(((char[]) null), ((char[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _verifyRelease([C, [C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.executesCondition {@code (toRelease != src): True}
 * @utbot.executesCondition {@code (toRelease.length <= src.length): True}
 * @utbot.invokes com.fasterxml.jackson.core.io.IOContext#wrongBuf()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (toRelease != src) && (toRelease.length <= src.length)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_verifyRelease_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] charArray = {' '};
        char[] charArray1 = {' '};
        
        iOContext._verifyRelease(charArray, charArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyRelease([C, [C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (toRelease != src) && (toRelease.length <= src.length)
 *  */
    @Test
    public void test_verifyRelease_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext._verifyRelease] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:279) */
        iOContext._verifyRelease(((char[]) null), charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (toRelease != src) && (toRelease.length <= src.length)
 *  */
    @Test
    public void test_verifyRelease_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext._verifyRelease] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:279) */
        iOContext._verifyRelease(charArray, ((char[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext._verifyRelease
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyRelease([B, [B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.executesCondition {@code (toRelease != src): True}
 * @utbot.executesCondition {@code (toRelease.length <= src.length): False}
 *  */
    @Test
    public void test_verifyRelease_ToReleaseLengthGreaterThanSrcLength1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {};
        
        iOContext._verifyRelease(byteArray, byteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.executesCondition {@code (toRelease != src): False}
 *  */
    @Test
    public void test_verifyRelease_ToReleaseEqualsSrc1() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext._verifyRelease(((byte[]) null), ((byte[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _verifyRelease([B, [B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.executesCondition {@code (toRelease != src): True}
 * @utbot.executesCondition {@code (toRelease.length <= src.length): True}
 * @utbot.invokes com.fasterxml.jackson.core.io.IOContext#wrongBuf()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (toRelease != src) && (toRelease.length <= src.length)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_verifyRelease_ThrowIllegalArgumentException1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        iOContext._verifyRelease(byteArray, byteArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyRelease([B, [B)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (toRelease != src) && (toRelease.length <= src.length)
 *  */
    @Test
    public void test_verifyRelease_ThrowNullPointerException1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext._verifyRelease] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:274) */
        iOContext._verifyRelease(((byte[]) null), byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (toRelease != src) && (toRelease.length <= src.length)
 *  */
    @Test
    public void test_verifyRelease_ThrowNullPointerException_11() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext._verifyRelease] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:274) */
        iOContext._verifyRelease(byteArray, ((byte[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.wrongBuf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrongBuf()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#wrongBuf()}
 * @utbot.returnsFrom {@code return new IllegalArgumentException("Trying to release buffer not owned by the context");}
 *  */
    @Test
    public void testWrongBuf_Return() throws Exception  {
        IOContext iOContext = new IOContext(null, null, false);
        
        Class iOContextClazz = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        Method wrongBufMethod = iOContextClazz.getDeclaredMethod("wrongBuf");
        wrongBufMethod.setAccessible(true);
        java.lang.Object[] wrongBufMethodArguments = new java.lang.Object[0];
        IllegalArgumentException actual = ((IllegalArgumentException) wrongBufMethod.invoke(iOContext, wrongBufMethodArguments));
        
        IllegalArgumentException expected = ((IllegalArgumentException) createInstance("java.lang.IllegalArgumentException"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.getSourceReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceReference()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#getSourceReference()}
 * @utbot.returnsFrom {@code return _sourceRef;}
 *  */
    @Test
    public void testGetSourceReference_Return_sourceRef() {
        IOContext iOContext = new IOContext(null, null, false);
        
        Object actual = iOContext.getSourceReference();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocBase64Buffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocBase64Buffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocBase64Buffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_base64Buffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_BASE64_CODEC_BUFFER));
 *  */
    @Test
    public void testAllocBase64Buffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocBase64Buffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:86)
                com.fasterxml.jackson.core.io.IOContext.allocBase64Buffer(IOContext.java:176) */
            iOContext.allocBase64Buffer();
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocBase64Buffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_base64Buffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_BASE64_CODEC_BUFFER));
 *  */
    @Test
    public void testAllocBase64Buffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocBase64Buffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocBase64Buffer(IOContext.java:176) */
        iOContext.allocBase64Buffer();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocBase64Buffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocBase64Buffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_base64Buffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocBase64Buffer_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _base64Buffer = {(byte) -127};
        iOContext._base64Buffer = _base64Buffer;
        
        iOContext.allocBase64Buffer();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocBase64Buffer()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocBase64Buffer()}
     */
    @Test
    public void testAllocBase64Buffer() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, true);
        
        byte[] actual = iOContext.allocBase64Buffer();
        
        byte[] expected = new byte[2000];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocConcatBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocConcatBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocConcatBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_concatCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_CONCAT_BUFFER));
 *  */
    @Test
    public void testAllocConcatBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocConcatBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:114)
                com.fasterxml.jackson.core.io.IOContext.allocConcatBuffer(IOContext.java:194) */
            iOContext.allocConcatBuffer();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocConcatBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_concatCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_CONCAT_BUFFER));
 *  */
    @Test
    public void testAllocConcatBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocConcatBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocConcatBuffer(IOContext.java:194) */
        iOContext.allocConcatBuffer();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocConcatBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocConcatBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_concatCBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBuffer_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _concatCBuffer = {' '};
        iOContext._concatCBuffer = _concatCBuffer;
        
        iOContext.allocConcatBuffer();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocConcatBuffer()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocConcatBuffer()}
     */
    @Test
    public void testAllocConcatBuffer() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, true);
        
        char[] actual = iOContext.allocConcatBuffer();
        
        char[] expected = new char[4000];
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocTokenBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_tokenCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER, minSize));
 *  */
    @Test
    public void testAllocTokenBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer(IOContext.java:189) */
            iOContext.allocTokenBuffer(0);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_tokenCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER, minSize));
 *  */
    @Test
    public void testAllocTokenBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer(IOContext.java:189) */
            iOContext.allocTokenBuffer(4000);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_tokenCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER, minSize));
 *  */
    @Test
    public void testAllocTokenBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer(IOContext.java:189) */
        iOContext.allocTokenBuffer(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocTokenBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_tokenCBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBuffer_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        
        iOContext.allocTokenBuffer(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocTokenBuffer(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer(int)}
     */
    @Test
    public void testAllocTokenBuffer() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        
        char[] actual = iOContext.allocTokenBuffer(64);
        
        char[] expected = new char[4000];
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocTokenBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_tokenCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER));
 *  */
    @Test
    public void testAllocTokenBuffer_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:114)
                com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer(IOContext.java:181) */
            iOContext.allocTokenBuffer();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_tokenCBuffer = _bufferRecycler.allocCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER));
 *  */
    @Test
    public void testAllocTokenBuffer_ThrowNullPointerException1() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocTokenBuffer(IOContext.java:181) */
        iOContext.allocTokenBuffer();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocTokenBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_tokenCBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBuffer_ThrowIllegalStateException1() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        
        iOContext.allocTokenBuffer();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocTokenBuffer()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocTokenBuffer()}
     */
    @Test
    public void testAllocTokenBuffer1() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, true);
        
        char[] actual = iOContext.allocTokenBuffer();
        
        char[] expected = new char[4000];
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext._verifyAlloc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyAlloc(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.executesCondition {@code (buffer != null): False}
 *  */
    @Test
    public void test_verifyAlloc_BufferEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext._verifyAlloc(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _verifyAlloc(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.executesCondition {@code (buffer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: buffer != null
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_verifyAlloc_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        int[] intArray = {};
        
        iOContext._verifyAlloc(intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.isResourceManaged
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isResourceManaged()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#isResourceManaged()}
 * @utbot.returnsFrom {@code return _managedResource;}
 *  */
    @Test
    public void testIsResourceManaged_Return_managedResource() {
        IOContext iOContext = new IOContext(null, null, false);
        
        boolean actual = iOContext.isResourceManaged();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocReadIOBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_readIOBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER));
 *  */
    @Test
    public void testAllocReadIOBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:86)
                com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer(IOContext.java:147) */
            iOContext.allocReadIOBuffer();
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_readIOBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER));
 *  */
    @Test
    public void testAllocReadIOBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer(IOContext.java:147) */
        iOContext.allocReadIOBuffer();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocReadIOBuffer()
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_readIOBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBuffer_ThrowIllegalStateException() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        
        iOContext.allocReadIOBuffer();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocReadIOBuffer()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer()}
     */
    @Test
    public void testAllocReadIOBuffer() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, true);
        
        byte[] actual = iOContext.allocReadIOBuffer();
        
        byte[] expected = new byte[8000];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method allocReadIOBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_readIOBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER, minSize));
 *  */
    @Test
    public void testAllocReadIOBuffer_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer(IOContext.java:155) */
            iOContext.allocReadIOBuffer(0);
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (_readIOBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER, minSize));
 *  */
    @Test
    public void testAllocReadIOBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevBYTE_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS"));
        try {
            int[] byteBufferLengths = {8000, 8000, 2000, 2000};
            setStaticField(bufferRecyclerClazz, "BYTE_BUFFER_LENGTHS", byteBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            byte[][] _byteBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_byteBuffers", _byteBuffers);
            IOContext iOContext = new IOContext(bufferRecycler, null, false);
            
            /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocByteBuffer(BufferRecycler.java:94)
                com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer(IOContext.java:155) */
            iOContext.allocReadIOBuffer(8000);
        } finally {
            setStaticField(BufferRecycler.class, "BYTE_BUFFER_LENGTHS", prevBYTE_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocByteBuffer(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_readIOBuffer = _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_READ_IO_BUFFER, minSize));
 *  */
    @Test
    public void testAllocReadIOBuffer_ThrowNullPointerException1() {
        IOContext iOContext = new IOContext(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.allocReadIOBuffer(IOContext.java:155) */
        iOContext.allocReadIOBuffer(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method allocReadIOBuffer(int)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyAlloc(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _verifyAlloc(_readIOBuffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBuffer_ThrowIllegalStateException1() {
        IOContext iOContext = new IOContext(null, null, false);
        byte[] _readIOBuffer = {(byte) -127};
        iOContext._readIOBuffer = _readIOBuffer;
        
        iOContext.allocReadIOBuffer(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method allocReadIOBuffer(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#allocReadIOBuffer(int)}
     */
    @Test
    public void testAllocReadIOBuffer1() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        
        byte[] actual = iOContext.allocReadIOBuffer(64);
        
        byte[] expected = new byte[8000];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseTokenBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): False}
 *  */
    @Test
    public void testReleaseTokenBuffer_BufEqualsNull() {
        IOContext iOContext = new IOContext(null, null, false);
        
        iOContext.releaseTokenBuffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 *  */
    @Test
    public void testReleaseTokenBuffer_BufNotEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {null};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        
        BufferRecycler bufferRecycler1 = iOContext._bufferRecycler;
        char[][] bufferRecycler1_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] initialIOContext_bufferRecycler_charBuffers0 = ((char[]) get(bufferRecycler1_bufferRecycler_charBuffers, 0));
        
        iOContext.releaseTokenBuffer(_tokenCBuffer);
        
        BufferRecycler bufferRecycler2 = iOContext._bufferRecycler;
        char[][] bufferRecycler2_bufferRecycler_charBuffers = ((char[][]) getFieldValue(bufferRecycler2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalIOContext_bufferRecycler_charBuffers0 = ((char[]) get(bufferRecycler2_bufferRecycler_charBuffers, 0));
        char[] finalIOContext_tokenCBuffer = iOContext._tokenCBuffer;
        
        assertFalse(initialIOContext_bufferRecycler_charBuffers0 == finalIOContext_bufferRecycler_charBuffers0);
        
        assertNull(finalIOContext_tokenCBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseTokenBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER, buf);
 *  */
    @Test
    public void testReleaseTokenBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        IOContext iOContext = new IOContext(bufferRecycler, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:132)
            com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer(IOContext.java:240) */
        iOContext.releaseTokenBuffer(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER, buf);
 *  */
    @Test
    public void testReleaseTokenBuffer_ThrowNullPointerException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer(IOContext.java:240) */
        iOContext.releaseTokenBuffer(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _bufferRecycler.releaseCharBuffer(BufferRecycler.CHAR_TOKEN_BUFFER, buf);
 *  */
    @Test
    public void testReleaseTokenBuffer_ThrowNullPointerException_1() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer(IOContext.java:240) */
        iOContext.releaseTokenBuffer(_tokenCBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method releaseTokenBuffer([C)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
 * @utbot.executesCondition {@code (buf != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#_verifyRelease(char[],char[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _verifyRelease(buf, _tokenCBuffer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReleaseTokenBuffer_ThrowIllegalArgumentException() {
        IOContext iOContext = new IOContext(null, null, false);
        char[] _tokenCBuffer = {' '};
        iOContext._tokenCBuffer = _tokenCBuffer;
        char[] charArray = {' '};
        
        iOContext.releaseTokenBuffer(charArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method releaseTokenBuffer([C)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.io.IOContext}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#releaseTokenBuffer(char[])}
     */
    @Test
    public void testReleaseTokenBufferThrowsNPEWithNonEmptyPrimitiveArray() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        Object object = new Object();
        IOContext iOContext = new IOContext(bufferRecycler, object, false);
        char[] charArray = {'\u0000', '?'};
        
        /* This test fails because method [com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.IOContext._verifyRelease(IOContext.java:279)
            com.fasterxml.jackson.core.io.IOContext.releaseTokenBuffer(IOContext.java:238) */
        iOContext.releaseTokenBuffer(charArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.io.IOContext.withEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withEncoding(com.fasterxml.jackson.core.JsonEncoding)
    
    /**
    @utbot.classUnderTest {@link IOContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.io.IOContext#withEncoding(com.fasterxml.jackson.core.JsonEncoding)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithEncoding_Return() {
        IOContext iOContext = new IOContext(null, null, false);
        
        IOContext actual = iOContext.withEncoding(null);
        
        Object actual_sourceRef = actual._sourceRef;
        assertNull(actual_sourceRef);
        
        JsonEncoding actual_encoding = actual._encoding;
        assertNull(actual_encoding);
        
        boolean actual_managedResource = actual._managedResource;
        assertFalse(actual_managedResource);
        
        BufferRecycler actual_bufferRecycler = actual._bufferRecycler;
        assertNull(actual_bufferRecycler);
        
        byte[] actual_readIOBuffer = actual._readIOBuffer;
        assertNull(actual_readIOBuffer);
        
        byte[] actual_writeEncodingBuffer = actual._writeEncodingBuffer;
        assertNull(actual_writeEncodingBuffer);
        
        byte[] actual_base64Buffer = actual._base64Buffer;
        assertNull(actual_base64Buffer);
        
        char[] actual_tokenCBuffer = actual._tokenCBuffer;
        assertNull(actual_tokenCBuffer);
        
        char[] actual_concatCBuffer = actual._concatCBuffer;
        assertNull(actual_concatCBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1024979438711600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1024979438711600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1024979438725600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024979438711600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024979438725600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1024979439244800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1024979439244800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1024979439248800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024979439244800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024979439248800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1024979439652300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1024979439652300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1024979439655200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024979439652300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024979439655200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1024979440168300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1024979440168300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1024979440171400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024979440168300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024979440171400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

