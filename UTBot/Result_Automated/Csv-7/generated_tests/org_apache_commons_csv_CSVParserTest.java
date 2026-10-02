package org.apache.commons.csv;

import org.junit.Test;
import java.util.Iterator;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import java.io.Reader;
import java.io.BufferedReader;
import java.util.zip.ZipInputStream;
import sun.nio.ch.FileChannelImpl;
import java.io.FileDescriptor;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarFile;
import java.io.File;
import java.io.IOException;
import org.junit.Ignore;
import java.net.URL;
import java.io.StringReader;
import java.util.ArrayList;
import org.apache.commons.csv.Token.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.io.FileReader;
import jdk.internal.util.xml.impl.ReaderUTF16;
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
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

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
 *             throw new RuntimeException(e);
 *         }
 *     }
 * 
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
    public void testClose_ThisLexerNotEqualsNull_3() throws Exception  {
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
    public void testClose_ThisLexerNotEqualsNull_4() throws Exception  {
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
    public void testClose_ThisLexerNotEqualsNull_5() throws Exception  {
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
    public void testClose_ThisLexerNotEqualsNull_6() throws Exception  {
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
    public void testClose_ThisLexerNotEqualsNull_7() throws Exception  {
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
        sun.nio.ch.FileChannelImpl[] lock = {};
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
        ZipInputStream parent = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
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
        sun.nio.ch.FileChannelImpl[] lock = {};
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
            org.apache.commons.csv.ExtendedBufferedReader.close(ExtendedBufferedReader.java:175)
            org.apache.commons.csv.Lexer.close(Lexer.java:429)
            org.apache.commons.csv.CSVParser.close(CSVParser.java:263) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.File, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.File,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(format, "format");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        
        CSVParser.parse(file, ((CSVFormat) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.File,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(file, "file");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws IOException  {
        CSVParser.parse(((File) null), ((CSVFormat) null));
    }
    ///endregion
    
    ///region FUZZER: SECURITY for method parse(java.io.File, org.apache.commons.csv.CSVFormat)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.CSVParser}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.io.File,org.apache.commons.csv.CSVFormat)}
     */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testParse() {
        File file = new File("", "file");
        File file1 = new File(file, "#$\\\"'");
        File file2 = new File(file1, "-3");
        Quote quote = Quote.NON_NUMERIC;
        java.lang.String[] stringArray = {"XZ", "file", "\n\t\r"};
        CSVFormat cSVFormat = new CSVFormat('@', '\u0001', quote, '\u0001', '\u0001', false, true, "file", "", stringArray, false);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.parse] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "\file\#$\"'\-3" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            java.base/java.io.FileReader.<init>(FileReader.java:75)
            org.apache.commons.csv.CSVParser.parse(CSVParser.java:151) */
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.io.File, org.apache.commons.csv.CSVFormat)
    
    @Test
    public void testParse1() throws Exception  {
        File file = ((File) createInstance("java.io.File"));
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.parse] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            java.base/java.io.FileReader.<init>(FileReader.java:75)
            org.apache.commons.csv.CSVParser.parse(CSVParser.java:151) */
        CSVParser.parse(file, cSVFormat);
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
        
        CSVParser.parse(url, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.net.URL,java.nio.charset.Charset,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(url, "url");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException1() throws IOException  {
        CSVParser.parse(null, null, null);
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, org.apache.commons.csv.CSVFormat)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.lang.String,org.apache.commons.csv.CSVFormat)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(string, "string");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException2() throws IOException  {
        CSVParser.parse(((String) null), ((CSVFormat) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.lang.String,org.apache.commons.csv.CSVFormat)}
 * @utbot.invokes {@link org.apache.commons.csv.Assertions#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Assertions.notNull(format, "format");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_12() throws IOException  {
        String string = "";
        
        CSVParser.parse(string, ((CSVFormat) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, org.apache.commons.csv.CSVFormat)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.CSVParser}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.lang.String,org.apache.commons.csv.CSVFormat)}
     */
    @Test(expected = IllegalStateException.class)
    public void testParseThrowsISEWithNonEmptyString() throws IOException  {
        Quote quote = Quote.NON_NUMERIC;
        java.lang.String[] stringArray = {"XZ", "", "string", "#$\\\"'"};
        CSVFormat cSVFormat = new CSVFormat('', '', quote, '@', '?', false, true, "XZ", "#$\\\"'", stringArray, true);
        
        CSVParser.parse("XZp", cSVFormat);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.CSVParser}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#parse(java.lang.String,org.apache.commons.csv.CSVFormat)}
     */
    @Test(expected = IllegalStateException.class)
    public void testParseThrowsISEWithNonEmptyString1() throws IOException  {
        Quote quote = Quote.NONE;
        java.lang.String[] stringArray = {"XZ", "10", "format"};
        CSVFormat cSVFormat = new CSVFormat('', '\u0000', quote, '\u0000', '?', false, false, "format", "10", stringArray, false);
        
        CSVParser.parse("insrtg", cSVFormat);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, org.apache.commons.csv.CSVFormat)
    
    @Test
    public void testParse2() throws Exception  {
        String string = "";
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        CSVParser actual = CSVParser.parse(string, cSVFormat);
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        StringReader lock = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testParse3() throws Exception  {
        String string = " ";
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVParser actual = CSVParser.parse(string, cSVFormat);
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        LinkedHashMap headerMap = new LinkedHashMap();
        Integer integer = 0;
        headerMap.put(null, integer);
        setField(expected, "org.apache.commons.csv.CSVParser", "headerMap", headerMap);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        StringReader lock = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
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
            org.apache.commons.csv.CSVParser.isClosed(CSVParser.java:379) */
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
            org.apache.commons.csv.CSVParser.getCurrentLineNumber(CSVParser.java:277) */
        cSVParser.getCurrentLineNumber();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getHeaderMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeaderMap()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getHeaderMap()}
 * @utbot.executesCondition {@code (this.headerMap == null): True}
 * @utbot.returnsFrom {@code return this.headerMap == null ? null : new LinkedHashMap<String, Integer>(this.headerMap);}
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
 * @utbot.returnsFrom {@code return this.headerMap == null ? null : new LinkedHashMap<String, Integer>(this.headerMap);}
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getRecords
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getRecords()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getRecords()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVParser#getRecords(java.util.Collection)}
 * @utbot.throwsException {@link java.io.IOException} in: return getRecords(new ArrayList<CSVRecord>());
 *  */
    @Test(expected = IOException.class)
    public void testGetRecords_ThrowIOException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        cSVParser.getRecords();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRecords()
    
    @Test
    public void testGetRecords1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreEmptyLines", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -1);
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.EORECORD;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:179)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:317) */
        cSVParser.getRecords();
    }
    ///endregion
    
    ///region Errors report for getRecords
    
    public void testGetRecords_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.getRecords
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRecords(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#getRecords(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while((rec = this.nextRecord()) != null)
 *  */
    @Test
    public void testGetRecords_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
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
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            java.base/java.io.BufferedReader.read(BufferedReader.java:189)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRecords(java.util.Collection)
    
    @Test
    public void testGetRecords2() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -2147483647);
        setField(reader, "java.io.BufferedReader", "markedChar", 2147483640);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 9);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        Object keySet = createInstance("java.util.WeakHashMap$KeySet");
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException] */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Class keySetType = Class.forName("java.util.Collection");
        Method getRecordsMethod = cSVParserClazz.getDeclaredMethod("getRecords", keySetType);
        getRecordsMethod.setAccessible(true);
        java.lang.Object[] getRecordsMethodArguments = new java.lang.Object[1];
        getRecordsMethodArguments[0] = keySet;
        try {
            getRecordsMethod.invoke(cSVParser, getRecordsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetRecords3() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreSurroundingSpaces", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\uFFFF', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.parseSimpleToken(Lexer.java:208)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:160)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords4() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\r');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\u0000');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:118)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:119)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords5() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0400');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreSurroundingSpaces", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 1024);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\t', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:136)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords6() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreEmptyLines", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:247)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:454)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords7() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\n');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreEmptyLines", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 10);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:118)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:119)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords8() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\n');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\n');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 10);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:329)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.apache.commons.csv.ExtendedBufferedReader.readLine(ExtendedBufferedReader.java:118)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:119)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords9() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 65535);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:247)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:457)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords10() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\n');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\u0000');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 10);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:247)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:454)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords11() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\r');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\u0000');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:247)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:457)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords12() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\r');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreSurroundingSpaces", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", 13);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:247)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:457)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    
    @Test
    public void testGetRecords13() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "ignoreSurroundingSpaces", true);
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {
            ' ', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.getRecords] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:179)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.getRecords(CSVParser.java:337) */
        cSVParser.getRecords(null);
    }
    ///endregion
    
    ///region Errors report for getRecords
    
    public void testGetRecords_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVParser.addRecordValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addRecordValue()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.executesCondition {@code (nullString == null): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAddRecordValue_NullStringEqualsNull() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.executesCondition {@code (nullString == null): False}
 * @utbot.executesCondition {@code (input.equalsIgnoreCase(nullString)): False}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAddRecordValue_NotInputEqualsIgnoreCase() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRecordValue()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String input = this.reusableToken.content.toString();
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:246) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String input = this.reusableToken.content.toString();
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_1() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:246) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getNullString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String nullString = this.format.getNullString();
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_2() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:247) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.executesCondition {@code (nullString == null): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.record.add(input);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_3() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:249) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.executesCondition {@code (nullString == null): False}
 * @utbot.executesCondition {@code (input.equalsIgnoreCase(nullString)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.record.add(input.equalsIgnoreCase(nullString) ? null : input);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_4() throws Throwable  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        CSVFormat format = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = " ";
        setField(format, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        StringBuilder content = new StringBuilder("");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.addRecordValue] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:251) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#addRecordValue()}
 * @utbot.executesCondition {@code (nullString == null): False}
 * @utbot.executesCondition {@code (input.equalsIgnoreCase(nullString)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.record.add(input.equalsIgnoreCase(nullString) ? null : input);
 *  */
    @Test
    public void testAddRecordValue_ThrowNullPointerException_5() throws Throwable  {
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
            org.apache.commons.csv.CSVParser.addRecordValue(CSVParser.java:251) */
        Class cSVParserClazz = Class.forName("org.apache.commons.csv.CSVParser");
        Method addRecordValueMethod = cSVParserClazz.getDeclaredMethod("addRecordValue");
        addRecordValueMethod.setAccessible(true);
        java.lang.Object[] addRecordValueMethodArguments = new java.lang.Object[0];
        try {
            addRecordValueMethod.invoke(cSVParser, addRecordValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
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
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            java.base/java.io.BufferedReader.read(BufferedReader.java:189)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.lexer.nextToken(this.reusableToken);
 *  */
    @Test
    public void testNextRecord_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -1);
        setField(reader, "java.io.BufferedReader", "nextChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:145)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.record.clear();
 *  */
    @Test
    public void testNextRecord_ThrowNullPointerException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:447) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.invokes {@link org.apache.commons.csv.Token#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.reusableToken.reset();
 *  */
    @Test
    public void testNextRecord_ThrowNullPointerException_1() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:450) */
        cSVParser.nextRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#nextToken(org.apache.commons.csv.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.lexer.nextToken(this.reusableToken);
 *  */
    @Test
    public void testNextRecord_ThrowNullPointerException_2() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.nextRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451) */
        cSVParser.nextRecord();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method nextRecord()
    
    /**
    @utbot.classUnderTest {@link CSVParser}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVParser#nextRecord()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link org.apache.commons.csv.Token#reset()}
 * @utbot.invokes {@link org.apache.commons.csv.Lexer#nextToken(org.apache.commons.csv.Token)}
 * @utbot.throwsException {@link java.io.IOException} in: this.lexer.nextToken(this.reusableToken);
 *  */
    @Test(expected = IOException.class)
    public void testNextRecord_ThrowIOException() throws Exception  {
        CSVParser cSVParser = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(sd, "java.io.Reader", "lock", lock);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -253);
        setField(reader, "java.io.BufferedReader", "nextChar", -253);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", -253);
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder(" ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        cSVParser.nextRecord();
    }
    ///endregion
    
    ///region Errors report for nextRecord
    
    public void testNextRecord_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 17 occurrences of:
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
 * @utbot.executesCondition {@code (formatHeader.length == 0): False}
 * @utbot.executesCondition {@code (this.format.getSkipHeaderRecord()): False}
 * @utbot.executesCondition {@code (header != null): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getSkipHeaderRecord()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < header.length; i++)} once
 * @utbot.returnsFrom {@code return hdrMap;}
 *  */
    @Test
    public void testInitializeHeader_HeaderNotEqualsNull() throws Exception  {
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
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -255);
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -1);
        setField(reader, "java.io.BufferedReader", "nextChar", -1);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("  ");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.initializeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:151)
            java.base/java.io.BufferedReader.read(BufferedReader.java:183)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.initializeHeader(CSVParser.java:357) */
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
        java.lang.String[] header = {null};
        setField(format, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(format, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "format", format);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        ReaderUTF16 in = ((ReaderUTF16) createInstance("jdk.internal.util.xml.impl.ReaderUTF16"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nextChar", -1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        record.add(null);
        record.add(null);
        record.add(null);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "record", record);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.COMMENT;
        reusableToken.type = type;
        StringBuilder content = new StringBuilder("\u0000\u0000");
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(cSVParser, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        /* This test fails because method [org.apache.commons.csv.CSVParser.initializeHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/java.io.BufferedReader.read(BufferedReader.java:194)
            org.apache.commons.csv.ExtendedBufferedReader.read(ExtendedBufferedReader.java:56)
            org.apache.commons.csv.Lexer.nextToken(Lexer.java:88)
            org.apache.commons.csv.CSVParser.nextRecord(CSVParser.java:451)
            org.apache.commons.csv.CSVParser.initializeHeader(CSVParser.java:363) */
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
            org.apache.commons.csv.CSVParser.initializeHeader(CSVParser.java:350) */
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
        // 8 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields964853060386800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields964853060386800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass964853060392800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964853060386800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964853060392800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields964853061051200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields964853061051200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass964853061053200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964853061051200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964853061053200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

