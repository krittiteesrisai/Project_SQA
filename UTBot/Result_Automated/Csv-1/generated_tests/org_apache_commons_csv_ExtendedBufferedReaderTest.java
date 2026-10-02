package org.apache.commons.csv;

import org.junit.Test;
import java.io.FileReader;
import sun.nio.cs.StreamDecoder;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import java.io.FilterInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.channels.NotYetConnectedException;
import jdk.internal.util.xml.impl.ReaderUTF8;
import sun.nio.ch.FileChannelImpl;
import jdk.internal.util.xml.impl.ReaderUTF16;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_csv_ExtendedBufferedReaderTest {
    ///region Test suites for executable org.apache.commons.csv.ExtendedBufferedReader.readAgain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readAgain()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#readAgain()}
 * @utbot.returnsFrom {@code return lastChar;}
 *  */
    @Test
    public void testReadAgain_ReturnLastChar() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        
        int actual = extendedBufferedReader.readAgain();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.ExtendedBufferedReader.lookAhead
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lookAhead()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.invokes {@link java.io.BufferedReader#mark(int)}
 * @utbot.invokes {@link java.io.BufferedReader#read()}
 * @utbot.invokes {@link java.io.BufferedReader#reset()}
 * @utbot.returnsFrom {@code return c;}
 *  */
    @Test
    public void testLookAhead_BufferedReaderReset() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.lookAhead();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        int finalExtendedBufferedReaderMarkedChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "markedChar"));
        int finalExtendedBufferedReaderReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit"));
        boolean finalExtendedBufferedReaderMarkedSkipLF = ((Boolean) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "markedSkipLF"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(0, finalExtendedBufferedReaderNextChar);
        
        assertEquals(0, finalExtendedBufferedReaderMarkedChar);
        
        assertEquals(1, finalExtendedBufferedReaderReadAheadLimit);
        
        assertTrue(finalExtendedBufferedReaderMarkedSkipLF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lookAhead()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: super.mark(1);
 *  */
    @Test
    public void testLookAhead_ThrowNullPointerException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.lookAhead] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.mark(BufferedReader.java:494)
            org.apache.commons.csv.ExtendedBufferedReader.lookAhead(ExtendedBufferedReader.java:146) */
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.invokes {@link java.io.BufferedReader#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int c = super.read();
 *  */
    @Test
    public void testLookAhead_ThrowNullPointerException_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 2);
        setField(in, "java.io.BufferedReader", "nextChar", 2);
        setField(in, "java.io.BufferedReader", "markedChar", 2);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.lookAhead] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.lookAhead(ExtendedBufferedReader.java:147) */
        extendedBufferedReader.lookAhead();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method lookAhead()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: int c = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.invokes {@link java.io.BufferedReader#reset()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_2() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_3() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 437781120);
        setField(in, "java.io.BufferedReader", "nextChar", 437781120);
        setField(in, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: int c = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_4() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 2);
        setField(in, "java.io.BufferedReader", "nextChar", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_5() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_6() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: int c = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_7() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 437781120);
        setField(in, "java.io.BufferedReader", "nextChar", 437781120);
        setField(in, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_8() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in2 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
 * @utbot.throwsException {@link java.io.IOException} in: super.reset();
 *  */
    @Test(expected = IOException.class)
    public void testLookAhead_ThrowIOException_9() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", -2090517494);
        setField(bb, "java.nio.Buffer", "limit", -2090517494);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.lookAhead();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lookAhead()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#lookAhead()}
     */
    @Test
    public void testLookAheadReturns10() throws IOException  {
        StringReader stringReader = new StringReader("\n\t");
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(stringReader);
        
        int actual = extendedBufferedReader.lookAhead();
        
        assertEquals(10, actual);
    }
    ///endregion
    
    ///region Errors report for lookAhead
    
    public void testLookAhead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 50 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.ExtendedBufferedReader.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method read([C, int, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.executesCondition {@code (length == 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testRead_LengthEqualsZero() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        
        int actual = extendedBufferedReader.read(null, 0, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.executesCondition {@code (length == 0): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_Char() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\n');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 65538);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 65538);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {'\r', ' '};
        
        int actual = extendedBufferedReader.read(charArray, 1, 1);
        
        assertEquals(1, actual);
        
        int finalExtendedBufferedReaderLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        
        char finalCharArray1 = charArray[1];
        
        assertEquals(10, finalExtendedBufferedReaderLastChar);
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals('\n', finalCharArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.executesCondition {@code (length == 0): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_Char_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\n');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {' ', ' '};
        
        int actual = extendedBufferedReader.read(charArray, 1, 1);
        
        assertEquals(1, actual);
        
        int finalExtendedBufferedReaderLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        int finalExtendedBufferedReaderLineCounter = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter"));
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        
        char finalCharArray1 = charArray[1];
        
        assertEquals(10, finalExtendedBufferedReaderLastChar);
        
        assertEquals(1, finalExtendedBufferedReaderLineCounter);
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals('\n', finalCharArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.executesCondition {@code (length == 0): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_ILessOrEqualZero() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\n');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        char[] charArray = {' '};
        
        int actual = extendedBufferedReader.read(charArray, 0, 1);
        
        assertEquals(1, actual);
        
        int finalExtendedBufferedReaderLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        
        char finalCharArray0 = charArray[0];
        
        assertEquals(10, finalExtendedBufferedReaderLastChar);
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals('\n', finalCharArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.executesCondition {@code (length == 0): False}
 *  */
    @Test
    public void testRead_LengthNotEqualsZero() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 274497876);
        setField(bb, "java.nio.Buffer", "limit", 274497876);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        char[] charArray = {' ', ' '};
        
        int actual = extendedBufferedReader.read(charArray, 0, 2);
        
        assertEquals(1, actual);
        
        int finalExtendedBufferedReaderLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        char finalCharArray0 = charArray[0];
        
        assertEquals(10, finalExtendedBufferedReaderLastChar);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
        
        assertEquals('\n', finalCharArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method read([C, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (length == 0): False}
    /// invoke:
    ///     {@link java.io.BufferedReader#read(char[],int,int)} once
    /// execute conditions:
    ///     {@code (len > 0): True},
    ///     {@code (ch == '\n'): False}
    /// return from: {@code return len;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_ChEqualsChar() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter", -255);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\r');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {' '};
        
        int actual = extendedBufferedReader.read(charArray, 0, 1);
        
        assertEquals(1, actual);
        
        int finalExtendedBufferedReaderLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        int finalExtendedBufferedReaderLineCounter = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter"));
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        
        char finalCharArray0 = charArray[0];
        
        assertEquals(13, finalExtendedBufferedReaderLastChar);
        
        assertEquals(-254, finalExtendedBufferedReaderLineCounter);
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals('\r', finalCharArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_ChNotEqualsChar() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {' '};
        
        int actual = extendedBufferedReader.read(charArray, 0, 1);
        
        assertEquals(1, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        
        char finalCharArray0 = charArray[0];
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals('\u0000', finalCharArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_ChEqualsChar_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 274497876);
        setField(bb, "java.nio.Buffer", "limit", 274497876);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\r'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {' ', ' '};
        
        int actual = extendedBufferedReader.read(charArray, 0, 2);
        
        assertEquals(1, actual);
        
        int finalExtendedBufferedReaderLastChar = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        int finalExtendedBufferedReaderLineCounter = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        char finalCharArray0 = charArray[0];
        
        assertEquals(13, finalExtendedBufferedReaderLastChar);
        
        assertEquals(1, finalExtendedBufferedReaderLineCounter);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
        
        assertEquals('\r', finalCharArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = offset; i < offset + len; i++)} once
 * @utbot.returnsFrom {@code return len;}
 *  */
    @Test
    public void testRead_ChNotEqualsChar_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(bb, "java.nio.Buffer", "position", 274497876);
        setField(bb, "java.nio.Buffer", "limit", 274497876);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {' '};
        
        int actual = extendedBufferedReader.read(charArray, 0, 1);
        
        assertEquals(1, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        char finalCharArray0 = charArray[0];
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
        
        assertEquals('\u0000', finalCharArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([C, int, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.executesCondition {@code (length == 0): False}
 * @utbot.invokes {@link java.io.BufferedReader#read(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = super.read(buf, offset, length);
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -1);
        char[] charArray = {' ', ' '};
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.read] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:85) */
        extendedBufferedReader.read(charArray, 0, 2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([C, int, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: int len = super.read(buf, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        char[] charArray = {' ', ' '};
        
        extendedBufferedReader.read(charArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: int len = super.read(buf, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", 1);
        char[] charArray = {' '};
        
        extendedBufferedReader.read(charArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: int len = super.read(buf, offset, length);
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_2() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        char[] charArray = {' ', ' '};
        
        extendedBufferedReader.read(charArray, 0, 2);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method read([C, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
     */
    @Test
    public void testReadReturnsOneWithNonEmptyPrimitiveArrayAndCornerCase() throws IOException  {
        StringReader stringReader = new StringReader("XZ");
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(stringReader);
        char[] charArray = {'\u0001'};
        
        int actual = extendedBufferedReader.read(charArray, 0, 1);
        
        assertEquals(1, actual);
        
        char finalCharArray0 = charArray[0];
        
        assertEquals('X', finalCharArray0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method read([C, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read(char[],int,int)}
     */
    @Test
    public void testReadThrowsIOOBEWithNonEmptyPrimitiveArray() throws IOException  {
        StringReader stringReader = new StringReader("-3");
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(stringReader);
        char[] charArray = {'\u0001', '\u0001', '\u008E', '\u0001'};
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.read] produces [java.lang.IndexOutOfBoundsException: Range [1, 1 + -1) out of bounds for length 4]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.BufferedReader.read(BufferedReader.java:282)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:85) */
        extendedBufferedReader.read(charArray, 1, -1);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 63 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.ExtendedBufferedReader.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.executesCondition {@code (current == '\n'): False}
 * @utbot.returnsFrom {@code return lastChar;}
 *  */
    @Test
    public void testRead_CurrentNotEqualsChar() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 *  */
    @Test
    public void testRead() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1245210);
        setField(bb, "java.nio.Buffer", "limit", 1245210);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -255);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        int finalExtendedBufferedReaderMarkedChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "markedChar"));
        int finalExtendedBufferedReaderReadAheadLimit = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
        
        assertEquals(-2, finalExtendedBufferedReaderMarkedChar);
        
        assertEquals(0, finalExtendedBufferedReaderReadAheadLimit);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 *  */
    @Test
    public void testRead_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1245210);
        setField(bb, "java.nio.Buffer", "limit", 1245210);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -254);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -254);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.executesCondition {@code (current == '\n'): False}
 * @utbot.returnsFrom {@code return lastChar;}
 *  */
    @Test
    public void testRead_CurrentNotEqualsChar_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1245210);
        setField(bb, "java.nio.Buffer", "limit", 1245210);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.executesCondition {@code (current == '\n'): False}
 * @utbot.returnsFrom {@code return lastChar;}
 *  */
    @Test
    public void testRead_CurrentNotEqualsChar_2() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1245210);
        setField(bb, "java.nio.Buffer", "limit", 1245210);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.executesCondition {@code (current == '\n'): False}
 * @utbot.returnsFrom {@code return lastChar;}
 *  */
    @Test
    public void testRead_CurrentNotEqualsChar_3() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\u0000');
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1245210);
        setField(bb, "java.nio.Buffer", "limit", 1245210);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        FilterInputStream in2 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "entryEOF", true);
        setField(in2, "java.io.FilterInputStream", "in", in3);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -254);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -254);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        StreamDecoder extendedBufferedReaderInInSd = ((StreamDecoder) getFieldValue(extendedBufferedReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalExtendedBufferedReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(extendedBufferedReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        assertFalse(finalExtendedBufferedReaderInSdHaveLeftoverChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 *  */
    @Test
    public void testRead_2() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in2 = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 258);
        setField(bb, "java.nio.Buffer", "limit", 258);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        ZipInputStream in3 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in3, "java.util.zip.ZipInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in3);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        java.lang.String[] lock = {};
        setField(in, "java.io.Reader", "lock", lock);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -248);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -248);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        java.nio.channels.NotYetConnectedException[][] lock1 = {};
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock1);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        int finalExtendedBufferedReaderInNextChar = ((Integer) getFieldValue(extendedBufferedReaderIn, "java.io.BufferedReader", "nextChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        boolean finalExtendedBufferedReaderSkipLF = ((Boolean) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "skipLF"));
        
        assertEquals(1, finalExtendedBufferedReaderInNextChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
        
        assertFalse(finalExtendedBufferedReaderSkipLF);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.executesCondition {@code (current == '\n'): False}
 * @utbot.returnsFrom {@code return lastChar;}
 *  */
    @Test
    public void testRead_CurrentNotEqualsChar_4() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1342177670);
        setField(bb, "java.nio.Buffer", "limit", 1342177670);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 5);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 5);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(0, actual);
        
        Reader extendedBufferedReaderIn = ((Reader) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "in"));
        int finalExtendedBufferedReaderInNextChar = ((Integer) getFieldValue(extendedBufferedReaderIn, "java.io.BufferedReader", "nextChar"));
        int finalExtendedBufferedReaderNChars = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nChars"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        boolean finalExtendedBufferedReaderSkipLF = ((Boolean) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "skipLF"));
        
        assertEquals(1, finalExtendedBufferedReaderInNextChar);
        
        assertEquals(1, finalExtendedBufferedReaderNChars);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
        
        assertFalse(finalExtendedBufferedReaderSkipLF);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int current = super.read();
 *  */
    @Test
    public void testRead_ThrowNullPointerException1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.read] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:179)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:57) */
        extendedBufferedReader.read();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int current = super.read();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        ReaderUTF8 in1 = ((ReaderUTF8) createInstance("jdk.internal.util.xml.impl.ReaderUTF8"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", -1);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        java.io.FileReader[] lock = {};
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.read] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:57) */
        extendedBufferedReader.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int current = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        
        extendedBufferedReader.read();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int current = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_11() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\n', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 2);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.read();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int current = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_21() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", 4);
        java.nio.channels.NotYetConnectedException[] lock = {};
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.read();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int current = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_3() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        setField(in1, "java.io.BufferedReader", "skipLF", true);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        
        extendedBufferedReader.read();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.throwsException {@link java.io.IOException} in: int current = super.read();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_4() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in2 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in2, "java.io.InputStreamReader", "sd", sd);
        setField(in1, "java.io.BufferedReader", "in", in2);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        
        extendedBufferedReader.read();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
 * @utbot.invokes {@link java.io.BufferedReader#read()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int current = super.read();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_ThrowIndexOutOfBoundsException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 1342177670);
        setField(bb, "java.nio.Buffer", "limit", 1342177670);
        setField(sd, "sun.nio.cs.StreamDecoder", "bb", bb);
        FileChannelImpl ch = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(in1, "java.io.InputStreamReader", "sd", sd);
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {'\u0000', '\u0000'};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1);
        setField(in, "java.io.BufferedReader", "markedChar", 1065353214);
        setField(in, "java.io.BufferedReader", "readAheadLimit", 1);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb1 = {'\u0000', '\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", -255);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        Object lock1 = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock1);
        
        extendedBufferedReader.read();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method read()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
     */
    @Test
    public void testReadReturns10() throws IOException  {
        StringReader stringReader = new StringReader("\n\t");
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(stringReader);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(10, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#read()}
     */
    @Test
    public void testReadReturns9() throws IOException  {
        StringReader stringReader = new StringReader("\t\n");
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(stringReader);
        
        int actual = extendedBufferedReader.read();
        
        assertEquals(9, actual);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 55 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.ExtendedBufferedReader.readLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readLine()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#readLine()}
 * @utbot.invokes {@link java.io.BufferedReader#readLine()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return line;}
 *  */
    @Test
    public void testReadLine_StringLength() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter", -255);
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        String actual = extendedBufferedReader.readLine();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalExtendedBufferedReaderLineCounter = ((Integer) getFieldValue(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter"));
        int finalExtendedBufferedReaderNextChar = ((Integer) getFieldValue(extendedBufferedReader, "java.io.BufferedReader", "nextChar"));
        
        assertEquals(-254, finalExtendedBufferedReaderLineCounter);
        
        assertEquals(1, finalExtendedBufferedReaderNextChar);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readLine()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#readLine()}
 * @utbot.invokes {@link java.io.BufferedReader#readLine()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String line = super.readLine();
 *  */
    @Test
    public void testReadLine_ThrowNullPointerException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        Reader in = ((Reader) createInstance("java.io.Reader$1"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 3);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.readLine] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:320)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:123) */
        extendedBufferedReader.readLine();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readLine()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#readLine()}
 * @utbot.invokes {@link java.io.BufferedReader#readLine()}
 * @utbot.throwsException {@link java.io.IOException} in: String line = super.readLine();
 *  */
    @Test(expected = IOException.class)
    public void testReadLine_ThrowIOException() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        extendedBufferedReader.readLine();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method readLine()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#readLine()}
     */
    @Test
    public void testReadLine() throws IOException  {
        StringReader stringReader = new StringReader("\t\n");
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(stringReader);
        
        String actual = extendedBufferedReader.readLine();
        
        String expected = "\t";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readLine()
    
    @Test
    public void testReadLine1() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[34];
        cb[32] = '\n';
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 33);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 32);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", 35);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.readLine] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:145)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:123) */
        extendedBufferedReader.readLine();
    }
    
    @Test
    public void testReadLine2() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.readLine] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:123) */
        extendedBufferedReader.readLine();
    }
    
    @Test
    public void testReadLine3() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        ReaderUTF16 in = ((ReaderUTF16) createInstance("jdk.internal.util.xml.impl.ReaderUTF16"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.readLine] produces [java.lang.NullPointerException]
            java.base/jdk.internal.util.xml.impl.ReaderUTF16.read(ReaderUTF16.java:84)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:123) */
        extendedBufferedReader.readLine();
    }
    
    @Test
    public void testReadLine4() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "markedChar", -1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.readLine] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:123) */
        extendedBufferedReader.readLine();
    }
    
    @Test
    public void testReadLine5() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        ReaderUTF8 in1 = ((ReaderUTF8) createInstance("jdk.internal.util.xml.impl.ReaderUTF8"));
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(in, "java.io.BufferedReader", "nChars", 1073741824);
        setField(in, "java.io.BufferedReader", "nextChar", -2);
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(extendedBufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[11];
        setField(extendedBufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nChars", 1);
        setField(extendedBufferedReader, "java.io.BufferedReader", "nextChar", 2);
        setField(extendedBufferedReader, "java.io.BufferedReader", "readAheadLimit", -2147483645);
        setField(extendedBufferedReader, "java.io.Reader", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.ExtendedBufferedReader.readLine] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.read1(BufferedReader.java:227)
            java.base/java.io.BufferedReader.read(BufferedReader.java:287)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:123) */
        extendedBufferedReader.readLine();
    }
    ///endregion
    
    ///region Errors report for readLine
    
    public void testReadLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 37 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 19 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.ExtendedBufferedReader.getLineNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLineNumber()
    
    /**
    @utbot.classUnderTest {@link ExtendedBufferedReader}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.ExtendedBufferedReader#getLineNumber()}
 * @utbot.returnsFrom {@code return lineCounter;}
 *  */
    @Test
    public void testGetLineNumber_ReturnLineCounter() throws Exception  {
        ExtendedBufferedReader extendedBufferedReader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(extendedBufferedReader, "org.apache.commons.csv.ExtendedBufferedReader", "lineCounter", -255);
        
        int actual = extendedBufferedReader.getLineNumber();
        
        assertEquals(-255, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields963958527788600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields963958527788600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass963958527826500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields963958527788600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass963958527826500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields963958528260200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields963958528260200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass963958528261900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields963958528260200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass963958528261900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

