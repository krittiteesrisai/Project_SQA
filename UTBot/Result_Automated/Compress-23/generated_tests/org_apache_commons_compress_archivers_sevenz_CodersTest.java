package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import org.apache.commons.compress.archivers.sevenz.Coders.CoderId;
import java.io.IOException;
import org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.io.DataInputStream;
import java.util.jar.JarEntry;
import java.util.Properties;
import sun.security.util.ManifestEntryVerifier;
import java.util.ArrayList;
import org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.util.jar.JarOutputStream;
import java.io.FilterOutputStream;
import java.util.zip.CheckedOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_archivers_sevenz_CodersTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.Coders.addDecoder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, [B)
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.util.Arrays#toString(byte[])}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Arrays.toString(coder.decompressionMethodId)
 *  */
    @Test
    public void testAddDecoder_ThrowNullPointerException() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {};
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addDecoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(Coders.java:51) */
            Coders.addDecoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Arrays.equals(coderId.method.getId(), coder.decompressionMethodId)
 *  */
    @Test
    public void testAddDecoder_ThrowNullPointerException_1() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {null};
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addDecoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(Coders.java:47) */
            Coders.addDecoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Arrays.equals(coderId.method.getId(), coder.decompressionMethodId)
 *  */
    @Test
    public void testAddDecoder_ThrowNullPointerException_3() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            Coders.CoderId coderId = new Coders.CoderId(null, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addDecoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(Coders.java:47) */
            Coders.addDecoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZMethod#getId()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Arrays.equals(coderId.method.getId(), coder.decompressionMethodId)
 *  */
    @Test
    public void testAddDecoder_ThrowNullPointerException_4() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addDecoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(Coders.java:47) */
            Coders.addDecoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final CoderId coderId: coderTable)
 *  */
    @Test
    public void testAddDecoder_ThrowNullPointerException_2() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            Coders.coderTable = null;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addDecoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(Coders.java:46) */
            Coders.addDecoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, [B)
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.io.IOException} in: return coderId.coder.decode(is, coder, password);
 *  */
    @Test(expected = IOException.class)
    public void testAddDecoder_ThrowIOException_1() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.BZIP2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
            setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
            Coder coder = new Coder();
            byte[] decompressionMethodId = {};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(inflaterInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.io.IOException} in: return coderId.coder.decode(is, coder, password);
 *  */
    @Test(expected = IOException.class)
    public void testAddDecoder_ThrowIOException_2() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
            setField(jarInputStream, "java.util.zip.ZipInputStream", "closed", true);
            Coder coder = new Coder();
            byte[] decompressionMethodId = {};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(jarInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} in: return coderId.coder.decode(is, coder, password);
 *  */
    @Test(expected = IOException.class)
    public void testAddDecoder_ThrowIOException() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            Coder coder = new Coder();
            byte[] decompressionMethodId = {};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(null, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.io.IOException} in: return coderId.coder.decode(is, coder, password);
 *  */
    @Test(expected = IOException.class)
    public void testAddDecoder_ThrowIOException_3() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
            setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
            CheckedInputStream checkedInputStream = new CheckedInputStream(inflaterInputStream, null);
            Coder coder = new Coder();
            byte[] decompressionMethodId = {(byte) -127};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(checkedInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: return coderId.coder.decode(is, coder, password);
 *  */
    @Test(expected = ZipException.class)
    public void testAddDecoder_ThrowZipException() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.AES256SHA256;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
            Object entry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$Entry");
            (((ZipEntry) entry)).setMethod(1);
            setField(jarInputStream, "java.util.zip.ZipInputStream", "entry", entry);
            byte[] singleByteBuf = {(byte) 0};
            setField(jarInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
            Coder coder = new Coder();
            byte[] decompressionMethodId = {};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(jarInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddDecoder_ThrowIOException_4() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
            setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "closed", true);
            DataInputStream dataInputStream = new DataInputStream(inflaterInputStream);
            CheckedInputStream checkedInputStream = new CheckedInputStream(dataInputStream, null);
            Coder coder = new Coder();
            byte[] decompressionMethodId = {(byte) -127};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(checkedInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, [B)
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return coderId.coder.decode(is, coder, password);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddDecoder_ThrowIndexOutOfBoundsException() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            InflaterInputStream inflaterInputStream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
            byte[] singleByteBuf = {};
            setField(inflaterInputStream, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
            Coder coder = new Coder();
            coder.decompressionMethodId = singleByteBuf;
            
            Coders.addDecoder(inflaterInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addDecoder(java.io.InputStream,org.apache.commons.compress.archivers.sevenz.Coder,byte[])}
 * @utbot.throwsException {@link java.lang.SecurityException} 
 *  */
    @Test(expected = SecurityException.class)
    public void testAddDecoder_ThrowSecurityException() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
            JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
            setField(jarInputStream, "java.util.jar.JarInputStream", "first", first);
            Object jv = createInstance("java.util.jar.JarVerifier");
            Properties sigFileSigners = ((Properties) createInstance("java.util.Properties"));
            setField(jv, "java.util.jar.JarVerifier", "sigFileSigners", sigFileSigners);
            setField(jarInputStream, "java.util.jar.JarInputStream", "jv", jv);
            ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
            ArrayList digests = new ArrayList();
            setField(mev, "sun.security.util.ManifestEntryVerifier", "digests", digests);
            setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", first);
            setField(jarInputStream, "java.util.jar.JarInputStream", "mev", mev);
            Coder coder = new Coder();
            byte[] decompressionMethodId = {};
            coder.decompressionMethodId = decompressionMethodId;
            
            Coders.addDecoder(jarInputStream, coder, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///region Errors report for addDecoder
    
    public void testAddDecoder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.sevenz.Coders.addEncoder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, [B)
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.SevenZMethod#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.Coders.CoderBase#encode(java.io.OutputStream,byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.Coders.CoderBase#encode(java.io.OutputStream,byte[])}
 * @utbot.returnsFrom {@code return coderId.coder.encode(out, password);}
 *  */
    @Test
    public void testAddEncoder_CodersEncode() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[9];
            SevenZMethod sevenZMethod = SevenZMethod.AES256SHA256;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            coderTable[1] = coderId;
            coderTable[2] = coderId;
            SevenZMethod sevenZMethod1 = SevenZMethod.LZMA2;
            Coders.CopyDecoder copyDecoder = new Coders.CopyDecoder();
            Coders.CoderId coderId1 = new Coders.CoderId(sevenZMethod1, copyDecoder);
            coderTable[3] = coderId1;
            Coders.coderTable = coderTable;
            
            OutputStream actual = Coders.addEncoder(null, sevenZMethod1, null);
            
            assertNull(actual);
            
            SevenZMethod finalSevenZMethod1 = sevenZMethod1;
            
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, [B)
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return coderId.coder.encode(out, password);
 *  */
    @Test
    public void testAddEncoder_ThrowNullPointerException_3() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addEncoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(Coders.java:59) */
            Coders.addEncoder(null, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.sevenz.Coders.CoderBase#encode(java.io.OutputStream,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return coderId.coder.encode(out, password);
 *  */
    @Test
    public void testAddEncoder_ThrowNullPointerException_4() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addEncoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(BZip2CompressorOutputStream.java:691)
                org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(BZip2CompressorOutputStream.java:701)
                org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init(BZip2CompressorOutputStream.java:521)
                org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.<init>(BZip2CompressorOutputStream.java:390)
                org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.<init>(BZip2CompressorOutputStream.java:356)
                org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder.encode(Coders.java:143)
                org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(Coders.java:59) */
            Coders.addEncoder(null, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coderId.method.equals(method)
 *  */
    @Test
    public void testAddEncoder_ThrowNullPointerException_1() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {null};
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addEncoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(Coders.java:58) */
            Coders.addEncoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coderId.method.equals(method)
 *  */
    @Test
    public void testAddEncoder_ThrowNullPointerException_2() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            Coders.CoderId coderId = new Coders.CoderId(null, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addEncoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(Coders.java:58) */
            Coders.addEncoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final CoderId coderId: coderTable)
 *  */
    @Test
    public void testAddEncoder_ThrowNullPointerException() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            Coders.coderTable = null;
            
            /* This test fails because method [org.apache.commons.compress.archivers.sevenz.Coders.addEncoder] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(Coders.java:57) */
            Coders.addEncoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, [B)
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: throw new IOException("Unsupported compression method " + method);
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = {};
            Coders.coderTable = coderTable;
            
            Coders.addEncoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.io.IOException} in: throw new IOException("Unsupported compression method " + method);
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_1() throws IOException  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.AES256SHA256;
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, null);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            
            Coders.addEncoder(null, null, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testAddEncoder_ThrowZipException() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setMethod(1);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            
            Coders.addEncoder(zipOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_2() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
            
            Coders.addEncoder(deflaterOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_3() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -3L);
            ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            setField(out, "java.util.zip.ZipOutputStream", "closed", true);
            setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
            
            Coders.addEncoder(jarOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testAddEncoder_ThrowZipException_1() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
            FilterOutputStream filterOutputStream = new FilterOutputStream(jarOutputStream);
            
            Coders.addEncoder(filterOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_4() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setMethod(8);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
            
            Coders.addEncoder(zipOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testAddEncoder_ThrowZipException_2() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.DEFLATE;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setMethod(1);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
            
            Coders.addEncoder(checkedOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_5() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -3L);
            DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
            
            Coders.addEncoder(jarOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_6() throws Throwable  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            Object inMemoryCachingStreamBridge = createInstance("org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge");
            CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
            CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
            ZipOutputStream out2 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(out2, "java.util.zip.ZipOutputStream", "current", current);
            setField(out2, "java.util.zip.ZipOutputStream", "written", 9223372036854775804L);
            setField(out2, "java.util.zip.ZipOutputStream", "locoff", -3L);
            CheckedOutputStream out3 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
            ZipOutputStream out4 = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            setField(out4, "java.util.zip.ZipOutputStream", "closed", true);
            setField(out3, "java.io.FilterOutputStream", "out", out4);
            setField(out2, "java.io.FilterOutputStream", "out", out3);
            setField(out1, "java.io.FilterOutputStream", "out", out2);
            setField(out, "java.io.FilterOutputStream", "out", out1);
            setField(inMemoryCachingStreamBridge, "java.io.FilterOutputStream", "out", out);
            
            Class codersClazz = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
            Class inMemoryCachingStreamBridgeType = Class.forName("java.io.OutputStream");
            Class sevenZMethodType = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
            Class byteArrayType = Class.forName("[B");
            Method addEncoderMethod = codersClazz.getDeclaredMethod("addEncoder", inMemoryCachingStreamBridgeType, sevenZMethodType, byteArrayType);
            addEncoderMethod.setAccessible(true);
            java.lang.Object[] addEncoderMethodArguments = new java.lang.Object[3];
            addEncoderMethodArguments[0] = inMemoryCachingStreamBridge;
            addEncoderMethodArguments[1] = sevenZMethod;
            addEncoderMethodArguments[2] = ((Object) null);
            try {
                addEncoderMethod.invoke(null, addEncoderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testAddEncoder_ThrowZipException_3() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setMethod(1);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
            FilterOutputStream filterOutputStream = new FilterOutputStream(checkedOutputStream);
            
            Coders.addEncoder(filterOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testAddEncoder_ThrowZipException_4() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            Object inMemoryCachingStreamBridge = createInstance("org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge");
            ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setMethod(1);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(out, "java.util.zip.ZipOutputStream", "current", current);
            setField(inMemoryCachingStreamBridge, "java.io.FilterOutputStream", "out", out);
            Class checkedOutputStreamClazz = Class.forName("java.util.zip.CheckedOutputStream");
            Class inMemoryCachingStreamBridgeType = Class.forName("java.io.OutputStream");
            Class checksumType = Class.forName("java.util.zip.Checksum");
            Constructor checkedOutputStreamConstructor = checkedOutputStreamClazz.getDeclaredConstructor(inMemoryCachingStreamBridgeType, checksumType);
            checkedOutputStreamConstructor.setAccessible(true);
            java.lang.Object[] checkedOutputStreamConstructorArguments = new java.lang.Object[2];
            checkedOutputStreamConstructorArguments[0] = inMemoryCachingStreamBridge;
            checkedOutputStreamConstructorArguments[1] = ((Object) null);
            CheckedOutputStream checkedOutputStream = ((CheckedOutputStream) checkedOutputStreamConstructor.newInstance(checkedOutputStreamConstructorArguments));
            CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
            
            Coders.addEncoder(checkedOutputStream1, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_7() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(deflaterOutputStream, null);
            CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
            
            Coders.addEncoder(checkedOutputStream1, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_8() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            ZipArchiveEntry entry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            entry.setSize(94L);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "written", 92L);
            setField(zipOutputStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
            CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
            DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(out, "java.io.FilterOutputStream", "out", out1);
            setField(zipOutputStream, "java.io.FilterOutputStream", "out", out);
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(zipOutputStream, null);
            CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
            FilterOutputStream filterOutputStream = new FilterOutputStream(checkedOutputStream1);
            
            Coders.addEncoder(filterOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Coders}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.sevenz.Coders#addEncoder(java.io.OutputStream,org.apache.commons.compress.archivers.sevenz.SevenZMethod,byte[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testAddEncoder_ThrowIOException_9() throws Exception  {
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] prevCoderTable = Coders.coderTable;
        try {
            org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderTable = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[1];
            SevenZMethod sevenZMethod = SevenZMethod.COPY;
            Coders.BZIP2Decoder bZIP2Decoder = new Coders.BZIP2Decoder();
            Coders.CoderId coderId = new Coders.CoderId(sevenZMethod, bZIP2Decoder);
            coderTable[0] = coderId;
            Coders.coderTable = coderTable;
            JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
            Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
            Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
            (((ZipEntry) entry)).setSize(94L);
            setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 92L);
            setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -1L);
            CheckedOutputStream out = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
            CheckedOutputStream out1 = ((CheckedOutputStream) createInstance("java.util.zip.CheckedOutputStream"));
            DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
            Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
            setField(def, "java.util.zip.Deflater", "finished", true);
            setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
            setField(out1, "java.io.FilterOutputStream", "out", out2);
            setField(out, "java.io.FilterOutputStream", "out", out1);
            setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(jarOutputStream, null);
            CheckedOutputStream checkedOutputStream1 = new CheckedOutputStream(checkedOutputStream, null);
            FilterOutputStream filterOutputStream = new FilterOutputStream(checkedOutputStream1);
            
            Coders.addEncoder(filterOutputStream, sevenZMethod, null);
        } finally {
            Coders.coderTable = prevCoderTable;
        }
    }
    ///endregion
    
    ///region Errors report for addEncoder
    
    public void testAddEncoder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 42 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields972137946494100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields972137946494100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass972137946500200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields972137946494100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass972137946500200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

