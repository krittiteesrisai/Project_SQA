package org.apache.commons.collections.map;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.io.ObjectStreamField;
import java.util.zip.ZipInputStream;
import java.io.DataInputStream;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_collections_map_CaseInsensitiveMapTest {
    ///region Test suites for executable org.apache.commons.collections.map.CaseInsensitiveMap.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#clone()}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.clone();
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.CaseInsensitiveMap.clone] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.AbstractHashedMap.clone(AbstractHashedMap.java:1230)
            org.apache.commons.collections.map.CaseInsensitiveMap.clone(CaseInsensitiveMap.java:134) */
        caseInsensitiveMap.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#clone()}
     */
    @Test
    public void testClone() {
        CaseInsensitiveMap caseInsensitiveMap = new CaseInsensitiveMap();
        Object object = new Object();
        Object object1 = new Object();
        caseInsensitiveMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        caseInsensitiveMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        caseInsensitiveMap.put(object4, object5);
        
        Map actual = ((Map) caseInsensitiveMap.clone());
        
        Map expected = new LinkedHashMap();
        String string = "java.lang.object@77888271";
        expected.put(string, object1);
        String string1 = "java.lang.object@734d3cc0";
        expected.put(string1, object5);
        String string2 = "java.lang.object@40e5b5a7";
        expected.put(string2, object3);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region Errors report for clone
    
    public void testClone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // No such field java.util.Set keySet found in org.utbot.engine.overrides.collections.UtHashMap
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.CaseInsensitiveMap.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.CaseInsensitiveMap.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.CaseInsensitiveMap.readObject(CaseInsensitiveMap.java:149) */
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_2() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", -255);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = new java.io.ObjectStreamField[2];
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        fields[1] = objectStreamField;
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_3() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", -255);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = new java.io.ObjectStreamField[2];
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        fields[1] = objectStreamField;
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link org.apache.commons.collections.map.CaseInsensitiveMap#doReadObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_4() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -255);
        DataInputStream din = ((DataInputStream) createInstance("java.io.DataInputStream"));
        ZipInputStream in = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in, "java.util.zip.ZipInputStream", "closed", true);
        setField(din, "java.io.FilterInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "din", din);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object handles = createInstance("java.io.ObjectInputStream$HandleTable");
        setField(objectInputStream, "java.io.ObjectInputStream", "handles", handles);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", -1);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        DataInputStream in1 = ((DataInputStream) createInstance("java.io.DataInputStream"));
        JarInputStream in2 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        setField(in2, "java.util.jar.JarInputStream", "first", first);
        byte[] singleByteBuf = {(byte) 0};
        setField(in2, "java.util.zip.InflaterInputStream", "singleByteBuf", singleByteBuf);
        setField(in1, "java.io.FilterInputStream", "in", in2);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", 0L);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", -255);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = new java.io.ObjectStreamField[2];
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        fields[1] = objectStreamField;
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(caseInsensitiveMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 9 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.CaseInsensitiveMap.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.CaseInsensitiveMap.writeObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.CaseInsensitiveMap.writeObject(CaseInsensitiveMap.java:141) */
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.defaultWriteObject();
 *  */
    @Test(expected = ZipException.class)
    public void testWriteObject_ThrowZipException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) -127, (byte) -127};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -1L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteObject_ThrowIOException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) -127, (byte) -127};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.defaultWriteObject();
 *  */
    @Test(expected = ZipException.class)
    public void testWriteObject_ThrowZipException_1() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteObject_ThrowIOException_1() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.defaultWriteObject();
 *  */
    @Test(expected = ZipException.class)
    public void testWriteObject_ThrowZipException_2() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        byte[] primVals = new byte[32];
        setField(objectOutputStream, "java.io.ObjectOutputStream", "primVals", primVals);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        int[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 32);
        Object fieldRefl = createInstance("java.io.ObjectStreamClass$FieldReflector");
        setField(fieldRefl, "java.io.ObjectStreamClass$FieldReflector", "numPrimFields", 1);
        long[] readKeys = {0L};
        setField(fieldRefl, "java.io.ObjectStreamClass$FieldReflector", "readKeys", readKeys);
        int[] offsets = {0};
        setField(fieldRefl, "java.io.ObjectStreamClass$FieldReflector", "offsets", offsets);
        char[] typeCodes = {'S'};
        setField(fieldRefl, "java.io.ObjectStreamClass$FieldReflector", "typeCodes", typeCodes);
        setField(desc, "java.io.ObjectStreamClass", "fieldRefl", fieldRefl);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out.defaultWriteObject();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteObject_ThrowIndexOutOfBoundsException() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        int[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        Object fieldRefl = createInstance("java.io.ObjectStreamClass$FieldReflector");
        setField(desc, "java.io.ObjectStreamClass", "fieldRefl", fieldRefl);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method writeObject(java.io.ObjectOutputStream)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#writeObject(java.io.ObjectOutputStream)}
     */
    @Test(timeout = 1000L)
    public void testWriteObject() throws Throwable  {
        CaseInsensitiveMap caseInsensitiveMap = new CaseInsensitiveMap(2113929215);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class caseInsensitiveMapClazz = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = caseInsensitiveMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(caseInsensitiveMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeObject
    
    public void testWriteObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.CaseInsensitiveMap.convertKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#convertKey(java.lang.Object)}
 * @utbot.executesCondition {@code (key != null): True}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.returnsFrom {@code return key.toString().toLowerCase();}
 *  */
    @Test
    public void testConvertKey_KeyNotEqualsNull() throws Exception  {
        CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Integer integer = 0;
        
        String actual = ((String) caseInsensitiveMap.convertKey(integer));
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CaseInsensitiveMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.CaseInsensitiveMap#convertKey(java.lang.Object)}
 * @utbot.executesCondition {@code (key != null): False}
 * @utbot.returnsFrom {@code return AbstractHashedMap.NULL;}
 *  */
    @Test
    public void testConvertKey_KeyEqualsNull() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            CaseInsensitiveMap caseInsensitiveMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
            
            java.lang.Object[] actual = ((java.lang.Object[]) caseInsensitiveMap.convertKey(null));
            
            int null1Size = null1.length;
            assertEquals(null1Size, actual.length);
            assertTrue(deepEquals(null1, actual));
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields957804765715500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields957804765715500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass957804765722800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields957804765715500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass957804765722800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields957804766088200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields957804766088200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass957804766091700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields957804766088200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass957804766091700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

