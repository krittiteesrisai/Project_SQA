package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import java.util.HashMap;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.io.FilterOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import sun.security.util.DerOutputStream;
import java.io.OutputStream;
import org.junit.Ignore;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_cpio_CpioArchiveOutputStreamTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): True}
 * @utbot.executesCondition {@code (format != this.entryFormat): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getTime()}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setTime(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getName()}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
 *  */
    @Test
    public void testPutArchiveEntry_FormatEqualsThisEntryFormat() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 6);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 6);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        CpioArchiveEntry initialCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        
        long finalCpioArchiveEntryMtime = ((Long) getFieldValue(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime"));
        
        assertFalse(initialCpioArchiveOutputStreamEntry == finalCpioArchiveOutputStreamEntry);
        
        assertEquals(1790707744529L, finalCpioArchiveEntryMtime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CpioArchiveEntry e = (CpioArchiveEntry) entry;
 *  */
    @Test
    public void testPutArchiveEntry_ThrowClassCastException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.ClassCastException: class org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to class org.apache.commons.compress.archivers.cpio.CpioArchiveEntry (org.apache.commons.compress.archivers.ar.ArArchiveEntry and org.apache.commons.compress.archivers.cpio.CpioArchiveEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:145) */
        cpioArchiveOutputStream.putArchiveEntry(arArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: e.getTime() == -1
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:150) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: e.getTime() == -1
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:150) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: closeArchiveEntry();
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:148) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): True}
 * @utbot.executesCondition {@code (format != this.entryFormat): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getTime()}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setTime(long)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getName()}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.names.put(e.getName(), e) != null
 *  */
    @Test
    public void testPutArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) -255);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:159) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): True}
 * @utbot.executesCondition {@code (format != this.entryFormat): True}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#setTime(long)}
 * @utbot.throwsException {@link java.io.IOException} when: format != this.entryFormat
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.executesCondition {@code (e.getTime() == -1): False}
 * @utbot.executesCondition {@code (format != this.entryFormat): True}
 * @utbot.throwsException {@link java.io.IOException} when: format != this.entryFormat
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -1);
        entry.setChksum(-254L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -128L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -128L);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} in: closeArchiveEntry();
 *  */
    @Test(expected = IOException.class)
    public void testPutArchiveEntry_ThrowIOException_6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        CpioArchiveEntry initialCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        
        assertFalse(initialCpioArchiveOutputStreamEntry == finalCpioArchiveOutputStreamEntry);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testPutArchiveEntry2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 1);
        entry.setChksum(0L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:159) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 398458946);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1044668109313355L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1044668109313355L);
        DataOutputStream out = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            java.base/java.io.DataOutputStream.write(DataOutputStream.java:112)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:148) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:159) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 820447847);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 6242351013992556731L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 6242351013992556731L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:148) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    @Test
    public void testPutArchiveEntry6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 10493996);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 10493982L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 10493982L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:148) */
        cpioArchiveOutputStream.putArchiveEntry(null);
    }
    
    @Test
    public void testPutArchiveEntry7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:163) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:179)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:163) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry9() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        String name = "";
        cpioArchiveEntry.setName(name);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:163) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    
    @Test
    public void testPutArchiveEntry10() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        HashMap names = new HashMap();
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:175)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(CpioArchiveOutputStream.java:163) */
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test(expected = IOException.class)
    public void testPutArchiveEntry11() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 0);
        HashMap names = new HashMap();
        Object object = createInstance("java.lang.Object");
        names.put(null, object);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "names", names);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 0);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "mtime", -1L);
        
        cpioArchiveOutputStream.putArchiveEntry(cpioArchiveEntry);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.activatesSwitch {@code switch(e.getFormat())}
 *  */
    @Test
    public void testWriteHeader_CpioArchiveEntryGetFormat() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -246);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(e.getFormat())
 *  */
    @Test
    public void testWriteHeader_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:169) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = ((Object) null);
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
     */
    @Test
    public void testWriteHeaderThrowsNPE() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream, (short) 2);
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("\n\t\r", 7L);
        cpioArchiveEntry.setChksum(3L);
        cpioArchiveEntry.setMode(2147483650L);
        cpioArchiveEntry.setName("070701");
        cpioArchiveEntry.setInode(java.lang.Long.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteHeader1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteHeader2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteHeader3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:175) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteHeader4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:179) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeHeaderMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeHeader", cpioArchiveEntryType);
        writeHeaderMethod.setAccessible(true);
        java.lang.Object[] writeHeaderMethodArguments = new java.lang.Object[1];
        writeHeaderMethodArguments[0] = cpioArchiveEntry;
        try {
            writeHeaderMethod.invoke(cpioArchiveOutputStream, writeHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", -2147483645);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483645 out of bounds for byte[4]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:129)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteOldBinaryEntry_ThrowOutOfMemoryError() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = new byte[34];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -2147483644);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -252);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = ((Object) null);
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test
    public void testWriteOldBinaryEntry_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteOldBinaryEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOldBinaryEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: writeBinaryLong(entry.getDevice(), 2, swapHalfWord);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry_ThrowIOException_9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -251);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", -255L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    @Test
    public void testWriteOldBinaryEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073740801 out of bounds for byte[9]]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldBinaryEntry2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", -2147483647);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = new byte[37];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out1, "java.io.ByteArrayOutputStream", "count", -2147483612);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483612 out of bounds for byte[37]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:123)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldBinaryEntry3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DataOutputStream out = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            java.base/java.io.DataOutputStream.write(DataOutputStream.java:112)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:225) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldBinaryEntry4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[33];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(CpioArchiveOutputStream.java:233) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = true;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldBinaryEntry5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482625);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry] produces [java.lang.NullPointerException] */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)
    
    @Test(expected = IOException.class)
    public void testWriteOldBinaryEntry6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        cpioArchiveEntry.setInode(0L);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 0L);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Class booleanType = boolean.class;
        Method writeOldBinaryEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldBinaryEntry", cpioArchiveEntryType, booleanType);
        writeOldBinaryEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldBinaryEntryMethodArguments = new java.lang.Object[2];
        writeOldBinaryEntryMethodArguments[0] = cpioArchiveEntry;
        writeOldBinaryEntryMethodArguments[1] = false;
        try {
            writeOldBinaryEntryMethod.invoke(cpioArchiveOutputStream, writeOldBinaryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeOldBinaryEntry
    
    public void testWriteOldBinaryEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 44 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 *  */
    @Test
    public void testCloseArchiveEntry() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -1);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -128L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -128L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 *  */
    @Test
    public void testCloseArchiveEntry_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", java.lang.Short.MIN_VALUE);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.crc != this.entry.getChksum()): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 *  */
    @Test
    public void testCloseArchiveEntry_ThisCrcEqualsThisEntryGetChksum() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(-255L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamCrc = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamCrc);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482624);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482624 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.entry.getSize() != this.written
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:248) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pad(this.entry.getDataPadCount());
 *  */
    @Test
    public void testCloseArchiveEntry_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeArchiveEntry()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.io.IOException} in: this.entry.getSize()
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -253L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.executesCondition {@code (this.crc != this.entry.getChksum()): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getFormat()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getChksum()}
 * @utbot.throwsException {@link java.io.IOException} when: this.crc != this.entry.getChksum()
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        entry.setChksum(-254L);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 9223372036854775555L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.io.IOException} in: pad(this.entry.getDataPadCount());
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#closeArchiveEntry()}
 * @utbot.executesCondition {@code (this.entry.getSize() != this.written): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method closeArchiveEntry()
    
    @Test
    public void testCloseArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
    }
    
    @Test
    public void testCloseArchiveEntry2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", -1163135676);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1219648770302107L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 1219648770302107L);
        
        cpioArchiveOutputStream.closeArchiveEntry();
        
        CpioArchiveEntry finalCpioArchiveOutputStreamEntry = ((CpioArchiveEntry) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        
        assertNull(finalCpioArchiveOutputStreamEntry);
        
        assertEquals(0L, finalCpioArchiveOutputStreamWritten);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method closeArchiveEntry()
    
    @Test
    public void testCloseArchiveEntry3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "alignmentBoundary", 985297052);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 71858585990251003L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 71858585990251003L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740802);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry(CpioArchiveOutputStream.java:253) */
        cpioArchiveOutputStream.closeArchiveEntry();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDevice()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeAsciiLong(entry.getDevice(), 6, 8);
 *  */
    @Test
    public void testWriteOldAsciiEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:210) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = ((Object) null);
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getDevice()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: writeAsciiLong(entry.getDevice(), 6, 8);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteOldAsciiEntry_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteOldAsciiEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 32L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:210) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 131072L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:210) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 536870912L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:210) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteOldAsciiEntry4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 4);
        setField(cpioArchiveEntry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "min", 4096L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(CpioArchiveOutputStream.java:210) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeOldAsciiEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeOldAsciiEntry", cpioArchiveEntryType);
        writeOldAsciiEntryMethod.setAccessible(true);
        java.lang.Object[] writeOldAsciiEntryMethodArguments = new java.lang.Object[1];
        writeOldAsciiEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeOldAsciiEntryMethod.invoke(cpioArchiveOutputStream, writeOldAsciiEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioUtil#long2byteArray(long,int,boolean)}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[])}
 *  */
    @Test
    public void testWriteBinaryLong_OutputStreamWrite() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOutOutBout = getFieldValue(cpioArchiveOutputStreamOut, "java.io.ObjectOutputStream", "bout");
        OutputStream cpioArchiveOutputStreamOutOutBoutOutBoutOut = ((OutputStream) getFieldValue(cpioArchiveOutputStreamOutOutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBoutOutBoutOutOutBoutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOutOutBoutOutBoutOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBoutOutBuf0 = ((Byte) get(cpioArchiveOutputStreamOutOutBoutOutBoutOutOutBoutOutBuf, 0));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOut1OutBout = getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ObjectOutputStream", "bout");
        OutputStream cpioArchiveOutputStreamOut1OutBoutOutBoutOut = ((OutputStream) getFieldValue(cpioArchiveOutputStreamOut1OutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOut1OutBoutOutBoutOutOutBoutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut1OutBoutOutBoutOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBoutOutBuf1 = ((Byte) get(cpioArchiveOutputStreamOut1OutBoutOutBoutOutOutBoutOutBuf, 1));
        OutputStream cpioArchiveOutputStreamOut2 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOut2OutBout = getFieldValue(cpioArchiveOutputStreamOut2, "java.io.ObjectOutputStream", "bout");
        OutputStream cpioArchiveOutputStreamOut2OutBoutOutBoutOut = ((OutputStream) getFieldValue(cpioArchiveOutputStreamOut2OutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutBoutOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut2OutBoutOutBoutOut, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals((byte) -1, finalCpioArchiveOutputStreamOutBoutOutBuf0);
        
        assertEquals((byte) 1, finalCpioArchiveOutputStreamOutBoutOutBuf1);
        
        assertEquals(2, finalCpioArchiveOutputStreamOutBoutOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: byte[] tmp = CpioUtil.long2byteArray(number, length, swapHalfWord);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryLong_ThrowUnsupportedOperationException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 1;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: byte[] tmp = CpioUtil.long2byteArray(number, length, swapHalfWord);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryLong_ThrowUnsupportedOperationException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 0;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteBinaryLong_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(tmp);
 *  */
    @Test(expected = IOException.class)
    public void testWriteBinaryLong_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeBinaryLong(long, int, boolean)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] tmp = CpioUtil.long2byteArray(number, length, swapHalfWord);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNegativeArraySizeException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(CpioUtil.java:81)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:351) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = -256;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", -2147483643);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483643 out of bounds for byte[6]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:129)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteBinaryLong_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteBinaryLong_ThrowOutOfMemoryError() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeBinaryLong(long,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(tmp);
 *  */
    @Test
    public void testWriteBinaryLong_ThrowNullPointerException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = -255L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeBinaryLong(long, int, boolean)
    
    @Test
    public void testWriteBinaryLong1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[40];
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 7);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = true;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut, "java.io.BufferedOutputStream", "count"));
        
        assertEquals(11, finalCpioArchiveOutputStreamOutCount);
    }
    
    @Test
    public void testWriteBinaryLong2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 6;
        writeBinaryLongMethodArguments[2] = false;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOutOutBout = getFieldValue(cpioArchiveOutputStreamOut, "java.io.ObjectOutputStream", "bout");
        int finalCpioArchiveOutputStreamOutBoutPos = ((Integer) getFieldValue(cpioArchiveOutputStreamOutOutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        
        assertEquals(6, finalCpioArchiveOutputStreamOutBoutPos);
    }
    
    @Test
    public void testWriteBinaryLong3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[32];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 4);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf1 = new byte[39];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOutOutBout = getFieldValue(cpioArchiveOutputStreamOut, "java.io.ObjectOutputStream", "bout");
        int finalCpioArchiveOutputStreamOutBoutPos = ((Integer) getFieldValue(cpioArchiveOutputStreamOutOutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos"));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        Object cpioArchiveOutputStreamOut1OutBout = getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ObjectOutputStream", "bout");
        OutputStream cpioArchiveOutputStreamOut1OutBoutOutBoutOut = ((OutputStream) getFieldValue(cpioArchiveOutputStreamOut1OutBout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutBoutOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut1OutBoutOutBoutOut, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals(0, finalCpioArchiveOutputStreamOutBoutPos);
        
        assertEquals(6, finalCpioArchiveOutputStreamOutBoutOutCount);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeBinaryLong(long, int, boolean)
    
    @Test
    public void testWriteBinaryLong4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 16414);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + 16414) out of bounds for length 5]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:127)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 4;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + 1) out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 8;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 8;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 6;
        writeBinaryLongMethodArguments[2] = false;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 8;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteBinaryLong10() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[36];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[39];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeBinaryLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeBinaryLong", longType, intType, booleanType);
        writeBinaryLongMethod.setAccessible(true);
        java.lang.Object[] writeBinaryLongMethodArguments = new java.lang.Object[3];
        writeBinaryLongMethodArguments[0] = 0L;
        writeBinaryLongMethodArguments[1] = 2;
        writeBinaryLongMethodArguments[2] = true;
        try {
            writeBinaryLongMethod.invoke(cpioArchiveOutputStream, writeBinaryLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeBinaryLong
    
    public void testWriteBinaryLong_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 51 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString
    
    ///region FUZZER: ERROR SUITE for method writeCString(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeCString(java.lang.String)}
     */
    @Test
    public void testWriteCStringThrowsNPEWithNonEmptyString() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(CpioArchiveOutputStream.java:380) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method writeCStringMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeCString", stringType);
        writeCStringMethod.setAccessible(true);
        java.lang.Object[] writeCStringMethodArguments = new java.lang.Object[1];
        writeCStringMethodArguments[0] = "acb";
        try {
            writeCStringMethod.invoke(cpioArchiveOutputStream, writeCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeCString(java.lang.String)
    
    @Test
    public void testWriteCString1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(CpioArchiveOutputStream.java:380) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class stringType = Class.forName("java.lang.String");
        Method writeCStringMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeCString", stringType);
        writeCStringMethod.setAccessible(true);
        java.lang.Object[] writeCStringMethodArguments = new java.lang.Object[1];
        writeCStringMethodArguments[0] = string;
        try {
            writeCStringMethod.invoke(cpioArchiveOutputStream, writeCStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong
    
    ///region FUZZER: ERROR SUITE for method writeAsciiLong(long, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeAsciiLong(long,int,int)}
     */
    @Test
    public void testWriteAsciiLongThrowsNPE() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 1L;
        writeAsciiLongMethodArguments[1] = 1;
        writeAsciiLongMethodArguments[2] = 17;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeAsciiLong(long, int, int)
    
    @Test
    public void testWriteAsciiLong1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.StringIndexOutOfBoundsException: start 256, end 1, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:525)
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:507)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:374) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
        writeAsciiLongMethodArguments[1] = -255;
        writeAsciiLongMethodArguments[2] = 16;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 536870912L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 16;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 137438953472L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 8;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteAsciiLong4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class longType = long.class;
        Class intType = int.class;
        Method writeAsciiLongMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeAsciiLong", longType, intType, intType);
        writeAsciiLongMethod.setAccessible(true);
        java.lang.Object[] writeAsciiLongMethodArguments = new java.lang.Object[3];
        writeAsciiLongMethodArguments[0] = 0L;
        writeAsciiLongMethodArguments[1] = 0;
        writeAsciiLongMethodArguments[2] = 0;
        try {
            writeAsciiLongMethod.invoke(cpioArchiveOutputStream, writeAsciiLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getInode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeAsciiLong(entry.getInode(), 8, 16);
 *  */
    @Test
    public void testWriteNewEntry_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = ((Object) null);
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
     */
    @Test
    public void testWriteNewEntryThrowsNPE() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream, (short) 1);
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("#$\\\"'", 1L);
        cpioArchiveEntry.setChksum(java.lang.Long.MAX_VALUE);
        cpioArchiveEntry.setMode(-9223372036854775807L);
        cpioArchiveEntry.setName("-3");
        cpioArchiveEntry.setInode(8L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)}
     */
    @Test
    public void testWriteNewEntryThrowsNPE1() throws Throwable  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream, (short) 1);
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("#$\\\"'", 1L);
        cpioArchiveEntry.setChksum(java.lang.Long.MAX_VALUE);
        cpioArchiveEntry.setMode(-9223372036854775807L);
        cpioArchiveEntry.setName("-3");
        cpioArchiveEntry.setInode(2147483656L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)
    
    @Test
    public void testWriteNewEntry1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(256L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(1073741824L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(576460752303423488L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteNewEntry4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        cpioArchiveEntry.setInode(134217728L);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(CpioArchiveOutputStream.java:376)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(CpioArchiveOutputStream.java:191) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class cpioArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Method writeNewEntryMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("writeNewEntry", cpioArchiveEntryType);
        writeNewEntryMethod.setAccessible(true);
        java.lang.Object[] writeNewEntryMethodArguments = new java.lang.Object[1];
        writeNewEntryMethodArguments[0] = cpioArchiveEntry;
        try {
            writeNewEntryMethod.invoke(cpioArchiveOutputStream, writeNewEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry
    
    ///region FUZZER: SECURITY for method createArchiveEntry(java.io.File, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#createArchiveEntry(java.io.File,java.lang.String)}
     */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testCreateArchiveEntryWithBlankString() {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        File file = new File("\n\t\r");
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "
            
        " "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isFile(File.java:893)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.<init>(CpioArchiveEntry.java:255)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(CpioArchiveOutputStream.java:386) */
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createArchiveEntry(java.io.File, java.lang.String)
    
    @Test
    public void testCreateArchiveEntry1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        File file = ((File) createInstance("java.io.File"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isFile(File.java:893)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.<init>(CpioArchiveEntry.java:255)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(CpioArchiveOutputStream.java:386) */
        cpioArchiveOutputStream.createArchiveEntry(file, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWrite_LenEqualsZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {};
        
        cpioArchiveOutputStream.write(byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 *  */
    @Test
    public void testWrite_ThisWrittenPlusLenLessOrEqualThisEntryGetSize() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) -255);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -247L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -249L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 2);
        
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf0 = ((Byte) get(cpioArchiveOutputStreamOutOutBuf, 0));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOut1OutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf1 = ((Byte) get(cpioArchiveOutputStreamOut1OutBuf, 1));
        OutputStream cpioArchiveOutputStreamOut2 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut2, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals(-247L, finalCpioArchiveOutputStreamWritten);
        
        assertEquals((byte) -127, finalCpioArchiveOutputStreamOutBuf0);
        
        assertEquals((byte) -127, finalCpioArchiveOutputStreamOutBuf1);
        
        assertEquals(2, finalCpioArchiveOutputStreamOutCount);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.iterates iterate the loop {@code for(int pos = 0; pos < len; pos++)} once
 *  */
    @Test
    public void testWrite_ThisWrittenPlusLenLessOrEqualThisEntryGetSize_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "fileFormat", (short) 2);
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
        
        long finalCpioArchiveOutputStreamCrc = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "crc"));
        long finalCpioArchiveOutputStreamWritten = ((Long) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written"));
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        byte[] cpioArchiveOutputStreamOutOutBuf = ((byte[]) getFieldValue(cpioArchiveOutputStreamOut, "java.io.ByteArrayOutputStream", "buf"));
        byte finalCpioArchiveOutputStreamOutBuf0 = ((Byte) get(cpioArchiveOutputStreamOutOutBuf, 0));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals(-126L, finalCpioArchiveOutputStreamCrc);
        
        assertEquals(-254L, finalCpioArchiveOutputStreamWritten);
        
        assertEquals((byte) -127, finalCpioArchiveOutputStreamOutBuf0);
        
        assertEquals(1, finalCpioArchiveOutputStreamOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 3, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.write(null, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        cpioArchiveOutputStream.write(null, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveEntry#getSize()}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_ThrowIndexOutOfBoundsException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 1, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.written + len > this.entry.getSize()
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -254L);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.write(null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.entry == null
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -247L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -249L);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(b, off, len);
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -207L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -208L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_6() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -207L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -208L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_7() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_8() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[15];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (len < 0): False}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWrite_ThrowIOException_9() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write([B, int, int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -254L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -223L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -255L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[15];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -12);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[40];
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
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        byteArray[33] = (byte) -127;
        byteArray[34] = (byte) -127;
        byteArray[35] = (byte) -127;
        byteArray[36] = (byte) -127;
        byteArray[37] = (byte) -127;
        byteArray[38] = (byte) -127;
        byteArray[39] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -12 out of bounds for byte[30]]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 8, 32);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWrite_ThrowOutOfMemoryError() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -240L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -241L);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[22];
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
        
        cpioArchiveOutputStream.write(byteArray, 6, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -247L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -248L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 1L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", 0L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: off < 0 || len < 0 || off > b.length - len
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:281) */
        cpioArchiveOutputStream.write(null, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#write(byte[],int,int)}
 * @utbot.executesCondition {@code (off > b.length - len): False}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (this.entry == null): False}
 * @utbot.executesCondition {@code (this.written + len > this.entry.getSize()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(b, off, len);
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", -255L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -256L);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 0, 1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method write([B, int, int)
    
    @Test(expected = StackOverflowError.class)
    public void testWrite1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -9223372036854775807L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[32];
        
        cpioArchiveOutputStream.write(byteArray, 1, 16);
    }
    
    @Test
    public void testWrite2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", java.lang.Long.MIN_VALUE);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740802);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[34];
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 0, 3);
    }
    
    @Test
    public void testWrite3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(entry, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", "filesize", 0L);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "written", -9223372036719501295L);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out1 = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[36];
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        DerOutputStream out2 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {};
        setField(out2, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out2, "java.io.ByteArrayOutputStream", "count", 25);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out2);
        setField(out1, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        byte[] byteArray = new byte[32];
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(CpioArchiveOutputStream.java:293) */
        cpioArchiveOutputStream.write(byteArray, 0, 2);
    }
    ///endregion
    
    ///region Errors report for write
    
    public void testWrite_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        // $r7 not found in the locals
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): False}
 *  */
    @Test
    public void testClose_ThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.close();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.invokes {@link java.io.OutputStream#close()}
 *  */
    @Test
    public void testClose_NotThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(out, "java.util.zip.DeflaterOutputStream", "closed", true);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        cpioArchiveOutputStream.close();
        
        boolean finalCpioArchiveOutputStreamClosed = ((Boolean) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed"));
        
        assertTrue(finalCpioArchiveOutputStreamClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.invokes {@link java.io.OutputStream#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:337) */
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: this.finish();
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
 * @utbot.executesCondition {@code (!this.closed): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.finish();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClose_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 3);
        
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method close()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#close()}
     */
    @Test
    public void testCloseThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:336) */
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        FilterOutputStream out = ((FilterOutputStream) createInstance("java.io.FilterOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.close(FilterOutputStream.java:173)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:337) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:336) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:336) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:179)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:336) */
        cpioArchiveOutputStream.close();
    }
    
    @Test
    public void testClose5() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:175)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close(CpioArchiveOutputStream.java:336) */
        cpioArchiveOutputStream.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureOpen()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()}
 * @utbot.executesCondition {@code (this.closed): False}
 *  */
    @Test
    public void testEnsureOpen_NotThisClosed() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Method ensureOpenMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("ensureOpen");
        ensureOpenMethod.setAccessible(true);
        java.lang.Object[] ensureOpenMethodArguments = new java.lang.Object[0];
        ensureOpenMethod.invoke(cpioArchiveOutputStream, ensureOpenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method ensureOpen()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()}
 * @utbot.executesCondition {@code (this.closed): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.closed
 *  */
    @Test(expected = IOException.class)
    public void testEnsureOpen_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Method ensureOpenMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("ensureOpen");
        ensureOpenMethod.setAccessible(true);
        java.lang.Object[] ensureOpenMethodArguments = new java.lang.Object[0];
        try {
            ensureOpenMethod.invoke(cpioArchiveOutputStream, ensureOpenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (this.finished): True}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testFinish_ThisFinished() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "finished", true);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.throwsException {@link java.io.IOException} in: ensureOpen();
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException_1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "closed", true);
        
        cpioArchiveOutputStream.finish();
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (this.finished): False}
 * @utbot.executesCondition {@code (this.entry != null): True}
 * @utbot.throwsException {@link java.io.IOException} when: this.entry != null
 *  */
    @Test(expected = IOException.class)
    public void testFinish_ThrowIOException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        CpioArchiveEntry entry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entry", entry);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finish()
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
 * @utbot.executesCondition {@code (this.finished): False}
 * @utbot.executesCondition {@code (this.entry != null): False}
 * @utbot.invokes org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#ensureOpen()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.entry = new CpioArchiveEntry(this.entryFormat);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFinish_ThrowIllegalArgumentException() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 6);
        
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method finish()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#finish()}
     */
    @Test
    public void testFinishThrowsNPE() throws IOException  {
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(filterOutputStream);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:87)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:137)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323) */
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method finish()
    
    @Test
    public void testFinish1() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 8);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(CpioArchiveOutputStream.java:352)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:184)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish2() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 1);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:171)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish3() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 4);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:179)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323) */
        cpioArchiveOutputStream.finish();
    }
    
    @Test
    public void testFinish4() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "entryFormat", (short) 2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(CpioArchiveOutputStream.java:175)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish(CpioArchiveOutputStream.java:323) */
        cpioArchiveOutputStream.finish();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.executesCondition {@code (count > 0): False}
 *  */
    @Test
    public void testPad_CountLessOrEqualZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 0;
        padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.executesCondition {@code (count > 0): True}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[])}
 *  */
    @Test
    public void testPad_CountGreaterThanZero() throws Exception  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DataOutputStream out = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        setField(out, "java.io.DataOutputStream", "written", -2);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        
        OutputStream cpioArchiveOutputStreamOut = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutWritten = ((Integer) getFieldValue(cpioArchiveOutputStreamOut, "java.io.DataOutputStream", "written"));
        OutputStream cpioArchiveOutputStreamOut1 = ((OutputStream) getFieldValue(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out"));
        OutputStream cpioArchiveOutputStreamOut1OutOut = ((OutputStream) getFieldValue(cpioArchiveOutputStreamOut1, "java.io.FilterOutputStream", "out"));
        int finalCpioArchiveOutputStreamOutOutCount = ((Integer) getFieldValue(cpioArchiveOutputStreamOut1OutOut, "java.io.ByteArrayOutputStream", "count"));
        
        assertEquals(Integer.MAX_VALUE, finalCpioArchiveOutputStreamOutWritten);
        
        assertEquals(1, finalCpioArchiveOutputStreamOutOutCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(buff);
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", -1073741822);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073741822 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:129)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(buff);
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPad_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testPad_ThrowOutOfMemoryError() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DerOutputStream out1 = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[32];
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", 2147483616);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 34;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(buff);
 *  */
    @Test
    public void testPad_ThrowNullPointerException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        FileOutputStream out = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(out, "java.io.FileOutputStream", "fd", fd);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DeflaterOutputStream out = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_3() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DataOutputStream out = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_4() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        DataOutputStream out = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_5() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_6() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_7() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_8() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 1);
        GZIPOutputStream out1 = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_9() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(buff);
 *  */
    @Test(expected = IOException.class)
    public void testPad_ThrowIOException_10() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        BufferedOutputStream out = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(out, "java.io.BufferedOutputStream", "buf", buf);
        setField(out, "java.io.BufferedOutputStream", "count", 2);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pad(int)
    
    /**
    @utbot.classUnderTest {@link CpioArchiveOutputStream}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream#pad(int)}
 * @utbot.executesCondition {@code (count > 0): True}
 * @utbot.invokes {@link java.io.OutputStream#write(byte[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.write(buff);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testPad_ThrowIndexOutOfBoundsException() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        DeflaterOutputStream out1 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(out1, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 1;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pad(int)
    
    @Test
    public void testPad1() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740802);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 11;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPad2() throws Throwable  {
        CpioArchiveOutputStream cpioArchiveOutputStream = ((CpioArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[36];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(out1, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out1, "java.io.ByteArrayOutputStream", "count", 25);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(cpioArchiveOutputStream, "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", "out", out);
        
        /* This test fails because method [org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:699)
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(CpioArchiveOutputStream.java:345) */
        Class cpioArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class intType = int.class;
        Method padMethod = cpioArchiveOutputStreamClazz.getDeclaredMethod("pad", intType);
        padMethod.setAccessible(true);
        java.lang.Object[] padMethodArguments = new java.lang.Object[1];
        padMethodArguments[0] = 2;
        try {
            padMethod.invoke(cpioArchiveOutputStream, padMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for pad
    
    public void testPad_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        // $r7 not found in the locals
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields968643084291000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields968643084291000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass968643084294900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968643084291000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968643084294900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields968643084637500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields968643084637500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass968643084638700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields968643084637500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass968643084638700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

