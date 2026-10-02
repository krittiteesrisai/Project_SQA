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
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contentsAsString();
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:342)
            com.fasterxml.jackson.core.util.TextBuffer.toString(TextBuffer.java:620) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:351)
            com.fasterxml.jackson.core.util.TextBuffer.toString(TextBuffer.java:620) */
        textBuffer.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return contentsAsString();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.toString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:349)
            com.fasterxml.jackson.core.util.TextBuffer.toString(TextBuffer.java:620) */
        textBuffer.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([C, int, int)
    
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
    public void testAppend_MaxGreaterOrEqualLen() throws Exception  {
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 125);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        char[] charArray = {' '};
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(charArray, 0, 1);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457) */
        textBuffer.append(charArray, -1, 3);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, max);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:463) */
        textBuffer.append(charArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, max);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        char[] _currentSegment = new char[32];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:463) */
        textBuffer.append(charArray, -1, Integer.MAX_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457) */
        textBuffer.append(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447) */
        textBuffer.append(((char[]) null), -255, -14);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -128);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447) */
        textBuffer.append(((char[]) null), -255, 256);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 200);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447) */
        textBuffer.append(((char[]) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: expand(len);
 *  */
    @Test
    public void testAppend_ThrowNegativeArraySizeException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = new char[40];
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
        _currentSegment[33] = ' ';
        _currentSegment[34] = ' ';
        _currentSegment[35] = ' ';
        _currentSegment[36] = ' ';
        _currentSegment[37] = ' ';
        _currentSegment[38] = ' ';
        _currentSegment[39] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 40);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NegativeArraySizeException: -2147483639]
            com.fasterxml.jackson.core.util.TextBuffer._charArray(TextBuffer.java:715)
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:675)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:472) */
        textBuffer.append(((char[]) null), -255, 2147483617);
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
    public void testAppend_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:474) */
        textBuffer.append(charArray, -1, 5);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:447) */
        textBuffer.append(((char[]) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457) */
        textBuffer.append(((char[]) null), -255, 1);
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
    public void testAppend_ThrowNullPointerException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:463) */
        textBuffer.append(((char[]) null), -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, curr, _currentSize, len);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _inputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457) */
        textBuffer.append(((char[]) null), -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int max = curr.length - _currentSize;
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:454) */
        textBuffer.append(((char[]) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(c, start, curr, _currentSize, max);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[16];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:463) */
        textBuffer.append(((char[]) null), -255, Integer.MAX_VALUE);
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
    public void testAppend_ThrowNullPointerException_6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 254);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:474) */
        textBuffer.append(((char[]) null), -255, -2);
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
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char[],int,int)}
     */
    @Test
    public void testAppendThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCases() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        char[] charArray = {'\u0000', '\u0000', '?', '\u0001'};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2147483648 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457) */
        textBuffer.append(charArray, 0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAppend_MaxGreaterOrEqualLen1() throws Exception  {
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
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#unshare(int)
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#expand(int)
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 *  */
    @Test
    public void testAppend_LenLessOrEqualZero1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(string, 2, 6);
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertNull(finalTextBuffer_inputBuffer);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(3, finalTextBuffer_segmentSize);
        
        assertEquals(6, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _inputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:485) */
        textBuffer.append(((String) null), -255, -1);
    }
    
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
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483643, end -2147483398, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:500) */
        textBuffer.append(string, 2147483643, 256);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 126);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin 148, end 24, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:494) */
        textBuffer.append(string, 148, -124);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:485) */
        textBuffer.append(((String) null), -255, -14);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(len);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 200);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:485) */
        textBuffer.append(((String) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: expand(len);
 *  */
    @Test
    public void testAppend_ThrowNegativeArraySizeException1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = new char[32];
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 30);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        String string = "   ";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NegativeArraySizeException: -2147483634]
            com.fasterxml.jackson.core.util.TextBuffer._charArray(TextBuffer.java:715)
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:675)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:509) */
        textBuffer.append(string, 1, 2147483632);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: str.getChars(offset, offset + amount, _currentSegment, 0);
 *  */
    @Test
    public void testAppend_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end 3, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:511) */
        textBuffer.append(string, -1, 4);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
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
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:485) */
        textBuffer.append(((String) null), -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): True}
 * @utbot.invokes {@link java.lang.String#getChars(int,int,char[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + max, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:500) */
        textBuffer.append(((String) null), -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_21() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:494) */
        textBuffer.append(((String) null), -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int max = curr.length - _currentSize;
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:492) */
        textBuffer.append(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + len, curr, _currentSize);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_31() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:494) */
        textBuffer.append(((String) null), -255, 1);
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
    public void testAppend_ThrowNullPointerException_61() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 253);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:511) */
        textBuffer.append(((String) null), -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (max >= len): False}
 * @utbot.executesCondition {@code (max > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.getChars(offset, offset + amount, _currentSegment, 0);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_41() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:511) */
        textBuffer.append(((String) null), 16, 1);
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(char)
    
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
        char[] _currentSegment = new char[35];
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
        char[] _currentSegment = new char[13];
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.append(' ');
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(13, finalTextBuffer_segmentSize);
        
        assertEquals(1, finalTextBuffer_currentSize);
        
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
    public void testAppend_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[17];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:430) */
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
    public void testAppend_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:440) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -15);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:430) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 256);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:430) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 183);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:430) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unshare(16);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_12() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = new char[17];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:430) */
        textBuffer.append(' ');
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#append(char)}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _currentSize >= curr.length
 *  */
    @Test
    public void testAppend_ThrowNullPointerException2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:436) */
        textBuffer.append(' ');
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.expand
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expand(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expand(int)}
 * @utbot.executesCondition {@code (sizeAddition < minNewSegmentSize): True}
 *  */
    @Test
    public void testExpand_SizeAdditionLessThanMinNewSegmentSize() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method expandMethod = textBufferClazz.getDeclaredMethod("expand", intType);
        expandMethod.setAccessible(true);
        java.lang.Object[] expandMethodArguments = new java.lang.Object[1];
        expandMethodArguments[0] = 2;
        expandMethod.invoke(textBuffer, expandMethodArguments);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(-253, finalTextBuffer_segmentSize);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expand(int)}
 * @utbot.executesCondition {@code (sizeAddition < minNewSegmentSize): False}
 *  */
    @Test
    public void testExpand_SizeAdditionGreaterOrEqualMinNewSegmentSize() throws Exception  {
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
        expandMethodArguments[0] = 0;
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
 * @utbot.executesCondition {@code (_segments == null): False}
 * @utbot.executesCondition {@code (sizeAddition < minNewSegmentSize): True}
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#_charArray(int)
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: _currentSegment = _charArray(Math.min(MAX_SEGMENT_LEN, oldLen + sizeAddition));
 *  */
    @Test
    public void testExpand_ThrowNegativeArraySizeException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = new char[40];
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
        _currentSegment[33] = ' ';
        _currentSegment[34] = ' ';
        _currentSegment[35] = ' ';
        _currentSegment[36] = ' ';
        _currentSegment[37] = ' ';
        _currentSegment[38] = ' ';
        _currentSegment[39] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.expand] produces [java.lang.NegativeArraySizeException: -2147483647]
            com.fasterxml.jackson.core.util.TextBuffer._charArray(TextBuffer.java:715)
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:675) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method expandMethod = textBufferClazz.getDeclaredMethod("expand", intType);
        expandMethod.setAccessible(true);
        java.lang.Object[] expandMethodArguments = new java.lang.Object[1];
        expandMethodArguments[0] = 2147483609;
        try {
            expandMethod.invoke(textBuffer, expandMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
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
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:667) */
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
            com.fasterxml.jackson.core.util.TextBuffer.expand(TextBuffer.java:667) */
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finishCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#finishCurrentSegment()}
 * @utbot.executesCondition {@code (_segments == null): False}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#_charArray(int)
 * @utbot.returnsFrom {@code return curr;}
 *  */
    @Test
    public void testFinishCurrentSegment__segmentsNotEqualsNull() throws Exception  {
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
        
        char[] expected = {'\u0000'};
        
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
            com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment(TextBuffer.java:581) */
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
            com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment(TextBuffer.java:581) */
        textBuffer.finishCurrentSegment();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expandCurrentSegment()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#expandCurrentSegment()}
 * @utbot.executesCondition {@code ((len == MAX_SEGMENT_LEN)): False}
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.returnsFrom {@code return (_currentSegment = Arrays.copyOf(curr, newLen));}
 *  */
    @Test
    public void testExpandCurrentSegment_LenNotEqualsMAX_SEGMENT_LEN() throws Exception  {
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
    public void testExpandCurrentSegment_ThrowNullPointerException() {
        TextBuffer textBuffer = new TextBuffer(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.expandCurrentSegment(TextBuffer.java:600) */
        textBuffer.expandCurrentSegment();
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
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
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#findBuffer(int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = curr = findBuffer(0);
 *  */
    @Test
    public void testEmptyAndGetCurrentSegment_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:561) */
        textBuffer.emptyAndGetCurrentSegment();
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:557) */
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.buildResultArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildResultArray()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_resultString != null): True}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.returnsFrom {@code return _resultString.toCharArray();}
 *  */
    @Test
    public void testBuildResultArray__resultStringNotEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments));
        
        char[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.invokes {@link java.util.Arrays#copyOf(char[],int)}
 * @utbot.returnsFrom {@code return Arrays.copyOf(_inputBuffer, len);}
 *  */
    @Test
    public void testBuildResultArray_StartEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.invokes {@link java.util.Arrays#copyOfRange(char[],int,int)}
 * @utbot.returnsFrom {@code return Arrays.copyOfRange(_inputBuffer, start, start + len);}
 *  */
    @Test
    public void testBuildResultArray_StartNotEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 2);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): True}
 * @utbot.returnsFrom {@code return NO_CHARS;}
 *  */
    @Test
    public void testBuildResultArray_LenLessThan1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = new TextBuffer(null);
            
            Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
            buildResultArrayMethod.setAccessible(true);
            java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
            char[] actual = ((char[]) buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments));
            
            assertArrayEquals(noChars, actual);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): True}
 * @utbot.returnsFrom {@code return NO_CHARS;}
 *  */
    @Test
    public void testBuildResultArray_SizeLessThan1() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
            char[] _resultArray = {};
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
            
            Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
            buildResultArrayMethod.setAccessible(true);
            java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
            char[] actual = ((char[]) buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments));
            
            assertArrayEquals(noChars, actual);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_resultString != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): False}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#_charArray(int)
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testBuildResultArray__segmentsEqualsNull() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        char[] actual = ((char[]) buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildResultArray()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return Arrays.copyOfRange(_inputBuffer, start, start + len);
 *  */
    @Test
    public void testBuildResultArray_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' ', ' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 3);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:693) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: return Arrays.copyOfRange(_inputBuffer, start, start + len);
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testBuildResultArray_ThrowOutOfMemoryError() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MAX_VALUE);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testBuildResultArray_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testBuildResultArray_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Arrays.copyOfRange(_inputBuffer, start, start + len);
 *  */
    @Test
    public void testBuildResultArray_ThrowNullPointerException() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:693) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.executesCondition {@code (len < 1): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.invokes {@link java.util.Arrays#copyOf(char[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Arrays.copyOf(_inputBuffer, len);
 *  */
    @Test
    public void testBuildResultArray_ThrowNullPointerException_1() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:691) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testBuildResultArray_ThrowNullPointerException_2() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testBuildResultArray_ThrowNullPointerException_3() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _segments.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(_currentSegment, 0, result, offset, _currentSize);
 *  */
    @Test
    public void testBuildResultArray_ThrowNullPointerException_5() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#buildResultArray()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (size < 1): False}
 * @utbot.executesCondition {@code (_segments != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _segments.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int currLen = curr.length;
 *  */
    @Test
    public void testBuildResultArray_ThrowNullPointerException_4() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.buildResultArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:705) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Method buildResultArrayMethod = textBufferClazz.getDeclaredMethod("buildResultArray");
        buildResultArrayMethod.setAccessible(true);
        java.lang.Object[] buildResultArrayMethodArguments = new java.lang.Object[0];
        try {
            buildResultArrayMethod.invoke(textBuffer, buildResultArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -2);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
            
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _resultArray = result = buildResultArray();
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
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:693)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: _resultArray = result = buildResultArray();
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testContentsAsArray_ThrowOutOfMemoryError() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
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
        _inputBuffer[32] = ' ';
        _inputBuffer[33] = ' ';
        _inputBuffer[34] = ' ';
        _inputBuffer[35] = ' ';
        _inputBuffer[36] = ' ';
        _inputBuffer[37] = ' ';
        _inputBuffer[38] = ' ';
        _inputBuffer[39] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 33);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2147483615);
        
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 256);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 256 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOfRange(Arrays.java:3967)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:693)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3634)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:691)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _resultArray = result = buildResultArray();
 *  */
    @Test
    public void testContentsAsArray_ThrowNullPointerException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        char[] charArray = {};
        _segments.add(charArray);
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:705)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373) */
        textBuffer.contentsAsArray();
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:342) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:349) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:351) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:349) */
        textBuffer.contentsAsString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.setCurrentLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentLength(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#setCurrentLength(int)}
 *  */
    @Test
    public void testSetCurrentLength() {
        TextBuffer textBuffer = new TextBuffer(null);
        textBuffer.setCurrentLength(-255);
        
        textBuffer.setCurrentLength(-255);
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
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:423) */
        textBuffer.ensureNotShared();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnsureNotShared_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 256);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:423) */
        textBuffer.ensureNotShared();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#ensureNotShared()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnsureNotShared_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 183);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:423) */
        textBuffer.ensureNotShared();
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
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.ensureNotShared(TextBuffer.java:423) */
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer.findBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findBuffer(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#findBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _allocator.allocCharBuffer(BufferRecycler.CharBufferType.TEXT_BUFFER, needed);
 *  */
    @Test
    public void testFindBuffer_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.findBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method findBufferMethod = textBufferClazz.getDeclaredMethod("findBuffer", intType);
        findBufferMethod.setAccessible(true);
        java.lang.Object[] findBufferMethodArguments = new java.lang.Object[1];
        findBufferMethodArguments[0] = 199;
        try {
            findBufferMethod.invoke(textBuffer, findBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#findBuffer(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _allocator.allocCharBuffer(BufferRecycler.CharBufferType.TEXT_BUFFER, needed);
 *  */
    @Test
    public void testFindBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(bufferRecycler, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.findBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method findBufferMethod = textBufferClazz.getDeclaredMethod("findBuffer", intType);
        findBufferMethod.setAccessible(true);
        java.lang.Object[] findBufferMethodArguments = new java.lang.Object[1];
        findBufferMethodArguments[0] = 200;
        try {
            findBufferMethod.invoke(textBuffer, findBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findBuffer(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#findBuffer(int)}
     */
    @Test
    public void testFindBuffer() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method findBufferMethod = textBufferClazz.getDeclaredMethod("findBuffer", intType);
        findBufferMethod.setAccessible(true);
        java.lang.Object[] findBufferMethodArguments = new java.lang.Object[1];
        findBufferMethodArguments[0] = -3;
        char[] actual = ((char[]) findBufferMethod.invoke(textBuffer, findBufferMethodArguments));
        
        char[] expected = new char[200];
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findBuffer(int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#findBuffer(int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testFindBufferThrowsOOME() throws Throwable  {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method findBufferMethod = textBufferClazz.getDeclaredMethod("findBuffer", intType);
        findBufferMethod.setAccessible(true);
        java.lang.Object[] findBufferMethodArguments = new java.lang.Object[1];
        findBufferMethodArguments[0] = 2147483645;
        try {
            findBufferMethod.invoke(textBuffer, findBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.TextBuffer._charArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _charArray(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#_charArray(int)}
 * @utbot.returnsFrom {@code return new char[len];}
 *  */
    @Test
    public void test_charArray_ReturnNewArrayOfChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        TextBuffer textBuffer = new TextBuffer(null);
        
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method _charArrayMethod = textBufferClazz.getDeclaredMethod("_charArray", intType);
        _charArrayMethod.setAccessible(true);
        java.lang.Object[] _charArrayMethodArguments = new java.lang.Object[1];
        _charArrayMethodArguments[0] = 1;
        char[] actual = ((char[]) _charArrayMethod.invoke(textBuffer, _charArrayMethodArguments));
        
        char[] expected = {'\u0000'};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _charArray(int)
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#_charArray(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new char[len];
 *  */
    @Test
    public void test_charArray_ThrowNegativeArraySizeException() throws Throwable  {
        TextBuffer textBuffer = new TextBuffer(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer._charArray] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.core.util.TextBuffer._charArray(TextBuffer.java:715) */
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class intType = int.class;
        Method _charArrayMethod = textBufferClazz.getDeclaredMethod("_charArray", intType);
        _charArrayMethod.setAccessible(true);
        java.lang.Object[] _charArrayMethodArguments = new java.lang.Object[1];
        _charArrayMethodArguments[0] = -256;
        try {
            _charArrayMethod.invoke(textBuffer, _charArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithShared(TextBuffer.java:190) */
        textBuffer.resetWithShared(null, -255, -255);
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
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:342)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NegativeArraySizeException: -255]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:351)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:349)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contentsAsDouble()
    
    @Test
    public void testContentsAsDouble1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "2.2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        double actual = textBuffer.contentsAsDouble();
        
        org.junit.Assert.assertEquals(2.2, actual, 1.0E-6);
    }
    
    @Test
    public void testContentsAsDouble2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[1] = '2';
        _inputBuffer[2] = '.';
        _inputBuffer[3] = '2';
        _inputBuffer[4] = '2';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 23);
        
        double actual = textBuffer.contentsAsDouble();
        
        org.junit.Assert.assertEquals(2.22, actual, 1.0E-6);
    }
    
    @Test
    public void testContentsAsDouble3() throws Exception  {
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method contentsAsDouble()
    
    @Test
    public void testContentsAsDouble4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "!                 !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[23];
        _resultArray[0] = '-';
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
        _resultArray[20] = 'e';
        _resultArray[21] = 'e';
        _resultArray[22] = '!';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "-eeeeeeeeeeeeeeeeeeeee!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[40];
        _currentSegment[0] = '!';
        _currentSegment[18] = '!';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "!                 !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble7() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[31];
        _inputBuffer[12] = '!';
        _inputBuffer[30] = '!';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 8);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "!                 !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble8() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[34];
        _inputBuffer[19] = '\u0001';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 15);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
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
            '\u0000', '\u0000', '@', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 10);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.IndexOutOfBoundsException: start 0, end 10, length 9]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble10() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {
            '!', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NumberFormatException: For input string: "!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:290)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
    }
    
    @Test
    public void testContentsAsDouble12() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 23);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:360)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:408) */
        textBuffer.contentsAsDouble();
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251) */
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        char[] charArray = {' '};
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        textBuffer.resetWithCopy(charArray, 0, 1);
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertNull(finalTextBuffer_inputBuffer);
        
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
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:474)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
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
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:463)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(charArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = findBuffer(len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:207) */
        textBuffer.resetWithCopy(null, -255, 199);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = findBuffer(len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:207) */
        textBuffer.resetWithCopy(null, -255, 200);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
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
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(charArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): False}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
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
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:474)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(charArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _currentSegment = new char[14];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483651 out of bounds for char[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:463)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(charArray, 2147483637, 22);
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", -255);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(null, -255, 1);
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:205) */
        textBuffer.resetWithCopy(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithCopy(char[],int,int)}
 * @utbot.executesCondition {@code (_hasSegments): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append(buf, start, len);
 *  */
    @Test
    public void testResetWithCopy_ThrowNullPointerException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(null, -255, 2);
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
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:457)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:210) */
        textBuffer.resetWithCopy(charArray, Integer.MIN_VALUE, 1);
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
        char[] _resultArray = {'+', '0'};
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
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.returnsFrom {@code return NumberInput.parseBigDecimal(_currentSegment, 0, _currentSize);}
 *  */
    @Test
    public void testContentsAsDecimal__segmentSizeEqualsZero() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'-', '0'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contentsAsDecimal()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[])}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_resultArray);
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNumberFormatException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'-'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:387) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_inputBuffer, _inputStart, _inputLen);
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNumberFormatException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_inputBuffer, _inputStart, _inputLen);
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNumberFormatException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_inputBuffer, _inputStart, _inputLen);
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNumberFormatException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[33];
        _inputBuffer[0] = '/';
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
        _inputBuffer[32] = ' ';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 25);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseBigDecimal(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseBigDecimal(_currentSegment, 0, _currentSize);
 *  */
    @Test
    public void testContentsAsDecimal_ThrowNumberFormatException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
 * @utbot.executesCondition {@code (_resultArray != null): False}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (_segmentSize == 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return NumberInput.parseBigDecimal(contentsAsArray());
 *  */
    @Test
    public void testContentsAsDecimal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
        char[] _currentSegment = {'\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method contentsAsDecimal()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#contentsAsDecimal()}
     */
    @Test
    public void testContentsAsDecimalThrowsNPE() {
        BufferRecycler bufferRecycler = new BufferRecycler();
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:498)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contentsAsDecimal()
    
    @Test
    public void testContentsAsDecimal1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[37] = '-';
        _inputBuffer[38] = '0';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        
        BigDecimal actual = textBuffer.contentsAsDecimal();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContentsAsDecimal2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "-40";
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
    
    ///region OTHER: ERROR SUITE for method contentsAsDecimal()
    
    @Test
    public void testContentsAsDecimal3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'-', '0', '\u013A'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character ĺ is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:387) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[20];
        _resultArray[0] = '-';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:387) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal5() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'+', '.', '.'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character array contains more than one decimal point.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:560)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:387) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal6() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:387) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal7() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[29];
        _inputBuffer[10] = '+';
        _inputBuffer[11] = 'E';
        _inputBuffer[12] = '\u803A';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 10);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Not a digit.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:743)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal8() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[37] = '-';
        _inputBuffer[38] = ':';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character : is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal9() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[29];
        _inputBuffer[9] = '+';
        _inputBuffer[10] = 'E';
        _inputBuffer[11] = '-';
        _inputBuffer[12] = '0';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 9);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 18);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Too many nonzero exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:734)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal10() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[13];
        _inputBuffer[9] = '+';
        _inputBuffer[10] = 'e';
        _inputBuffer[11] = '-';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 9);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: No exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:726)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal11() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Bad offset or len arguments for char[] input.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:500)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:391) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal12() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[38];
        _currentSegment[0] = '+';
        _currentSegment[1] = '0';
        _currentSegment[2] = 'e';
        _currentSegment[3] = '-';
        _currentSegment[4] = '0';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 19);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Too many nonzero exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:734)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal13() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[36];
        _currentSegment[0] = '+';
        _currentSegment[1] = '0';
        _currentSegment[2] = 'e';
        _currentSegment[3] = ':';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 6);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Not a digit.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:743)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal14() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[34];
        _currentSegment[0] = '-';
        _currentSegment[1] = ':';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 8);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character : is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal15() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '+', '0', 'E', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: No exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:726)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal16() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Bad offset or len arguments for char[] input.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:500)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal17() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[34];
        _currentSegment[0] = '-';
        _currentSegment[1] = '0';
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 32);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal18() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:395) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal19() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "-0\u0000";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character   is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal20() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "-.";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal21() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal22() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "+0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal23() throws Exception  {
        char[] prevNO_CHARS = TextBuffer.NO_CHARS;
        try {
            char[] noChars = {};
            Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", Integer.MIN_VALUE);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
            
            /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException]
                java.base/java.math.BigDecimal.<init>(BigDecimal.java:692)
                java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
                com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
                com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
                com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
            textBuffer.contentsAsDecimal();
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test
    public void testContentsAsDecimal24() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 8);
        char[] _currentSegment = new char[34];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NumberFormatException: Character   is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:305)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:299)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal25() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
    }
    
    @Test
    public void testContentsAsDecimal26() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:705)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDecimal(TextBuffer.java:398) */
        textBuffer.contentsAsDecimal();
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
        String _resultString = "";
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        
        textBuffer.resetWithString(null);
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertNull(finalTextBuffer_inputBuffer);
        
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithString(TextBuffer.java:223) */
        textBuffer.resetWithString(null);
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
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = findBuffer(needed);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        char[] _currentSegment = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645) */
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
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): False}
 * @utbot.executesCondition {@code (needed > _currentSegment.length): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = findBuffer(needed);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 214);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645) */
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
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#unshare(int)}
 * @utbot.executesCondition {@code (_currentSegment == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = findBuffer(needed);
 *  */
    @Test
    public void testUnshare_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 200);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.unshare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645) */
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
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648) */
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
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2);
            setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2);
            
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
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:321) */
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
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:321) */
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 129);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -128);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:710)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:321) */
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 129);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -128);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.buildResultArray(TextBuffer.java:705)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:373)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:321) */
        textBuffer.getTextBuffer();
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty(TextBuffer.java:167) */
        textBuffer.resetWithEmpty();
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
    public void testReleaseBuffers__currentSegmentEqualsNull() throws Exception  {
        BufferRecycler bufferRecycler = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        TextBuffer textBuffer = new TextBuffer(bufferRecycler);
        
        textBuffer.releaseBuffers();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): True}
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
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType,char[])}
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
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): True}
 *  */
    @Test
    public void testReleaseBuffers__allocatorEqualsNull_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -254);
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
        char[] _resultArray = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        
        textBuffer.releaseBuffers();
        
        char[] finalTextBuffer_inputBuffer = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer"));
        int finalTextBuffer_inputStart = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart"));
        int finalTextBuffer_inputLen = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen"));
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        char[] finalTextBuffer_resultArray = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray"));
        
        assertNull(finalTextBuffer_inputBuffer);
        
        assertEquals(-1, finalTextBuffer_inputStart);
        
        assertEquals(0, finalTextBuffer_inputLen);
        
        assertFalse(finalTextBuffer_hasSegments);
        
        assertEquals(0, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
        
        assertNull(finalTextBuffer_resultArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method releaseBuffers()
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#releaseBuffers()}
 * @utbot.executesCondition {@code (_allocator == null): False}
 * @utbot.executesCondition {@code (_currentSegment != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.TextBuffer#resetWithEmpty()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.BufferRecycler#releaseCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType,char[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _allocator.releaseCharBuffer(BufferRecycler.CharBufferType.TEXT_BUFFER, buf);
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
            com.fasterxml.jackson.core.util.BufferRecycler.releaseCharBuffer(BufferRecycler.java:99)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:146) */
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
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", -255);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -255);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:251)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithEmpty(TextBuffer.java:167)
            com.fasterxml.jackson.core.util.TextBuffer.releaseBuffers(TextBuffer.java:138) */
        textBuffer.releaseBuffers();
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
    public void testGetCurrentSegment__currentSizeGreaterOrEqualCurrLength_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {' '};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.getCurrentSegment();
        
        char[] expected = {'\u0000', '\u0000'};
        
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
        char[] _currentSegment = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        
        char[] initialTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        
        char[] actual = textBuffer.getCurrentSegment();
        
        char[] expected = new char[13];
        
        assertArrayEquals(expected, actual);
        
        boolean finalTextBuffer_hasSegments = ((Boolean) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments"));
        int finalTextBuffer_segmentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize"));
        char[] finalTextBuffer_currentSegment = ((char[]) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment"));
        int finalTextBuffer_currentSize = ((Integer) getFieldValue(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize"));
        
        assertFalse(initialTextBuffer_currentSegment == finalTextBuffer_currentSegment);
        
        assertTrue(finalTextBuffer_hasSegments);
        
        assertEquals(9, finalTextBuffer_segmentSize);
        
        assertEquals(0, finalTextBuffer_currentSize);
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
        
        char[] expected = {'\u0000', '\u0000'};
        
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
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: unshare(1);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        char[] _currentSegment = {'\u0000', '\u0000'};
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:531) */
        textBuffer.getCurrentSegment();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): False}
 * @utbot.executesCondition {@code (curr == null): True}
 * @utbot.invokes com.fasterxml.jackson.core.util.TextBuffer#findBuffer(int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _currentSegment = findBuffer(0);
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:535) */
        textBuffer.getCurrentSegment();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 12);
        char[] _currentSegment = new char[12];
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:531) */
        textBuffer.getCurrentSegment();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 198);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:531) */
        textBuffer.getCurrentSegment();
    }
    
    /**
    @utbot.classUnderTest {@link TextBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.TextBuffer#getCurrentSegment()}
 * @utbot.executesCondition {@code (_inputStart >= 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCurrentSegment_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        TextBuffer textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[][] _charBuffers = {};
        setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 199);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:88)
            com.fasterxml.jackson.core.util.TextBuffer.findBuffer(TextBuffer.java:236)
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:645)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:531) */
        textBuffer.getCurrentSegment();
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
            com.fasterxml.jackson.core.util.TextBuffer.unshare(TextBuffer.java:648)
            com.fasterxml.jackson.core.util.TextBuffer.getCurrentSegment(TextBuffer.java:531) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1022239140191700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1022239140191700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1022239140219900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1022239140191700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1022239140219900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1022239140553900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1022239140553900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1022239140556100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1022239140553900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1022239140556100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1022239140911200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1022239140911200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1022239140912700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1022239140911200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1022239140912700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

