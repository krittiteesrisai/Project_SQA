package org.apache.commons.csv;

import org.junit.Test;
import java.util.Iterator;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import java.io.Reader;
import java.io.BufferedReader;
import java.util.zip.ZipInputStream;
import java.util.zip.InflaterInputStream;
import sun.nio.ch.FileChannelImpl;
import java.io.FileDescriptor;
import java.nio.channels.ReadableByteChannel;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.apache.commons.csv.Token.Type;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_csv_CSVParserTest {
    ///region Test suites for executable org.apache.commons.csv.CSVParser.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#iterator()}
 * @utbot.returnsFrom {@code return new Iterator<CSVRecord>() {
 * 
 *     private CSVRecord current;
 * 
 *     private CSVRecord getNextRecord() {
 *         try {
 *             return CSVParser.this.nextRecord();
 *         } catch (final IOException e) {
 *             throw new IllegalStateException(e.getClass().getSimpleName() + " reading next record: " + e.toString(), e);
 *         }
 *     }
 * 
 *     @Override
 *     public boolean hasNext() {
 *         if (CSVParser.this.isClosed()) {
 *             return false;
 *         }
 *         if (this.current == null) {
 *             this.current = this.getNextRecord();
 *         }
 *         return this.current != null;
 *     }
 * 
 *     @Override
 *     public CSVRecord next() {
 *         if (CSVParser.this.isClosed()) {
 *             throw new NoSuchElementException("CSVParser has been closed");
 *         }
 *         CSVRecord next = this.current;
 *         this.current = null;
 *         if (next == null) {
 *             next = this.getNextRecord();
 *             if (next == null) {
 *                 throw new NoSuchElementException("No more CSV records available");
 *             }
 *         }
 *         return next;
 *     }
 * 
 *     @Override
 *     public void remove() {
 *         throw new UnsupportedOperationException();
 *     }
 * };}
 *  */
    @Test
    public void testIterator_Return() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        Iterator actual = cSVParser.iterator();
        
        Iterator expected = ((Iterator) createInstance("org.apache.commons.csv.CSVParser$1"));
        setField(expected, "org.apache.commons.csv.CSVParser$1", "this$0", cSVParser);
        
        CSVRecord actualCurrent = ((CSVRecord) getFieldValue(actual, "org.apache.commons.csv.CSVParser$1", "current"));
        assertNull(actualCurrent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): False}
 *  */
    @Test
    public void testClose_ThisLexerEqualsNull() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        cSVParser.close();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_10() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Object lock = createInstance("java.lang.Object");
        setField(in, "java.io.Reader", "lock", lock);
        setField(reader, "java.io.BufferedReader", "in", in);
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_2() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_3() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        FileChannelImpl ch = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "fd", -1);
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(ch, "sun.nio.ch.FileChannelImpl", "fd", fd);
        Object closeLock = createInstance("java.lang.Object");
        setField(ch, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(sd, "java.io.Reader", "lock", closeLock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_4() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ReadableByteChannel ch = ((ReadableByteChannel) createInstance("java.nio.file.FileChannelLinesSpliterator$1"));
        Object this$0 = createInstance("java.nio.file.FileChannelLinesSpliterator");
        FileChannelImpl fc = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        Object closeLock = createInstance("java.lang.Object");
        setField(fc, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(fc, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(this$0, "java.nio.file.FileChannelLinesSpliterator", "fc", fc);
        setField(ch, "java.nio.file.FileChannelLinesSpliterator$1", "this$0", this$0);
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(sd, "java.io.Reader", "lock", closeLock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_5() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        ZipInputStream in2 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in2, "java.util.zip.ZipInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock1 = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_6() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ReadableByteChannel ch = ((ReadableByteChannel) createInstance("java.nio.file.FileChannelLinesSpliterator$1"));
        Object this$0 = createInstance("java.nio.file.FileChannelLinesSpliterator");
        FileChannelImpl fc = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "fd", -1);
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fc, "sun.nio.ch.FileChannelImpl", "fd", fd);
        Object closeLock = createInstance("java.lang.Object");
        setField(fc, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(this$0, "java.nio.file.FileChannelLinesSpliterator", "fc", fc);
        setField(ch, "java.nio.file.FileChannelLinesSpliterator$1", "this$0", this$0);
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(sd, "java.io.Reader", "lock", closeLock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_7() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in2 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in2, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock1 = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_8() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ReadableByteChannel ch = ((ReadableByteChannel) createInstance("java.nio.file.FileChannelLinesSpliterator$1"));
        Object this$0 = createInstance("java.nio.file.FileChannelLinesSpliterator");
        FileChannelImpl fc = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fc, "sun.nio.ch.FileChannelImpl", "fd", fd);
        JarFile parent = ((JarFile) createInstance("java.util.jar.JarFile"));
        setField(parent, "java.util.zip.ZipFile", "closeRequested", true);
        setField(fc, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(fc, "sun.nio.ch.FileChannelImpl", "threads", threads);
        Object closeLock = createInstance("java.lang.Object");
        setField(fc, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(this$0, "java.nio.file.FileChannelLinesSpliterator", "fc", fc);
        setField(ch, "java.nio.file.FileChannelLinesSpliterator$1", "this$0", this$0);
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(sd, "java.io.Reader", "lock", closeLock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 *  */
    @Test
    public void testClose_ThisLexerNotEqualsNull_9() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ReadableByteChannel ch = ((ReadableByteChannel) createInstance("java.nio.file.FileChannelLinesSpliterator$1"));
        Object this$0 = createInstance("java.nio.file.FileChannelLinesSpliterator");
        FileChannelImpl fc = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fc, "sun.nio.ch.FileChannelImpl", "fd", fd);
        JarInputStream parent = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(parent, "java.util.zip.ZipInputStream", "closed", true);
        setField(fc, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(fc, "sun.nio.ch.FileChannelImpl", "threads", threads);
        Object closeLock = createInstance("java.lang.Object");
        setField(fc, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(this$0, "java.nio.file.FileChannelLinesSpliterator", "fc", fc);
        setField(ch, "java.nio.file.FileChannelLinesSpliterator$1", "this$0", this$0);
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(sd, "java.io.Reader", "lock", closeLock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
        
        Lexer cSVParserLexer = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexerLexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer, "org.apache.commons.csv.Lexer", "reader"));
        int finalCSVParserLexerReaderLastChar = ((Integer) getFieldValue(cSVParserLexerLexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar"));
        Lexer cSVParserLexer1 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer1LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer1, "org.apache.commons.csv.Lexer", "reader"));
        boolean finalCSVParserLexerReaderClosed = ((Boolean) getFieldValue(cSVParserLexer1LexerReader, "org.apache.commons.csv.ExtendedBufferedReader", "closed"));
        Lexer cSVParserLexer2 = ((Lexer) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "lexer"));
        ExtendedBufferedReader cSVParserLexer2LexerReader = ((ExtendedBufferedReader) getFieldValue(cSVParserLexer2, "org.apache.commons.csv.Lexer", "reader"));
        Reader finalCSVParserLexerReaderIn = ((Reader) getFieldValue(cSVParserLexer2LexerReader, "java.io.BufferedReader", "in"));
        
        assertEquals(-1, finalCSVParserLexerReaderLastChar);
        
        assertTrue(finalCSVParserLexerReaderClosed);
        
        assertNull(finalCSVParserLexerReaderIn);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.close] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.close(BufferedReader.java:521)
            org.apache.commons.csv.ExtendedBufferedReader.close(ExtendedBufferedReader.java:188)
            org.apache.commons.csv.Lexer.close(Lexer.java:459)
            org.apache.commons.csv.CSVParser.close(CSVParser.java:381) */
        cSVParser.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#close()}
 * @utbot.executesCondition {@code (this.lexer != null): True}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#close()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test(expected = ClassCastException.class)
    public void testClose_ThrowClassCastException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ReadableByteChannel ch = ((ReadableByteChannel) createInstance("java.nio.file.FileChannelLinesSpliterator$1"));
        Object this$0 = createInstance("java.nio.file.FileChannelLinesSpliterator");
        FileChannelImpl fc = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fc, "sun.nio.ch.FileChannelImpl", "fd", fd);
        byte[] parent = {};
        setField(fc, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(fc, "sun.nio.ch.FileChannelImpl", "threads", threads);
        Object closeLock = createInstance("java.lang.Object");
        setField(fc, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(this$0, "java.nio.file.FileChannelLinesSpliterator", "fc", fc);
        setField(ch, "java.nio.file.FileChannelLinesSpliterator$1", "this$0", this$0);
        setField(sd, "sun.nio.cs.StreamDecoder", "ch", ch);
        setField(sd, "java.io.Reader", "lock", closeLock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        cSVParser.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 34 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 9 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static java.util.concurrent.ConcurrentHashMap sun.nio.ch.FileLockTable.lockMap accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.File, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.File,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(format, "format");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        
        CSVParser.parse(file, ((Charset) null), ((CSVFormat) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.File,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(file, "file");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws IOException  {
        CSVParser.parse(((File) null), ((Charset) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.io.File, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)
    
    @Test
    public void testParse1() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.parse] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            org.apache.commons.csv.CSVParser.parse(CSVParser.java:155) */
        CSVParser.parse(file, ((Charset) null), cSVFormat);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.net.URL, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.net.URL,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(charset, "charset");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_11() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        
        CSVParser.parse(url, ((Charset) null), ((CSVFormat) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.net.URL,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(url, "url");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException1() throws IOException  {
        CSVParser.parse(((URL) null), ((Charset) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.nio.file.Path, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.nio.file.Path,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(path, "path");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException2() throws IOException  {
        CSVParser.parse(((Path) null), ((Charset) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field private static final sun.nio.fs.WindowsSecurityDescriptor sun.nio.fs.WindowsSecurityDescriptor.NULL_DESCRIPTOR accessible:
        module java.base does not "opens sun.nio.fs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.InputStream, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.InputStream,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(inputStream, "inputStream");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException3() throws IOException  {
        CSVParser.parse(((InputStream) null), ((Charset) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.Reader,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVParser(reader, format);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_12() throws Exception  {
        FileReader fileReader = ((FileReader) createInstance("java.io.FileReader"));
        
        CSVParser.parse(fileReader, ((CSVFormat) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.Reader,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVParser(reader, format);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException4() throws IOException  {
        CSVParser.parse(((Reader) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader, org.apache.commons.csv.CSVFormat)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.CSVParser}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.Reader,org.apache.commons.csv.CSVFormat)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsIAE() throws IOException  {
        CSVParser.parse(((Reader) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.lang.String,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(format, "format");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException5() throws IOException  {
        String string = "";
        
        CSVParser.parse(string, ((CSVFormat) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.lang.String,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(string, "string");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_13() throws IOException  {
        CSVParser.parse(((String) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.isClosed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosed()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#isClosed()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#isClosed()}
 * @utbot.returnsFrom {@code return this.lexer.isClosed();}
 *  */
    @Test
    public void testIsClosed_LexerIsClosed() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        boolean actual = cSVParser.isClosed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isClosed()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#isClosed()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#isClosed()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.lexer.isClosed();
 *  */
    @Test
    public void testIsClosed_ThrowNullPointerException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.isClosed] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.isClosed(CSVParser.java:506) */
        cSVParser.isClosed();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getCurrentLineNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getCurrentLineNumber()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.csv.Lexer#getCurrentLineNumber()} twice
    /// return from: {@code return this.lexer.getCurrentLineNumber();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getCurrentLineNumber()}
 * @utbot.returnsFrom {@code return this.lexer.getCurrentLineNumber();}
 *  */
    @Test
    public void testGetCurrentLineNumber_ReturnThisLexerGetCurrentLineNumber() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        long actual = cSVParser.getCurrentLineNumber();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getCurrentLineNumber()}
 * @utbot.returnsFrom {@code return this.lexer.getCurrentLineNumber();}
 *  */
    @Test
    public void testGetCurrentLineNumber_ReturnThisLexerGetCurrentLineNumber_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", -255L);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        long actual = cSVParser.getCurrentLineNumber();
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getCurrentLineNumber()}
 * @utbot.returnsFrom {@code return this.lexer.getCurrentLineNumber();}
 *  */
    @Test
    public void testGetCurrentLineNumber_ReturnThisLexerGetCurrentLineNumber_2() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -1);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        long actual = cSVParser.getCurrentLineNumber();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getCurrentLineNumber()}
 * @utbot.returnsFrom {@code return this.lexer.getCurrentLineNumber();}
 *  */
    @Test
    public void testGetCurrentLineNumber_ReturnThisLexerGetCurrentLineNumber_3() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 10);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        long actual = cSVParser.getCurrentLineNumber();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getCurrentLineNumber()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getCurrentLineNumber()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#getCurrentLineNumber()}
 * @utbot.returnsFrom {@code return this.lexer.getCurrentLineNumber();}
 *  */
    @Test
    public void testGetCurrentLineNumber_LexerGetCurrentLineNumber() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        long actual = cSVParser.getCurrentLineNumber();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentLineNumber()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getCurrentLineNumber()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#getCurrentLineNumber()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.lexer.getCurrentLineNumber();
 *  */
    @Test
    public void testGetCurrentLineNumber_ThrowNullPointerException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getCurrentLineNumber] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.getCurrentLineNumber(CSVParser.java:396) */
        cSVParser.getCurrentLineNumber();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getRecords
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRecords()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getRecords()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while((rec = this.nextRecord()) != null)
 *  */
    @Test
    public void testGetRecords_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", 0L);
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 256);
        setField(reader, "java.io.BufferedReader", "nextChar", 255);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            java.base/java.io.BufferedReader.read(BufferedReader.java:189)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:449) */
        cSVParser.getRecords();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getRecords()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRecords_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", 0L);
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 89);
        setField(reader, "java.io.BufferedReader", "nextChar", 89);
        setField(reader, "java.io.BufferedReader", "markedChar", 89);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 89 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:151)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:449) */
        cSVParser.getRecords();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRecords()
    
    @Test
    public void testGetRecords1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\r');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\u0000');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", 0L);
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException] */
        cSVParser.getRecords();
    }
    ///endregion
    
    ///region Errors report for getRecords
    
    public void testGetRecords_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.initializeHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initializeHeader()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#initializeHeader()}
 * @utbot.executesCondition {@code (formatHeader != null): False}
 * @utbot.returnsFrom {@code return hdrMap;}
 *  */
    @Test
    public void testInitializeHeader_FormatHeaderEqualsNull() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method initializeHeaderMethod = cSVParserClazz.getDeclaredMethod("initializeHeader");
        initializeHeaderMethod.setAccessible(true);
        java.lang.Object[] initializeHeaderMethodArguments = new java.lang.Object[0];
        Map actual = ((Map) initializeHeaderMethod.invoke(cSVParser, initializeHeaderMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#initializeHeader()}
 * @utbot.executesCondition {@code (formatHeader != null): True}
 * @utbot.executesCondition {@code (this.format.getIgnoreHeaderCase()): False}
 * @utbot.executesCondition {@code (formatHeader.length == 0): False}
 * @utbot.executesCondition {@code (this.format.getSkipHeaderRecord()): False}
 * @utbot.executesCondition {@code (headerRecord != null): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getIgnoreHeaderCase()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getSkipHeaderRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < headerRecord.length; i++)} once
 * @utbot.returnsFrom {@code return hdrMap;}
 *  */
    @Test
    public void testInitializeHeader_NotContainsHeader() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(format, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method initializeHeaderMethod = cSVParserClazz.getDeclaredMethod("initializeHeader");
        initializeHeaderMethod.setAccessible(true);
        java.lang.Object[] initializeHeaderMethodArguments = new java.lang.Object[0];
        LinkedHashMap actual = ((LinkedHashMap) initializeHeaderMethod.invoke(cSVParser, initializeHeaderMethodArguments));
        
        LinkedHashMap expected = new LinkedHashMap();
        Integer integer = 0;
        expected.put(null, integer);
        
        assertTrue(deepEquals(expected, actual));
        
        CSVFormat cSVParserFormat = ((CSVFormat) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "format"));
        java.lang.String[] cSVParserFormatFormatHeader = ((java.lang.String[]) getFieldValue(cSVParserFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVParserFormatHeader0 = ((String) get(cSVParserFormatFormatHeader, 0));
        
        assertNull(finalCSVParserFormatHeader0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initializeHeader()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#initializeHeader()}
 * @utbot.executesCondition {@code (formatHeader != null): True}
 * @utbot.executesCondition {@code (this.format.getIgnoreHeaderCase()): False}
 * @utbot.executesCondition {@code (formatHeader.length == 0): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final CSVRecord nextRecord = this.nextRecord();
 *  */
    @Test
    public void testInitializeHeader_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(format, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", 0L);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nextChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.initializeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/java.io.BufferedReader.read(BufferedReader.java:194)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587)
            org.apache.commons.csv.CSVParser.initializeHeader(CSVParser.java:472) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method initializeHeaderMethod = cSVParserClazz.getDeclaredMethod("initializeHeader");
        initializeHeaderMethod.setAccessible(true);
        java.lang.Object[] initializeHeaderMethodArguments = new java.lang.Object[0];
        try {
            initializeHeaderMethod.invoke(cSVParser, initializeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#initializeHeader()}
 * @utbot.executesCondition {@code (formatHeader != null): True}
 * @utbot.executesCondition {@code (this.format.getIgnoreHeaderCase()): False}
 * @utbot.executesCondition {@code (formatHeader.length == 0): False}
 * @utbot.executesCondition {@code (this.format.getSkipHeaderRecord()): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getSkipHeaderRecord()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.nextRecord();
 *  */
    @Test
    public void testInitializeHeader_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null, null};
        setField(format, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(format, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", -255L);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {' ', ' '};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 256);
        setField(reader, "java.io.BufferedReader", "nextChar", 255);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", -255L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.initializeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            java.base/java.io.BufferedReader.read(BufferedReader.java:194)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587)
            org.apache.commons.csv.CSVParser.initializeHeader(CSVParser.java:478) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method initializeHeaderMethod = cSVParserClazz.getDeclaredMethod("initializeHeader");
        initializeHeaderMethod.setAccessible(true);
        java.lang.Object[] initializeHeaderMethodArguments = new java.lang.Object[0];
        try {
            initializeHeaderMethod.invoke(cSVParser, initializeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#initializeHeader()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getHeader()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String[] formatHeader = this.format.getHeader();
 *  */
    @Test
    public void testInitializeHeader_ThrowNullPointerException() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.initializeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.initializeHeader(CSVParser.java:463) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method initializeHeaderMethod = cSVParserClazz.getDeclaredMethod("initializeHeader");
        initializeHeaderMethod.setAccessible(true);
        java.lang.Object[] initializeHeaderMethodArguments = new java.lang.Object[0];
        try {
            initializeHeaderMethod.invoke(cSVParser, initializeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for initializeHeader
    
    public void testInitializeHeader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.nextRecord
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextRecord()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.lexer.nextToken(this.reusableToken);
 *  */
    @Test
    public void testNextRecord_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", -255L);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nextChar", -1);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", -255L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/java.io.BufferedReader.read(BufferedReader.java:189)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testNextRecord_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", -255L);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 129);
        setField(reader, "java.io.BufferedReader", "nextChar", 129);
        setField(reader, "java.io.BufferedReader", "markedChar", 129);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", -255L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 129 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:151)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.recordList.clear();
 *  */
    @Test
    public void testNextRecord_ThrowNullPointerException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:582) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final long startCharPosition = lexer.getCharacterPosition() + this.characterOffset;
 *  */
    @Test
    public void testNextRecord_ThrowNullPointerException_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:584) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.reusableToken.reset();
 *  */
    @Test
    public void testNextRecord_ThrowNullPointerException_2() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", -255L);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", -255L);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:586) */
        cSVParser.nextRecord();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextRecord()
    
    @Test
    public void testNextRecord1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", 0L);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\r', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException] */
        cSVParser.nextRecord();
    }
    
    @Test
    public void testNextRecord2() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '&');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreSurroundingSpaces", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 65533);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "position", 0L);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\uF458', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        String firstEol = "";
        setField(lexer, "org.apache.commons.csv.Lexer", "firstEol", firstEol);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "characterOffset", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:179)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:58)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:95)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:587) */
        cSVParser.nextRecord();
    }
    ///endregion
    
    ///region Errors report for nextRecord
    
    public void testNextRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getFirstEndOfLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFirstEndOfLine()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getFirstEndOfLine()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#getFirstEol()}
 * @utbot.returnsFrom {@code return lexer.getFirstEol();}
 *  */
    @Test
    public void testGetFirstEndOfLine_LexerGetFirstEol() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        
        String actual = cSVParser.getFirstEndOfLine();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFirstEndOfLine()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getFirstEndOfLine()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#getFirstEol()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return lexer.getFirstEol();
 *  */
    @Test
    public void testGetFirstEndOfLine_ThrowNullPointerException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getFirstEndOfLine] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.getFirstEndOfLine(CSVParser.java:406) */
        cSVParser.getFirstEndOfLine();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getRecordNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecordNumber()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getRecordNumber()}
 * @utbot.returnsFrom {@code return this.recordNumber;}
 *  */
    @Test
    public void testGetRecordNumber_ReturnThisRecordNumber() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordNumber", 1L);
        
        long actual = cSVParser.getRecordNumber();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.addRecordValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addRecordValue(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): False}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): True}
 * @utbot.executesCondition {@code (this.format.getTrailingDelimiter()): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddRecordValue_LastRecordAndInputCleanIsEmptyAndThisFormatGetTrailingDelimiter() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = true;
        addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): True}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): True}
 * @utbot.executesCondition {@code (this.format.getTrailingDelimiter()): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddRecordValue_ThisFormatGetTrim() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        setField(format, "org.apache.commons.csv.CSVFormat", "trim", true);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = true;
        addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): False}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): False}
 * @utbot.executesCondition {@code (inputClean.equals(nullString)): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getNullString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAddRecordValue_NotInputCleanEquals() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        ArrayList recordList = new ArrayList();
        recordList.add(null);
        recordList.add(null);
        recordList.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "recordList", recordList);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRecordValue(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String input = this.reusableToken.content.toString();
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:363) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String input = this.reusableToken.content.toString();
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_1() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:363) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getTrim()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.format.getTrim()
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_2() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:364) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): False}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): False}
 * @utbot.executesCondition {@code (inputClean.equals(nullString)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.recordList.add(inputClean.equals(nullString) ? null : inputClean);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_3() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:369) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): False}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): True}
 * @utbot.executesCondition {@code (this.format.getTrailingDelimiter()): True}
 * @utbot.executesCondition {@code (inputClean.equals(nullString)): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getTrailingDelimiter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.recordList.add(inputClean.equals(nullString) ? null : inputClean);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_4() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:369) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = true;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): False}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): True}
 * @utbot.executesCondition {@code (this.format.getTrailingDelimiter()): False}
 * @utbot.executesCondition {@code (inputClean.equals(nullString)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.recordList.add(inputClean.equals(nullString) ? null : inputClean);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_5() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:369) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = true;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): True}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): False}
 * @utbot.executesCondition {@code (inputClean.equals(nullString)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.recordList.add(inputClean.equals(nullString) ? null : inputClean);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_6() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(format, "org.apache.commons.csv.CSVFormat", "trim", true);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:369) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue(boolean)}
 * @utbot.executesCondition {@code (this.format.getTrim()): True}
 * @utbot.executesCondition {@code (lastRecord && inputClean.isEmpty()): False}
 * @utbot.executesCondition {@code (inputClean.equals(nullString)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.recordList.add(inputClean.equals(nullString) ? null : inputClean);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_7() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(format, "org.apache.commons.csv.CSVFormat", "trim", true);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("! ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:369) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class booleanType = boolean.class;
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue", booleanType);
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[1];
        addRecordValueMethodArguments[0] = false;
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getHeaderMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeaderMap()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getHeaderMap()}
 * @utbot.executesCondition {@code (this.headerMap == null): True}
 * @utbot.returnsFrom {@code return this.headerMap == null ? null : new LinkedHashMap<>(this.headerMap);}
 *  */
    @Test
    public void testGetHeaderMap_ThisHeaderMapEqualsNull() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        Map actual = cSVParser.getHeaderMap();
        
        assertNull(actual);
        
        Map finalCSVParserHeaderMap = ((Map) getFieldValue(cSVParser, "org.apache.commons.csv.CSVParser", "headerMap"));
        
        assertNull(finalCSVParserHeaderMap);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getHeaderMap()}
 * @utbot.executesCondition {@code (this.headerMap == null): False}
 * @utbot.returnsFrom {@code return this.headerMap == null ? null : new LinkedHashMap<>(this.headerMap);}
 *  */
    @Test
    public void testGetHeaderMap_ThisHeaderMapNotEqualsNull() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        LinkedHashMap headerMap = new LinkedHashMap();
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "headerMap", headerMap);
        
        LinkedHashMap actual = ((LinkedHashMap) cSVParser.getHeaderMap());
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields966387085299000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields966387085299000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass966387085307800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields966387085299000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass966387085307800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields966387085675900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields966387085675900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass966387085680600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields966387085675900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass966387085680600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

