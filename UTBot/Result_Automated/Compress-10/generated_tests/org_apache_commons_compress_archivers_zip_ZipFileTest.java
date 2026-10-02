package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;
import java.io.FileDescriptor;
import sun.nio.ch.FileChannelImpl;
import java.util.jar.JarInputStream;
import java.nio.channels.FileChannel;
import java.io.InputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_compress_archivers_zip_ZipFileTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readCentralDirectoryEntry(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#readCentralDirectoryEntry(java.util.Map)}
 * @utbot.invokes {@link java.io.RandomAccessFile#readFully(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: archive.readFully(cfh);
 *  */
    @Test
    public void testReadCentralDirectoryEntry_ThrowNullPointerException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(ZipFile.java:438) */
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class mapType = Class.forName("java.util.Map");
        Method readCentralDirectoryEntryMethod = zipFileClazz.getDeclaredMethod("readCentralDirectoryEntry", mapType);
        readCentralDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readCentralDirectoryEntryMethodArguments = new java.lang.Object[1];
        readCentralDirectoryEntryMethodArguments[0] = ((Object) null);
        try {
            readCentralDirectoryEntryMethod.invoke(zipFile, readCentralDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readCentralDirectoryEntry(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#readCentralDirectoryEntry(java.util.Map)}
 * @utbot.invokes {@link java.io.RandomAccessFile#readFully(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: archive.readFully(cfh);
 *  */
    @Test(expected = IOException.class)
    public void testReadCentralDirectoryEntry_ThrowIOException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class mapType = Class.forName("java.util.Map");
        Method readCentralDirectoryEntryMethod = zipFileClazz.getDeclaredMethod("readCentralDirectoryEntry", mapType);
        readCentralDirectoryEntryMethod.setAccessible(true);
        java.lang.Object[] readCentralDirectoryEntryMethodArguments = new java.lang.Object[1];
        readCentralDirectoryEntryMethodArguments[0] = ((Object) null);
        try {
            readCentralDirectoryEntryMethod.invoke(zipFile, readCentralDirectoryEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry, int)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): False}
 *  */
    @Test
    public void testSetSizesAndOffsetFromZip64Extra_Z64ReparseCentralDirectoryData() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(-255L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            byte[] rawCentralDirectoryData = {};
            setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967296L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967296L);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = -255;
            setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): True}
 *  */
    @Test
    public void testSetSizesAndOffsetFromZip64Extra_Z64ReparseCentralDirectoryData_1() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(-255L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967296L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967296L);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = 65535;
            setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): False}
 *  */
    @Test
    public void testSetSizesAndOffsetFromZip64Extra_Z64ReparseCentralDirectoryData_2() throws Exception  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(-255L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967296L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967296L);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = -255;
            setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry, int)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID)
 *  */
    @Test
    public void testSetSizesAndOffsetFromZip64Extra_ThrowNullPointerException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(ZipFile.java:535) */
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = ((Object) null);
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = ((Object) null);
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = -255;
            try {
                setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (z64 != null): True}
 * @utbot.executesCondition {@code (offset.headerOffset == ZIP64_MAGIC): True}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): True}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasUncompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getRelativeHeaderOffset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: z64.getRelativeHeaderOffset().getLongValue()
 *  */
    @Test
    public void testSetSizesAndOffsetFromZip64Extra_ThrowNullPointerException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(-255L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967296L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967295L);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra] produces [java.lang.NullPointerException] */
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = 65535;
            try {
                setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (z64 != null): True}
 * @utbot.executesCondition {@code (offset.headerOffset == ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ze.setSize(z64.getSize().getLongValue());
 *  */
    @Test
    public void testSetSizesAndOffsetFromZip64Extra_ThrowNullPointerException_2() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(4294967295L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967296L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967296L);
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra] produces [java.lang.NullPointerException] */
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = -255;
            try {
                setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry, int)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (offset.headerOffset == ZIP64_MAGIC): True}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);
 *  */
    @Test(expected = ZipException.class)
    public void testSetSizesAndOffsetFromZip64Extra_ThrowZipException() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(-255L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            byte[] rawCentralDirectoryData = {(byte) 0};
            setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967295L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967295L);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = -255;
            try {
                setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry,org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry,int)}
 * @utbot.executesCondition {@code (offset.headerOffset == ZIP64_MAGIC): False}
 * @utbot.executesCondition {@code (z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: z64.reparseCentralDirectoryData(hasUncompressedSize, hasCompressedSize, hasRelativeHeaderOffset, diskStart == ZIP64_MAGIC_SHORT);
 *  */
    @Test(expected = ZipException.class)
    public void testSetSizesAndOffsetFromZip64Extra_ThrowZipException_1() throws Throwable  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            zipArchiveEntry.setSize(4294967295L);
            LinkedHashMap extraFields = new LinkedHashMap();
            ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
            setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", 1);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
            byte[] rawCentralDirectoryData = {(byte) 0};
            setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
            extraFields.put(zipShort, zip64ExtendedInformationExtraField);
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            setField(zipArchiveEntry, "java.util.zip.ZipEntry", "csize", 4294967296L);
            Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            setField(offsetEntry, "org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry", "headerOffset", 4294967296L);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
            Class offsetEntryType = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
            Class intType = int.class;
            Method setSizesAndOffsetFromZip64ExtraMethod = zipFileClazz.getDeclaredMethod("setSizesAndOffsetFromZip64Extra", zipArchiveEntryType, offsetEntryType, intType);
            setSizesAndOffsetFromZip64ExtraMethod.setAccessible(true);
            java.lang.Object[] setSizesAndOffsetFromZip64ExtraMethodArguments = new java.lang.Object[3];
            setSizesAndOffsetFromZip64ExtraMethodArguments[0] = zipArchiveEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[1] = offsetEntry;
            setSizesAndOffsetFromZip64ExtraMethodArguments[2] = 65535;
            try {
                setSizesAndOffsetFromZip64ExtraMethod.invoke(zipFile, setSizesAndOffsetFromZip64ExtraMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///region Errors report for setSizesAndOffsetFromZip64Extra
    
    public void testSetSizesAndOffsetFromZip64Extra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method positionAtCentralDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean found = tryToLocateSignature(MIN_EOCD_SIZE + ZIP64_EOCDL_LENGTH, MAX_EOCD_SIZE + ZIP64_EOCDL_LENGTH, ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG);
 *  */
    @Test
    public void testPositionAtCentralDirectory_ThrowNullPointerException() throws Throwable  {
        byte[] prevZIP64_EOCD_LOC_SIG = ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        try {
            byte[] zip64EocdLocSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 7};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_LOC_SIG", zip64EocdLocSig);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(ZipFile.java:733)
                org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory(ZipFile.java:665) */
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Method positionAtCentralDirectoryMethod = zipFileClazz.getDeclaredMethod("positionAtCentralDirectory");
            positionAtCentralDirectoryMethod.setAccessible(true);
            java.lang.Object[] positionAtCentralDirectoryMethodArguments = new java.lang.Object[0];
            try {
                positionAtCentralDirectoryMethod.invoke(zipFile, positionAtCentralDirectoryMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_LOC_SIG", prevZIP64_EOCD_LOC_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method positionAtCentralDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory64()
 * @utbot.throwsException {@link java.io.IOException} in: positionAtCentralDirectory64();
 *  */
    @Test(expected = IOException.class)
    public void testPositionAtCentralDirectory_ThrowIOException() throws Throwable  {
        byte[] prevZIP64_EOCD_LOC_SIG = ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        try {
            byte[] zip64EocdLocSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 7};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_LOC_SIG", zip64EocdLocSig);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Method positionAtCentralDirectoryMethod = zipFileClazz.getDeclaredMethod("positionAtCentralDirectory");
            positionAtCentralDirectoryMethod.setAccessible(true);
            java.lang.Object[] positionAtCentralDirectoryMethodArguments = new java.lang.Object[0];
            try {
                positionAtCentralDirectoryMethod.invoke(zipFile, positionAtCentralDirectoryMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_LOC_SIG", prevZIP64_EOCD_LOC_SIG);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method positionAtCentralDirectory64()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory64()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: skipBytes(ZIP64_EOCDL_LOCATOR_OFFSET);
 *  */
    @Test
    public void testPositionAtCentralDirectory64_ThrowNullPointerException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(ZipFile.java:771)
            org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64(ZipFile.java:685) */
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Method positionAtCentralDirectory64Method = zipFileClazz.getDeclaredMethod("positionAtCentralDirectory64");
        positionAtCentralDirectory64Method.setAccessible(true);
        java.lang.Object[] positionAtCentralDirectory64MethodArguments = new java.lang.Object[0];
        try {
            positionAtCentralDirectory64Method.invoke(zipFile, positionAtCentralDirectory64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method positionAtCentralDirectory64()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory64()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)
 * @utbot.throwsException {@link java.io.IOException} in: skipBytes(ZIP64_EOCDL_LOCATOR_OFFSET);
 *  */
    @Test(expected = IOException.class)
    public void testPositionAtCentralDirectory64_ThrowIOException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Method positionAtCentralDirectory64Method = zipFileClazz.getDeclaredMethod("positionAtCentralDirectory64");
        positionAtCentralDirectory64Method.setAccessible(true);
        java.lang.Object[] positionAtCentralDirectory64MethodArguments = new java.lang.Object[0];
        try {
            positionAtCentralDirectory64Method.invoke(zipFile, positionAtCentralDirectory64MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method positionAtCentralDirectory32()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory32()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean found = tryToLocateSignature(MIN_EOCD_SIZE, MAX_EOCD_SIZE, ZipArchiveOutputStream.EOCD_SIG);
 *  */
    @Test
    public void testPositionAtCentralDirectory32_ThrowNullPointerException() throws Throwable  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(ZipFile.java:733)
                org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32(ZipFile.java:713) */
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Method positionAtCentralDirectory32Method = zipFileClazz.getDeclaredMethod("positionAtCentralDirectory32");
            positionAtCentralDirectory32Method.setAccessible(true);
            java.lang.Object[] positionAtCentralDirectory32MethodArguments = new java.lang.Object[0];
            try {
                positionAtCentralDirectory32Method.invoke(zipFile, positionAtCentralDirectory32MethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method positionAtCentralDirectory32()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory32()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.throwsException {@link java.io.IOException} when: !found
 *  */
    @Test(expected = IOException.class)
    public void testPositionAtCentralDirectory32_ThrowIOException() throws Throwable  {
        byte[] prevEOCD_SIG = ZipArchiveOutputStream.EOCD_SIG;
        try {
            byte[] eocdSig = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "EOCD_SIG", eocdSig);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Method positionAtCentralDirectory32Method = zipFileClazz.getDeclaredMethod("positionAtCentralDirectory32");
            positionAtCentralDirectory32Method.setAccessible(true);
            java.lang.Object[] positionAtCentralDirectory32MethodArguments = new java.lang.Object[0];
            try {
                positionAtCentralDirectory32Method.invoke(zipFile, positionAtCentralDirectory32MethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "EOCD_SIG", prevEOCD_SIG);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryToLocateSignature(long, long, [B)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])}
 * @utbot.invokes {@link java.io.RandomAccessFile#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long off = archive.length() - minDistanceFromEnd;
 *  */
    @Test
    public void testTryToLocateSignature_ThrowNullPointerException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(ZipFile.java:733) */
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Method tryToLocateSignatureMethod = zipFileClazz.getDeclaredMethod("tryToLocateSignature", longType, longType, byteArrayType);
        tryToLocateSignatureMethod.setAccessible(true);
        java.lang.Object[] tryToLocateSignatureMethodArguments = new java.lang.Object[3];
        tryToLocateSignatureMethodArguments[0] = -255L;
        tryToLocateSignatureMethodArguments[1] = -255L;
        tryToLocateSignatureMethodArguments[2] = ((Object) null);
        try {
            tryToLocateSignatureMethod.invoke(zipFile, tryToLocateSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method tryToLocateSignature(long, long, [B)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])}
 * @utbot.executesCondition {@code (off >= 0): True}
 * @utbot.invokes {@link java.io.RandomAccessFile#length()}
 * @utbot.invokes {@link java.io.RandomAccessFile#length()}
 * @utbot.invokes {@link java.lang.Math#max(long,long)}
 * @utbot.iterates iterate the loop {@code for(; off >= stopSearching; off--)} once
 * @utbot.throwsException {@link java.io.IOException} when: curr == sig[POS_0]
 *  */
    @Test(expected = IOException.class)
    public void testTryToLocateSignature_ThrowIOException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        byte[] byteArray = {};
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Method tryToLocateSignatureMethod = zipFileClazz.getDeclaredMethod("tryToLocateSignature", longType, longType, byteArrayType);
        tryToLocateSignatureMethod.setAccessible(true);
        java.lang.Object[] tryToLocateSignatureMethodArguments = new java.lang.Object[3];
        tryToLocateSignatureMethodArguments[0] = -2L;
        tryToLocateSignatureMethodArguments[1] = 360287970189639678L;
        tryToLocateSignatureMethodArguments[2] = ((Object) byteArray);
        try {
            tryToLocateSignatureMethod.invoke(zipFile, tryToLocateSignatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveLocalFileHeaderData(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#resolveLocalFileHeaderData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testResolveLocalFileHeaderData_SetIterator() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        LinkedHashMap entries = new LinkedHashMap();
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "entries", entries);
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class mapType = Class.forName("java.util.Map");
        Method resolveLocalFileHeaderDataMethod = zipFileClazz.getDeclaredMethod("resolveLocalFileHeaderData", mapType);
        resolveLocalFileHeaderDataMethod.setAccessible(true);
        java.lang.Object[] resolveLocalFileHeaderDataMethodArguments = new java.lang.Object[1];
        resolveLocalFileHeaderDataMethodArguments[0] = ((Object) null);
        resolveLocalFileHeaderDataMethod.invoke(zipFile, resolveLocalFileHeaderDataMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveLocalFileHeaderData(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#resolveLocalFileHeaderData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ZipArchiveEntry ze: entries.keySet())
 *  */
    @Test
    public void testResolveLocalFileHeaderData_ThrowNullPointerException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(ZipFile.java:808) */
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class mapType = Class.forName("java.util.Map");
        Method resolveLocalFileHeaderDataMethod = zipFileClazz.getDeclaredMethod("resolveLocalFileHeaderData", mapType);
        resolveLocalFileHeaderDataMethod.setAccessible(true);
        java.lang.Object[] resolveLocalFileHeaderDataMethodArguments = new java.lang.Object[1];
        resolveLocalFileHeaderDataMethodArguments[0] = ((Object) null);
        try {
            resolveLocalFileHeaderDataMethod.invoke(zipFile, resolveLocalFileHeaderDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for resolveLocalFileHeaderData
    
    public void testResolveLocalFileHeaderData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntriesInPhysicalOrder()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getEntriesInPhysicalOrder()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.keySet().toArray(new ZipArchiveEntry[0])
 *  */
    @Test
    public void testGetEntriesInPhysicalOrder_ThrowNullPointerException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(ZipFile.java:282) */
        zipFile.getEntriesInPhysicalOrder();
    }
    ///endregion
    
    ///region Errors report for getEntriesInPhysicalOrder
    
    public void testGetEntriesInPhysicalOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method populateFromCentralDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#populateFromCentralDirectory()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory()
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.invokes {@link java.io.RandomAccessFile#length()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: positionAtCentralDirectory();
 *  */
    @Test
    public void testPopulateFromCentralDirectory_ThrowNullPointerException() throws Throwable  {
        byte[] prevZIP64_EOCD_LOC_SIG = ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        try {
            byte[] zip64EocdLocSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 7};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_LOC_SIG", zip64EocdLocSig);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            
            /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory] produces [java.lang.NullPointerException]
                org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(ZipFile.java:733)
                org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory(ZipFile.java:665)
                org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory(ZipFile.java:405) */
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Method populateFromCentralDirectoryMethod = zipFileClazz.getDeclaredMethod("populateFromCentralDirectory");
            populateFromCentralDirectoryMethod.setAccessible(true);
            java.lang.Object[] populateFromCentralDirectoryMethodArguments = new java.lang.Object[0];
            try {
                populateFromCentralDirectoryMethod.invoke(zipFile, populateFromCentralDirectoryMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_LOC_SIG", prevZIP64_EOCD_LOC_SIG);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method populateFromCentralDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#populateFromCentralDirectory()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory()
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.invokes {@link java.io.RandomAccessFile#length()}
 * @utbot.invokes {@link java.io.RandomAccessFile#length()}
 * @utbot.invokes {@link java.lang.Math#max(long,long)}
 * @utbot.invokes {@link java.io.RandomAccessFile#seek(long)}
 * @utbot.invokes {@link java.io.RandomAccessFile#read()}
 * @utbot.invokes {@link java.io.RandomAccessFile#read()}
 * @utbot.invokes {@link java.io.RandomAccessFile#read()}
 * @utbot.invokes {@link java.io.RandomAccessFile#read()}
 * @utbot.invokes {@link java.io.RandomAccessFile#seek(long)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#tryToLocateSignature(long,long,byte[])
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory64()
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory64()
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipFile#positionAtCentralDirectory()
 * @utbot.throwsException {@link java.io.IOException} in: positionAtCentralDirectory();
 *  */
    @Test(expected = IOException.class)
    public void testPopulateFromCentralDirectory_ThrowIOException() throws Throwable  {
        byte[] prevZIP64_EOCD_LOC_SIG = ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG;
        try {
            byte[] zip64EocdLocSig = {(byte) 80, (byte) 75, (byte) 6, (byte) 7};
            Class zipArchiveOutputStreamClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
            setStaticField(zipArchiveOutputStreamClazz, "ZIP64_EOCD_LOC_SIG", zip64EocdLocSig);
            ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
            RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
            setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
            
            Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
            Method populateFromCentralDirectoryMethod = zipFileClazz.getDeclaredMethod("populateFromCentralDirectory");
            populateFromCentralDirectoryMethod.setAccessible(true);
            java.lang.Object[] populateFromCentralDirectoryMethodArguments = new java.lang.Object[0];
            try {
                populateFromCentralDirectoryMethod.invoke(zipFile, populateFromCentralDirectoryMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ZipArchiveOutputStream.class, "ZIP64_EOCD_LOC_SIG", prevZIP64_EOCD_LOC_SIG);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method startsWithLocalFileHeader()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#startsWithLocalFileHeader()}
 * @utbot.invokes {@link java.io.RandomAccessFile#seek(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: archive.seek(0);
 *  */
    @Test
    public void testStartsWithLocalFileHeader_ThrowNullPointerException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader(ZipFile.java:850) */
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Method startsWithLocalFileHeaderMethod = zipFileClazz.getDeclaredMethod("startsWithLocalFileHeader");
        startsWithLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] startsWithLocalFileHeaderMethodArguments = new java.lang.Object[0];
        try {
            startsWithLocalFileHeaderMethod.invoke(zipFile, startsWithLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method startsWithLocalFileHeader()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#startsWithLocalFileHeader()}
 * @utbot.invokes {@link java.io.RandomAccessFile#seek(long)}
 * @utbot.invokes {@link java.io.RandomAccessFile#readFully(byte[])}
 * @utbot.throwsException {@link java.io.IOException} in: archive.readFully(start);
 *  */
    @Test(expected = IOException.class)
    public void testStartsWithLocalFileHeader_ThrowIOException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Method startsWithLocalFileHeaderMethod = zipFileClazz.getDeclaredMethod("startsWithLocalFileHeader");
        startsWithLocalFileHeaderMethod.setAccessible(true);
        java.lang.Object[] startsWithLocalFileHeaderMethodArguments = new java.lang.Object[0];
        try {
            startsWithLocalFileHeaderMethod.invoke(zipFile, startsWithLocalFileHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): False}
 *  */
    @Test
    public void testCloseQuietly_ZipfileEqualsNull() {
        ZipFile.closeQuietly(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): True}
 *  */
    @Test
    public void testCloseQuietly_ZipfileNotEqualsNull() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(archive, "java.io.RandomAccessFile", "closed", true);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        ZipFile.closeQuietly(zipFile);
        
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): True}
 *  */
    @Test
    public void testCloseQuietly_ZipfileNotEqualsNull_1() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        ZipFile.closeQuietly(zipFile);
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): True}
 *  */
    @Test
    public void testCloseQuietly_ZipfileNotEqualsNull_2() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        JarInputStream parent = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(parent, "java.util.zip.ZipInputStream", "closed", true);
        setField(channel, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        ZipFile.closeQuietly(zipFile);
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        FileChannel zipFileArchiveArchiveChannel = ((FileChannel) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "channel"));
        boolean finalZipFileArchiveChannelClosed = ((Boolean) getFieldValue(zipFileArchiveArchiveChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        RandomAccessFile zipFileArchive1 = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive1, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveChannelClosed);
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): True}
 *  */
    @Test
    public void testCloseQuietly_ZipfileNotEqualsNull_3() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        ZipFile.closeQuietly(zipFile);
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        FileDescriptor zipFileArchiveArchiveFd = ((FileDescriptor) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "fd"));
        boolean finalZipFileArchiveFdClosed = ((Boolean) getFieldValue(zipFileArchiveArchiveFd, "java.io.FileDescriptor", "closed"));
        RandomAccessFile zipFileArchive1 = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive1, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveFdClosed);
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCloseQuietly_ThrowNullPointerException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly] produces [java.lang.NullPointerException]
            java.base/java.io.RandomAccessFile.close(RandomAccessFile.java:642)
            org.apache.commons.compress.archivers.zip.ZipFile.close(ZipFile.java:240)
            org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(ZipFile.java:251) */
        ZipFile.closeQuietly(zipFile);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)}
 * @utbot.executesCondition {@code (zipfile != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: zipfile.close();
 *  */
    @Test(expected = ClassCastException.class)
    public void testCloseQuietly_ThrowClassCastException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        byte[] parent = {};
        setField(channel, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        Object closeLock = createInstance("java.lang.Object");
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        ZipFile.closeQuietly(zipFile);
    }
    ///endregion
    
    ///region Errors report for closeQuietly
    
    public void testCloseQuietly_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static java.util.concurrent.ConcurrentHashMap sun.nio.ch.FileLockTable.lockMap accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.finalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finalize()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#finalize()}
 * @utbot.executesCondition {@code (!closed): False}
 * @utbot.invokes {@link java.lang.Object#finalize()}
 *  */
    @Test
    public void testFinalize_Closed() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed", true);
        
        zipFile.finalize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(archive, "java.io.RandomAccessFile", "closed", true);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        zipFile.close();
        
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        zipFile.close();
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", 0L);
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        JarInputStream parent = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(parent, "java.util.zip.ZipInputStream", "closed", true);
        setField(channel, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        zipFile.close();
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        FileChannel zipFileArchiveArchiveChannel = ((FileChannel) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "channel"));
        boolean finalZipFileArchiveChannelClosed = ((Boolean) getFieldValue(zipFileArchiveArchiveChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        RandomAccessFile zipFileArchive1 = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive1, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveChannelClosed);
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        JarInputStream parent = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(parent, "java.util.zip.InflaterInputStream", "closed", true);
        setField(channel, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        zipFile.close();
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        FileChannel zipFileArchiveArchiveChannel = ((FileChannel) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "channel"));
        Object zipFileArchiveArchiveChannelArchiveChannelParent = getFieldValue(zipFileArchiveArchiveChannel, "sun.nio.ch.FileChannelImpl", "parent");
        boolean finalZipFileArchiveChannelParentClosed = ((Boolean) getFieldValue(zipFileArchiveArchiveChannelArchiveChannelParent, "java.util.zip.ZipInputStream", "closed"));
        RandomAccessFile zipFileArchive1 = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        FileChannel zipFileArchive1ArchiveChannel = ((FileChannel) getFieldValue(zipFileArchive1, "java.io.RandomAccessFile", "channel"));
        boolean finalZipFileArchiveChannelClosed = ((Boolean) getFieldValue(zipFileArchive1ArchiveChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        RandomAccessFile zipFileArchive2 = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive2, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveChannelParentClosed);
        
        assertTrue(finalZipFileArchiveChannelClosed);
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", -1L);
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        Object closer = createInstance("java.net.SocketCleanable");
        setField(closer, "jdk.internal.ref.PhantomCleanable", "next", closer);
        setField(channel, "sun.nio.ch.FileChannelImpl", "closer", closer);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        zipFile.close();
        
        RandomAccessFile zipFileArchive = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        FileChannel zipFileArchiveArchiveChannel = ((FileChannel) getFieldValue(zipFileArchive, "java.io.RandomAccessFile", "channel"));
        boolean finalZipFileArchiveChannelClosed = ((Boolean) getFieldValue(zipFileArchiveArchiveChannel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closed"));
        RandomAccessFile zipFileArchive1 = ((RandomAccessFile) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive"));
        boolean finalZipFileArchiveClosed = ((Boolean) getFieldValue(zipFileArchive1, "java.io.RandomAccessFile", "closed"));
        boolean finalZipFileClosed = ((Boolean) getFieldValue(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "closed"));
        
        assertTrue(finalZipFileArchiveChannelClosed);
        
        assertTrue(finalZipFileArchiveClosed);
        
        assertTrue(finalZipFileClosed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: archive.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.close] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.close(ZipFile.java:240) */
        zipFile.close();
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 * @utbot.invokes {@link java.io.RandomAccessFile#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "closed", true);
        setField(archive, "java.io.RandomAccessFile", "fd", fd);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.close] produces [java.lang.NullPointerException]
            java.base/java.io.RandomAccessFile.close(RandomAccessFile.java:642)
            org.apache.commons.compress.archivers.zip.ZipFile.close(ZipFile.java:240) */
        zipFile.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#close()}
 * @utbot.invokes {@link java.io.RandomAccessFile#close()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test(expected = ClassCastException.class)
    public void testClose_ThrowClassCastException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        FileChannelImpl channel = ((FileChannelImpl) createInstance("sun.nio.ch.FileChannelImpl"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(fd, "java.io.FileDescriptor", "handle", 0L);
        setField(channel, "sun.nio.ch.FileChannelImpl", "fd", fd);
        byte[] parent = {};
        setField(channel, "sun.nio.ch.FileChannelImpl", "parent", parent);
        Object threads = createInstance("sun.nio.ch.NativeThreadSet");
        setField(channel, "sun.nio.ch.FileChannelImpl", "threads", threads);
        Object closeLock = createInstance("java.lang.Object");
        setField(channel, "java.nio.channels.spi.AbstractInterruptibleChannel", "closeLock", closeLock);
        setField(archive, "java.io.RandomAccessFile", "channel", channel);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        zipFile.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static java.util.concurrent.ConcurrentHashMap sun.nio.ch.FileLockTable.lockMap accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.getInputStream
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetInputStream_ReturnNull() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        LinkedHashMap entries = new LinkedHashMap();
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
        entries.put(zipArchiveEntry, offsetEntry);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "entries", entries);
        
        InputStream actual = zipFile.getInputStream(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetInputStream_ReturnNull_1() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        LinkedHashMap entries = new LinkedHashMap();
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        String name = "";
        jarArchiveEntry.setName(name);
        Object offsetEntry = createInstance("org.apache.commons.compress.archivers.zip.ZipFile$OffsetEntry");
        entries.put(jarArchiveEntry, offsetEntry);
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "entries", entries);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        
        InputStream actual = zipFile.getInputStream(zipArchiveEntry);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OffsetEntry offsetEntry = entries.get(ze);
 *  */
    @Test
    public void testGetInputStream_ThrowNullPointerException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.getInputStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(ZipFile.java:319) */
        zipFile.getInputStream(null);
    }
    ///endregion
    
    ///region Errors report for getInputStream
    
    public void testGetInputStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.getEntries
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntries()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getEntries()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.enumeration(entries.keySet());
 *  */
    @Test
    public void testGetEntries_ThrowNullPointerException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.getEntries] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.getEntries(ZipFile.java:267) */
        zipFile.getEntries();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.getEncoding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEncoding()
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getEncoding()}
 * @utbot.returnsFrom {@code return encoding;}
 *  */
    @Test
    public void testGetEncoding_ReturnEncoding() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        String actual = zipFile.getEncoding();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getEntry(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return nameMap.get(name);}
 *  */
    @Test
    public void testGetEntry_MapGet() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        LinkedHashMap nameMap = new LinkedHashMap();
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "nameMap", nameMap);
        String string = "";
        
        ZipArchiveEntry actual = zipFile.getEntry(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#getEntry(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nameMap.get(name);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.getEntry(ZipFile.java:295) */
        zipFile.getEntry(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipFile.skipBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipBytes(int)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)}
 *  */
    @Test
    public void testSkipBytes() throws Exception  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class intType = int.class;
        Method skipBytesMethod = zipFileClazz.getDeclaredMethod("skipBytes", intType);
        skipBytesMethod.setAccessible(true);
        java.lang.Object[] skipBytesMethodArguments = new java.lang.Object[1];
        skipBytesMethodArguments[0] = 0;
        skipBytesMethod.invoke(zipFile, skipBytesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipBytes(int)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)}
 * @utbot.iterates iterate the loop {@code while(totalSkipped < count)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int skippedNow = archive.skipBytes(count - totalSkipped);
 *  */
    @Test
    public void testSkipBytes_ThrowNullPointerException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipFile.skipBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(ZipFile.java:771) */
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class intType = int.class;
        Method skipBytesMethod = zipFileClazz.getDeclaredMethod("skipBytes", intType);
        skipBytesMethod.setAccessible(true);
        java.lang.Object[] skipBytesMethodArguments = new java.lang.Object[1];
        skipBytesMethodArguments[0] = 1;
        try {
            skipBytesMethod.invoke(zipFile, skipBytesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipBytes(int)
    
    /**
    @utbot.classUnderTest {@link ZipFile}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipFile#skipBytes(int)}
 * @utbot.iterates iterate the loop {@code while(totalSkipped < count)} once
 * @utbot.throwsException {@link java.io.IOException} in: int skippedNow = archive.skipBytes(count - totalSkipped);
 *  */
    @Test(expected = IOException.class)
    public void testSkipBytes_ThrowIOException() throws Throwable  {
        ZipFile zipFile = ((ZipFile) createInstance("org.apache.commons.compress.archivers.zip.ZipFile"));
        RandomAccessFile archive = ((RandomAccessFile) createInstance("java.io.RandomAccessFile"));
        setField(zipFile, "org.apache.commons.compress.archivers.zip.ZipFile", "archive", archive);
        
        Class zipFileClazz = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class intType = int.class;
        Method skipBytesMethod = zipFileClazz.getDeclaredMethod("skipBytes", intType);
        skipBytesMethod.setAccessible(true);
        java.lang.Object[] skipBytesMethodArguments = new java.lang.Object[1];
        skipBytesMethodArguments[0] = 1;
        try {
            skipBytesMethod.invoke(zipFile, skipBytesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields969901019072500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields969901019072500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass969901019078100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969901019072500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969901019078100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields969901019450500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields969901019450500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass969901019452100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969901019450500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969901019452100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields969901019779800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields969901019779800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass969901019781100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969901019779800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969901019781100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

