package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Ignore;
import java.io.File;
import java.util.Date;
import sun.util.calendar.LocalGregorianCalendar;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_compress_archivers_tar_TarArchiveEntryTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetName_ReturnName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        String actual = tarArchiveEntry.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getName().equals(it.getName());}
 *  */
    @Test
    public void testEquals_StringEquals() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = " ";
        tarArchiveEntry.setName(name);
        TarArchiveEntry tarArchiveEntry1 = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        boolean actual = tarArchiveEntry.equals(tarArchiveEntry1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getName().equals(it.getName());
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(TarArchiveEntry.java:379) */
        tarArchiveEntry.equals(((TarArchiveEntry) null));
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getName().equals(it.getName());
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(TarArchiveEntry.java:379) */
        tarArchiveEntry.equals(tarArchiveEntry);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (it == null): False}
 * @utbot.executesCondition {@code (getClass() != it.getClass()): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsItGetClass() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {};
        
        boolean actual = tarArchiveEntry.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (it == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_ItEqualsNull() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        boolean actual = tarArchiveEntry.equals(((Object) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#hashCode()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return getName().hashCode();}
 *  */
    @Test
    public void testHashCode_StringHashCode() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = " ";
        tarArchiveEntry.setName(name);
        
        int actual = tarArchiveEntry.hashCode();
        
        assertEquals(32, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#hashCode()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getName().hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode(TarArchiveEntry.java:404) */
        tarArchiveEntry.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName
    
    ///region OTHER: SECURITY for method setName(java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSetName1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "os.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(TarArchiveEntry.java:1174)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(TarArchiveEntry.java:435) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getSize()}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testGetSize_ReturnSize() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setSize(1L);
        
        long actual = tarArchiveEntry.getSize();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFile()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getFile()}
 * @utbot.returnsFrom {@code return file;}
 *  */
    @Test
    public void testGetFile_ReturnFile() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        File actual = tarArchiveEntry.getFile();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDirectory()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isDirectory()}
 * @utbot.executesCondition {@code (file != null): False}
 * @utbot.executesCondition {@code (linkFlag == LF_DIR): True}
 *  */
    @Test
    public void testIsDirectory_LinkFlagEqualsLF_DIR() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 53);
        
        boolean actual = tarArchiveEntry.isDirectory();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDirectory()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isDirectory()}
 * @utbot.executesCondition {@code (file != null): False}
 * @utbot.executesCondition {@code (linkFlag == LF_DIR): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getName().endsWith("/")
 *  */
    @Test
    public void testIsDirectory_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:859) */
        tarArchiveEntry.isDirectory();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isDirectory()
    
    @Test
    public void testIsDirectory1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        
        boolean actual = tarArchiveEntry.isDirectory();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isDirectory()
    
    @Test
    public void testIsDirectory2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:852) */
        tarArchiveEntry.isDirectory();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFile()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isFile()}
 * @utbot.executesCondition {@code (linkFlag == LF_OLDNORM): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsFile_LinkFlagEqualsLF_OLDNORM() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 0);
        
        boolean actual = tarArchiveEntry.isFile();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isFile()}
 * @utbot.executesCondition {@code (linkFlag == LF_OLDNORM): False}
 * @utbot.executesCondition {@code (linkFlag == LF_NORMAL): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsFile_LinkFlagEqualsLF_NORMAL() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 48);
        
        boolean actual = tarArchiveEntry.isFile();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFile()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isFile()}
 * @utbot.executesCondition {@code (file != null): False}
 * @utbot.executesCondition {@code (linkFlag == LF_OLDNORM): False}
 * @utbot.executesCondition {@code (linkFlag == LF_NORMAL): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !getName().endsWith("/");
 *  */
    @Test
    public void testIsFile_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile(TarArchiveEntry.java:879) */
        tarArchiveEntry.isFile();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isFile()
    
    @Test
    public void testIsFile1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", java.lang.Byte.MIN_VALUE);
        
        boolean actual = tarArchiveEntry.isFile();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isFile()
    
    @Test
    public void testIsFile2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isFile(File.java:893)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile(TarArchiveEntry.java:874) */
        tarArchiveEntry.isFile();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNames(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setNames(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setUserName(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setGroupName(java.lang.String)}
 *  */
    @Test
    public void testSetNames_TarArchiveEntrySetGroupName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setNames(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSymbolicLink()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSymbolicLink()}
 * @utbot.returnsFrom {@code return linkFlag == LF_SYMLINK;}
 *  */
    @Test
    public void testIsSymbolicLink_LinkFlagNotEqualsLF_SYMLINK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isSymbolicLink();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSymbolicLink()}
 * @utbot.returnsFrom {@code return linkFlag == LF_SYMLINK;}
 *  */
    @Test
    public void testIsSymbolicLink_LinkFlagEqualsLF_SYMLINK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 50);
        
        boolean actual = tarArchiveEntry.isSymbolicLink();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSize(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setSize(long)}
 * @utbot.executesCondition {@code (size < 0): False}
 *  */
    @Test
    public void testSetSize_SizeGreaterOrEqualZero() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setSize(-255L);
        
        tarArchiveEntry.setSize(0L);
        
        long finalTarArchiveEntrySize = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "size"));
        
        assertEquals(0L, finalTarArchiveEntrySize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSize(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setSize(long)}
 * @utbot.executesCondition {@code (size < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: size < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_ThrowIllegalArgumentException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setSize(-255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUserName()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getUserName()}
 * @utbot.returnsFrom {@code return userName;}
 *  */
    @Test
    public void testGetUserName_ReturnUserName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        String actual = tarArchiveEntry.getUserName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGroupName()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getGroupName()}
 * @utbot.returnsFrom {@code return groupName;}
 *  */
    @Test
    public void testGetGroupName_ReturnGroupName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        String actual = tarArchiveEntry.getGroupName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGroupName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setGroupName(java.lang.String)}
 *  */
    @Test
    public void testSetGroupName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setGroupName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExtended()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isExtended()}
 * @utbot.returnsFrom {@code return isExtended;}
 *  */
    @Test
    public void testIsExtended_ReturnIsExtended() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        boolean actual = tarArchiveEntry.isExtended();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUserId()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getUserId()}
 * @utbot.returnsFrom {@code return (int) (userId & 0xffffffff);}
 *  */
    @Test
    public void testGetUserId_ReturnUserId0xffffffff() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(1L);
        
        int actual = tarArchiveEntry.getUserId();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.returnsFrom {@code return desc.getName().startsWith(getName());}
 *  */
    @Test
    public void testIsDescendent_StringStartsWith() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "  ";
        tarArchiveEntry.setName(name);
        TarArchiveEntry tarArchiveEntry1 = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name1 = " ";
        tarArchiveEntry1.setName(name1);
        
        boolean actual = tarArchiveEntry.isDescendent(tarArchiveEntry1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return desc.getName().startsWith(getName());
 *  */
    @Test
    public void testIsDescendent_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(TarArchiveEntry.java:416) */
        tarArchiveEntry.isDescendent(null);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return desc.getName().startsWith(getName());
 *  */
    @Test
    public void testIsDescendent_ThrowNullPointerException_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(TarArchiveEntry.java:416) */
        tarArchiveEntry.isDescendent(tarArchiveEntry);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMode(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setMode(int)}
 *  */
    @Test
    public void testSetMode() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setMode(-255);
        
        tarArchiveEntry.setMode(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGroupId()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getGroupId()}
 * @utbot.returnsFrom {@code return (int) (groupId & 0xffffffff);}
 *  */
    @Test
    public void testGetGroupId_ReturnGroupId0xffffffff() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(1L);
        
        int actual = tarArchiveEntry.getGroupId();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMinor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDevMinor()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMinor()}
 * @utbot.returnsFrom {@code return devMinor;}
 *  */
    @Test
    public void testGetDevMinor_ReturnDevMinor() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setDevMinor(-255);
        
        int actual = tarArchiveEntry.getDevMinor();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGroupId(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setGroupId(long)}
 *  */
    @Test
    public void testSetGroupId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(-255L);
        
        tarArchiveEntry.setGroupId(1L);
        
        long finalTarArchiveEntryGroupId = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "groupId"));
        
        assertEquals(1L, finalTarArchiveEntryGroupId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGroupId(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setGroupId(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setGroupId(long)}
 *  */
    @Test
    public void testSetGroupId_TarArchiveEntrySetGroupId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(-255L);
        
        tarArchiveEntry.setGroupId(1);
        
        long finalTarArchiveEntryGroupId = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "groupId"));
        
        assertEquals(1L, finalTarArchiveEntryGroupId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCheckSumOK
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCheckSumOK()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isCheckSumOK()}
 * @utbot.returnsFrom {@code return checkSumOK;}
 *  */
    @Test
    public void testIsCheckSumOK_ReturnCheckSumOK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        boolean actual = tarArchiveEntry.isCheckSumOK();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUserId(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setUserId(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setUserId(long)}
 *  */
    @Test
    public void testSetUserId_TarArchiveEntrySetUserId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(-255L);
        
        tarArchiveEntry.setUserId(1);
        
        long finalTarArchiveEntryUserId = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "userId"));
        
        assertEquals(1L, finalTarArchiveEntryUserId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUserId(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setUserId(long)}
 *  */
    @Test
    public void testSetUserId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(-255L);
        
        tarArchiveEntry.setUserId(1L);
        
        long finalTarArchiveEntryUserId = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "userId"));
        
        assertEquals(1L, finalTarArchiveEntryUserId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMode()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getMode()}
 * @utbot.returnsFrom {@code return mode;}
 *  */
    @Test
    public void testGetMode_ReturnMode() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setMode(-255);
        
        int actual = tarArchiveEntry.getMode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNUSparse()}
 * @utbot.returnsFrom {@code return isOldGNUSparse() || isPaxGNUSparse();}
 *  */
    @Test
    public void testIsGNUSparse_IsOldGNUSparseOrIsPaxGNUSparse() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 83);
        
        boolean actual = tarArchiveEntry.isGNUSparse();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNUSparse()}
 * @utbot.returnsFrom {@code return isOldGNUSparse() || isPaxGNUSparse();}
 *  */
    @Test
    public void testIsGNUSparse_IsOldGNUSparseOrIsPaxGNUSparse_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isGNUSparse();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNUSparse()}
 * @utbot.returnsFrom {@code return isOldGNUSparse() || isPaxGNUSparse();}
 *  */
    @Test
    public void testIsGNUSparse_IsOldGNUSparseOrIsPaxGNUSparse_2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "paxGNUSparse", true);
        
        boolean actual = tarArchiveEntry.isGNUSparse();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMinor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDevMinor(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setDevMinor(int)}
 * @utbot.executesCondition {@code (devNo < 0): False}
 *  */
    @Test
    public void testSetDevMinor_DevNoGreaterOrEqualZero() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setDevMinor(-255);
        
        tarArchiveEntry.setDevMinor(0);
        
        int finalTarArchiveEntryDevMinor = ((Integer) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "devMinor"));
        
        assertEquals(0, finalTarArchiveEntryDevMinor);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDevMinor(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setDevMinor(int)}
 * @utbot.executesCondition {@code (devNo < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: devNo < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMinor_ThrowIllegalArgumentException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setDevMinor(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRealSize()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getRealSize()}
 * @utbot.returnsFrom {@code return realSize;}
 *  */
    @Test
    public void testGetRealSize_ReturnRealSize() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "realSize", 1L);
        
        long actual = tarArchiveEntry.getRealSize();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isOldGNUSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOldGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isOldGNUSparse()}
 * @utbot.returnsFrom {@code return linkFlag == LF_GNUTYPE_SPARSE;}
 *  */
    @Test
    public void testIsOldGNUSparse_LinkFlagNotEqualsLF_GNUTYPE_SPARSE() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isOldGNUSparse();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isOldGNUSparse()}
 * @utbot.returnsFrom {@code return linkFlag == LF_GNUTYPE_SPARSE;}
 *  */
    @Test
    public void testIsOldGNUSparse_LinkFlagEqualsLF_GNUTYPE_SPARSE() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 83);
        
        boolean actual = tarArchiveEntry.isOldGNUSparse();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongGroupId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongGroupId()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getLongGroupId()}
 * @utbot.returnsFrom {@code return groupId;}
 *  */
    @Test
    public void testGetLongGroupId_ReturnGroupId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setGroupId(1L);
        
        long actual = tarArchiveEntry.getLongGroupId();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIds(int, int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setIds(int,int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setUserId(int)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setGroupId(int)}
 *  */
    @Test
    public void testSetIds_TarArchiveEntrySetGroupId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(-255L);
        tarArchiveEntry.setGroupId(-255L);
        
        tarArchiveEntry.setIds(-255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMajor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDevMajor(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setDevMajor(int)}
 * @utbot.executesCondition {@code (devNo < 0): False}
 *  */
    @Test
    public void testSetDevMajor_DevNoGreaterOrEqualZero() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setDevMajor(-255);
        
        tarArchiveEntry.setDevMajor(0);
        
        int finalTarArchiveEntryDevMajor = ((Integer) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "devMajor"));
        
        assertEquals(0, finalTarArchiveEntryDevMajor);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDevMajor(int)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setDevMajor(int)}
 * @utbot.executesCondition {@code (devNo < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: devNo < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMajor_ThrowIllegalArgumentException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setDevMajor(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModTime()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getModTime()}
 * @utbot.returnsFrom {@code return new Date(modTime * MILLIS_PER_SECOND);}
 *  */
    @Test
    public void testGetModTime_Return() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(-255L);
        
        Date actual = tarArchiveEntry.getModTime();
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMajor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDevMajor()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getDevMajor()}
 * @utbot.returnsFrom {@code return devMajor;}
 *  */
    @Test
    public void testGetDevMajor_ReturnDevMajor() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setDevMajor(-255);
        
        int actual = tarArchiveEntry.getDevMajor();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUserName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setUserName(java.lang.String)}
 *  */
    @Test
    public void testSetUserName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setUserName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLinkName()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getLinkName()}
 * @utbot.returnsFrom {@code return linkName;}
 *  */
    @Test
    public void testGetLinkName_ReturnLinkName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        String actual = tarArchiveEntry.getLinkName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLinkName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setLinkName(java.lang.String)}
 *  */
    @Test
    public void testSetLinkName() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        tarArchiveEntry.setLinkName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongUserId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongUserId()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getLongUserId()}
 * @utbot.returnsFrom {@code return userId;}
 *  */
    @Test
    public void testGetLongUserId_ReturnUserId() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setUserId(1L);
        
        long actual = tarArchiveEntry.getLongUserId();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setModTime(long)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setModTime(long)}
 *  */
    @Test
    public void testSetModTime() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(-255L);
        
        tarArchiveEntry.setModTime(1L);
        
        long finalTarArchiveEntryModTime = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "modTime"));
        
        assertEquals(0L, finalTarArchiveEntryModTime);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setModTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setModTime(java.util.Date)}
 *  */
    @Test
    public void testSetModTime1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(-255L);
        Date date = new Date(-255L);
        
        tarArchiveEntry.setModTime(date);
        
        long finalTarArchiveEntryModTime = ((Long) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "modTime"));
        
        assertEquals(0L, finalTarArchiveEntryModTime);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setModTime(java.util.Date)}
 *  */
    @Test
    public void testSetModTime_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(0L);
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        
        tarArchiveEntry.setModTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setModTime(java.util.Date)}
 *  */
    @Test
    public void testSetModTime_2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(0L);
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date1 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date1, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        tarArchiveEntry.setModTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setModTime(java.util.Date)}
 *  */
    @Test
    public void testSetModTime_3() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(0L);
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date2 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date2, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        tarArchiveEntry.setModTime(date);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setModTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#setModTime(java.util.Date)}
 * @utbot.invokes {@link java.util.Date#getTime()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: modTime = time.getTime() / MILLIS_PER_SECOND;
 *  */
    @Test
    public void testSetModTime_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(TarArchiveEntry.java:623) */
        tarArchiveEntry.setModTime(((Date) null));
    }
    ///endregion
    
    ///region Errors report for setModTime
    
    public void testSetModTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName
    
    ///region OTHER: SECURITY for method normalizeFileName(java.lang.String, boolean)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testNormalizeFileName1() {
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "os.name" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(TarArchiveEntry.java:1174) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSparse()}
 * @utbot.returnsFrom {@code return isGNUSparse() || isStarSparse();}
 *  */
    @Test
    public void testIsSparse_IsGNUSparseOrIsStarSparse() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 83);
        
        boolean actual = tarArchiveEntry.isSparse();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSparse()}
 * @utbot.returnsFrom {@code return isGNUSparse() || isStarSparse();}
 *  */
    @Test
    public void testIsSparse_IsGNUSparseOrIsStarSparse_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "paxGNUSparse", true);
        
        boolean actual = tarArchiveEntry.isSparse();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSparse()}
 * @utbot.returnsFrom {@code return isGNUSparse() || isStarSparse();}
 *  */
    @Test
    public void testIsSparse_IsGNUSparseOrIsStarSparse_2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "starSparse", true);
        
        boolean actual = tarArchiveEntry.isSparse();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isSparse()}
 * @utbot.returnsFrom {@code return isGNUSparse() || isStarSparse();}
 *  */
    @Test
    public void testIsSparse_IsGNUSparseOrIsStarSparse_3() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isSparse();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeEntryHeader([B, org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testWriteEntryHeader1() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Object fallbackZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        String charsetName = "";
        setField(fallbackZipEncoding, "org.apache.commons.compress.archivers.zip.FallbackZipEncoding", "charsetName", charsetName);
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class byteArrayType = Class.forName("[B");
        Class fallbackZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Class booleanType = boolean.class;
        Method writeEntryHeaderMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeader", byteArrayType, fallbackZipEncodingType, booleanType);
        writeEntryHeaderMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderMethodArguments = new java.lang.Object[3];
        writeEntryHeaderMethodArguments[0] = ((Object) byteArray);
        writeEntryHeaderMethodArguments[1] = fallbackZipEncoding;
        writeEntryHeaderMethodArguments[2] = false;
        try {
            writeEntryHeaderMethod.invoke(tarArchiveEntry, writeEntryHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeEntryHeader([B, org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)
    
    @Test
    public void testWriteEntryHeader2() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        String name = "";
        tarArchiveEntry.setName(name);
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Object fallbackZipEncoding = createInstance("org.apache.commons.compress.archivers.zip.FallbackZipEncoding");
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(TarUtils.java:368)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(TarArchiveEntry.java:1001) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class byteArrayType = Class.forName("[B");
        Class fallbackZipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Class booleanType = boolean.class;
        Method writeEntryHeaderMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeader", byteArrayType, fallbackZipEncodingType, booleanType);
        writeEntryHeaderMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderMethodArguments = new java.lang.Object[3];
        writeEntryHeaderMethodArguments[0] = ((Object) byteArray);
        writeEntryHeaderMethodArguments[1] = fallbackZipEncoding;
        writeEntryHeaderMethodArguments[2] = false;
        try {
            writeEntryHeaderMethod.invoke(tarArchiveEntry, writeEntryHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPaxHeader()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isPaxHeader()}
 * @utbot.returnsFrom {@code return linkFlag == LF_PAX_EXTENDED_HEADER_LC || linkFlag == LF_PAX_EXTENDED_HEADER_UC;}
 *  */
    @Test
    public void testIsPaxHeader_LinkFlagEqualsLF_PAX_EXTENDED_HEADER_LCOrLinkFlagEqualsLF_PAX_EXTENDED_HEADER_UC() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 120);
        
        boolean actual = tarArchiveEntry.isPaxHeader();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isPaxHeader()}
 * @utbot.returnsFrom {@code return linkFlag == LF_PAX_EXTENDED_HEADER_LC || linkFlag == LF_PAX_EXTENDED_HEADER_UC;}
 *  */
    @Test
    public void testIsPaxHeader_LinkFlagEqualsLF_PAX_EXTENDED_HEADER_LCOrLinkFlagEqualsLF_PAX_EXTENDED_HEADER_UC_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 88);
        
        boolean actual = tarArchiveEntry.isPaxHeader();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isPaxHeader()}
 * @utbot.returnsFrom {@code return linkFlag == LF_PAX_EXTENDED_HEADER_LC || linkFlag == LF_PAX_EXTENDED_HEADER_UC;}
 *  */
    @Test
    public void testIsPaxHeader_LinkFlagNotEqualsLF_PAX_EXTENDED_HEADER_LCOrLinkFlagNotEqualsLF_PAX_EXTENDED_HEADER_UC() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isPaxHeader();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCharacterDevice()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isCharacterDevice()}
 * @utbot.returnsFrom {@code return linkFlag == LF_CHR;}
 *  */
    @Test
    public void testIsCharacterDevice_LinkFlagNotEqualsLF_CHR() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isCharacterDevice();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isCharacterDevice()}
 * @utbot.returnsFrom {@code return linkFlag == LF_CHR;}
 *  */
    @Test
    public void testIsCharacterDevice_LinkFlagEqualsLF_CHR() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 51);
        
        boolean actual = tarArchiveEntry.isCharacterDevice();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFIFO()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isFIFO()}
 * @utbot.returnsFrom {@code return linkFlag == LF_FIFO;}
 *  */
    @Test
    public void testIsFIFO_LinkFlagNotEqualsLF_FIFO() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isFIFO();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isFIFO()}
 * @utbot.returnsFrom {@code return linkFlag == LF_FIFO;}
 *  */
    @Test
    public void testIsFIFO_LinkFlagEqualsLF_FIFO() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 54);
        
        boolean actual = tarArchiveEntry.isFIFO();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGlobalPaxHeader()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGlobalPaxHeader()}
 * @utbot.returnsFrom {@code return linkFlag == LF_PAX_GLOBAL_EXTENDED_HEADER;}
 *  */
    @Test
    public void testIsGlobalPaxHeader_LinkFlagNotEqualsLF_PAX_GLOBAL_EXTENDED_HEADER() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isGlobalPaxHeader();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGlobalPaxHeader()}
 * @utbot.returnsFrom {@code return linkFlag == LF_PAX_GLOBAL_EXTENDED_HEADER;}
 *  */
    @Test
    public void testIsGlobalPaxHeader_LinkFlagEqualsLF_PAX_GLOBAL_EXTENDED_HEADER() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 103);
        
        boolean actual = tarArchiveEntry.isGlobalPaxHeader();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBlockDevice()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isBlockDevice()}
 * @utbot.returnsFrom {@code return linkFlag == LF_BLK;}
 *  */
    @Test
    public void testIsBlockDevice_LinkFlagNotEqualsLF_BLK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isBlockDevice();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isBlockDevice()}
 * @utbot.returnsFrom {@code return linkFlag == LF_BLK;}
 *  */
    @Test
    public void testIsBlockDevice_LinkFlagEqualsLF_BLK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 52);
        
        boolean actual = tarArchiveEntry.isBlockDevice();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType
    
    ///region OTHER: ERROR SUITE for method evaluateType([B)
    
    @Test
    public void testEvaluateType1() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:154)
            org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(ArchiveUtils.java:77)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(TarArchiveEntry.java:1218) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class byteArrayType = Class.forName("[B");
        Method evaluateTypeMethod = tarArchiveEntryClazz.getDeclaredMethod("evaluateType", byteArrayType);
        evaluateTypeMethod.setAccessible(true);
        java.lang.Object[] evaluateTypeMethodArguments = new java.lang.Object[1];
        evaluateTypeMethodArguments[0] = ((Object) null);
        try {
            evaluateTypeMethod.invoke(tarArchiveEntry, evaluateTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillStarSparseData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fillStarSparseData(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#fillStarSparseData(java.util.Map)}
 * @utbot.executesCondition {@code (headers.containsKey("SCHILY.realsize")): False}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 *  */
    @Test
    public void testFillStarSparseData_NotHeadersContainsKey() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        tarArchiveEntry.fillStarSparseData(linkedHashMap);
        
        boolean finalTarArchiveEntryStarSparse = ((Boolean) getFieldValue(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "starSparse"));
        
        assertTrue(finalTarArchiveEntryStarSparse);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fillStarSparseData(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#fillStarSparseData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: headers.containsKey("SCHILY.realsize")
 *  */
    @Test
    public void testFillStarSparseData_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillStarSparseData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillStarSparseData(TarArchiveEntry.java:1248) */
        tarArchiveEntry.fillStarSparseData(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGNULongNameEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNULongNameEntry()}
 * @utbot.returnsFrom {@code return linkFlag == LF_GNUTYPE_LONGNAME;}
 *  */
    @Test
    public void testIsGNULongNameEntry_LinkFlagNotEqualsLF_GNUTYPE_LONGNAME() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isGNULongNameEntry();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNULongNameEntry()}
 * @utbot.returnsFrom {@code return linkFlag == LF_GNUTYPE_LONGNAME;}
 *  */
    @Test
    public void testIsGNULongNameEntry_LinkFlagEqualsLF_GNUTYPE_LONGNAME() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 76);
        
        boolean actual = tarArchiveEntry.isGNULongNameEntry();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isStarSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isStarSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isStarSparse()}
 * @utbot.returnsFrom {@code return starSparse;}
 *  */
    @Test
    public void testIsStarSparse_ReturnStarSparse() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        boolean actual = tarArchiveEntry.isStarSparse();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseTarHeader([B, org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#parseTarHeader(byte[],org.apache.commons.compress.archivers.zip.ZipEncoding,boolean)}
 * @utbot.executesCondition {@code (oldStyle): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#parseName(byte[],int,int,org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: TarUtils.parseName(header, offset, NAMELEN, encoding)
 *  */
    @Test
    public void testParseTarHeader_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:295)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(TarArchiveEntry.java:1094) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class byteArrayType = Class.forName("[B");
        Class zipEncodingType = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Class booleanType = boolean.class;
        Method parseTarHeaderMethod = tarArchiveEntryClazz.getDeclaredMethod("parseTarHeader", byteArrayType, zipEncodingType, booleanType);
        parseTarHeaderMethod.setAccessible(true);
        java.lang.Object[] parseTarHeaderMethodArguments = new java.lang.Object[3];
        parseTarHeaderMethodArguments[0] = ((Object) byteArray);
        parseTarHeaderMethodArguments[1] = ((Object) null);
        parseTarHeaderMethodArguments[2] = false;
        try {
            parseTarHeaderMethod.invoke(tarArchiveEntry, parseTarHeaderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseTarHeader([B, org.apache.commons.compress.archivers.zip.ZipEncoding)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#parseTarHeader(byte[],org.apache.commons.compress.archivers.zip.ZipEncoding)}
 * @utbot.invokes org.apache.commons.compress.archivers.tar.TarArchiveEntry#parseTarHeader(byte[],org.apache.commons.compress.archivers.zip.ZipEncoding,boolean)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: parseTarHeader(header, encoding, false);
 *  */
    @Test
    public void testParseTarHeader_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.parseName(TarUtils.java:295)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(TarArchiveEntry.java:1094)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(TarArchiveEntry.java:1085) */
        tarArchiveEntry.parseTarHeader(byteArray, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongLinkEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGNULongLinkEntry()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNULongLinkEntry()}
 * @utbot.returnsFrom {@code return linkFlag == LF_GNUTYPE_LONGLINK;}
 *  */
    @Test
    public void testIsGNULongLinkEntry_LinkFlagNotEqualsLF_GNUTYPE_LONGLINK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isGNULongLinkEntry();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isGNULongLinkEntry()}
 * @utbot.returnsFrom {@code return linkFlag == LF_GNUTYPE_LONGLINK;}
 *  */
    @Test
    public void testIsGNULongLinkEntry_LinkFlagEqualsLF_GNUTYPE_LONGLINK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 75);
        
        boolean actual = tarArchiveEntry.isGNULongLinkEntry();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLink()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isLink()}
 * @utbot.returnsFrom {@code return linkFlag == LF_LINK;}
 *  */
    @Test
    public void testIsLink_LinkFlagNotEqualsLF_LINK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) -127);
        
        boolean actual = tarArchiveEntry.isLink();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isLink()}
 * @utbot.returnsFrom {@code return linkFlag == LF_LINK;}
 *  */
    @Test
    public void testIsLink_LinkFlagEqualsLF_LINK() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "linkFlag", (byte) 49);
        
        boolean actual = tarArchiveEntry.isLink();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxGNUSparse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPaxGNUSparse()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#isPaxGNUSparse()}
 * @utbot.returnsFrom {@code return paxGNUSparse;}
 *  */
    @Test
    public void testIsPaxGNUSparse_ReturnPaxGNUSparse() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        boolean actual = tarArchiveEntry.isPaxGNUSparse();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fillGNUSparse1xData(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#fillGNUSparse1xData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: realSize = Integer.parseInt(headers.get("GNU.sparse.realsize"));
 *  */
    @Test
    public void testFillGNUSparse1xData_ThrowNumberFormatException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData(TarArchiveEntry.java:1242) */
        tarArchiveEntry.fillGNUSparse1xData(linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#fillGNUSparse1xData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realSize = Integer.parseInt(headers.get("GNU.sparse.realsize"));
 *  */
    @Test
    public void testFillGNUSparse1xData_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData(TarArchiveEntry.java:1242) */
        tarArchiveEntry.fillGNUSparse1xData(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastModifiedDate()
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getLastModifiedDate()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#getModTime()}
 * @utbot.returnsFrom {@code return getModTime();}
 *  */
    @Test
    public void testGetLastModifiedDate_TarArchiveEntryGetModTime() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        tarArchiveEntry.setModTime(-255L);
        
        Date actual = tarArchiveEntry.getLastModifiedDate();
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEntryHeaderField(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.returnsFrom {@code return TarUtils.formatLongOctalBytes(0, outbuf, offset, length);}
 *  */
    @Test
    public void testWriteEntryHeaderField_ValueLessThanZero() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -255L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 2;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.returnsFrom {@code return TarUtils.formatLongOctalBytes(0, outbuf, offset, length);}
 *  */
    @Test
    public void testWriteEntryHeaderField_ValueLessThanZero_1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[14];
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
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -255L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 1;
        writeEntryHeaderFieldMethodArguments[3] = 3;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(4, actual);
        
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 32, finalByteArray3);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value >= 1l << 3 * (length - 1)): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.tar.TarUtils#formatLongOctalOrBinaryBytes(long,byte[],int,int)}
 * @utbot.returnsFrom {@code return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);}
 *  */
    @Test
    public void testWriteEntryHeaderField_ValueLessThan1lLeftShift3MultiplyLengthMinus1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 2;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) 49, finalByteArray0);
        
        assertEquals((byte) 32, finalByteArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEntryHeaderField(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalBytes(0, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1048) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -255L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 192;
        writeEntryHeaderFieldMethodArguments[3] = -62;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value >= 1l << 3 * (length - 1)): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalBytes(0, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 172 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1048) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 3L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 194;
        writeEntryHeaderFieldMethodArguments[3] = -20;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value >= 1l << 3 * (length - 1)): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalBytes(0, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1048) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 33L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 234;
        writeEntryHeaderFieldMethodArguments[3] = -232;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value >= 1l << 3 * (length - 1)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -483 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -230;
        writeEntryHeaderFieldMethodArguments[3] = -251;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value >= 1l << 3 * (length - 1)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -39;
        writeEntryHeaderFieldMethodArguments[3] = 41;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalBytes(0, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1048) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -255L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -127;
        writeEntryHeaderFieldMethodArguments[3] = 130;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -2;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 17179869185L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 10;
        writeEntryHeaderFieldMethodArguments[3] = 6;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): True}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value >= 1l << 3 * (length - 1)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -7;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -3L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -7;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowNullPointerException() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -37193559048192L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = 169;
        writeEntryHeaderFieldMethodArguments[3] = 7;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (!starMode): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test
    public void testWriteEntryHeaderField_ThrowNullPointerException_1() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -16L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = -255;
        writeEntryHeaderFieldMethodArguments[3] = 0;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeEntryHeaderField(long, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWriteEntryHeaderField_ThrowIllegalArgumentException() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 72057594037927936L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = -255;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#writeEntryHeaderField(long,byte[],int,int,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWriteEntryHeaderField_ThrowIllegalArgumentException_1() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = -255;
        writeEntryHeaderFieldMethodArguments[3] = 1;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeEntryHeaderField(long, [B, int, int, boolean)
    
    @Test
    public void testWriteEntryHeaderField1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[15];
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 6;
        writeEntryHeaderFieldMethodArguments[3] = 2;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(8, actual);
        
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    
    @Test
    public void testWriteEntryHeaderField2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[15];
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 2;
        writeEntryHeaderFieldMethodArguments[3] = 3;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(5, actual);
        
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 49, finalByteArray3);
        
        assertEquals((byte) 32, finalByteArray4);
    }
    
    @Test
    public void testWriteEntryHeaderField3() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[34];
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = java.lang.Long.MIN_VALUE;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 31;
        writeEntryHeaderFieldMethodArguments[3] = 1;
        writeEntryHeaderFieldMethodArguments[4] = true;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(32, actual);
        
        byte finalByteArray24 = byteArray[24];
        byte finalByteArray31 = byteArray[31];
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray24);
        
        assertEquals((byte) -1, finalByteArray31);
    }
    
    @Test
    public void testWriteEntryHeaderField4() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 4194305L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray0);
        
        assertEquals((byte) 64, finalByteArray5);
        
        assertEquals((byte) 1, finalByteArray7);
    }
    
    @Test
    public void testWriteEntryHeaderField5() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 48, finalByteArray4);
        
        assertEquals((byte) 48, finalByteArray5);
        
        assertEquals((byte) 48, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    
    @Test
    public void testWriteEntryHeaderField6() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 48, finalByteArray4);
        
        assertEquals((byte) 48, finalByteArray5);
        
        assertEquals((byte) 49, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    
    @Test
    public void testWriteEntryHeaderField7() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[11];
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 3;
        writeEntryHeaderFieldMethodArguments[4] = true;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(3, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 32, finalByteArray2);
    }
    
    @Test
    public void testWriteEntryHeaderField8() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 48, finalByteArray4);
        
        assertEquals((byte) 48, finalByteArray5);
        
        assertEquals((byte) 48, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    
    @Test
    public void testWriteEntryHeaderField9() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(8, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        byte finalByteArray5 = byteArray[5];
        byte finalByteArray6 = byteArray[6];
        byte finalByteArray7 = byteArray[7];
        
        assertEquals((byte) 48, finalByteArray0);
        
        assertEquals((byte) 48, finalByteArray1);
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 48, finalByteArray4);
        
        assertEquals((byte) 48, finalByteArray5);
        
        assertEquals((byte) 49, finalByteArray6);
        
        assertEquals((byte) 32, finalByteArray7);
    }
    
    @Test
    public void testWriteEntryHeaderField10() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[15];
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 65L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 2;
        writeEntryHeaderFieldMethodArguments[3] = 3;
        writeEntryHeaderFieldMethodArguments[4] = false;
        int actual = ((Integer) writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments));
        
        assertEquals(5, actual);
        
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        byte finalByteArray4 = byteArray[4];
        
        assertEquals((byte) 48, finalByteArray2);
        
        assertEquals((byte) 48, finalByteArray3);
        
        assertEquals((byte) 32, finalByteArray4);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeEntryHeaderField(long, [B, int, int, boolean)
    
    @Test
    public void testWriteEntryHeaderField11() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1048) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 8L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -2147483618;
        writeEntryHeaderFieldMethodArguments[3] = -2147483646;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField12() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[12];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -5 out of bounds for byte[12]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 8589934593L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 0;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField13() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[15];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 15]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -2147483642;
        writeEntryHeaderFieldMethodArguments[3] = -2147483646;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField14() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 41 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 43;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField15() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 30;
        writeEntryHeaderFieldMethodArguments[3] = 2;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField16() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1048) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -9223372036854775807L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 30;
        writeEntryHeaderFieldMethodArguments[3] = 2;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField17() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1073741824 out of bounds for byte[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -16L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 1073741824;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField18() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = java.lang.Long.MIN_VALUE;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -2147483647;
        writeEntryHeaderFieldMethodArguments[3] = Integer.MIN_VALUE;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField19() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -6;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField20() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[33];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741856 out of bounds for length 33]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 2097153L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 1073741849;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField21() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -8;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField22() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1073741824 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 144115196665790481L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 1073741824;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField23() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -2147483618;
        writeEntryHeaderFieldMethodArguments[3] = -2147483646;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField24() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:393)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 4L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = Integer.MIN_VALUE;
        writeEntryHeaderFieldMethodArguments[3] = -2147483647;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField25() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -2147483617;
        writeEntryHeaderFieldMethodArguments[3] = -2147483647;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField26() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = new byte[31];
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:452)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 30;
        writeEntryHeaderFieldMethodArguments[3] = 2;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField27() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:388)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 0;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField28() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(TarUtils.java:404)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(TarUtils.java:451)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:482)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 0L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = -6;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField29() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483645 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -16L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 2147483644;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField30() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 2594354860342116356L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 1073741867;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField31() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 140737505132561L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = 2147483641;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField32() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 4194305L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = -7;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField33() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(TarUtils.java:523)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:488)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -14L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = 2147483644;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWriteEntryHeaderField34() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(TarUtils.java:510)
            org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(TarUtils.java:486)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(TarArchiveEntry.java:1050) */
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -3L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 8;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeEntryHeaderField(long, [B, int, int, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWriteEntryHeaderField35() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = 2L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) byteArray);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 0;
        writeEntryHeaderFieldMethodArguments[4] = false;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWriteEntryHeaderField36() throws Throwable  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        Class tarArchiveEntryClazz = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class longType = long.class;
        Class byteArrayType = Class.forName("[B");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method writeEntryHeaderFieldMethod = tarArchiveEntryClazz.getDeclaredMethod("writeEntryHeaderField", longType, byteArrayType, intType, intType, booleanType);
        writeEntryHeaderFieldMethod.setAccessible(true);
        java.lang.Object[] writeEntryHeaderFieldMethodArguments = new java.lang.Object[5];
        writeEntryHeaderFieldMethodArguments[0] = -1L;
        writeEntryHeaderFieldMethodArguments[1] = ((Object) null);
        writeEntryHeaderFieldMethodArguments[2] = 0;
        writeEntryHeaderFieldMethodArguments[3] = 1;
        writeEntryHeaderFieldMethodArguments[4] = true;
        try {
            writeEntryHeaderFieldMethod.invoke(tarArchiveEntry, writeEntryHeaderFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fillGNUSparse0xData(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#fillGNUSparse0xData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: realSize = Integer.parseInt(headers.get("GNU.sparse.size"));
 *  */
    @Test
    public void testFillGNUSparse0xData_ThrowNumberFormatException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData(TarArchiveEntry.java:1233) */
        tarArchiveEntry.fillGNUSparse0xData(linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link TarArchiveEntry}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.tar.TarArchiveEntry#fillGNUSparse0xData(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: realSize = Integer.parseInt(headers.get("GNU.sparse.size"));
 *  */
    @Test
    public void testFillGNUSparse0xData_ThrowNullPointerException() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData(TarArchiveEntry.java:1233) */
        tarArchiveEntry.fillGNUSparse0xData(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDirectoryEntries()
    
    @Test
    public void testGetDirectoryEntries1() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] actual = tarArchiveEntry.getDirectoryEntries();
        
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDirectoryEntries()
    
    @Test
    public void testGetDirectoryEntries2() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        File file = ((File) createInstance("java.io.File"));
        setField(tarArchiveEntry, "org.apache.commons.compress.archivers.tar.TarArchiveEntry", "file", file);
        
        /* This test fails because method [org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.isDirectory(File.java:860)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries(TarArchiveEntry.java:949) */
        tarArchiveEntry.getDirectoryEntries();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields975988400037200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields975988400037200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass975988400041100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975988400037200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975988400041100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields975988400366100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields975988400366100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass975988400367500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields975988400366100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass975988400367500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

