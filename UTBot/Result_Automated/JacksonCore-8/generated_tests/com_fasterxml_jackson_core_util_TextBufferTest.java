package com.fasterxml.jackson.core.util;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_util_TextBufferTest {
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testToString_ReturnContentsAsString_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        String actual = textBuffer.toString();
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testToString_ReturnContentsAsString() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        String actual = textBuffer.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testToString_ReturnContentsAsString_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        String actual = textBuffer.toString();
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testToString_ReturnContentsAsString_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        String actual = textBuffer.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testToString_ReturnContentsAsString_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        String actual = textBuffer.toString();
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testToString_ReturnContentsAsString_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        String actual = textBuffer.toString();
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: /*
 *     /**********************************************************
 *     /* Standard methods:
 *     /**********************************************************
 *      */
 * /**
 *  * Note: calling this method may not be as efficient as calling
 *  * {@link #contentsAsString}, since it's not guaranteed that resulting
 *  * String is cached.
 *  */
 * @Override
 * public String toString() {
 *     return contentsAsString();
 * }
 *  */
    @Test
    public void testToString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.toString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:330)
            com.fasterxml.jackson.core.util.TextBuffer.toString(TextBuffer.java:636) */
        textBuffer.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.returnsFrom {@code return contentsAsString();}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return contentsAsString();
 *  */
    @Test
    public void testToString_ThrowNegativeArraySizeException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.toString] produces [java.lang.NegativeArraySizeException: -255]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:339)
            com.fasterxml.jackson.core.util.TextBuffer.toString(TextBuffer.java:636) */
        textBuffer.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: /*
 *     /**********************************************************
 *     /* Standard methods:
 *     /**********************************************************
 *      */
 * /**
 *  * Note: calling this method may not be as efficient as calling
 *  * {@link #contentsAsString}, since it's not guaranteed that resulting
 *  * String is cached.
 *  */
 * @Override
 * public String toString() {
 *     return contentsAsString();
 * }
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.toString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.util.TextBuffer.toString(TextBuffer.java:636) */
        textBuffer.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAppend_MaxGreaterOrEqualLen() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        String string = "";
        
        textBuffer.append(string, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#expand(int)
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 *  */
    @Test
    public void testAppend_LenLessOrEqualZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        String string = "\u0000";
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(string, 0, 1);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(1, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: str.getChars(offset, offset + max, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:484) */
        textBuffer.append(string, -1, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:469) */
            textBuffer.append(((String) null), -255, 199);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:469) */
        textBuffer.append(((String) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
            char[] _currentSegment = {'\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:469) */
            textBuffer.append(((String) null), -255, -14);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:469) */
            textBuffer.append(((String) null), -255, 1);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: str.getChars(offset, offset + amount, _currentSegment, 0);
 *  */
    @Test
    public void testAppend_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] _resultArray = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:495) */
        textBuffer.append(string, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: str.getChars(offset, offset + amount, _currentSegment, 0);
 *  */
    @Test
    public void testAppend_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        String string = "              ";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin 14, end 15, length 14]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:495) */
        textBuffer.append(string, 13, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + max, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:484) */
        textBuffer.append(((String) null), -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:469) */
        textBuffer.append(((String) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_7() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
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
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            TextBuffer textBuffer = new TextBuffer(bufferRecycler);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:478) */
            textBuffer.append(((String) null), -255, -55);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:478) */
        textBuffer.append(((String) null), -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int max = curr.length - _currentSize;
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:476) */
        textBuffer.append(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + amount, _currentSegment, 0);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:495) */
        textBuffer.append(((String) null), -255, 1073741825);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:478) */
        textBuffer.append(((String) null), -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + amount, _currentSegment, 0);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483200);
            String _resultString = "";
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
            char[] _resultArray = {'\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:478) */
            textBuffer.append(((String) null), -255, 2147483569);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method append(java.lang.String, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testAppendThrowsOOMEWithNonEmptyStringAndCornerCases() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        textBuffer.append("3-", 0, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.String, int, int)
    
    @Test
    public void testAppend1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            char[] charArray = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000', '\u0000'
            };
            _charBuffers[0] = charArray;
            _charBuffers[1] = charArray;
            char[] charArray1 = new char[40];
            _charBuffers[2] = charArray1;
            _charBuffers[3] = charArray;
            _charBuffers[4] = charArray;
            _charBuffers[5] = charArray;
            _charBuffers[6] = charArray;
            _charBuffers[7] = charArray;
            _charBuffers[8] = charArray;
            _charBuffers[9] = charArray;
            _charBuffers[10] = charArray;
            _charBuffers[11] = charArray;
            _charBuffers[12] = charArray;
            _charBuffers[13] = charArray;
            _charBuffers[14] = charArray;
            _charBuffers[15] = charArray;
            _charBuffers[16] = charArray;
            _charBuffers[17] = charArray;
            _charBuffers[18] = charArray;
            _charBuffers[19] = charArray;
            _charBuffers[20] = charArray;
            _charBuffers[21] = charArray;
            _charBuffers[22] = charArray;
            _charBuffers[23] = charArray;
            _charBuffers[24] = charArray;
            _charBuffers[25] = charArray;
            _charBuffers[26] = charArray;
            _charBuffers[27] = charArray;
            _charBuffers[28] = charArray;
            _charBuffers[29] = charArray;
            _charBuffers[30] = charArray;
            _charBuffers[31] = charArray;
            _charBuffers[32] = charArray;
            _charBuffers[33] = charArray;
            _charBuffers[34] = charArray;
            _charBuffers[35] = charArray;
            _charBuffers[36] = charArray;
            _charBuffers[37] = charArray;
            _charBuffers[38] = charArray;
            _charBuffers[39] = charArray;
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", charArray);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1073741824);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2147483627);
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3221225451 out of bounds for char[10]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:469) */
            textBuffer.append(string, 0, 1073742115);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483176);
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 536871137, length 0]
                java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
                java.base/java.lang.String.getChars(String.java:1680)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:478) */
            textBuffer.append(string, 0, 536871137);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend3() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483135);
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 2147483526, length 1000]
                java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
                java.base/java.lang.String.getChars(String.java:1680)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:478) */
            textBuffer.append(string, 0, 2147483526);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend4() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
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
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483546);
            ArrayList _segments = new ArrayList();
            _segments.add(null);
            _segments.add(null);
            _segments.add(null);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin 1000, end 2500, length 1000]
                java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
                java.base/java.lang.String.getChars(String.java:1680)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:495) */
            textBuffer.append(string, 0, 1073742179);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(char)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 *  */
    @Test
    public void testAppend__inputStartGreaterOrEqualZero() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            TextBuffer textBuffer = new TextBuffer(bufferRecycler);
            
            char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            
            textBuffer.append(' ');
            
            BufferRecycler textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers0 = ((char[]) get(textBuffer_allocator_allocator_charBuffers, 0));
            BufferRecycler textBuffer_allocator1 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator1_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers1 = ((char[]) get(textBuffer_allocator1_allocator_charBuffers, 1));
            BufferRecycler textBuffer_allocator2 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator2_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers3 = ((char[]) get(textBuffer_allocator2_allocator_charBuffers, 3));
            BufferRecycler textBuffer_allocator3 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator3_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator3, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers4 = ((char[]) get(textBuffer_allocator3_allocator_charBuffers, 4));
            BufferRecycler textBuffer_allocator4 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator4_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator4, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers5 = ((char[]) get(textBuffer_allocator4_allocator_charBuffers, 5));
            BufferRecycler textBuffer_allocator5 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator5_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator5, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers6 = ((char[]) get(textBuffer_allocator5_allocator_charBuffers, 6));
            BufferRecycler textBuffer_allocator6 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator6_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator6, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers7 = ((char[]) get(textBuffer_allocator6_allocator_charBuffers, 7));
            BufferRecycler textBuffer_allocator7 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator7_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator7, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers8 = ((char[]) get(textBuffer_allocator7_allocator_charBuffers, 8));
            BufferRecycler textBuffer_allocator8 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator8_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator8, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers9 = ((char[]) get(textBuffer_allocator8_allocator_charBuffers, 9));
            BufferRecycler textBuffer_allocator9 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator9_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator9, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers10 = ((char[]) get(textBuffer_allocator9_allocator_charBuffers, 10));
            BufferRecycler textBuffer_allocator10 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator10_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator10, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers11 = ((char[]) get(textBuffer_allocator10_allocator_charBuffers, 11));
            BufferRecycler textBuffer_allocator11 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator11_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator11, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers12 = ((char[]) get(textBuffer_allocator11_allocator_charBuffers, 12));
            BufferRecycler textBuffer_allocator12 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator12_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator12, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers13 = ((char[]) get(textBuffer_allocator12_allocator_charBuffers, 13));
            BufferRecycler textBuffer_allocator13 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator13_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator13, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers14 = ((char[]) get(textBuffer_allocator13_allocator_charBuffers, 14));
            BufferRecycler textBuffer_allocator14 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator14_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator14, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers15 = ((char[]) get(textBuffer_allocator14_allocator_charBuffers, 15));
            BufferRecycler textBuffer_allocator15 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator15_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator15, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers16 = ((char[]) get(textBuffer_allocator15_allocator_charBuffers, 16));
            BufferRecycler textBuffer_allocator16 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator16_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator16, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers17 = ((char[]) get(textBuffer_allocator16_allocator_charBuffers, 17));
            BufferRecycler textBuffer_allocator17 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator17_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator17, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers18 = ((char[]) get(textBuffer_allocator17_allocator_charBuffers, 18));
            BufferRecycler textBuffer_allocator18 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator18_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator18, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers19 = ((char[]) get(textBuffer_allocator18_allocator_charBuffers, 19));
            BufferRecycler textBuffer_allocator19 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator19_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator19, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers20 = ((char[]) get(textBuffer_allocator19_allocator_charBuffers, 20));
            BufferRecycler textBuffer_allocator20 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator20_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator20, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers21 = ((char[]) get(textBuffer_allocator20_allocator_charBuffers, 21));
            BufferRecycler textBuffer_allocator21 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator21_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator21, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers22 = ((char[]) get(textBuffer_allocator21_allocator_charBuffers, 22));
            BufferRecycler textBuffer_allocator22 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator22_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator22, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers23 = ((char[]) get(textBuffer_allocator22_allocator_charBuffers, 23));
            BufferRecycler textBuffer_allocator23 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator23_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator23, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers24 = ((char[]) get(textBuffer_allocator23_allocator_charBuffers, 24));
            BufferRecycler textBuffer_allocator24 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator24_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator24, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers25 = ((char[]) get(textBuffer_allocator24_allocator_charBuffers, 25));
            BufferRecycler textBuffer_allocator25 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator25_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator25, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers26 = ((char[]) get(textBuffer_allocator25_allocator_charBuffers, 26));
            BufferRecycler textBuffer_allocator26 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator26_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator26, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers27 = ((char[]) get(textBuffer_allocator26_allocator_charBuffers, 27));
            BufferRecycler textBuffer_allocator27 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator27_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator27, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers28 = ((char[]) get(textBuffer_allocator27_allocator_charBuffers, 28));
            BufferRecycler textBuffer_allocator28 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator28_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator28, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers29 = ((char[]) get(textBuffer_allocator28_allocator_charBuffers, 29));
            BufferRecycler textBuffer_allocator29 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator29_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator29, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers30 = ((char[]) get(textBuffer_allocator29_allocator_charBuffers, 30));
            BufferRecycler textBuffer_allocator30 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator30_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator30, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers31 = ((char[]) get(textBuffer_allocator30_allocator_charBuffers, 31));
            BufferRecycler textBuffer_allocator31 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator31_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator31, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers32 = ((char[]) get(textBuffer_allocator31_allocator_charBuffers, 32));
            BufferRecycler textBuffer_allocator32 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator32_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator32, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers33 = ((char[]) get(textBuffer_allocator32_allocator_charBuffers, 33));
            BufferRecycler textBuffer_allocator33 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator33_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator33, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers34 = ((char[]) get(textBuffer_allocator33_allocator_charBuffers, 34));
            BufferRecycler textBuffer_allocator34 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator34_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator34, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers35 = ((char[]) get(textBuffer_allocator34_allocator_charBuffers, 35));
            BufferRecycler textBuffer_allocator35 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator35_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator35, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers36 = ((char[]) get(textBuffer_allocator35_allocator_charBuffers, 36));
            BufferRecycler textBuffer_allocator36 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator36_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator36, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers37 = ((char[]) get(textBuffer_allocator36_allocator_charBuffers, 37));
            BufferRecycler textBuffer_allocator37 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator37_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator37, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers38 = ((char[]) get(textBuffer_allocator37_allocator_charBuffers, 38));
            BufferRecycler textBuffer_allocator38 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator38_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator38, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers39 = ((char[]) get(textBuffer_allocator38_allocator_charBuffers, 39));
            int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
            char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
            
            assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
            
            assertNull(finalTextBuffer_allocator_charBuffers0);
            
            assertNull(finalTextBuffer_allocator_charBuffers1);
            
            assertNull(finalTextBuffer_allocator_charBuffers3);
            
            assertNull(finalTextBuffer_allocator_charBuffers4);
            
            assertNull(finalTextBuffer_allocator_charBuffers5);
            
            assertNull(finalTextBuffer_allocator_charBuffers6);
            
            assertNull(finalTextBuffer_allocator_charBuffers7);
            
            assertNull(finalTextBuffer_allocator_charBuffers8);
            
            assertNull(finalTextBuffer_allocator_charBuffers9);
            
            assertNull(finalTextBuffer_allocator_charBuffers10);
            
            assertNull(finalTextBuffer_allocator_charBuffers11);
            
            assertNull(finalTextBuffer_allocator_charBuffers12);
            
            assertNull(finalTextBuffer_allocator_charBuffers13);
            
            assertNull(finalTextBuffer_allocator_charBuffers14);
            
            assertNull(finalTextBuffer_allocator_charBuffers15);
            
            assertNull(finalTextBuffer_allocator_charBuffers16);
            
            assertNull(finalTextBuffer_allocator_charBuffers17);
            
            assertNull(finalTextBuffer_allocator_charBuffers18);
            
            assertNull(finalTextBuffer_allocator_charBuffers19);
            
            assertNull(finalTextBuffer_allocator_charBuffers20);
            
            assertNull(finalTextBuffer_allocator_charBuffers21);
            
            assertNull(finalTextBuffer_allocator_charBuffers22);
            
            assertNull(finalTextBuffer_allocator_charBuffers23);
            
            assertNull(finalTextBuffer_allocator_charBuffers24);
            
            assertNull(finalTextBuffer_allocator_charBuffers25);
            
            assertNull(finalTextBuffer_allocator_charBuffers26);
            
            assertNull(finalTextBuffer_allocator_charBuffers27);
            
            assertNull(finalTextBuffer_allocator_charBuffers28);
            
            assertNull(finalTextBuffer_allocator_charBuffers29);
            
            assertNull(finalTextBuffer_allocator_charBuffers30);
            
            assertNull(finalTextBuffer_allocator_charBuffers31);
            
            assertNull(finalTextBuffer_allocator_charBuffers32);
            
            assertNull(finalTextBuffer_allocator_charBuffers33);
            
            assertNull(finalTextBuffer_allocator_charBuffers34);
            
            assertNull(finalTextBuffer_allocator_charBuffers35);
            
            assertNull(finalTextBuffer_allocator_charBuffers36);
            
            assertNull(finalTextBuffer_allocator_charBuffers37);
            
            assertNull(finalTextBuffer_allocator_charBuffers38);
            
            assertNull(finalTextBuffer_allocator_charBuffers39);
            
            assertEquals(-1, finalTextBuffer_inputStart);
            
            assertEquals(1, finalTextBuffer_currentSize);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 *  */
    @Test
    public void testAppend__currentSizeLessThanCurrLength() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        textBuffer.append(' ');
        
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(2, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): True}
 *  */
    @Test
    public void testAppend__currentSizeGreaterOrEqualCurrLength_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _currentSegment);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(' ');
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(1, finalTextBuffer_segmentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 *  */
    @Test
    public void testAppend__currentSizeLessThanCurrLength_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        char[] _currentSegment = new char[19];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        textBuffer.append(' ');
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        char[] textBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char finalTextBuffer_currentSegment0 = ((Character) get(textBuffer_currentSegment, 0));
        char[] textBuffer_currentSegment1 = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char finalTextBuffer_currentSegment1 = ((Character) get(textBuffer_currentSegment1, 1));
        char[] textBuffer_currentSegment2 = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char finalTextBuffer_currentSegment2 = ((Character) get(textBuffer_currentSegment2, 2));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertNull(finalTextBuffer_inputBuffer);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(' ', finalTextBuffer_currentSegment0);
        
        assertEquals(' ', finalTextBuffer_currentSegment1);
        
        assertEquals(' ', finalTextBuffer_currentSegment2);
        
        assertEquals(3, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 *  */
    @Test
    public void testAppend__currentSizeLessThanCurrLength_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = new char[25];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        textBuffer.append(' ');
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] textBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char finalTextBuffer_currentSegment0 = ((Character) get(textBuffer_currentSegment, 0));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(' ', finalTextBuffer_currentSegment0);
        
        assertEquals(1, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 *  */
    @Test
    public void testAppend__inputStartGreaterOrEqualZero_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            char[] charArray = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            _charBuffers[0] = charArray;
            _charBuffers[1] = charArray;
            _charBuffers[2] = ((char[]) null);
            _charBuffers[3] = charArray;
            _charBuffers[4] = charArray;
            _charBuffers[5] = charArray;
            _charBuffers[6] = charArray;
            _charBuffers[7] = charArray;
            _charBuffers[8] = charArray;
            _charBuffers[9] = charArray;
            _charBuffers[10] = charArray;
            _charBuffers[11] = charArray;
            _charBuffers[12] = charArray;
            _charBuffers[13] = charArray;
            _charBuffers[14] = charArray;
            _charBuffers[15] = charArray;
            _charBuffers[16] = charArray;
            _charBuffers[17] = charArray;
            _charBuffers[18] = charArray;
            _charBuffers[19] = charArray;
            _charBuffers[20] = charArray;
            _charBuffers[21] = charArray;
            _charBuffers[22] = charArray;
            _charBuffers[23] = charArray;
            _charBuffers[24] = charArray;
            _charBuffers[25] = charArray;
            _charBuffers[26] = charArray;
            _charBuffers[27] = charArray;
            _charBuffers[28] = charArray;
            _charBuffers[29] = charArray;
            _charBuffers[30] = charArray;
            _charBuffers[31] = charArray;
            _charBuffers[32] = charArray;
            _charBuffers[33] = charArray;
            _charBuffers[34] = charArray;
            _charBuffers[35] = charArray;
            _charBuffers[36] = charArray;
            _charBuffers[37] = charArray;
            _charBuffers[38] = charArray;
            _charBuffers[39] = charArray;
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", charArray);
            
            char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            
            textBuffer.append(' ');
            
            BufferRecycler textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer_allocator_allocator_charBuffers, 2));
            int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
            char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
            
            assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
            
            assertNull(finalTextBuffer_allocator_charBuffers2);
            
            assertEquals(-1, finalTextBuffer_inputStart);
            
            assertEquals(1, finalTextBuffer_currentSize);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): True}
 *  */
    @Test
    public void testAppend__currentSizeGreaterOrEqualCurrLength() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _currentSegment);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(' ');
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(1, finalTextBuffer_segmentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(char)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(16);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[17];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:414) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: curr[_currentSize++] = c;
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:424) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(16);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 183);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:414) */
            textBuffer.append(' ');
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _currentSize >= curr.length
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:420) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(16);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_11() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = {};
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 177);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:414) */
            textBuffer.append(' ');
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(16);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_21() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
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
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 473);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:414) */
            textBuffer.append(' ');
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(char)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
     */
    @Test
    public void testAppend() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        textBuffer.append('\uFFFD');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#expand(int)
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testAppend_LenLessOrEqualZero1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        char[] charArray = {' '};
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(charArray, 0, 1);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(1, finalTextBuffer_segmentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#unshare(int)
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAppend_MaxGreaterOrEqualLen1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] charArray = {};
        
        textBuffer.append(charArray, 0, 0);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_segmentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, max);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447) */
        textBuffer.append(charArray, -1, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
        textBuffer.append(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, _currentSegment, 0, amount);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _currentSegment);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458) */
        textBuffer.append(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
        textBuffer.append(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
            char[] _currentSegment = {'\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
            textBuffer.append(((char[]) null), -255, -14);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
        textBuffer.append(((char[]) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -128);
            char[] _currentSegment = {'\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
            textBuffer.append(((char[]) null), -255, 256);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, _currentSegment, 0, amount);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            char[] charArray = {};
            _charBuffers[0] = charArray;
            _charBuffers[1] = charArray;
            char[] charArray1 = new char[40];
            _charBuffers[2] = charArray1;
            _charBuffers[3] = charArray;
            _charBuffers[4] = charArray;
            _charBuffers[5] = charArray;
            _charBuffers[6] = charArray;
            _charBuffers[7] = charArray;
            _charBuffers[8] = charArray;
            _charBuffers[9] = charArray;
            _charBuffers[10] = charArray;
            _charBuffers[11] = charArray;
            _charBuffers[12] = charArray;
            _charBuffers[13] = charArray;
            _charBuffers[14] = charArray;
            _charBuffers[15] = charArray;
            _charBuffers[16] = charArray;
            _charBuffers[17] = charArray;
            _charBuffers[18] = charArray;
            _charBuffers[19] = charArray;
            _charBuffers[20] = charArray;
            _charBuffers[21] = charArray;
            _charBuffers[22] = charArray;
            _charBuffers[23] = charArray;
            _charBuffers[24] = charArray;
            _charBuffers[25] = charArray;
            _charBuffers[26] = charArray;
            _charBuffers[27] = charArray;
            _charBuffers[28] = charArray;
            _charBuffers[29] = charArray;
            _charBuffers[30] = charArray;
            _charBuffers[31] = charArray;
            _charBuffers[32] = charArray;
            _charBuffers[33] = charArray;
            _charBuffers[34] = charArray;
            _charBuffers[35] = charArray;
            _charBuffers[36] = charArray;
            _charBuffers[37] = charArray;
            _charBuffers[38] = charArray;
            _charBuffers[39] = charArray;
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {' '};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483440);
            String _resultString = "";
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[0]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
            textBuffer.append(charArray, -1, -31);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, _currentSegment, 0, amount);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483460);
            String _resultString = "";
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
            char[] _resultArray = {'\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
            char[] charArray1 = {' ', ' '};
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -127 is negative]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458) */
            textBuffer.append(charArray1, 0, -127);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_51() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
        textBuffer.append(((char[]) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int max = curr.length - _currentSize;
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_22() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:438) */
        textBuffer.append(((char[]) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, curr, _currentSize, max);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_31() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447) */
        textBuffer.append(((char[]) null), -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_41() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
        textBuffer.append(((char[]) null), -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
            textBuffer.append(((char[]) null), -255, 198);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, _currentSegment, 0, amount);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_12() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {' '};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483138);
            String _resultString = "";
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
            textBuffer.append(((char[]) null), -255, 1073741985);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_61() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = {};
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", charArray);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
            textBuffer.append(((char[]) null), -255, 201);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, _currentSegment, 0, amount);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_71() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458) */
        textBuffer.append(((char[]) null), -255, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method append([C, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testAppendThrowsOOMEWithNonEmptyPrimitiveArrayAndCornerCases() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        char[] charArray = {'', '', ''};
        
        textBuffer.append(charArray, 0, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append([C, int, int)
    
    @Test
    public void testAppend5() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = {};
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", charArray);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", charArray);
            char[] charArray1 = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
            textBuffer.append(charArray1, 0, 0);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend6() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
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
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            char[] _currentSegment = new char[16];
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            char[] charArray = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 217 out of bounds for char[9]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
            textBuffer.append(charArray, 0, 217);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend7() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = {};
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", charArray);
            char[] charArray1 = new char[17];
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 193 out of bounds for char[17]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
            textBuffer.append(charArray1, 0, 193);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend8() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = {};
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483519);
            char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            char[] charArray1 = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000', '\u0000'
            };
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1000 out of bounds for char[10]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458) */
            textBuffer.append(charArray1, 0, 2147483556);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend9() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
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
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483562);
            ArrayList _segments = new ArrayList();
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            char[] charArray = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000', '\u0000'
            };
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1000 out of bounds for char[10]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458) */
            textBuffer.append(charArray, 0, 2147483635);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend10() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            char[] charArray = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            _charBuffers[0] = charArray;
            _charBuffers[1] = charArray;
            _charBuffers[2] = ((char[]) null);
            _charBuffers[3] = charArray;
            _charBuffers[4] = charArray;
            _charBuffers[5] = charArray;
            _charBuffers[6] = charArray;
            _charBuffers[7] = charArray;
            _charBuffers[8] = charArray;
            _charBuffers[9] = charArray;
            _charBuffers[10] = charArray;
            _charBuffers[11] = charArray;
            _charBuffers[12] = charArray;
            _charBuffers[13] = charArray;
            _charBuffers[14] = charArray;
            _charBuffers[15] = charArray;
            _charBuffers[16] = charArray;
            _charBuffers[17] = charArray;
            _charBuffers[18] = charArray;
            _charBuffers[19] = charArray;
            _charBuffers[20] = charArray;
            _charBuffers[21] = charArray;
            _charBuffers[22] = charArray;
            _charBuffers[23] = charArray;
            _charBuffers[24] = charArray;
            _charBuffers[25] = charArray;
            _charBuffers[26] = charArray;
            _charBuffers[27] = charArray;
            _charBuffers[28] = charArray;
            _charBuffers[29] = charArray;
            _charBuffers[30] = charArray;
            _charBuffers[31] = charArray;
            _charBuffers[32] = charArray;
            _charBuffers[33] = charArray;
            _charBuffers[34] = charArray;
            _charBuffers[35] = charArray;
            _charBuffers[36] = charArray;
            _charBuffers[37] = charArray;
            _charBuffers[38] = charArray;
            _charBuffers[39] = charArray;
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = new char[18];
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 2147483521);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483735 out of bounds for char[18]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:431) */
            textBuffer.append(charArray, 0, 2147483635);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend11() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            char[] charArray = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            _charBuffers[0] = charArray;
            _charBuffers[1] = charArray;
            char[] charArray1 = new char[40];
            _charBuffers[2] = charArray1;
            _charBuffers[3] = charArray;
            _charBuffers[4] = charArray;
            _charBuffers[5] = charArray;
            _charBuffers[6] = charArray;
            _charBuffers[7] = charArray;
            _charBuffers[8] = charArray;
            _charBuffers[9] = charArray;
            _charBuffers[10] = charArray;
            _charBuffers[11] = charArray;
            _charBuffers[12] = charArray;
            _charBuffers[13] = charArray;
            _charBuffers[14] = charArray;
            _charBuffers[15] = charArray;
            _charBuffers[16] = charArray;
            _charBuffers[17] = charArray;
            _charBuffers[18] = charArray;
            _charBuffers[19] = charArray;
            _charBuffers[20] = charArray;
            _charBuffers[21] = charArray;
            _charBuffers[22] = charArray;
            _charBuffers[23] = charArray;
            _charBuffers[24] = charArray;
            _charBuffers[25] = charArray;
            _charBuffers[26] = charArray;
            _charBuffers[27] = charArray;
            _charBuffers[28] = charArray;
            _charBuffers[29] = charArray;
            _charBuffers[30] = charArray;
            _charBuffers[31] = charArray;
            _charBuffers[32] = charArray;
            _charBuffers[33] = charArray;
            _charBuffers[34] = charArray;
            _charBuffers[35] = charArray;
            _charBuffers[36] = charArray;
            _charBuffers[37] = charArray;
            _charBuffers[38] = charArray;
            _charBuffers[39] = charArray;
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147482720);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482720 out of bounds for char[727]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441) */
            textBuffer.append(charArray, 0, 2147483447);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testAppend12() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -2147483523);
            ArrayList _segments = new ArrayList();
            _segments.add(null);
            _segments.add(null);
            _segments.add(null);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458) */
            textBuffer.append(((char[]) null), 0, 2147483631);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#size()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.returnsFrom {@code return _inputLen;}
 *  */
    @Test
    public void testSize__inputStartGreaterOrEqualZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        
        int actual = textBuffer.size();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#size()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 * @utbot.returnsFrom {@code return _resultArray.length;}
 *  */
    @Test
    public void testSize__resultArrayNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        int actual = textBuffer.size();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#size()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.returnsFrom {@code return _segmentSize + _currentSize;}
 *  */
    @Test
    public void testSize__resultStringEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        int actual = textBuffer.size();
        
        assertEquals(-510, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#size()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return _resultString.length();}
 *  */
    @Test
    public void testSize__resultStringNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        int actual = textBuffer.size();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.buf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buf(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buf(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _allocator.allocCharBuffer(BufferRecycler.CHAR_TEXT_BUFFER, needed);
 *  */
    @Test
    public void testBuf_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            TextBuffer textBuffer = new TextBuffer(bufferRecycler);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235) */
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            Class intType = int.class;
            Method bufMethod = textBufferClazz.getDeclaredMethod("buf", intType);
            bufMethod.setAccessible(true);
            java.lang.Object[] bufMethodArguments = new java.lang.Object[1];
            bufMethodArguments[0] = 200;
            try {
                bufMethod.invoke(textBuffer, bufMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buf(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _allocator.allocCharBuffer(BufferRecycler.CHAR_TEXT_BUFFER, needed);
 *  */
    @Test
    public void testBuf_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            TextBuffer textBuffer = new TextBuffer(bufferRecycler);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235) */
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            Class intType = int.class;
            Method bufMethod = textBufferClazz.getDeclaredMethod("buf", intType);
            bufMethod.setAccessible(true);
            java.lang.Object[] bufMethodArguments = new java.lang.Object[1];
            bufMethodArguments[0] = 199;
            try {
                bufMethod.invoke(textBuffer, bufMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method buf(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buf(int)}
     */
    @Test
    public void testBuf() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method bufMethod = textBufferClazz.getDeclaredMethod("buf", intType);
        bufMethod.setAccessible(true);
        java.lang.Object[] bufMethodArguments = new java.lang.Object[1];
        bufMethodArguments[0] = 1002;
        char[] actual = ((char[]) bufMethod.invoke(textBuffer, bufMethodArguments));
        
        char[] expected = new char[1002];
        
        assertArrayEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buf(int)}
     */
    @Test
    public void testBuf1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method bufMethod = textBufferClazz.getDeclaredMethod("buf", intType);
        bufMethod.setAccessible(true);
        java.lang.Object[] bufMethodArguments = new java.lang.Object[1];
        bufMethodArguments[0] = -2147482646;
        char[] actual = ((char[]) bufMethod.invoke(textBuffer, bufMethodArguments));
        
        char[] expected = new char[200];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.expand
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expand(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expand(int)}
 * @utbot.executesCondition {@code (_segments == null): False}
 * @utbot.executesCondition {@code (newLen < MIN_SEGMENT_LEN): True}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#carr(int)
 *  */
    @Test
    public void testExpand_NewLenLessThanMIN_SEGMENT_LEN() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method expandMethod = textBufferClazz.getDeclaredMethod("expand", intType);
        expandMethod.setAccessible(true);
        java.lang.Object[] expandMethodArguments = new java.lang.Object[1];
        expandMethodArguments[0] = -255;
        expandMethod.invoke(textBuffer, expandMethodArguments);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expand(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expand(int)}
 * @utbot.executesCondition {@code (_segments == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _segmentSize += curr.length;
 *  */
    @Test
    public void testExpand_ThrowNullPointerException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.expand] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:682) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method expandMethod = textBufferClazz.getDeclaredMethod("expand", intType);
        expandMethod.setAccessible(true);
        java.lang.Object[] expandMethodArguments = new java.lang.Object[1];
        expandMethodArguments[0] = -255;
        try {
            expandMethod.invoke(textBuffer, expandMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expand(int)}
 * @utbot.executesCondition {@code (_segments == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _segmentSize += curr.length;
 *  */
    @Test
    public void testExpand_ThrowNullPointerException_1() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.expand] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:682) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method expandMethod = textBufferClazz.getDeclaredMethod("expand", intType);
        expandMethod.setAccessible(true);
        java.lang.Object[] expandMethodArguments = new java.lang.Object[1];
        expandMethodArguments[0] = -255;
        try {
            expandMethod.invoke(textBuffer, expandMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.getTextOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextOffset()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextOffset()}
 * @utbot.executesCondition {@code ((_inputStart >= 0)): False}
 * @utbot.returnsFrom {@code return (_inputStart >= 0) ? _inputStart : 0;}
 *  */
    @Test
    public void testGetTextOffset__inputStartLessThanZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        int actual = textBuffer.getTextOffset();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextOffset()}
 * @utbot.executesCondition {@code ((_inputStart >= 0)): True}
 * @utbot.returnsFrom {@code return (_inputStart >= 0) ? _inputStart : 0;}
 *  */
    @Test
    public void testGetTextOffset__inputStartGreaterOrEqualZero() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        int actual = textBuffer.getTextOffset();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyAndGetCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#emptyAndGetCurrentSegment()}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.returnsFrom {@code return curr;}
 *  */
    @Test
    public void testEmptyAndGetCurrentSegment_Not_hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        char[] actual = textBuffer.emptyAndGetCurrentSegment();
        
        assertArrayEquals(_currentSegment, actual);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#emptyAndGetCurrentSegment()}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 * @utbot.returnsFrom {@code return curr;}
 *  */
    @Test
    public void testEmptyAndGetCurrentSegment__hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        char[] actual = textBuffer.emptyAndGetCurrentSegment();
        
        assertArrayEquals(_currentSegment, actual);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertFalse(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emptyAndGetCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#emptyAndGetCurrentSegment()}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (curr == null): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#buf(int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = curr = buf(0);
 *  */
    @Test
    public void testEmptyAndGetCurrentSegment_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:545) */
            textBuffer.emptyAndGetCurrentSegment();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#emptyAndGetCurrentSegment()}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearSegments();
 *  */
    @Test
    public void testEmptyAndGetCurrentSegment_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:541) */
        textBuffer.emptyAndGetCurrentSegment();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method emptyAndGetCurrentSegment()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#emptyAndGetCurrentSegment()}
     */
    @Test
    public void testEmptyAndGetCurrentSegment() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        char[] actual = textBuffer.emptyAndGetCurrentSegment();
        
        char[] expected = new char[200];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegmentSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentSegmentSize()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegmentSize()}
 * @utbot.returnsFrom {@code return _currentSize;}
 *  */
    @Test
    public void testGetCurrentSegmentSize_Return_currentSize() {
        TextBuffer textBuffer = new TextBuffer(null);
        textBuffer.setCurrentLength(-255);
        
        int actual = textBuffer.getCurrentSegmentSize();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentAndReturn(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testSetCurrentAndReturn__segmentSizeGreaterThanZero_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        String actual = textBuffer.setCurrentAndReturn(-255);
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testSetCurrentAndReturn__segmentSizeGreaterThanZero_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        String actual = textBuffer.setCurrentAndReturn(-255);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): False}
 * @utbot.executesCondition {@code ((currLen == 0)): False}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testSetCurrentAndReturn_CurrLenNotEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        String actual = textBuffer.setCurrentAndReturn(1);
        
        String expected = " ";
        
        assertEquals(expected, actual);
        
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(1, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): False}
 * @utbot.executesCondition {@code ((currLen == 0)): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testSetCurrentAndReturn_CurrLenEqualsZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        TextBuffer textBuffer = new TextBuffer(null);
        textBuffer.setCurrentLength(-255);
        
        String actual = textBuffer.setCurrentAndReturn(0);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testSetCurrentAndReturn__segmentSizeGreaterThanZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        String actual = textBuffer.setCurrentAndReturn(-255);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testSetCurrentAndReturn__segmentSizeGreaterThanZero_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        String actual = textBuffer.setCurrentAndReturn(-255);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 *  */
    @Test
    public void testSetCurrentAndReturn__segmentSizeGreaterThanZero_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        String actual = textBuffer.setCurrentAndReturn(0);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCurrentAndReturn(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contentsAsString();
 *  */
    @Test
    public void testSetCurrentAndReturn_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:330)
            com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn(TextBuffer.java:560) */
        textBuffer.setCurrentAndReturn(-255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return contentsAsString();
 *  */
    @Test
    public void testSetCurrentAndReturn_ThrowIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn] produces [java.lang.IndexOutOfBoundsException: start 0, end 9, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:348)
            com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn(TextBuffer.java:560) */
        textBuffer.setCurrentAndReturn(9);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): False}
 * @utbot.executesCondition {@code ((currLen == 0)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new String(_currentSegment, 0, currLen)
 *  */
    @Test
    public void testSetCurrentAndReturn_ThrowNullPointerException() {
        TextBuffer textBuffer = new TextBuffer(null);
        textBuffer.setCurrentLength(-255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn(TextBuffer.java:564) */
        textBuffer.setCurrentAndReturn(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentAndReturn(int)}
 * @utbot.executesCondition {@code (_segmentSize > 0): True}
 * @utbot.returnsFrom {@code return contentsAsString();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return contentsAsString();
 *  */
    @Test
    public void testSetCurrentAndReturn_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:348)
            com.fasterxml.jackson.core.util.TextBuffer.setCurrentAndReturn(TextBuffer.java:560) */
        textBuffer.setCurrentAndReturn(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finishCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#finishCurrentSegment()}
 * @utbot.executesCondition {@code (_segments == null): False}
 * @utbot.executesCondition {@code (newLen < MIN_SEGMENT_LEN): True}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#carr(int)
 * @utbot.returnsFrom {@code return curr;}
 *  */
    @Test
    public void testFinishCurrentSegment_NewLenLessThanMIN_SEGMENT_LEN() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.finishCurrentSegment();
        
        char[] expected = new char[1000];
        
        assertArrayEquals(expected, actual);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(-254, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finishCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#finishCurrentSegment()}
 * @utbot.executesCondition {@code (_segments == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int oldLen = _currentSegment.length;
 *  */
    @Test
    public void testFinishCurrentSegment_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment(TextBuffer.java:575) */
        textBuffer.finishCurrentSegment();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#finishCurrentSegment()}
 * @utbot.executesCondition {@code (_segments == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int oldLen = _currentSegment.length;
 *  */
    @Test
    public void testFinishCurrentSegment_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment(TextBuffer.java:575) */
        textBuffer.finishCurrentSegment();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.hasTextAsCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTextAsCharacters()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#hasTextAsCharacters()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 *  */
    @Test
    public void testHasTextAsCharacters__resultArrayNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        boolean actual = textBuffer.hasTextAsCharacters();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#hasTextAsCharacters()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 *  */
    @Test
    public void testHasTextAsCharacters__inputStartGreaterOrEqualZero() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        boolean actual = textBuffer.hasTextAsCharacters();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#hasTextAsCharacters()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTextAsCharacters__resultStringNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        boolean actual = textBuffer.hasTextAsCharacters();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#hasTextAsCharacters()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): False}
 *  */
    @Test
    public void testHasTextAsCharacters__resultStringEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        boolean actual = textBuffer.hasTextAsCharacters();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expandCurrentSegment(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expandCurrentSegment(int)}
 * @utbot.executesCondition {@code (curr.length >= minSize): True}
 * @utbot.returnsFrom {@code return curr;}
 *  */
    @Test
    public void testExpandCurrentSegment_CurrLengthGreaterOrEqualMinSize() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] actual = textBuffer.expandCurrentSegment(1);
        
        assertArrayEquals(_currentSegment, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expandCurrentSegment(int)}
 * @utbot.executesCondition {@code (curr.length >= minSize): False}
 * @utbot.invokes {@link java.util.Arrays#copyOf(char[],int)}
 * @utbot.returnsFrom {@code return curr;}
 *  */
    @Test
    public void testExpandCurrentSegment_CurrLengthLessThanMinSize() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.expandCurrentSegment(1);
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expandCurrentSegment(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expandCurrentSegment(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: curr.length >= minSize
 *  */
    @Test
    public void testExpandCurrentSegment_ThrowNullPointerException() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment(TextBuffer.java:620) */
        textBuffer.expandCurrentSegment(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expandCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expandCurrentSegment()}
 * @utbot.executesCondition {@code (newLen > MAX_SEGMENT_LEN): False}
 * @utbot.invokes {@link java.util.Arrays#copyOf(char[],int)}
 * @utbot.returnsFrom {@code return (_currentSegment = Arrays.copyOf(curr, newLen));}
 *  */
    @Test
    public void testExpandCurrentSegment_NewLenLessOrEqualMAX_SEGMENT_LEN() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.expandCurrentSegment();
        
        char[] expected = {' '};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expandCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expandCurrentSegment()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = curr.length;
 *  */
    @Test
    public void testExpandCurrentSegment_ThrowNullPointerException1() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment(TextBuffer.java:600) */
        textBuffer.expandCurrentSegment();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetWithEmpty()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 * @utbot.executesCondition {@code (_hasSegments): False}
 *  */
    @Test
    public void testResetWithEmpty_Not_hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        textBuffer.resetWithEmpty();
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 *  */
    @Test
    public void testResetWithEmpty__hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        textBuffer.resetWithEmpty();
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertFalse(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetWithEmpty()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearSegments();
 *  */
    @Test
    public void testResetWithEmpty_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty(TextBuffer.java:166) */
        textBuffer.resetWithEmpty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contentsAsArray()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        char[] actual = textBuffer.contentsAsArray();
        
        assertArrayEquals(_resultArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = new TextBuffer(null);
            
            char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
            
            char[] actual = textBuffer.contentsAsArray();
            
            assertArrayEquals(noChars, actual);
            
            char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
            
            assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultEqualsNull_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        char[] actual = textBuffer.contentsAsArray();
        
        char[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultEqualsNull_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        char[] actual = textBuffer.contentsAsArray();
        
        char[] expected = {' '};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultEqualsNull_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        char[] actual = textBuffer.contentsAsArray();
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultEqualsNull_5() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 3);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
            
            char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
            
            char[] actual = textBuffer.contentsAsArray();
            
            assertArrayEquals(noChars, actual);
            
            char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
            
            assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContentsAsArray_ResultEqualsNull_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        char[] actual = textBuffer.contentsAsArray();
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contentsAsArray()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 3);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:711)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: _resultArray = result = resultArray();
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testContentsAsArray_ThrowOutOfMemoryError() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        _inputBuffer[0] = ' ';
        _inputBuffer[1] = ' ';
        _inputBuffer[2] = ' ';
        _inputBuffer[3] = ' ';
        _inputBuffer[4] = ' ';
        _inputBuffer[5] = ' ';
        _inputBuffer[6] = ' ';
        _inputBuffer[7] = ' ';
        _inputBuffer[8] = ' ';
        _inputBuffer[9] = ' ';
        _inputBuffer[10] = ' ';
        _inputBuffer[11] = ' ';
        _inputBuffer[12] = ' ';
        _inputBuffer[13] = ' ';
        _inputBuffer[14] = ' ';
        _inputBuffer[15] = ' ';
        _inputBuffer[16] = ' ';
        _inputBuffer[17] = ' ';
        _inputBuffer[18] = ' ';
        _inputBuffer[19] = ' ';
        _inputBuffer[20] = ' ';
        _inputBuffer[21] = ' ';
        _inputBuffer[22] = ' ';
        _inputBuffer[23] = ' ';
        _inputBuffer[24] = ' ';
        _inputBuffer[25] = ' ';
        _inputBuffer[26] = ' ';
        _inputBuffer[27] = ' ';
        _inputBuffer[28] = ' ';
        _inputBuffer[29] = ' ';
        _inputBuffer[30] = ' ';
        _inputBuffer[31] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MAX_VALUE);
        
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -126);
        char[] _currentSegment = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 127);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 127 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:711)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:709)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 161);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -160);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 161);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -160);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 161);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -160);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = resultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 161);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -160);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:723)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360) */
        textBuffer.contentsAsArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.resetWithString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetWithString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithString(java.lang.String)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 *  */
    @Test
    public void testResetWithString_Not_hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        textBuffer.resetWithString(null);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithString(java.lang.String)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 *  */
    @Test
    public void testResetWithString__hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        textBuffer.resetWithString(null);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertFalse(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetWithString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithString(java.lang.String)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearSegments();
 *  */
    @Test
    public void testResetWithString_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithString(TextBuffer.java:222) */
        textBuffer.resetWithString(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contentsAsDouble()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.returnsFrom {@code return NumberInput.parseDouble(contentsAsString());}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowNumberFormatException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowNumberFormatException() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowNumberFormatException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowNumberFormatException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:330)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowNegativeArraySizeException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NegativeArraySizeException: -255]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:339)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NumberInput.parseDouble(contentsAsString());
 *  */
    @Test
    public void testContentsAsDouble_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contentsAsDouble()
    
    @Test
    public void testContentsAsDouble1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        double actual = textBuffer.contentsAsDouble();
        
        org.junit.Assert.assertEquals(2.0, actual, 1.0E-6);
    }
    
    @Test
    public void testContentsAsDouble2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[40];
        _currentSegment[0] = '2';
        _currentSegment[1] = '.';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 23);
        
        double actual = textBuffer.contentsAsDouble();
        
        org.junit.Assert.assertEquals(2.0, actual, 1.0E-6);
    }
    
    @Test
    public void testContentsAsDouble3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        _inputBuffer[12] = '2';
        _inputBuffer[13] = '.';
        _inputBuffer[14] = '2';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 12);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 23);
        
        double actual = textBuffer.contentsAsDouble();
        
        org.junit.Assert.assertEquals(2.2, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method contentsAsDouble()
    
    @Test
    public void testContentsAsDouble4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "!                  !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[23];
        _resultArray[0] = '\"';
        _resultArray[1] = 'e';
        _resultArray[2] = 'e';
        _resultArray[3] = 'e';
        _resultArray[4] = 'e';
        _resultArray[5] = 'e';
        _resultArray[6] = 'e';
        _resultArray[7] = 'e';
        _resultArray[8] = 'e';
        _resultArray[9] = 'e';
        _resultArray[10] = 'e';
        _resultArray[11] = 'e';
        _resultArray[12] = 'e';
        _resultArray[13] = 'e';
        _resultArray[14] = 'e';
        _resultArray[15] = 'e';
        _resultArray[16] = 'e';
        _resultArray[17] = 'e';
        _resultArray[18] = 'e';
        _resultArray[19] = 'e';
        _resultArray[20] = '!';
        _resultArray[21] = '\u0001';
        _resultArray[22] = '\u0001';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: ""eeeeeeeeeeeeeeeeeee!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[40];
        _currentSegment[0] = '2';
        _currentSegment[22] = '!';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "2                     !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble7() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[31];
        _inputBuffer[8] = '2';
        _inputBuffer[29] = '!';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 8);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "2                    !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble8() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[18];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble9() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0100', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 11);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.IndexOutOfBoundsException: start 0, end 11, length 9]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:348)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble10() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:348)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:348)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:392) */
        textBuffer.contentsAsDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.setCurrentLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentLength(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentLength(int)}
 * @utbot.returnsFrom {@code public void setCurrentLength(int len) {
 *     _currentSize = len;
 * }}
 *  */
    @Test
    public void testSetCurrentLength_Return() {
        TextBuffer textBuffer = new TextBuffer(null);
        textBuffer.setCurrentLength(-255);
        
        textBuffer.setCurrentLength(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.resetWithShared
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetWithShared([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithShared(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 *  */
    @Test
    public void testResetWithShared_Not_hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        
        textBuffer.resetWithShared(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithShared(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 *  */
    @Test
    public void testResetWithShared__hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        textBuffer.resetWithShared(null, -255, -255);
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertNull(finalTextBuffer_inputBuffer);
        
        assertFalse(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetWithShared([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithShared(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#clearSegments()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearSegments();
 *  */
    @Test
    public void testResetWithShared_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithShared] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithShared(TextBuffer.java:189) */
        textBuffer.resetWithShared(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.contentsAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contentsAsString()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_resultString == null): False}
 * @utbot.returnsFrom {@code return _resultString;}
 *  */
    @Test
    public void testContentsAsString__resultStringNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        String actual = textBuffer.contentsAsString();
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_resultString == null): True}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputLen < 1): True}
 * @utbot.returnsFrom {@code return (_resultString = "");}
 *  */
    @Test
    public void testContentsAsString__inputLenLessThan1() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        String actual = textBuffer.contentsAsString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_resultString == null): True}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 * @utbot.returnsFrom {@code return _resultString;}
 *  */
    @Test
    public void testContentsAsString__resultArrayNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        String actual = textBuffer.contentsAsString();
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_resultString == null): True}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (segLen == 0): True}
 * @utbot.executesCondition {@code ((currLen == 0)): True}
 * @utbot.returnsFrom {@code return _resultString;}
 *  */
    @Test
    public void testContentsAsString_CurrLenEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        String actual = textBuffer.contentsAsString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_resultString == null): True}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputLen < 1): False}
 * @utbot.returnsFrom {@code return _resultString;}
 *  */
    @Test
    public void testContentsAsString__inputLenGreaterOrEqual1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        String actual = textBuffer.contentsAsString();
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contentsAsString()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputLen < 1): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _resultString = new String(_inputBuffer, _inputStart, _inputLen);
 *  */
    @Test
    public void testContentsAsString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:330) */
        textBuffer.contentsAsString();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (segLen == 0): True}
 * @utbot.executesCondition {@code ((currLen == 0)): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: ""
 *  */
    @Test
    public void testContentsAsString_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337) */
        textBuffer.contentsAsString();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (segLen == 0): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char[],int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return _resultString;}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return _resultString;
 *  */
    @Test
    public void testContentsAsString_ThrowNegativeArraySizeException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsString] produces [java.lang.NegativeArraySizeException: -254]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:339) */
        textBuffer.contentsAsString();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsString()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (segLen == 0): True}
 * @utbot.executesCondition {@code ((currLen == 0)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ""
 *  */
    @Test
    public void testContentsAsString_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337) */
        textBuffer.contentsAsString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.resultArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resultArray()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_resultString != null): True}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.returnsFrom {@code return _resultString.toCharArray();}
 *  */
    @Test
    public void testResultArray__resultStringNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments));
        
        char[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.invokes {@link java.util.Arrays#copyOf(char[],int)}
 * @utbot.returnsFrom {@code return Arrays.copyOf(_inputBuffer, len);}
 *  */
    @Test
    public void testResultArray_StartEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.invokes {@link java.util.Arrays#copyOfRange(char[],int,int)}
 * @utbot.returnsFrom {@code return Arrays.copyOfRange(_inputBuffer, start, start + len);}
 *  */
    @Test
    public void testResultArray_StartNotEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 2);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): True}
 * @utbot.returnsFrom {@code return NO_CHARS;}
 *  */
    @Test
    public void testResultArray_LenLessThan1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = new TextBuffer(null);
            
            Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
            resultArrayMethod.setAccessible(true);
            java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
            char[] actual = ((char[]) resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments));
            
            assertArrayEquals(noChars, actual);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): True}
 * @utbot.returnsFrom {@code return NO_CHARS;}
 *  */
    @Test
    public void testResultArray_SizeLessThan1() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
            char[] _resultArray = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
            
            Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
            resultArrayMethod.setAccessible(true);
            java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
            char[] actual = ((char[]) resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments));
            
            assertArrayEquals(noChars, actual);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): False}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#carr(int)
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testResultArray__segmentsEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resultArray()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return Arrays.copyOfRange(_inputBuffer, start, start + len);
 *  */
    @Test
    public void testResultArray_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 3);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:711) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: return Arrays.copyOfRange(_inputBuffer, start, start + len);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testResultArray_ThrowOutOfMemoryError() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[12];
        _inputBuffer[0] = ' ';
        _inputBuffer[1] = ' ';
        _inputBuffer[2] = ' ';
        _inputBuffer[3] = ' ';
        _inputBuffer[4] = ' ';
        _inputBuffer[5] = ' ';
        _inputBuffer[6] = ' ';
        _inputBuffer[7] = ' ';
        _inputBuffer[8] = ' ';
        _inputBuffer[9] = ' ';
        _inputBuffer[10] = ' ';
        _inputBuffer[11] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MAX_VALUE);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testResultArray_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testResultArray_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Arrays.copyOfRange(_inputBuffer, start, start + len);
 *  */
    @Test
    public void testResultArray_ThrowNullPointerException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:711) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.invokes {@link java.util.Arrays#copyOf(char[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Arrays.copyOf(_inputBuffer, len);
 *  */
    @Test
    public void testResultArray_ThrowNullPointerException_1() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:709) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testResultArray_ThrowNullPointerException_2() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testResultArray_ThrowNullPointerException_3() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _segments.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testResultArray_ThrowNullPointerException_5() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _segments.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int currLen = curr.length;
 *  */
    @Test
    public void testResultArray_ThrowNullPointerException_4() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resultArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:723) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method resultArrayMethod = textBufferClazz.getDeclaredMethod("resultArray");
        resultArrayMethod.setAccessible(true);
        java.lang.Object[] resultArrayMethodArguments = new java.lang.Object[0];
        try {
            resultArrayMethod.invoke(textBuffer, resultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.carr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method carr(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#carr(int)}
 * @utbot.returnsFrom {@code return new char[len];}
 *  */
    @Test
    public void testCarr_ReturnNewArrayOfChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        TextBuffer textBuffer = new TextBuffer(null);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method carrMethod = textBufferClazz.getDeclaredMethod("carr", intType);
        carrMethod.setAccessible(true);
        java.lang.Object[] carrMethodArguments = new java.lang.Object[1];
        carrMethodArguments[0] = 1;
        char[] actual = ((char[]) carrMethod.invoke(textBuffer, carrMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method carr(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#carr(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: private char[] carr(int len) {
 *     return new char[len];
 * }
 *  */
    @Test
    public void testCarr_ThrowNegativeArraySizeException() throws Throwable  {
        TextBuffer textBuffer = new TextBuffer(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.carr] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.core.util.TextBuffer.carr(TextBuffer.java:732) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method carrMethod = textBufferClazz.getDeclaredMethod("carr", intType);
        carrMethod.setAccessible(true);
        java.lang.Object[] carrMethodArguments = new java.lang.Object[1];
        carrMethodArguments[0] = -256;
        try {
            carrMethod.invoke(textBuffer, carrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetWithCopy([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 *  */
    @Test
    public void testResetWithCopy() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        char[] charArray = {};
        
        textBuffer.resetWithCopy(charArray, 0, 0);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 *  */
    @Test
    public void testResetWithCopy_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        char[] charArray = {' '};
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.resetWithCopy(charArray, 0, 1);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(1, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetWithCopy([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209) */
        textBuffer.resetWithCopy(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209) */
        textBuffer.resetWithCopy(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209) */
        textBuffer.resetWithCopy(charArray, -1, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = buf(len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:206) */
            textBuffer.resetWithCopy(null, -255, 199);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = buf(len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:206) */
            textBuffer.resetWithCopy(null, -255, 200);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _currentSegment = {'\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209) */
        textBuffer.resetWithCopy(charArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearSegments();
 *  */
    @Test
    public void testResetWithCopy_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204) */
        textBuffer.resetWithCopy(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:458)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209) */
        textBuffer.resetWithCopy(null, -255, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method resetWithCopy([C, int, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
     */
    @Test
    public void testResetWithCopyThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        char[] charArray = {'?', '?', '?'};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -2147483648 out of bounds for char[3]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:441)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209) */
        textBuffer.resetWithCopy(charArray, Integer.MIN_VALUE, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureNotShared()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 *  */
    @Test
    public void testEnsureNotShared__inputStartLessThanZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        textBuffer.ensureNotShared();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 *  */
    @Test
    public void testEnsureNotShared__inputStartGreaterOrEqualZero_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[17];
        _currentSegment[0] = ' ';
        _currentSegment[1] = ' ';
        _currentSegment[2] = ' ';
        _currentSegment[3] = ' ';
        _currentSegment[4] = ' ';
        _currentSegment[5] = ' ';
        _currentSegment[6] = ' ';
        _currentSegment[7] = ' ';
        _currentSegment[8] = ' ';
        _currentSegment[9] = ' ';
        _currentSegment[10] = ' ';
        _currentSegment[11] = ' ';
        _currentSegment[12] = ' ';
        _currentSegment[13] = ' ';
        _currentSegment[14] = ' ';
        _currentSegment[15] = ' ';
        _currentSegment[16] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        textBuffer.ensureNotShared();
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertNull(finalTextBuffer_inputBuffer);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(1, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 *  */
    @Test
    public void testEnsureNotShared__inputStartGreaterOrEqualZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = new char[33];
        _currentSegment[0] = ' ';
        _currentSegment[1] = ' ';
        _currentSegment[2] = ' ';
        _currentSegment[3] = ' ';
        _currentSegment[4] = ' ';
        _currentSegment[5] = ' ';
        _currentSegment[6] = ' ';
        _currentSegment[7] = ' ';
        _currentSegment[8] = ' ';
        _currentSegment[9] = ' ';
        _currentSegment[10] = ' ';
        _currentSegment[11] = ' ';
        _currentSegment[12] = ' ';
        _currentSegment[13] = ' ';
        _currentSegment[14] = ' ';
        _currentSegment[15] = ' ';
        _currentSegment[16] = ' ';
        _currentSegment[17] = ' ';
        _currentSegment[18] = ' ';
        _currentSegment[19] = ' ';
        _currentSegment[20] = ' ';
        _currentSegment[21] = ' ';
        _currentSegment[22] = ' ';
        _currentSegment[23] = ' ';
        _currentSegment[24] = ' ';
        _currentSegment[25] = ' ';
        _currentSegment[26] = ' ';
        _currentSegment[27] = ' ';
        _currentSegment[28] = ' ';
        _currentSegment[29] = ' ';
        _currentSegment[30] = ' ';
        _currentSegment[31] = ' ';
        _currentSegment[32] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        textBuffer.ensureNotShared();
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureNotShared()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(16);
 *  */
    @Test
    public void testEnsureNotShared_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[17];
        _currentSegment[0] = ' ';
        _currentSegment[1] = ' ';
        _currentSegment[2] = ' ';
        _currentSegment[3] = ' ';
        _currentSegment[4] = ' ';
        _currentSegment[5] = ' ';
        _currentSegment[6] = ' ';
        _currentSegment[7] = ' ';
        _currentSegment[8] = ' ';
        _currentSegment[9] = ' ';
        _currentSegment[10] = ' ';
        _currentSegment[11] = ' ';
        _currentSegment[12] = ' ';
        _currentSegment[13] = ' ';
        _currentSegment[14] = ' ';
        _currentSegment[15] = ' ';
        _currentSegment[16] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:407) */
        textBuffer.ensureNotShared();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(16);
 *  */
    @Test
    public void testEnsureNotShared_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 241);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:407) */
            textBuffer.ensureNotShared();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(16);
 *  */
    @Test
    public void testEnsureNotShared_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 184);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:407) */
            textBuffer.ensureNotShared();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(16);
 *  */
    @Test
    public void testEnsureNotShared_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 183);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:407) */
            textBuffer.ensureNotShared();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(16);
 *  */
    @Test
    public void testEnsureNotShared_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[17];
        _currentSegment[0] = ' ';
        _currentSegment[1] = ' ';
        _currentSegment[2] = ' ';
        _currentSegment[3] = ' ';
        _currentSegment[4] = ' ';
        _currentSegment[5] = ' ';
        _currentSegment[6] = ' ';
        _currentSegment[7] = ' ';
        _currentSegment[8] = ' ';
        _currentSegment[9] = ' ';
        _currentSegment[10] = ' ';
        _currentSegment[11] = ' ';
        _currentSegment[12] = ' ';
        _currentSegment[13] = ' ';
        _currentSegment[14] = ' ';
        _currentSegment[15] = ' ';
        _currentSegment[16] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:407) */
        textBuffer.ensureNotShared();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method ensureNotShared()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
     */
    @Test
    public void testEnsureNotShared() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        textBuffer.ensureNotShared();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (curr == null): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): False}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__currentSizeLessThanCurrLength() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        char[] actual = textBuffer.getCurrentSegment();
        
        assertArrayEquals(_currentSegment, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__inputStartGreaterOrEqualZero_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {'\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] actual = textBuffer.getCurrentSegment();
        
        assertArrayEquals(_currentSegment, actual);
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        char[] textBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        char finalTextBuffer_currentSegment0 = ((Character) get(textBuffer_currentSegment, 0));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertNull(finalTextBuffer_inputBuffer);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(' ', finalTextBuffer_currentSegment0);
        
        assertEquals(1, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__inputStartGreaterOrEqualZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] actual = textBuffer.getCurrentSegment();
        
        assertArrayEquals(_currentSegment, actual);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_segmentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (curr == null): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): True}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__currentSizeGreaterOrEqualCurrLength_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.getCurrentSegment();
        
        char[] expected = new char[1000];
        
        assertArrayEquals(expected, actual);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__inputStartGreaterOrEqualZero_2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            
            char[] actual = textBuffer.getCurrentSegment();
            
            char[] expected = new char[200];
            
            assertArrayEquals(expected, actual);
            
            BufferRecycler textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers0 = ((char[]) get(textBuffer_allocator_allocator_charBuffers, 0));
            BufferRecycler textBuffer_allocator1 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator1_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers1 = ((char[]) get(textBuffer_allocator1_allocator_charBuffers, 1));
            BufferRecycler textBuffer_allocator2 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator2_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers3 = ((char[]) get(textBuffer_allocator2_allocator_charBuffers, 3));
            BufferRecycler textBuffer_allocator3 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator3_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator3, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers4 = ((char[]) get(textBuffer_allocator3_allocator_charBuffers, 4));
            BufferRecycler textBuffer_allocator4 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator4_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator4, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers5 = ((char[]) get(textBuffer_allocator4_allocator_charBuffers, 5));
            BufferRecycler textBuffer_allocator5 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator5_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator5, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers6 = ((char[]) get(textBuffer_allocator5_allocator_charBuffers, 6));
            BufferRecycler textBuffer_allocator6 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator6_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator6, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers7 = ((char[]) get(textBuffer_allocator6_allocator_charBuffers, 7));
            BufferRecycler textBuffer_allocator7 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator7_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator7, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers8 = ((char[]) get(textBuffer_allocator7_allocator_charBuffers, 8));
            BufferRecycler textBuffer_allocator8 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator8_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator8, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers9 = ((char[]) get(textBuffer_allocator8_allocator_charBuffers, 9));
            BufferRecycler textBuffer_allocator9 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator9_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator9, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers10 = ((char[]) get(textBuffer_allocator9_allocator_charBuffers, 10));
            BufferRecycler textBuffer_allocator10 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator10_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator10, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers11 = ((char[]) get(textBuffer_allocator10_allocator_charBuffers, 11));
            BufferRecycler textBuffer_allocator11 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator11_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator11, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers12 = ((char[]) get(textBuffer_allocator11_allocator_charBuffers, 12));
            BufferRecycler textBuffer_allocator12 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator12_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator12, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers13 = ((char[]) get(textBuffer_allocator12_allocator_charBuffers, 13));
            BufferRecycler textBuffer_allocator13 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator13_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator13, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers14 = ((char[]) get(textBuffer_allocator13_allocator_charBuffers, 14));
            BufferRecycler textBuffer_allocator14 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator14_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator14, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers15 = ((char[]) get(textBuffer_allocator14_allocator_charBuffers, 15));
            BufferRecycler textBuffer_allocator15 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator15_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator15, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers16 = ((char[]) get(textBuffer_allocator15_allocator_charBuffers, 16));
            BufferRecycler textBuffer_allocator16 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator16_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator16, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers17 = ((char[]) get(textBuffer_allocator16_allocator_charBuffers, 17));
            BufferRecycler textBuffer_allocator17 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator17_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator17, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers18 = ((char[]) get(textBuffer_allocator17_allocator_charBuffers, 18));
            BufferRecycler textBuffer_allocator18 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator18_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator18, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers19 = ((char[]) get(textBuffer_allocator18_allocator_charBuffers, 19));
            BufferRecycler textBuffer_allocator19 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator19_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator19, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers20 = ((char[]) get(textBuffer_allocator19_allocator_charBuffers, 20));
            BufferRecycler textBuffer_allocator20 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator20_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator20, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers21 = ((char[]) get(textBuffer_allocator20_allocator_charBuffers, 21));
            BufferRecycler textBuffer_allocator21 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator21_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator21, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers22 = ((char[]) get(textBuffer_allocator21_allocator_charBuffers, 22));
            BufferRecycler textBuffer_allocator22 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator22_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator22, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers23 = ((char[]) get(textBuffer_allocator22_allocator_charBuffers, 23));
            BufferRecycler textBuffer_allocator23 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator23_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator23, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers24 = ((char[]) get(textBuffer_allocator23_allocator_charBuffers, 24));
            BufferRecycler textBuffer_allocator24 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator24_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator24, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers25 = ((char[]) get(textBuffer_allocator24_allocator_charBuffers, 25));
            BufferRecycler textBuffer_allocator25 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator25_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator25, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers26 = ((char[]) get(textBuffer_allocator25_allocator_charBuffers, 26));
            BufferRecycler textBuffer_allocator26 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator26_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator26, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers27 = ((char[]) get(textBuffer_allocator26_allocator_charBuffers, 27));
            BufferRecycler textBuffer_allocator27 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator27_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator27, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers28 = ((char[]) get(textBuffer_allocator27_allocator_charBuffers, 28));
            BufferRecycler textBuffer_allocator28 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator28_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator28, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers29 = ((char[]) get(textBuffer_allocator28_allocator_charBuffers, 29));
            BufferRecycler textBuffer_allocator29 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator29_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator29, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers30 = ((char[]) get(textBuffer_allocator29_allocator_charBuffers, 30));
            BufferRecycler textBuffer_allocator30 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator30_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator30, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers31 = ((char[]) get(textBuffer_allocator30_allocator_charBuffers, 31));
            BufferRecycler textBuffer_allocator31 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator31_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator31, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers32 = ((char[]) get(textBuffer_allocator31_allocator_charBuffers, 32));
            BufferRecycler textBuffer_allocator32 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator32_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator32, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers33 = ((char[]) get(textBuffer_allocator32_allocator_charBuffers, 33));
            BufferRecycler textBuffer_allocator33 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator33_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator33, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers34 = ((char[]) get(textBuffer_allocator33_allocator_charBuffers, 34));
            BufferRecycler textBuffer_allocator34 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator34_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator34, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers35 = ((char[]) get(textBuffer_allocator34_allocator_charBuffers, 35));
            BufferRecycler textBuffer_allocator35 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator35_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator35, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers36 = ((char[]) get(textBuffer_allocator35_allocator_charBuffers, 36));
            BufferRecycler textBuffer_allocator36 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator36_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator36, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers37 = ((char[]) get(textBuffer_allocator36_allocator_charBuffers, 37));
            BufferRecycler textBuffer_allocator37 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator37_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator37, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers38 = ((char[]) get(textBuffer_allocator37_allocator_charBuffers, 38));
            BufferRecycler textBuffer_allocator38 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator38_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator38, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers39 = ((char[]) get(textBuffer_allocator38_allocator_charBuffers, 39));
            int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
            char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            
            assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
            
            assertNull(finalTextBuffer_allocator_charBuffers0);
            
            assertNull(finalTextBuffer_allocator_charBuffers1);
            
            assertNull(finalTextBuffer_allocator_charBuffers3);
            
            assertNull(finalTextBuffer_allocator_charBuffers4);
            
            assertNull(finalTextBuffer_allocator_charBuffers5);
            
            assertNull(finalTextBuffer_allocator_charBuffers6);
            
            assertNull(finalTextBuffer_allocator_charBuffers7);
            
            assertNull(finalTextBuffer_allocator_charBuffers8);
            
            assertNull(finalTextBuffer_allocator_charBuffers9);
            
            assertNull(finalTextBuffer_allocator_charBuffers10);
            
            assertNull(finalTextBuffer_allocator_charBuffers11);
            
            assertNull(finalTextBuffer_allocator_charBuffers12);
            
            assertNull(finalTextBuffer_allocator_charBuffers13);
            
            assertNull(finalTextBuffer_allocator_charBuffers14);
            
            assertNull(finalTextBuffer_allocator_charBuffers15);
            
            assertNull(finalTextBuffer_allocator_charBuffers16);
            
            assertNull(finalTextBuffer_allocator_charBuffers17);
            
            assertNull(finalTextBuffer_allocator_charBuffers18);
            
            assertNull(finalTextBuffer_allocator_charBuffers19);
            
            assertNull(finalTextBuffer_allocator_charBuffers20);
            
            assertNull(finalTextBuffer_allocator_charBuffers21);
            
            assertNull(finalTextBuffer_allocator_charBuffers22);
            
            assertNull(finalTextBuffer_allocator_charBuffers23);
            
            assertNull(finalTextBuffer_allocator_charBuffers24);
            
            assertNull(finalTextBuffer_allocator_charBuffers25);
            
            assertNull(finalTextBuffer_allocator_charBuffers26);
            
            assertNull(finalTextBuffer_allocator_charBuffers27);
            
            assertNull(finalTextBuffer_allocator_charBuffers28);
            
            assertNull(finalTextBuffer_allocator_charBuffers29);
            
            assertNull(finalTextBuffer_allocator_charBuffers30);
            
            assertNull(finalTextBuffer_allocator_charBuffers31);
            
            assertNull(finalTextBuffer_allocator_charBuffers32);
            
            assertNull(finalTextBuffer_allocator_charBuffers33);
            
            assertNull(finalTextBuffer_allocator_charBuffers34);
            
            assertNull(finalTextBuffer_allocator_charBuffers35);
            
            assertNull(finalTextBuffer_allocator_charBuffers36);
            
            assertNull(finalTextBuffer_allocator_charBuffers37);
            
            assertNull(finalTextBuffer_allocator_charBuffers38);
            
            assertNull(finalTextBuffer_allocator_charBuffers39);
            
            assertEquals(-1, finalTextBuffer_inputStart);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__inputStartGreaterOrEqualZero_3() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
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
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            
            char[] actual = textBuffer.getCurrentSegment();
            
            char[] expected = new char[200];
            
            assertArrayEquals(expected, actual);
            
            BufferRecycler textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers0 = ((char[]) get(textBuffer_allocator_allocator_charBuffers, 0));
            BufferRecycler textBuffer_allocator1 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator1_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers1 = ((char[]) get(textBuffer_allocator1_allocator_charBuffers, 1));
            BufferRecycler textBuffer_allocator2 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator2_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer_allocator2_allocator_charBuffers, 2));
            BufferRecycler textBuffer_allocator3 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator3_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator3, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers3 = ((char[]) get(textBuffer_allocator3_allocator_charBuffers, 3));
            BufferRecycler textBuffer_allocator4 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator4_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator4, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers4 = ((char[]) get(textBuffer_allocator4_allocator_charBuffers, 4));
            BufferRecycler textBuffer_allocator5 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator5_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator5, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers5 = ((char[]) get(textBuffer_allocator5_allocator_charBuffers, 5));
            BufferRecycler textBuffer_allocator6 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator6_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator6, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers6 = ((char[]) get(textBuffer_allocator6_allocator_charBuffers, 6));
            BufferRecycler textBuffer_allocator7 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator7_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator7, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers7 = ((char[]) get(textBuffer_allocator7_allocator_charBuffers, 7));
            BufferRecycler textBuffer_allocator8 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator8_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator8, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers8 = ((char[]) get(textBuffer_allocator8_allocator_charBuffers, 8));
            BufferRecycler textBuffer_allocator9 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator9_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator9, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers9 = ((char[]) get(textBuffer_allocator9_allocator_charBuffers, 9));
            BufferRecycler textBuffer_allocator10 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator10_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator10, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers10 = ((char[]) get(textBuffer_allocator10_allocator_charBuffers, 10));
            BufferRecycler textBuffer_allocator11 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator11_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator11, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers11 = ((char[]) get(textBuffer_allocator11_allocator_charBuffers, 11));
            BufferRecycler textBuffer_allocator12 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator12_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator12, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers12 = ((char[]) get(textBuffer_allocator12_allocator_charBuffers, 12));
            BufferRecycler textBuffer_allocator13 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator13_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator13, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers13 = ((char[]) get(textBuffer_allocator13_allocator_charBuffers, 13));
            BufferRecycler textBuffer_allocator14 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator14_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator14, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers14 = ((char[]) get(textBuffer_allocator14_allocator_charBuffers, 14));
            BufferRecycler textBuffer_allocator15 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator15_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator15, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers15 = ((char[]) get(textBuffer_allocator15_allocator_charBuffers, 15));
            BufferRecycler textBuffer_allocator16 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator16_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator16, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers16 = ((char[]) get(textBuffer_allocator16_allocator_charBuffers, 16));
            BufferRecycler textBuffer_allocator17 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator17_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator17, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers17 = ((char[]) get(textBuffer_allocator17_allocator_charBuffers, 17));
            BufferRecycler textBuffer_allocator18 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator18_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator18, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers18 = ((char[]) get(textBuffer_allocator18_allocator_charBuffers, 18));
            BufferRecycler textBuffer_allocator19 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator19_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator19, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers19 = ((char[]) get(textBuffer_allocator19_allocator_charBuffers, 19));
            BufferRecycler textBuffer_allocator20 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator20_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator20, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers20 = ((char[]) get(textBuffer_allocator20_allocator_charBuffers, 20));
            BufferRecycler textBuffer_allocator21 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator21_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator21, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers21 = ((char[]) get(textBuffer_allocator21_allocator_charBuffers, 21));
            BufferRecycler textBuffer_allocator22 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator22_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator22, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers22 = ((char[]) get(textBuffer_allocator22_allocator_charBuffers, 22));
            BufferRecycler textBuffer_allocator23 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator23_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator23, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers23 = ((char[]) get(textBuffer_allocator23_allocator_charBuffers, 23));
            BufferRecycler textBuffer_allocator24 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator24_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator24, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers24 = ((char[]) get(textBuffer_allocator24_allocator_charBuffers, 24));
            BufferRecycler textBuffer_allocator25 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator25_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator25, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers25 = ((char[]) get(textBuffer_allocator25_allocator_charBuffers, 25));
            BufferRecycler textBuffer_allocator26 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator26_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator26, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers26 = ((char[]) get(textBuffer_allocator26_allocator_charBuffers, 26));
            BufferRecycler textBuffer_allocator27 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator27_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator27, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers27 = ((char[]) get(textBuffer_allocator27_allocator_charBuffers, 27));
            BufferRecycler textBuffer_allocator28 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator28_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator28, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers28 = ((char[]) get(textBuffer_allocator28_allocator_charBuffers, 28));
            BufferRecycler textBuffer_allocator29 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator29_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator29, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers29 = ((char[]) get(textBuffer_allocator29_allocator_charBuffers, 29));
            BufferRecycler textBuffer_allocator30 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator30_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator30, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers30 = ((char[]) get(textBuffer_allocator30_allocator_charBuffers, 30));
            BufferRecycler textBuffer_allocator31 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator31_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator31, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers31 = ((char[]) get(textBuffer_allocator31_allocator_charBuffers, 31));
            BufferRecycler textBuffer_allocator32 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator32_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator32, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers32 = ((char[]) get(textBuffer_allocator32_allocator_charBuffers, 32));
            BufferRecycler textBuffer_allocator33 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator33_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator33, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers33 = ((char[]) get(textBuffer_allocator33_allocator_charBuffers, 33));
            BufferRecycler textBuffer_allocator34 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator34_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator34, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers34 = ((char[]) get(textBuffer_allocator34_allocator_charBuffers, 34));
            BufferRecycler textBuffer_allocator35 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator35_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator35, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers35 = ((char[]) get(textBuffer_allocator35_allocator_charBuffers, 35));
            BufferRecycler textBuffer_allocator36 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator36_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator36, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers36 = ((char[]) get(textBuffer_allocator36_allocator_charBuffers, 36));
            BufferRecycler textBuffer_allocator37 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator37_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator37, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers37 = ((char[]) get(textBuffer_allocator37_allocator_charBuffers, 37));
            BufferRecycler textBuffer_allocator38 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator38_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator38, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers38 = ((char[]) get(textBuffer_allocator38_allocator_charBuffers, 38));
            BufferRecycler textBuffer_allocator39 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
            char[][] textBuffer_allocator39_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator39, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
            char[] finalTextBuffer_allocator_charBuffers39 = ((char[]) get(textBuffer_allocator39_allocator_charBuffers, 39));
            int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
            char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
            
            assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
            
            assertNull(finalTextBuffer_allocator_charBuffers0);
            
            assertNull(finalTextBuffer_allocator_charBuffers1);
            
            assertNull(finalTextBuffer_allocator_charBuffers2);
            
            assertNull(finalTextBuffer_allocator_charBuffers3);
            
            assertNull(finalTextBuffer_allocator_charBuffers4);
            
            assertNull(finalTextBuffer_allocator_charBuffers5);
            
            assertNull(finalTextBuffer_allocator_charBuffers6);
            
            assertNull(finalTextBuffer_allocator_charBuffers7);
            
            assertNull(finalTextBuffer_allocator_charBuffers8);
            
            assertNull(finalTextBuffer_allocator_charBuffers9);
            
            assertNull(finalTextBuffer_allocator_charBuffers10);
            
            assertNull(finalTextBuffer_allocator_charBuffers11);
            
            assertNull(finalTextBuffer_allocator_charBuffers12);
            
            assertNull(finalTextBuffer_allocator_charBuffers13);
            
            assertNull(finalTextBuffer_allocator_charBuffers14);
            
            assertNull(finalTextBuffer_allocator_charBuffers15);
            
            assertNull(finalTextBuffer_allocator_charBuffers16);
            
            assertNull(finalTextBuffer_allocator_charBuffers17);
            
            assertNull(finalTextBuffer_allocator_charBuffers18);
            
            assertNull(finalTextBuffer_allocator_charBuffers19);
            
            assertNull(finalTextBuffer_allocator_charBuffers20);
            
            assertNull(finalTextBuffer_allocator_charBuffers21);
            
            assertNull(finalTextBuffer_allocator_charBuffers22);
            
            assertNull(finalTextBuffer_allocator_charBuffers23);
            
            assertNull(finalTextBuffer_allocator_charBuffers24);
            
            assertNull(finalTextBuffer_allocator_charBuffers25);
            
            assertNull(finalTextBuffer_allocator_charBuffers26);
            
            assertNull(finalTextBuffer_allocator_charBuffers27);
            
            assertNull(finalTextBuffer_allocator_charBuffers28);
            
            assertNull(finalTextBuffer_allocator_charBuffers29);
            
            assertNull(finalTextBuffer_allocator_charBuffers30);
            
            assertNull(finalTextBuffer_allocator_charBuffers31);
            
            assertNull(finalTextBuffer_allocator_charBuffers32);
            
            assertNull(finalTextBuffer_allocator_charBuffers33);
            
            assertNull(finalTextBuffer_allocator_charBuffers34);
            
            assertNull(finalTextBuffer_allocator_charBuffers35);
            
            assertNull(finalTextBuffer_allocator_charBuffers36);
            
            assertNull(finalTextBuffer_allocator_charBuffers37);
            
            assertNull(finalTextBuffer_allocator_charBuffers38);
            
            assertNull(finalTextBuffer_allocator_charBuffers39);
            
            assertEquals(-1, finalTextBuffer_inputStart);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (curr == null): False}
 * @utbot.executesCondition {@code (_currentSize >= curr.length): True}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetCurrentSegment__currentSizeGreaterOrEqualCurrLength() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.getCurrentSegment();
        
        char[] expected = new char[1000];
        
        assertArrayEquals(expected, actual);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(1, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (curr == null): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#buf(int)
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#allocCharBuffer(int,int)}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#buf(int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = buf(0);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:519) */
            textBuffer.getCurrentSegment();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(1);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = new char[40][];
            _charBuffers[0] = ((char[]) null);
            _charBuffers[1] = ((char[]) null);
            char[] charArray = new char[40];
            _charBuffers[2] = charArray;
            _charBuffers[3] = ((char[]) null);
            _charBuffers[4] = ((char[]) null);
            _charBuffers[5] = ((char[]) null);
            _charBuffers[6] = ((char[]) null);
            _charBuffers[7] = ((char[]) null);
            _charBuffers[8] = ((char[]) null);
            _charBuffers[9] = ((char[]) null);
            _charBuffers[10] = ((char[]) null);
            _charBuffers[11] = ((char[]) null);
            _charBuffers[12] = ((char[]) null);
            _charBuffers[13] = ((char[]) null);
            _charBuffers[14] = ((char[]) null);
            _charBuffers[15] = ((char[]) null);
            _charBuffers[16] = ((char[]) null);
            _charBuffers[17] = ((char[]) null);
            _charBuffers[18] = ((char[]) null);
            _charBuffers[19] = ((char[]) null);
            _charBuffers[20] = ((char[]) null);
            _charBuffers[21] = ((char[]) null);
            _charBuffers[22] = ((char[]) null);
            _charBuffers[23] = ((char[]) null);
            _charBuffers[24] = ((char[]) null);
            _charBuffers[25] = ((char[]) null);
            _charBuffers[26] = ((char[]) null);
            _charBuffers[27] = ((char[]) null);
            _charBuffers[28] = ((char[]) null);
            _charBuffers[29] = ((char[]) null);
            _charBuffers[30] = ((char[]) null);
            _charBuffers[31] = ((char[]) null);
            _charBuffers[32] = ((char[]) null);
            _charBuffers[33] = ((char[]) null);
            _charBuffers[34] = ((char[]) null);
            _charBuffers[35] = ((char[]) null);
            _charBuffers[36] = ((char[]) null);
            _charBuffers[37] = ((char[]) null);
            _charBuffers[38] = ((char[]) null);
            _charBuffers[39] = ((char[]) null);
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 128);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 257);
            char[] _currentSegment = {'\u0000'};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 385 out of bounds for char[0]]
                java.base/java.lang.System.arraycopy(Native Method)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
                com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:515) */
            textBuffer.getCurrentSegment();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(1);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 256);
            char[] _currentSegment = new char[16];
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:515) */
            textBuffer.getCurrentSegment();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(1);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 198);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660)
                com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:515) */
            textBuffer.getCurrentSegment();
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(1);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {'\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:515) */
        textBuffer.getCurrentSegment();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCurrentSegment()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
     */
    @Test
    public void testGetCurrentSegment() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        char[] actual = textBuffer.getCurrentSegment();
        
        char[] expected = new char[200];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextBuffer()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 * @utbot.returnsFrom {@code return _resultArray;}
 *  */
    @Test
    public void testGetTextBuffer__resultArrayNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        char[] actual = textBuffer.getTextBuffer();
        
        assertArrayEquals(_resultArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.returnsFrom {@code return _inputBuffer;}
 *  */
    @Test
    public void testGetTextBuffer__inputStartGreaterOrEqualZero() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        char[] actual = textBuffer.getTextBuffer();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): True}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.returnsFrom {@code return (_resultArray = _resultString.toCharArray());}
 *  */
    @Test
    public void testGetTextBuffer__resultStringNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        char[] actual = textBuffer.getTextBuffer();
        
        char[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (!_hasSegments): False}
 * @utbot.returnsFrom {@code return contentsAsArray();}
 *  */
    @Test
    public void testGetTextBuffer__hasSegments_1() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -2);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
            
            char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
            
            char[] actual = textBuffer.getTextBuffer();
            
            assertArrayEquals(noChars, actual);
            
            char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
            
            assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (!_hasSegments): True}
 * @utbot.returnsFrom {@code return _currentSegment;}
 *  */
    @Test
    public void testGetTextBuffer_Not_hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        char[] actual = textBuffer.getTextBuffer();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (!_hasSegments): False}
 * @utbot.returnsFrom {@code return contentsAsArray();}
 *  */
    @Test
    public void testGetTextBuffer__hasSegments() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        char[] actual = textBuffer.getTextBuffer();
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTextBuffer()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return contentsAsArray();
 *  */
    @Test
    public void testGetTextBuffer_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:309) */
        textBuffer.getTextBuffer();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return contentsAsArray();
 *  */
    @Test
    public void testGetTextBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:309) */
        textBuffer.getTextBuffer();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return contentsAsArray();
 *  */
    @Test
    public void testGetTextBuffer_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:309) */
        textBuffer.getTextBuffer();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getTextBuffer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return contentsAsArray();
 *  */
    @Test
    public void testGetTextBuffer_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        char[] charArray = {};
        _segments.add(charArray);
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:723)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:309) */
        textBuffer.getTextBuffer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method releaseBuffers()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): False}
 * @utbot.executesCondition {@code (_currentSegment != null): False}
 *  */
    @Test
    public void testReleaseBuffers__currentSegmentEqualsNull() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        textBuffer.releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 *  */
    @Test
    public void testReleaseBuffers__allocatorEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        textBuffer.releaseBuffers();
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): False}
 * @utbot.executesCondition {@code (_currentSegment != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(int,char[])}
 *  */
    @Test
    public void testReleaseBuffers__currentSegmentNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        BufferRecycler textBuffer_allocator = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] initialTextBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer_allocator_allocator_charBuffers, 2));
        
        textBuffer.releaseBuffers();
        
        BufferRecycler textBuffer_allocator1 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator1_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator1, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers0 = ((char[]) get(textBuffer_allocator1_allocator_charBuffers, 0));
        BufferRecycler textBuffer_allocator2 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator2_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator2, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers1 = ((char[]) get(textBuffer_allocator2_allocator_charBuffers, 1));
        BufferRecycler textBuffer_allocator3 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator3_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator3, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers2 = ((char[]) get(textBuffer_allocator3_allocator_charBuffers, 2));
        BufferRecycler textBuffer_allocator4 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator4_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator4, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers3 = ((char[]) get(textBuffer_allocator4_allocator_charBuffers, 3));
        BufferRecycler textBuffer_allocator5 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator5_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator5, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers4 = ((char[]) get(textBuffer_allocator5_allocator_charBuffers, 4));
        BufferRecycler textBuffer_allocator6 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator6_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator6, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers5 = ((char[]) get(textBuffer_allocator6_allocator_charBuffers, 5));
        BufferRecycler textBuffer_allocator7 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator7_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator7, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers6 = ((char[]) get(textBuffer_allocator7_allocator_charBuffers, 6));
        BufferRecycler textBuffer_allocator8 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator8_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator8, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers7 = ((char[]) get(textBuffer_allocator8_allocator_charBuffers, 7));
        BufferRecycler textBuffer_allocator9 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator9_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator9, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers8 = ((char[]) get(textBuffer_allocator9_allocator_charBuffers, 8));
        BufferRecycler textBuffer_allocator10 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator10_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator10, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers9 = ((char[]) get(textBuffer_allocator10_allocator_charBuffers, 9));
        BufferRecycler textBuffer_allocator11 = ((BufferRecycler) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator"));
        char[][] textBuffer_allocator11_allocator_charBuffers = ((char[][]) getFieldValue(textBuffer_allocator11, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers"));
        char[] finalTextBuffer_allocator_charBuffers10 = ((char[]) get(textBuffer_allocator11_allocator_charBuffers, 10));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialTextBuffer_allocator_charBuffers2 == finalTextBuffer_allocator_charBuffers2);
        
        assertNull(finalTextBuffer_allocator_charBuffers0);
        
        assertNull(finalTextBuffer_allocator_charBuffers1);
        
        assertNull(finalTextBuffer_allocator_charBuffers3);
        
        assertNull(finalTextBuffer_allocator_charBuffers4);
        
        assertNull(finalTextBuffer_allocator_charBuffers5);
        
        assertNull(finalTextBuffer_allocator_charBuffers6);
        
        assertNull(finalTextBuffer_allocator_charBuffers7);
        
        assertNull(finalTextBuffer_allocator_charBuffers8);
        
        assertNull(finalTextBuffer_allocator_charBuffers9);
        
        assertNull(finalTextBuffer_allocator_charBuffers10);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertNull(finalTextBuffer_currentSegment);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseBuffers()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): False}
 * @utbot.executesCondition {@code (_currentSegment != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _allocator.releaseCharBuffer(BufferRecycler.CHAR_TEXT_BUFFER, buf);
 *  */
    @Test
    public void testReleaseBuffers_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:132)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:145) */
        textBuffer.releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): False}
 * @utbot.executesCondition {@code (_currentSegment != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _allocator.releaseCharBuffer(BufferRecycler.CHAR_TEXT_BUFFER, buf);
 *  */
    @Test
    public void testReleaseBuffers_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        char[] _inputBuffer = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:132)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:145) */
        textBuffer.releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resetWithEmpty();
 *  */
    @Test
    public void testReleaseBuffers_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty(TextBuffer.java:166)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:137) */
        textBuffer.releaseBuffers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.unshare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unshare(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.executesCondition {@code (needed > _currentSegment.length): False}
 * @utbot.executesCondition {@code (sharedLen > 0): False}
 *  */
    @Test
    public void testUnshare_SharedLenLessOrEqualZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
        unshareMethod.setAccessible(true);
        java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
        unshareMethodArguments[0] = 1;
        unshareMethod.invoke(textBuffer, unshareMethodArguments);
        
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unshare(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.executesCondition {@code (needed > _currentSegment.length): False}
 * @utbot.executesCondition {@code (sharedLen > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(inputBuf, start, _currentSegment, 0, sharedLen);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _inputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
        unshareMethod.setAccessible(true);
        java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
        unshareMethodArguments[0] = -1;
        try {
            unshareMethod.invoke(textBuffer, unshareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.executesCondition {@code (needed > _currentSegment.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = buf(needed);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
            char[] _currentSegment = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660) */
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            Class intType = int.class;
            Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
            unshareMethod.setAccessible(true);
            java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
            unshareMethodArguments[0] = 1;
            try {
                unshareMethod.invoke(textBuffer, unshareMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = buf(needed);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660) */
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            Class intType = int.class;
            Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
            unshareMethod.setAccessible(true);
            java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
            unshareMethodArguments[0] = -14;
            try {
                unshareMethod.invoke(textBuffer, unshareMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = buf(needed);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 200);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:660) */
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            Class intType = int.class;
            Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
            unshareMethod.setAccessible(true);
            java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
            unshareMethodArguments[0] = -1;
            try {
                unshareMethod.invoke(textBuffer, unshareMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.executesCondition {@code (needed > _currentSegment.length): False}
 * @utbot.executesCondition {@code (sharedLen > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(inputBuf, start, _currentSegment, 0, sharedLen);
 *  */
    @Test
    public void testUnshare_ThrowNullPointerException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:663) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
        unshareMethod.setAccessible(true);
        java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
        unshareMethodArguments[0] = -1;
        try {
            unshareMethod.invoke(textBuffer, unshareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unshare(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
     */
    @Test
    public void testUnshare() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
        unshareMethod.setAccessible(true);
        java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
        unshareMethodArguments[0] = -3;
        unshareMethod.invoke(textBuffer, unshareMethodArguments);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method unshare(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testUnshareThrowsOOME() throws Throwable  {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method unshareMethod = textBufferClazz.getDeclaredMethod("unshare", intType);
        unshareMethod.setAccessible(true);
        java.lang.Object[] unshareMethodArguments = new java.lang.Object[1];
        unshareMethodArguments[0] = 2147483645;
        try {
            unshareMethod.invoke(textBuffer, unshareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.clearSegments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearSegments()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#clearSegments()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 *  */
    @Test
    public void testClearSegments_ArrayListClear() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method clearSegmentsMethod = textBufferClazz.getDeclaredMethod("clearSegments");
        clearSegmentsMethod.setAccessible(true);
        java.lang.Object[] clearSegmentsMethodArguments = new java.lang.Object[0];
        clearSegmentsMethod.invoke(textBuffer, clearSegmentsMethodArguments);
        
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearSegments()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#clearSegments()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _segments.clear();
 *  */
    @Test
    public void testClearSegments_ThrowNullPointerException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.clearSegments] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method clearSegmentsMethod = textBufferClazz.getDeclaredMethod("clearSegments");
        clearSegmentsMethod.setAccessible(true);
        java.lang.Object[] clearSegmentsMethodArguments = new java.lang.Object[0];
        try {
            clearSegmentsMethod.invoke(textBuffer, clearSegmentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contentsAsDecimal()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.returnsFrom {@code return NumberInput.parseBigDecimal(_resultArray);}
 *  */
    @Test
    public void testContentsAsDecimal__resultArrayNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'0'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputBuffer != null): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): True}
 * @utbot.executesCondition {@code (_currentSegment != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.returnsFrom {@code return NumberInput.parseBigDecimal(_currentSegment, 0, _currentSize);}
 *  */
    @Test
    public void testContentsAsDecimal__currentSegmentNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'+', '0'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method contentsAsDecimal()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_resultArray);
 *  */
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal_ThrowNumberFormatException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): True}
 * @utbot.executesCondition {@code (_currentSegment != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_currentSegment, 0, _currentSize);
 *  */
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal_ThrowNumberFormatException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        textBuffer.contentsAsDecimal();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contentsAsDecimal()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return NumberInput.parseBigDecimal(contentsAsArray());
 *  */
    @Test
    public void testContentsAsDecimal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputBuffer != null): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NumberInput.parseBigDecimal(contentsAsArray());
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:709)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputBuffer != null): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NumberInput.parseBigDecimal(contentsAsArray());
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:711)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (_inputBuffer != null): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): True}
 * @utbot.executesCondition {@code (_currentSegment != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NumberInput.parseBigDecimal(contentsAsArray());
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNullPointerException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:709)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): True}
 * @utbot.executesCondition {@code (_currentSegment != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NumberInput.parseBigDecimal(contentsAsArray());
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNullPointerException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        char[] charArray = {'\u0000'};
        _segments.add(charArray);
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:723)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contentsAsDecimal()
    
    @Test
    public void testContentsAsDecimal1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'0'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContentsAsDecimal2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'+', '0', '\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContentsAsDecimal3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "+4";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        char[] initialTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_resultArray == finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method contentsAsDecimal()
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'.'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        textBuffer.contentsAsDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = new TextBuffer(null);
            
            textBuffer.contentsAsDecimal();
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "+\u013A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        textBuffer.contentsAsDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal7() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'+'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        textBuffer.contentsAsDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal8() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", Integer.MIN_VALUE);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
            
            textBuffer.contentsAsDecimal();
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal9() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        textBuffer.contentsAsDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal10() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        textBuffer.contentsAsDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 8);
        char[] _currentSegment = new char[34];
        _currentSegment[0] = '\u8000';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        
        textBuffer.contentsAsDecimal();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal12() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
            
            textBuffer.contentsAsDecimal();
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal13() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        textBuffer.contentsAsDecimal();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method contentsAsDecimal()
    
    @Test
    public void testContentsAsDecimal14() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count -2147483648, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:381) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal15() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count -2147483648, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:381) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal16() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal17() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal18() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:728)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal19() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:723)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:384) */
        textBuffer.contentsAsDecimal();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method contentsAsDecimal()
    
    @Test(timeout = 1000L)
    public void testContentsAsDecimal20() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        textBuffer.contentsAsDecimal();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1023545152528800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1023545152528800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1023545152533800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023545152528800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023545152533800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1023545153916900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023545153916900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023545153918500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023545153916900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023545153918500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1023545154795400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023545154795400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023545154796800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023545154795400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023545154796800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1023545156061600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023545156061600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023545156063000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023545156061600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023545156063000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

