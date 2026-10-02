package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.util.zip.Inflater;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.LinkedList;
import sun.security.util.ManifestEntryVerifier;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_archivers_dump_DumpArchiveInputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 32): False}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.DumpArchiveUtil#verify(byte[])}
 * @utbot.returnsFrom {@code return DumpArchiveUtil.verify(buffer);}
 *  */
    @Test
    public void testMatches_LengthGreaterOrEqualDumpArchiveConstantsTP_SIZE() {
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        
        boolean actual = DumpArchiveInputStream.matches(byteArray, 1073741824);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 32): False}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): False}
 * @utbot.returnsFrom {@code return DumpArchiveConstants.NFS_MAGIC == DumpArchiveUtil.convert32(buffer, 24);}
 *  */
    @Test
    public void testMatches_DumpArchiveConstantsNFS_MAGICNotEqualsDumpArchiveUtilConvert32() {
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        
        boolean actual = DumpArchiveInputStream.matches(byteArray, 129);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 32): False}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): False}
 * @utbot.returnsFrom {@code return DumpArchiveConstants.NFS_MAGIC == DumpArchiveUtil.convert32(buffer, 24);}
 *  */
    @Test
    public void testMatches_DumpArchiveConstantsNFS_MAGICEqualsDumpArchiveUtilConvert32() {
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) 108;
        byteArray[25] = (byte) -22;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        
        boolean actual = DumpArchiveInputStream.matches(byteArray, 129);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length < 32): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatches_LengthLessThan32() {
        boolean actual = DumpArchiveInputStream.matches(null, 31);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches([B, int)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.DumpArchiveUtil#convert32(byte[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return DumpArchiveConstants.NFS_MAGIC == DumpArchiveUtil.convert32(buffer, 24);
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 0]
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(DumpArchiveUtil.java:113)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(DumpArchiveInputStream.java:550) */
        DumpArchiveInputStream.matches(byteArray, 129);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return DumpArchiveUtil.verify(buffer);
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 0]
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(DumpArchiveUtil.java:113)
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(DumpArchiveUtil.java:58)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(DumpArchiveInputStream.java:546) */
        DumpArchiveInputStream.matches(byteArray, 1073741824);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return DumpArchiveUtil.verify(buffer);
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) 108;
        byteArray[25] = (byte) -22;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(DumpArchiveUtil.java:113)
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(DumpArchiveUtil.java:65)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(DumpArchiveInputStream.java:546) */
        DumpArchiveInputStream.matches(byteArray, 1073741824);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#matches(byte[],int)}
 * @utbot.executesCondition {@code (length >= DumpArchiveConstants.TP_SIZE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return DumpArchiveUtil.verify(buffer);
 *  */
    @Test
    public void testMatches_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = new byte[35];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) 108;
        byteArray[25] = (byte) -22;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 35]
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(DumpArchiveUtil.java:113)
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.calculateChecksum(DumpArchiveUtil.java:44)
            org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(DumpArchiveUtil.java:67)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(DumpArchiveInputStream.java:546) */
        DumpArchiveInputStream.matches(byteArray, 1073741824);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isClosed): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_HasHitEOFOrIsClosed() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "hasHitEOF", true);
        
        int actual = dumpArchiveInputStream.read(null, -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isClosed): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): False}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_EntryOffsetLessThanEntrySize() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed", true);
        
        int actual = dumpArchiveInputStream.read(null, -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isClosed): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testRead_HasHitEOFOrIsClosedOrEntryOffsetGreaterOrEqualEntrySize() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -171L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -171L);
        
        int actual = dumpArchiveInputStream.read(null, -255, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isClosed): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): True}
 * @utbot.executesCondition {@code (active == null): False}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.returnsFrom {@code return totalRead;}
 *  */
    @Test
    public void testRead_LenLessOrEqualZero() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -3L);
        byte[] readBuf = {(byte) -127};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {(byte) -127};
        
        int actual = dumpArchiveInputStream.read(byteArray, 0, 1);
        
        assertEquals(1, actual);
        
        long finalDumpArchiveInputStreamEntryOffset = ((Long) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset"));
        int finalDumpArchiveInputStreamRecordOffset = ((Integer) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset"));
        
        assertEquals(-2L, finalDumpArchiveInputStreamEntryOffset);
        
        assertEquals(1, finalDumpArchiveInputStreamRecordOffset);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (hasHitEOF || isClosed): True}
 * @utbot.executesCondition {@code (entryOffset >= entrySize): True}
 * @utbot.executesCondition {@code (active == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: active == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRead_ThrowIllegalStateException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -166L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -167L);
        
        dumpArchiveInputStream.read(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -1L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 512);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        dumpArchiveInputStream.raw = raw;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        dumpArchiveInputStream.read(byteArray, 0, 193);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testRead_ThrowIOException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -1L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 512);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        dumpArchiveInputStream.read(byteArray, 0, 193);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.dump.ShortFileException} 
 *  */
    @Test(expected = ShortFileException.class)
    public void testRead_ThrowShortFileException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -45L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -46L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 512);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        dumpArchiveInputStream.read(byteArray, 0, 195);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read([B, int, int)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -28L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -30L);
        byte[] readBuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", Integer.MIN_VALUE);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -2147483648 out of bounds for byte[5]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(byteArray, -255, 231);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -3L);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", -1);
        byte[] byteArray = {(byte) -126, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(byteArray, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -7L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -8L);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", -1);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(byteArray, -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -3L);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(byteArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !active.isSparseRecord(readIdx++)
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] cdata = {(byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -4L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -5L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 256);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader.getCdata(DumpArchiveEntry.java:555)
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(DumpArchiveEntry.java:381)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:504) */
        dumpArchiveInputStream.read(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 145L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", 144L);
        byte[] readBuf = {(byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(null, -255, 242);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_3() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -3L);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", -1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_4() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -8L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -9L);
        byte[] readBuf = {(byte) 0, (byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(null, -255, 256);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(readBuf, recordOffset, buf, off, sz);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_5() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -3L);
        byte[] readBuf = {(byte) -127, (byte) -127};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): False}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len > readBuf.length - recordOffset
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 42L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", 41L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:479) */
        dumpArchiveInputStream.read(null, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len > readBuf.length - recordOffset
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -3L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:479) */
        dumpArchiveInputStream.read(null, -255, 130);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_6() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 181L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", 180L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 512);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:494) */
        dumpArchiveInputStream.read(byteArray, 0, 3);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_7() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 0L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -1L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 512);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 2305);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 766);
        dumpArchiveInputStream.raw = raw;
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:494) */
        dumpArchiveInputStream.read(byteArray, 0, 128);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#read(byte[],int,int)}
 * @utbot.executesCondition {@code (len + entryOffset > entrySize): True}
 * @utbot.iterates iterate the loop {@code while(len > 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test
    public void testRead_ThrowNullPointerException_8() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", -1L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -2L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 512);
        byte[] readBuf = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 2303);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1073738497);
        dumpArchiveInputStream.raw = raw;
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:494) */
        dumpArchiveInputStream.read(byteArray, 0, 243);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method read([B, int, int)
    
    @Test
    public void testRead1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 2147483648L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", 2147483647L);
        byte[] readBuf = new byte[34];
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", 2);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        int actual = dumpArchiveInputStream.read(byteArray, 0, 524288);
        
        assertEquals(1, actual);
        
        long finalDumpArchiveInputStreamEntryOffset = ((Long) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset"));
        int finalDumpArchiveInputStreamRecordOffset = ((Integer) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset"));
        
        assertEquals(2147483648L, finalDumpArchiveInputStreamEntryOffset);
        
        assertEquals(3, finalDumpArchiveInputStreamRecordOffset);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read([B, int, int)
    
    @Test
    public void testRead2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] cdata = {(byte) 0};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 0L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -2L);
        byte[] readBuf = {(byte) 0, (byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", 2);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:484) */
        dumpArchiveInputStream.read(byteArray, 0, 1073741825);
    }
    
    @Test
    public void testRead3() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entrySize", 0L);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "entryOffset", -9223372036711610232L);
        byte[] readBuf = new byte[32];
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readBuf", readBuf);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "recordOffset", 30);
        byte[] byteArray = new byte[20];
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(DumpArchiveEntry.java:381)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(DumpArchiveInputStream.java:504) */
        dumpArchiveInputStream.read(byteArray, 0, 3);
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method close()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!isClosed): False}
 *  */
    @Test
    public void testClose_IsClosed() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed", true);
        
        dumpArchiveInputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!isClosed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.TapeInputStream#close()}
 *  */
    @Test
    public void testClose_NotIsClosed() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method close()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!isClosed): True}
    /// invoke:
    ///     {@link org.apache.commons.compress.archivers.dump.TapeInputStream#close()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        TapeInputStream tapeInputStream = dumpArchiveInputStream.raw;
        InputStream tapeInputStreamRawIn = ((InputStream) getFieldValue(tapeInputStream, "java.io.FilterInputStream", "in"));
        boolean finalDumpArchiveInputStreamRawInClosed = ((Boolean) getFieldValue(tapeInputStreamRawIn, "java.util.zip.ZipInputStream", "closed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
        
        assertTrue(finalDumpArchiveInputStreamRawInClosed);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_5() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        BufferedInputStream in = ((BufferedInputStream) createInstance("java.io.BufferedInputStream"));
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        TapeInputStream tapeInputStream = dumpArchiveInputStream.raw;
        InputStream tapeInputStreamRawIn = ((InputStream) getFieldValue(tapeInputStream, "java.io.FilterInputStream", "in"));
        boolean finalDumpArchiveInputStreamRawInClosed = ((Boolean) getFieldValue(tapeInputStreamRawIn, "java.util.zip.ZipInputStream", "closed"));
        TapeInputStream tapeInputStream1 = dumpArchiveInputStream.raw;
        InputStream tapeInputStream1RawIn = ((InputStream) getFieldValue(tapeInputStream1, "java.io.FilterInputStream", "in"));
        boolean finalDumpArchiveInputStreamRawInClosed1 = ((Boolean) getFieldValue(tapeInputStream1RawIn, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
        
        assertTrue(finalDumpArchiveInputStreamRawInClosed);
        
        assertTrue(finalDumpArchiveInputStreamRawInClosed1);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.FilterInputStream", "in", in1);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
        
        boolean finalDumpArchiveInputStreamIsClosed = ((Boolean) getFieldValue(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "isClosed"));
        TapeInputStream tapeInputStream = dumpArchiveInputStream.raw;
        InputStream tapeInputStreamRawIn = ((InputStream) getFieldValue(tapeInputStream, "java.io.FilterInputStream", "in"));
        boolean finalDumpArchiveInputStreamRawInClosed = ((Boolean) getFieldValue(tapeInputStreamRawIn, "java.util.zip.InflaterInputStream", "closed"));
        
        assertTrue(finalDumpArchiveInputStreamIsClosed);
        
        assertTrue(finalDumpArchiveInputStreamRawInClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!isClosed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.TapeInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: raw.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close(DumpArchiveInputStream.java:529) */
        dumpArchiveInputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#close()}
 * @utbot.executesCondition {@code (!isClosed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.TapeInputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Inflater inf = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zsRef = createInstance("java.util.zip.Inflater$InflaterZStreamRef");
        CleanerImpl.PhantomCleanableRef cleanable = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(zsRef, "java.util.zip.Inflater$InflaterZStreamRef", "cleanable", cleanable);
        setField(inf, "java.util.zip.Inflater", "zsRef", zsRef);
        setField(in, "java.util.zip.InflaterInputStream", "inf", inf);
        setField(in, "java.util.zip.InflaterInputStream", "usesDefaultInflater", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        dumpArchiveInputStream.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 20 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field private static final java.util.concurrent.atomic.AtomicInteger sun.net.ResourceManager.numSockets accessible:
        module java.base does not "opens sun.net" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.DumpArchiveEntry#getIno()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPath_MapPut() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        LinkedHashMap pending = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "pending", pending);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        header.setIno(-255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method getPathMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("getPath", dumpArchiveEntryType);
        getPathMethod.setAccessible(true);
        java.lang.Object[] getPathMethodArguments = new java.lang.Object[1];
        getPathMethodArguments[0] = dumpArchiveEntry;
        String actual = ((String) getPathMethod.invoke(dumpArchiveInputStream, getPathMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.invokes {@link java.util.Stack#pop()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testGetPath_StringBuilderToString() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = -256;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        String name = "";
        setField(dirent, "org.apache.commons.compress.archivers.dump.Dirent", "name", name);
        names.put(integer, dirent);
        names.put(null, null);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        header.setIno(-256);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method getPathMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("getPath", dumpArchiveEntryType);
        getPathMethod.setAccessible(true);
        java.lang.Object[] getPathMethodArguments = new java.lang.Object[1];
        getPathMethodArguments[0] = dumpArchiveEntry;
        String actual = ((String) getPathMethod.invoke(dumpArchiveInputStream, getPathMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.DumpArchiveEntry#getIno()}
 * @utbot.invokes {@link java.util.Stack#isEmpty()}
 * @utbot.invokes {@link java.util.Stack#pop()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return sb.toString();
 *  */
    @Test
    public void testGetPath_ThrowNullPointerException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = -255;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        names.put(integer, dirent);
        names.put(null, null);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        header.setIno(-255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:105)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:131)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath(DumpArchiveInputStream.java:439) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method getPathMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("getPath", dumpArchiveEntryType);
        getPathMethod.setAccessible(true);
        java.lang.Object[] getPathMethodArguments = new java.lang.Object[1];
        getPathMethodArguments[0] = dumpArchiveEntry;
        try {
            getPathMethod.invoke(dumpArchiveInputStream, getPathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getCount()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getBytesRead()}
 * @utbot.returnsFrom {@code return (int) getBytesRead();}
 *  */
    @Test
    public void testGetCount_DumpArchiveInputStreamGetBytesRead() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        
        int actual = dumpArchiveInputStream.getCount();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBytesRead()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getBytesRead()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.TapeInputStream#getBytesRead()}
 * @utbot.returnsFrom {@code return raw.getBytesRead();}
 *  */
    @Test
    public void testGetBytesRead_TapeInputStreamGetBytesRead() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        
        long actual = dumpArchiveInputStream.getBytesRead();
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBytesRead()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getBytesRead()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.TapeInputStream#getBytesRead()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return raw.getBytesRead();
 *  */
    @Test
    public void testGetBytesRead_ThrowNullPointerException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead(DumpArchiveInputStream.java:156) */
        dumpArchiveInputStream.getBytesRead();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextDumpEntry()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.returnsFrom {@code return getNextEntry();}
 *  */
    @Test
    public void testGetNextDumpEntry_DumpArchiveInputStreamGetNextEntry() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "hasHitEOF", true);
        ArrayDeque queue = new ArrayDeque();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        DumpArchiveEntry actual = dumpArchiveInputStream.getNextDumpEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextDumpEntry()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNextEntry();
 *  */
    @Test
    public void testGetNextDumpEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1073741824);
        byte[] cdata = {(byte) -127, (byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 1073741823);
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader.getCdata(DumpArchiveEntry.java:555)
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(DumpArchiveEntry.java:381)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:244)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry(DumpArchiveInputStream.java:218) */
        dumpArchiveInputStream.getNextDumpEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNextEntry();
 *  */
    @Test
    public void testGetNextDumpEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -255);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "filepos", 0L);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1022);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", 0L);
        dumpArchiveInputStream.raw = raw;
        ArrayDeque queue = new ArrayDeque();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:253)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry(DumpArchiveInputStream.java:218) */
        dumpArchiveInputStream.getNextDumpEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNextEntry();
 *  */
    @Test
    public void testGetNextDumpEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -524288);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -524288);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "filepos", 1L);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) -127};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1049856);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1048832);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1049856 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:253)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry(DumpArchiveInputStream.java:218) */
        dumpArchiveInputStream.getNextDumpEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextDumpEntry()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextDumpEntry_ThrowIOException_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "filepos", -255L);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        dumpArchiveInputStream.getNextDumpEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextDumpEntry_ThrowIOException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        byte[] cdata = {(byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1024);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1024);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        dumpArchiveInputStream.getNextDumpEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextDumpEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: return getNextEntry();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextDumpEntry_ThrowIOException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        byte[] cdata = {(byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1073741824);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1073741824);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        dumpArchiveInputStream.getNextDumpEntry();
    }
    ///endregion
    
    ///region Errors report for getNextDumpEntry
    
    public void testGetNextDumpEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readBITS()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test
    public void testReadBITS_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1073741824);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1073740800);
        dumpArchiveInputStream.raw = raw;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1073741824 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS(DumpArchiveInputStream.java:194) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test
    public void testReadBITS_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -1);
        dumpArchiveInputStream.raw = raw;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS(DumpArchiveInputStream.java:194) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test
    public void testReadBITS_ThrowNullPointerException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS(DumpArchiveInputStream.java:194) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readBITS()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testReadBITS_ThrowIOException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadBITS_ThrowIOException_1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.dump.ShortFileException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test(expected = ShortFileException.class)
    public void testReadBITS_ThrowShortFileException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readBITS()}
 * @utbot.throwsException {@link org.apache.commons.compress.archivers.dump.ShortFileException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test(expected = ShortFileException.class)
    public void testReadBITS_ThrowShortFileException_1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        JarInputStream in = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in, "java.util.jar.JarInputStream", "first", first);
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        setField(in, "java.util.jar.JarInputStream", "mev", mev);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readBITSMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readBITS");
        readBITSMethod.setAccessible(true);
        java.lang.Object[] readBITSMethodArguments = new java.lang.Object[0];
        try {
            readBITSMethod.invoke(dumpArchiveInputStream, readBITSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readBITS
    
    public void testReadBITS_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.invokes {@link java.util.Queue#isEmpty()}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 *  */
    @Test
    public void testGetNextEntry_HasHitEOF() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "hasHitEOF", true);
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        DumpArchiveEntry actual = dumpArchiveInputStream.getNextEntry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !active.isSparseRecord(readIdx++) && raw.skip(DumpArchiveConstants.TP_SIZE) == -1
 *  */
    @Test
    public void testGetNextEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 256);
        byte[] cdata = {(byte) -127, (byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", 255);
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader.getCdata(DumpArchiveEntry.java:555)
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(DumpArchiveEntry.java:381)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:244) */
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test
    public void testGetNextEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -255);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "filepos", -255L);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) -127};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -2146435072);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -1048577);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1048577 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:253) */
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.invokes {@link java.util.Queue#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !queue.isEmpty()
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:230) */
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(readIdx < active.getHeaderCount())
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -255);
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:243) */
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: filepos = raw.getBytesRead();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -255);
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:251) */
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: raw.skip(DumpArchiveConstants.TP_SIZE) == -1
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_3() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        byte[] cdata = {(byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:245) */
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.executesCondition {@code (!queue.isEmpty()): False}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test
    public void testGetNextEntry_ThrowNullPointerException_4() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -255);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "filepos", 0L);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1073742081);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1022);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry(DumpArchiveInputStream.java:253) */
        dumpArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getNextEntry()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.io.IOException} in: byte[] headerBytes = raw.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_2() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "readIdx", -255);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "filepos", -255L);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", -255L);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.io.IOException} in: raw.skip(DumpArchiveConstants.TP_SIZE) == -1
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        byte[] cdata = {(byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1073741824);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1073741824);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        dumpArchiveInputStream.getNextEntry();
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getNextEntry()}
 * @utbot.iterates iterate the loop {@code while(entry == null)} once
 * @utbot.throwsException {@link java.io.IOException} in: raw.skip(DumpArchiveConstants.TP_SIZE) == -1
 *  */
    @Test(expected = IOException.class)
    public void testGetNextEntry_ThrowIOException_1() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry active = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        byte[] cdata = {(byte) -127};
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "cdata", cdata);
        setField(active, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "active", active);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1024);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1024);
        dumpArchiveInputStream.raw = raw;
        LinkedList queue = new LinkedList();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "queue", queue);
        
        dumpArchiveInputStream.getNextEntry();
    }
    ///endregion
    
    ///region Errors report for getNextEntry
    
    public void testGetNextEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long size = entry.getEntrySize();
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:322) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = ((Object) null);
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !names.containsKey(entry.getIno()) && DumpArchiveConstants.SEGMENT_TYPE.INODE == entry.getHeaderType()
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException_1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        header.setIno(-255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:332) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: blockBuffer.length < datalen
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException_4() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        DumpArchiveConstants.SEGMENT_TYPE type = DumpArchiveConstants.SEGMENT_TYPE.CLRI;
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "type", type);
        header.setIno(-255);
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:339) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: raw.read(blockBuffer, 0, datalen) != datalen
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException_2() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        DumpArchiveConstants.SEGMENT_TYPE type = DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "type", type);
        header.setIno(-255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:343) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] peekBytes = raw.peek();
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException_3() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -2);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(1L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        DumpArchiveConstants.SEGMENT_TYPE type = DumpArchiveConstants.SEGMENT_TYPE.CLRI;
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "type", type);
        header.setIno(-255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.peek(TapeInputStream.java:227)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:393) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: blockBuffer.length < datalen
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException_5() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = -256;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        names.put(integer, dirent);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        header.setIno(-256);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:339) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: raw.read(blockBuffer, 0, datalen) != datalen
 *  */
    @Test
    public void testReadDirectoryEntry_ThrowNullPointerException_6() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = -255;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        names.put(integer, dirent);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        header.setIno(-255);
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:343) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.io.EOFException} when: raw.read(blockBuffer, 0, datalen) != datalen
 *  */
    @Test(expected = EOFException.class)
    public void testReadDirectoryEntry_ThrowEOFException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {(byte) -127};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        DumpArchiveConstants.SEGMENT_TYPE type = DumpArchiveConstants.SEGMENT_TYPE.CLRI;
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "type", type);
        header.setIno(-255);
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", -255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)}
 * @utbot.iterates iterate the loop {@code while(first || DumpArchiveConstants.SEGMENT_TYPE.ADDR == entry.getHeaderType())} once
 * @utbot.throwsException {@link java.io.IOException} in: byte[] peekBytes = raw.peek();
 *  */
    @Test(expected = IOException.class)
    public void testReadDirectoryEntry_ThrowIOException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -256);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -256);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(-255L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        DumpArchiveConstants.SEGMENT_TYPE type = DumpArchiveConstants.SEGMENT_TYPE.CLRI;
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "type", type);
        header.setIno(-255);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)
    
    @Test
    public void testReadDirectoryEntry1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer1 = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", 0L);
        Object in = createInstance("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(0L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1024 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.peek(TapeInputStream.java:227)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:393) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadDirectoryEntry2() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer1 = new byte[40];
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", 0L);
        Object in = createInstance("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(0L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1024 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.peek(TapeInputStream.java:227)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:393) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadDirectoryEntry3() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 3);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = 0;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        names.put(integer, dirent);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(0L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:343) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadDirectoryEntry4() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer1 = {};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1073741824);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 37789761);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = 0;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        names.put(integer, dirent);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(0L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 37790785 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:343) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadDirectoryEntry5() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        DumpArchiveInputStream in = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = 0;
        Dirent dirent = ((Dirent) createInstance("org.apache.commons.compress.archivers.dump.Dirent"));
        names.put(integer, dirent);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(0L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.readFully(IOUtils.java:153)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readFully(TapeInputStream.java:339)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readBlock(TapeInputStream.java:266)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:129)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:343) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadDirectoryEntry6() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] blockBuffer = {};
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "blockBuffer", blockBuffer);
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        DumpArchiveInputStream in = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = 0;
        names.put(integer, null);
        setField(dumpArchiveInputStream, "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", "names", names);
        DumpArchiveEntry dumpArchiveEntry = ((DumpArchiveEntry) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        dumpArchiveEntry.setSize(0L);
        DumpArchiveEntry.TapeSegmentHeader header = ((DumpArchiveEntry.TapeSegmentHeader) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setField(header, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "count", 1);
        setField(dumpArchiveEntry, "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "header", header);
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.IOUtils.readFully(IOUtils.java:153)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readFully(TapeInputStream.java:339)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readBlock(TapeInputStream.java:269)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:129)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(DumpArchiveInputStream.java:343) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class dumpArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Method readDirectoryEntryMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readDirectoryEntry", dumpArchiveEntryType);
        readDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readDirectoryEntryMethodArguments = new java.lang.Object[1];
        readDirectoryEntryMethodArguments[0] = dumpArchiveEntry;
        try {
            readDirectoryEntryMethod.invoke(dumpArchiveInputStream, readDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readDirectoryEntry
    
    public void testReadDirectoryEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getSummary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSummary()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#getSummary()}
 * @utbot.returnsFrom {@code return summary;}
 *  */
    @Test
    public void testGetSummary_ReturnSummary() throws Exception  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        DumpArchiveSummary actual = dumpArchiveInputStream.getSummary();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readCLRI()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readCLRI()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test
    public void testReadCLRI_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 1073741824);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 1073740800);
        dumpArchiveInputStream.raw = raw;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1073741824 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI(DumpArchiveInputStream.java:170) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readCLRI()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test
    public void testReadCLRI_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -1);
        dumpArchiveInputStream.raw = raw;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI(DumpArchiveInputStream.java:170) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readCLRI()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test
    public void testReadCLRI_ThrowNullPointerException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI(DumpArchiveInputStream.java:170) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readCLRI()
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readCLRI()}
 * @utbot.throwsException {@link java.io.IOException} in: byte[] buffer = raw.readRecord();
 *  */
    @Test(expected = IOException.class)
    public void testReadCLRI_ThrowIOException() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", -255);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -255);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DumpArchiveInputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.dump.DumpArchiveInputStream#readCLRI()}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadCLRI_ThrowIOException_1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0, (byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", 2);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", 2);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        InflaterInputStream in = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in, "java.util.zip.InflaterInputStream", "closed", true);
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readCLRI()
    
    @Test
    public void testReadCLRI1() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -3071);
        dumpArchiveInputStream.raw = raw;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI(DumpArchiveInputStream.java:170) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadCLRI2() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", Integer.MIN_VALUE);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", -3071);
        dumpArchiveInputStream.raw = raw;
        
        /* This test fails because method [org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.dump.TapeInputStream.read(TapeInputStream.java:144)
            org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord(TapeInputStream.java:243)
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI(DumpArchiveInputStream.java:170) */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readCLRI()
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadCLRI3() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", 0L);
        TapeInputStream in = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadCLRI4() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "currBlkIdx", -1);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockSize", Integer.MIN_VALUE);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "readOffset", Integer.MIN_VALUE);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "isCompressed", true);
        TapeInputStream in = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method readCLRI()
    
    @Test(timeout = 1000L)
    public void testReadCLRI5() throws Throwable  {
        DumpArchiveInputStream dumpArchiveInputStream = ((DumpArchiveInputStream) createInstance("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        TapeInputStream raw = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] blockBuffer = {(byte) 0};
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "blockBuffer", blockBuffer);
        setField(raw, "org.apache.commons.compress.archivers.dump.TapeInputStream", "bytesRead", 0L);
        TapeInputStream in = ((TapeInputStream) createInstance("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(raw, "java.io.FilterInputStream", "in", in);
        dumpArchiveInputStream.raw = raw;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class dumpArchiveInputStreamClazz = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Method readCLRIMethod = dumpArchiveInputStreamClazz.getDeclaredMethod("readCLRI");
        readCLRIMethod.setAccessible(true);
        java.lang.Object[] readCLRIMethodArguments = new java.lang.Object[0];
        try {
            readCLRIMethod.invoke(dumpArchiveInputStream, readCLRIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readCLRI
    
    public void testReadCLRI_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields973719408850300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields973719408850300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass973719408858500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973719408850300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973719408858500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields973719409240100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields973719409240100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass973719409241700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields973719409240100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass973719409241700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

