package org.apache.commons.compress.changes;

import org.junit.Test;
import java.util.LinkedHashSet;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_changes_ChangeSetPerformerTest {
    ///region Test suites for executable org.apache.commons.compress.changes.ChangeSetPerformer.perform
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method perform(org.apache.commons.compress.archivers.ArchiveInputStream, org.apache.commons.compress.archivers.ArchiveOutputStream)
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#perform(org.apache.commons.compress.archivers.ArchiveInputStream,org.apache.commons.compress.archivers.ArchiveOutputStream)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((entry = in.getNextEntry()) != null)
 *  */
    @Test
    public void testPerform_ThrowNullPointerException() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:84) */
        changeSetPerformer.perform(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method perform(org.apache.commons.compress.archivers.ArchiveInputStream, org.apache.commons.compress.archivers.ArchiveOutputStream)
    
    @Test
    public void testPerform1() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        Character character = '\u0000';
        changes.add(character);
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.compress.changes.Change (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.compress.changes.Change is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:74) */
        changeSetPerformer.perform(null, null);
    }
    
    @Test
    public void testPerform2() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        ZipArchiveInputStream zipArchiveInputStream = ((ZipArchiveInputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(ZipArchiveInputStream.java:341)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry(ZipArchiveInputStream.java:116)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry(ZipArchiveInputStream.java:187)
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:84) */
        changeSetPerformer.perform(zipArchiveInputStream, null);
    }
    
    @Test
    public void testPerform3() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        ArArchiveEntry currentEntry = ((ArArchiveEntry) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(currentEntry, "org.apache.commons.compress.archivers.ar.ArArchiveEntry", "length", -2L);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "currentEntry", currentEntry);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "entryOffset", 2L);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:165)
            java.base/java.io.InputStream.read(InputStream.java:218)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:79)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry(ArArchiveInputStream.java:144)
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:84) */
        changeSetPerformer.perform(arArchiveInputStream, null);
    }
    
    @Test
    public void testPerform4() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", -9223372036854775807L);
        ArArchiveEntry currentEntry = ((ArArchiveEntry) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(currentEntry, "org.apache.commons.compress.archivers.ar.ArArchiveEntry", "length", 0L);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "currentEntry", currentEntry);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "entryOffset", 0L);
        ZipArchiveOutputStream zipArchiveOutputStream = ((ZipArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:165)
            org.apache.commons.compress.archivers.ArchiveInputStream.read(ArchiveInputStream.java:79)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:66)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry(ArArchiveInputStream.java:144)
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:84) */
        changeSetPerformer.perform(arArchiveInputStream, zipArchiveOutputStream);
    }
    
    @Test
    public void testPerform5() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 0L);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:165)
            java.base/java.io.InputStream.read(InputStream.java:218)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:79)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry(ArArchiveInputStream.java:144)
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:84) */
        changeSetPerformer.perform(arArchiveInputStream, null);
    }
    
    @Test
    public void testPerform6() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        changes.add(null);
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        TarArchiveOutputStream tarArchiveOutputStream = ((TarArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:76) */
        changeSetPerformer.perform(null, tarArchiveOutputStream);
    }
    
    @Test
    public void testPerform7() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet changes = new LinkedHashSet();
        setField(changeSetPerformer, "org.apache.commons.compress.changes.ChangeSetPerformer", "changes", changes);
        ArArchiveInputStream arArchiveInputStream = ((ArArchiveInputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "offset", 1L);
        ArArchiveEntry currentEntry = ((ArArchiveEntry) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(currentEntry, "org.apache.commons.compress.archivers.ar.ArArchiveEntry", "length", 0L);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "currentEntry", currentEntry);
        setField(arArchiveInputStream, "org.apache.commons.compress.archivers.ar.ArArchiveInputStream", "entryOffset", 1L);
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.perform] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(ArArchiveInputStream.java:165)
            org.apache.commons.compress.archivers.ArchiveInputStream.read(ArchiveInputStream.java:79)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry(ArArchiveInputStream.java:91)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry(ArArchiveInputStream.java:144)
            org.apache.commons.compress.changes.ChangeSetPerformer.perform(ChangeSetPerformer.java:84) */
        changeSetPerformer.perform(arArchiveInputStream, arArchiveOutputStream);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDeletedLater(java.util.Set, org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.ArchiveEntry#getName()}
 * @utbot.invokes {@link java.util.Set#isEmpty()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDeletedLater_SetIsEmpty() throws Exception  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        boolean actual = ((Boolean) isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDeletedLater(java.util.Set, org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Change change = (Change) it.next();
 *  */
    @Test
    public void testIsDeletedLater_ThrowClassCastException() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.changes.Change] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Change change = (Change) it.next();
 *  */
    @Test
    public void testIsDeletedLater_ThrowClassCastException_1() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        Integer integer = 0;
        linkedHashSet.add(integer);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.changes.Change] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Change change = (Change) it.next();
 *  */
    @Test
    public void testIsDeletedLater_ThrowClassCastException_2() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        linkedHashSet.add(null);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.changes.Change] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Change change = (Change) it.next();
 *  */
    @Test
    public void testIsDeletedLater_ThrowClassCastException_3() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0001';
        linkedHashSet.add(character);
        Character character1 = '\u0000';
        linkedHashSet.add(character1);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.changes.Change] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Change change = (Change) it.next();
 *  */
    @Test
    public void testIsDeletedLater_ThrowClassCastException_4() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        Long long1 = 0L;
        linkedHashSet.add(long1);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.compress.changes.Change] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String source = entry.getName();
 *  */
    @Test
    public void testIsDeletedLater_ThrowNullPointerException() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.NullPointerException]
            org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater(ChangeSetPerformer.java:141) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class setType = Class.forName("java.util.Set");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", setType, archiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = ((Object) null);
        isDeletedLaterMethodArguments[1] = ((Object) null);
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !workingSet.isEmpty()
 *  */
    @Test
    public void testIsDeletedLater_ThrowNullPointerException_3() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.NullPointerException]
            org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater(ChangeSetPerformer.java:143) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class setType = Class.forName("java.util.Set");
        Class arArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", setType, arArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = ((Object) null);
        isDeletedLaterMethodArguments[1] = arArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !workingSet.isEmpty()
 *  */
    @Test
    public void testIsDeletedLater_ThrowNullPointerException_1() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        JarArchiveEntry jarArchiveEntry = ((JarArchiveEntry) createInstance("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        String name = "";
        setField(jarArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.NullPointerException] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class setType = Class.forName("java.util.Set");
        Class jarArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", setType, jarArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = ((Object) null);
        isDeletedLaterMethodArguments[1] = jarArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#isDeletedLater(java.util.Set,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int type = change.type();
 *  */
    @Test
    public void testIsDeletedLater_ThrowNullPointerException_2() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        ZipArchiveEntry zipArchiveEntry = ((ZipArchiveEntry) createInstance("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        String name = "";
        setField(zipArchiveEntry, "java.util.zip.ZipEntry", "name", name);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.NullPointerException] */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class zipArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, zipArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = zipArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isDeletedLater(java.util.Set, org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testIsDeletedLater1() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Character character = '\u0000';
        linkedHashSet.add(character);
        linkedHashSet.add(null);
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.compress.changes.Change (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.compress.changes.Change is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater(ChangeSetPerformer.java:145) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Class arArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method isDeletedLaterMethod = changeSetPerformerClazz.getDeclaredMethod("isDeletedLater", linkedHashSetType, arArchiveEntryType);
        isDeletedLaterMethod.setAccessible(true);
        java.lang.Object[] isDeletedLaterMethodArguments = new java.lang.Object[2];
        isDeletedLaterMethodArguments[0] = linkedHashSet;
        isDeletedLaterMethodArguments[1] = arArchiveEntry;
        try {
            isDeletedLaterMethod.invoke(changeSetPerformer, isDeletedLaterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for isDeletedLater
    
    public void testIsDeletedLater_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.changes.ChangeSetPerformer.copyStream
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyStream(java.io.InputStream, org.apache.commons.compress.archivers.ArchiveOutputStream, org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ChangeSetPerformer}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.changes.ChangeSetPerformer#copyStream(java.io.InputStream,org.apache.commons.compress.archivers.ArchiveOutputStream,org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.ArchiveOutputStream#putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.putArchiveEntry(entry);
 *  */
    @Test
    public void testCopyStream_ThrowNullPointerException() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.copyStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(ChangeSetPerformer.java:174) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class inputStreamType = Class.forName("java.io.InputStream");
        Class archiveOutputStreamType = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method copyStreamMethod = changeSetPerformerClazz.getDeclaredMethod("copyStream", inputStreamType, archiveOutputStreamType, archiveEntryType);
        copyStreamMethod.setAccessible(true);
        java.lang.Object[] copyStreamMethodArguments = new java.lang.Object[3];
        copyStreamMethodArguments[0] = ((Object) null);
        copyStreamMethodArguments[1] = ((Object) null);
        copyStreamMethodArguments[2] = ((Object) null);
        try {
            copyStreamMethod.invoke(changeSetPerformer, copyStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method copyStream(java.io.InputStream, org.apache.commons.compress.archivers.ArchiveOutputStream, org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testCopyStream1() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        ArArchiveOutputStream arArchiveOutputStream = ((ArArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "archiveOffset", 0L);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "entryOffset", 0L);
        ArArchiveEntry prevEntry = ((ArArchiveEntry) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(prevEntry, "org.apache.commons.compress.archivers.ar.ArArchiveEntry", "length", 0L);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "prevEntry", prevEntry);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.copyStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(ArArchiveOutputStream.java:102)
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(ArArchiveOutputStream.java:74)
            org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(ChangeSetPerformer.java:174) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class extObjectInputStreamType = Class.forName("java.io.InputStream");
        Class arArchiveOutputStreamType = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method copyStreamMethod = changeSetPerformerClazz.getDeclaredMethod("copyStream", extObjectInputStreamType, arArchiveOutputStreamType, archiveEntryType);
        copyStreamMethod.setAccessible(true);
        java.lang.Object[] copyStreamMethodArguments = new java.lang.Object[3];
        copyStreamMethodArguments[0] = extObjectInputStream;
        copyStreamMethodArguments[1] = arArchiveOutputStream;
        copyStreamMethodArguments[2] = ((Object) null);
        try {
            copyStreamMethod.invoke(changeSetPerformer, copyStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCopyStream2() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        ArArchiveOutputStream arArchiveOutputStream = ((ArArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "archiveOffset", 0L);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "entryOffset", 0L);
        ArArchiveEntry prevEntry = ((ArArchiveEntry) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(prevEntry, "org.apache.commons.compress.archivers.ar.ArArchiveEntry", "length", 0L);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "prevEntry", prevEntry);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "haveUnclosedEntry", true);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.copyStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(ArArchiveOutputStream.java:102)
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(ArArchiveOutputStream.java:74)
            org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(ChangeSetPerformer.java:174) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class extObjectInputStreamType = Class.forName("java.io.InputStream");
        Class arArchiveOutputStreamType = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method copyStreamMethod = changeSetPerformerClazz.getDeclaredMethod("copyStream", extObjectInputStreamType, arArchiveOutputStreamType, archiveEntryType);
        copyStreamMethod.setAccessible(true);
        java.lang.Object[] copyStreamMethodArguments = new java.lang.Object[3];
        copyStreamMethodArguments[0] = extObjectInputStream;
        copyStreamMethodArguments[1] = arArchiveOutputStream;
        copyStreamMethodArguments[2] = ((Object) null);
        try {
            copyStreamMethod.invoke(changeSetPerformer, copyStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCopyStream3() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        ArArchiveOutputStream arArchiveOutputStream = ((ArArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "archiveOffset", 0L);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.copyStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader(ArArchiveOutputStream.java:48)
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(ArArchiveOutputStream.java:63)
            org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(ChangeSetPerformer.java:174) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class inputStreamType = Class.forName("java.io.InputStream");
        Class arArchiveOutputStreamType = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        Class archiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method copyStreamMethod = changeSetPerformerClazz.getDeclaredMethod("copyStream", inputStreamType, arArchiveOutputStreamType, archiveEntryType);
        copyStreamMethod.setAccessible(true);
        java.lang.Object[] copyStreamMethodArguments = new java.lang.Object[3];
        copyStreamMethodArguments[0] = ((Object) null);
        copyStreamMethodArguments[1] = arArchiveOutputStream;
        copyStreamMethodArguments[2] = ((Object) null);
        try {
            copyStreamMethod.invoke(changeSetPerformer, copyStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCopyStream4() throws Throwable  {
        ChangeSetPerformer changeSetPerformer = ((ChangeSetPerformer) createInstance("org.apache.commons.compress.changes.ChangeSetPerformer"));
        ArArchiveOutputStream arArchiveOutputStream = ((ArArchiveOutputStream) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "archiveOffset", 0L);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "entryOffset", 0L);
        ArArchiveEntry prevEntry = ((ArArchiveEntry) createInstance("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(prevEntry, "org.apache.commons.compress.archivers.ar.ArArchiveEntry", "length", 0L);
        setField(arArchiveOutputStream, "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", "prevEntry", prevEntry);
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 0L, 0, 0, 0, 0L);
        
        /* This test fails because method [org.apache.commons.compress.changes.ChangeSetPerformer.copyStream] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(ArArchiveOutputStream.java:103)
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(ArArchiveOutputStream.java:74)
            org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(ChangeSetPerformer.java:174) */
        Class changeSetPerformerClazz = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class inputStreamType = Class.forName("java.io.InputStream");
        Class arArchiveOutputStreamType = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        Class arArchiveEntryType = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Method copyStreamMethod = changeSetPerformerClazz.getDeclaredMethod("copyStream", inputStreamType, arArchiveOutputStreamType, arArchiveEntryType);
        copyStreamMethod.setAccessible(true);
        java.lang.Object[] copyStreamMethodArguments = new java.lang.Object[3];
        copyStreamMethodArguments[0] = ((Object) null);
        copyStreamMethodArguments[1] = arArchiveOutputStream;
        copyStreamMethodArguments[2] = arArchiveEntry;
        try {
            copyStreamMethod.invoke(changeSetPerformer, copyStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for copyStream
    
    public void testCopyStream_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields969010082436400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields969010082436400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass969010082443900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields969010082436400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass969010082443900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

