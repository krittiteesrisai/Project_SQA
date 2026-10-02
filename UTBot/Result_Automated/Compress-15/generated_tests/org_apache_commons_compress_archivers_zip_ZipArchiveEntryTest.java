package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField;
import java.util.LinkedHashMap;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.time.Instant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_compress_archivers_zip_ZipArchiveEntryTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.executesCondition {@code (name == null): True}
 * @utbot.invokes {@link java.util.zip.ZipEntry#getName()}
 * @utbot.returnsFrom {@code return name == null ? super.getName() : name;}
 *  */
    @Test
    public void testGetName_NameEqualsNull() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        
        String actual = zipArchiveEntry.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getName
    
    public void testGetName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#hashCode()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return getName().hashCode();}
 *  */
    @Test
    public void testHashCode_StringHashCode() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = " ";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        int actual = zipArchiveEntry.hashCode();
        
        assertEquals(255, actual);
    }
    ///endregion
    
    ///region Errors report for hashCode
    
    public void testHashCode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone
    
    ///region Errors report for clone
    
    public void testClone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMethod
    
    ///region Errors report for getMethod
    
    public void testGetMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName
    
    ///region Errors report for setName
    
    public void testSetName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName
    
    ///region Errors report for setName
    
    public void testSetName_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getSize
    
    ///region Errors report for getSize
    
    public void testGetSize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDirectory()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#isDirectory()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.String#endsWith(java.lang.String)}
 * @utbot.returnsFrom {@code return getName().endsWith("/");}
 *  */
    @Test
    public void testIsDirectory_StringEndsWith() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        boolean actual = zipArchiveEntry.isDirectory();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isDirectory
    
    public void testIsDirectory_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setSize
    
    ///region Errors report for setSize
    
    public void testSetSize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setMethod
    
    ///region Errors report for setMethod
    
    public void testSetMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setExtra([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setExtra(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ExtraFieldUtils#parse(byte[],boolean,org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveEntry#mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[],boolean)
 *  */
    @Test
    public void testSetExtra_ZipArchiveEntryMergeExtraFields() throws Exception  {
        ExtraFieldUtils.UnparseableExtraField prevREAD = ExtraFieldUtils.UnparseableExtraField.READ;
        try {
            ExtraFieldUtils.UnparseableExtraField read = ((ExtraFieldUtils.UnparseableExtraField) createInstance("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField"));
            setField(read, "org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", "key", 2);
            Class unparseableExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField");
            setStaticField(unparseableExtraFieldClazz, "READ", read);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            LinkedHashMap extraFields = new LinkedHashMap();
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            byte[] extra = {(byte) 0};
            zipArchiveEntry.setExtra(extra);
            byte[] byteArray = {};
            
            byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
            
            zipArchiveEntry.setExtra(byteArray);
            
            byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
            
            assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
        } finally {
            setStaticField(ExtraFieldUtils.UnparseableExtraField.class, "READ", prevREAD);
        }
    }
    ///endregion
    
    ///region Errors report for setExtra
    
    public void testSetExtra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setExtra()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setExtra()}
 *  */
    @Test
    public void testSetExtra() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        LinkedHashMap extraFields = new LinkedHashMap();
        setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
        byte[] extra = {(byte) 0};
        zipArchiveEntry.setExtra(extra);
        
        byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        zipArchiveEntry.setExtra();
        
        byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setExtra()}
 *  */
    @Test
    public void testSetExtra_1() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        
        byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        zipArchiveEntry.setExtra();
        
        byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
    }
    ///endregion
    
    ///region Errors report for setExtra
    
    public void testSetExtra_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform
    
    ///region Errors report for getPlatform
    
    public void testGetPlatform_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField
    
    ///region Errors report for addExtraField
    
    public void testAddExtraField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 30 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)}
 * @utbot.executesCondition {@code (extraFields == null): False}
 * @utbot.executesCondition {@code (extraFields.remove(type) == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#remove(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setExtra()}
 *  */
    @Test
    public void testRemoveExtraField_ExtraFieldsRemoveNotEqualsNull() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        LinkedHashMap extraFields = new LinkedHashMap();
        ZipShort zipShort = ((ZipShort) createInstance("org.apache.commons.compress.archivers.zip.ZipShort"));
        setField(zipShort, "org.apache.commons.compress.archivers.zip.ZipShort", "value", -255);
        UnicodeCommentExtraField unicodeCommentExtraField = ((UnicodeCommentExtraField) createInstance("org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField"));
        extraFields.put(zipShort, unicodeCommentExtraField);
        setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
        byte[] extra = {(byte) 0};
        zipArchiveEntry.setExtra(extra);
        ZipShort zipShort1 = new ZipShort(-255);
        
        byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        zipArchiveEntry.removeExtraField(zipShort1);
        
        byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
    }
    ///endregion
    
    ///region Errors report for removeExtraField
    
    public void testRemoveExtraField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField
    
    ///region Errors report for getExtraField
    
    public void testGetExtraField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform
    
    ///region Errors report for setPlatform
    
    public void testSetPlatform_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUnixMode(int)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setUnixMode(int)}
 * @utbot.executesCondition {@code (isDirectory()): False}
 *  */
    @Test
    public void testSetUnixMode_NotIsDirectory() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        zipArchiveEntry.setExternalAttributes(0L);
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        zipArchiveEntry.setUnixMode(-255);
        
        int finalZipArchiveEntryPlatform = ((Integer) getFieldValue(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "platform"));
        long finalZipArchiveEntryExternalAttributes = ((Long) getFieldValue(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "externalAttributes"));
        
        assertEquals(3, finalZipArchiveEntryPlatform);
        
        assertEquals(-16711679L, finalZipArchiveEntryExternalAttributes);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setUnixMode(int)}
 * @utbot.executesCondition {@code (isDirectory()): True}
 *  */
    @Test
    public void testSetUnixMode_IsDirectory() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        zipArchiveEntry.setExternalAttributes(0L);
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        zipArchiveEntry.setUnixMode(-255);
        
        int finalZipArchiveEntryPlatform = ((Integer) getFieldValue(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "platform"));
        long finalZipArchiveEntryExternalAttributes = ((Long) getFieldValue(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "externalAttributes"));
        
        assertEquals(3, finalZipArchiveEntryPlatform);
        
        assertEquals(-16711663L, finalZipArchiveEntryExternalAttributes);
    }
    ///endregion
    
    ///region Errors report for setUnixMode
    
    public void testSetUnixMode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawName
    
    ///region Errors report for getRawName
    
    public void testGetRawName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode
    
    ///region Errors report for getUnixMode
    
    public void testGetUnixMode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields
    
    ///region Errors report for getExtraFields
    
    public void testGetExtraFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields
    
    ///region Errors report for getExtraFields
    
    public void testGetExtraFields_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields
    
    ///region Errors report for setExtraFields
    
    public void testSetExtraFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 73 occurrences of:
        // Concrete execution failed
        
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields
    
    ///region Errors report for mergeExtraFields
    
    public void testMergeExtraFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 71 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalFileDataExtra()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getLocalFileDataExtra()}
 * @utbot.executesCondition {@code (extra != null): True}
 * @utbot.returnsFrom {@code return extra != null ? extra : new byte[0];}
 *  */
    @Test
    public void testGetLocalFileDataExtra_ExtraNotEqualsNull() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        byte[] extra = {(byte) 0};
        zipArchiveEntry.setExtra(extra);
        
        byte[] actual = zipArchiveEntry.getLocalFileDataExtra();
        
        assertArrayEquals(extra, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getLocalFileDataExtra()}
 * @utbot.executesCondition {@code (extra != null): False}
 * @utbot.returnsFrom {@code return extra != null ? extra : new byte[0];}
 *  */
    @Test
    public void testGetLocalFileDataExtra_ExtraEqualsNull() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        
        byte[] actual = zipArchiveEntry.getLocalFileDataExtra();
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra
    
    ///region Errors report for getCentralDirectoryExtra
    
    public void testGetCentralDirectoryExtra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCentralDirectoryExtra([B)
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#setCentralDirectoryExtra(byte[])}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ExtraFieldUtils#parse(byte[],boolean,org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField)}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.ZipArchiveEntry#mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[],boolean)
 *  */
    @Test
    public void testSetCentralDirectoryExtra_ZipArchiveEntryMergeExtraFields() throws Exception  {
        ExtraFieldUtils.UnparseableExtraField prevREAD = ExtraFieldUtils.UnparseableExtraField.READ;
        try {
            ExtraFieldUtils.UnparseableExtraField read = ((ExtraFieldUtils.UnparseableExtraField) createInstance("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField"));
            setField(read, "org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", "key", 2);
            Class unparseableExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField");
            setStaticField(unparseableExtraFieldClazz, "READ", read);
            ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
            LinkedHashMap extraFields = new LinkedHashMap();
            setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
            byte[] extra = {(byte) 0};
            zipArchiveEntry.setExtra(extra);
            byte[] byteArray = {};
            
            byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
            
            zipArchiveEntry.setCentralDirectoryExtra(byteArray);
            
            byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
            
            assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
        } finally {
            setStaticField(ExtraFieldUtils.UnparseableExtraField.class, "READ", prevREAD);
        }
    }
    ///endregion
    
    ///region Errors report for setCentralDirectoryExtra
    
    public void testSetCentralDirectoryExtra_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastModifiedDate()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getLastModifiedDate()}
 * @utbot.returnsFrom {@code return new Date(getTime());}
 *  */
    @Test
    public void testGetLastModifiedDate_Return() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", 0L);
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        Date actual = zipArchiveEntry.getLastModifiedDate();
        
        Date expected = new Date(0L);
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getLastModifiedDate()}
 * @utbot.returnsFrom {@code return new Date(getTime());}
 *  */
    @Test
    public void testGetLastModifiedDate_Return_1() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        Instant instant = ((Instant) createInstance("java.time.Instant"));
        setField(instant, "java.time.Instant", "seconds", 1351444864561595478L);
        setField(mtime, "java.nio.file.attribute.FileTime", "instant", instant);
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        Date actual = zipArchiveEntry.getLastModifiedDate();
        
        Date expected = new Date(java.lang.Long.MAX_VALUE);
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLastModifiedDate()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getLastModifiedDate()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#getTime()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return new Date(getTime());
 *  */
    @Test
    public void testGetLastModifiedDate_ThrowArithmeticException() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        FileTime mtime = ((FileTime) createInstance("java.nio.file.attribute.FileTime"));
        TimeUnit unit = TimeUnit.NANOSECONDS;
        setField(mtime, "java.nio.file.attribute.FileTime", "unit", unit);
        setField(mtime, "java.nio.file.attribute.FileTime", "value", 0L);
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "mtime", mtime);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate] produces [java.lang.ArithmeticException: / by zero] */
        zipArchiveEntry.getLastModifiedDate();
    }
    ///endregion
    
    ///region Errors report for getLastModifiedDate
    
    public void testGetLastModifiedDate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private final java.lang.String java.time.temporal.ChronoUnit.name accessible: module
        java.base does not "opens java.time.temporal" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableExtraFieldData
    
    ///region Errors report for getUnparseableExtraFieldData
    
    public void testGetUnparseableExtraFieldData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getGeneralPurposeBit
    
    ///region Errors report for getGeneralPurposeBit
    
    public void testGetGeneralPurposeBit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeUnparseableExtraFieldData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeUnparseableExtraFieldData()
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#removeUnparseableExtraFieldData()}
 *  */
    @Test
    public void testRemoveUnparseableExtraFieldData() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        LinkedHashMap extraFields = new LinkedHashMap();
        setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "extraFields", extraFields);
        UnparseableExtraFieldData unparseableExtra = ((UnparseableExtraFieldData) createInstance("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "unparseableExtra", unparseableExtra);
        byte[] extra = {(byte) 0};
        zipArchiveEntry.setExtra(extra);
        
        byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        zipArchiveEntry.removeUnparseableExtraFieldData();
        
        UnparseableExtraFieldData finalZipArchiveEntryUnparseableExtra = ((UnparseableExtraFieldData) getFieldValue(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "unparseableExtra"));
        byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
        
        assertNull(finalZipArchiveEntryUnparseableExtra);
    }
    
    /**
    @utbot.classUnderTest {@link ZipArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.ZipArchiveEntry#removeUnparseableExtraFieldData()}
 *  */
    @Test
    public void testRemoveUnparseableExtraFieldData_1() throws Exception  {
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        UnparseableExtraFieldData unparseableExtra = ((UnparseableExtraFieldData) createInstance("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        setField(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "unparseableExtra", unparseableExtra);
        
        byte[] initialZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        zipArchiveEntry.removeUnparseableExtraFieldData();
        
        UnparseableExtraFieldData finalZipArchiveEntryUnparseableExtra = ((UnparseableExtraFieldData) getFieldValue(zipArchiveEntry, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "unparseableExtra"));
        byte[] finalZipArchiveEntryExtra = ((byte[]) getFieldValue(zipArchiveEntry, "java.util.zip.ZipEntry", "extra"));
        
        assertFalse(initialZipArchiveEntryExtra == finalZipArchiveEntryExtra);
        
        assertNull(finalZipArchiveEntryUnparseableExtra);
    }
    ///endregion
    
    ///region Errors report for removeUnparseableExtraFieldData
    
    public void testRemoveUnparseableExtraFieldData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setGeneralPurposeBit
    
    ///region Errors report for setGeneralPurposeBit
    
    public void testSetGeneralPurposeBit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes
    
    ///region Errors report for getInternalAttributes
    
    public void testGetInternalAttributes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes
    
    ///region Errors report for setInternalAttributes
    
    public void testSetInternalAttributes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField
    
    ///region Errors report for addAsFirstExtraField
    
    public void testAddAsFirstExtraField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 23 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes
    
    ///region Errors report for getExternalAttributes
    
    public void testGetExternalAttributes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes
    
    ///region Errors report for setExternalAttributes
    
    public void testSetExternalAttributes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields970648447758800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields970648447758800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass970648447763600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970648447758800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970648447763600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields970648448112700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields970648448112700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass970648448114400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970648448112700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970648448114400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields970648449258300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields970648449258300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass970648449259400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields970648449258300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass970648449259400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

