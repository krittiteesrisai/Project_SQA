package com.google.debugging.sourcemap;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;
import java.util.LinkedHashMap;
import com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier;
import java.util.List;
import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;
import com.google.debugging.sourcemap.proto.Mapping;
import com.google.protobuf.UnknownFieldSet;
import org.json.JSONArray;
import org.json.JSONException;
import com.google.debugging.sourcemap.SourceMapGeneratorV3.ConsumerEntryVisitor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class com_google_debugging_sourcemap_SourceMapConsumerV3Test {
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.search
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method search(java.util.ArrayList, int, int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 *  */
    @Test
    public void testSearch_EndLessThanStart() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", 1);
        arrayList.add(namedEntry);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = -2;
        searchMethodArguments[2] = 125;
        searchMethodArguments[3] = -126;
        int actual = ((Integer) searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 *  */
    @Test
    public void testSearch_StartGreaterThanEnd() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", -64);
        arrayList.add(namedEntry);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = -63;
        searchMethodArguments[2] = 0;
        searchMethodArguments[3] = 0;
        int actual = ((Integer) searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 *  */
    @Test
    public void testSearch_CompareEqualsZero() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", -255);
        arrayList.add(namedEntry);
        Object namedEntry1 = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry1);
        Object namedEntry2 = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry2);
        arrayList.add(namedEntry2);
        arrayList.add(namedEntry2);
        arrayList.add(null);
        arrayList.add(namedEntry2);
        arrayList.add(namedEntry2);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = -255;
        searchMethodArguments[2] = 236;
        searchMethodArguments[3] = -237;
        int actual = ((Integer) searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method search(java.util.ArrayList, int, int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int compare = compareEntry(entries, mid, target);
 *  */
    @Test
    public void testSearch_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.search] produces [java.lang.IndexOutOfBoundsException: Index -128 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = -3;
        searchMethodArguments[2] = -255;
        searchMethodArguments[3] = 256;
        try {
            searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int compare = compareEntry(entries, mid, target);
 *  */
    @Test
    public void testSearch_ThrowIndexOutOfBoundsException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", 255);
        arrayList.add(namedEntry);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.search] produces [java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 4]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = 256;
        searchMethodArguments[2] = -16;
        searchMethodArguments[3] = 16;
        try {
            searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int compare = compareEntry(entries, mid, target);
 *  */
    @Test
    public void testSearch_ThrowNullPointerException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.search] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = ((Object) null);
        searchMethodArguments[1] = -255;
        searchMethodArguments[2] = -255;
        searchMethodArguments[3] = -255;
        try {
            searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int compare = compareEntry(entries, mid, target);
 *  */
    @Test
    public void testSearch_ThrowNullPointerException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.search] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = -255;
        searchMethodArguments[2] = 4;
        searchMethodArguments[3] = -5;
        try {
            searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method search(java.util.ArrayList, int, int, int)
    
    @Test
    public void testSearchByFuzzer() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.search] produces [java.lang.IndexOutOfBoundsException: Index 1073741825 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method searchMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("search", arrayListType, intType, intType, intType);
        searchMethod.setAccessible(true);
        java.lang.Object[] searchMethodArguments = new java.lang.Object[4];
        searchMethodArguments[0] = arrayList;
        searchMethodArguments[1] = -2147483647;
        searchMethodArguments[2] = Integer.MIN_VALUE;
        searchMethodArguments[3] = 1;
        try {
            searchMethod.invoke(sourceMapConsumerV3, searchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.parse
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parse(org.json.JSONObject, com.google.debugging.sourcemap.SourceMapSupplier)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.invokes {@link org.json.JSONObject#getInt(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.caughtException {@code JSONException ex}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONObject jSONObject = ((JSONObject) createInstance("org.json.JSONObject"));
        LinkedHashMap map = new LinkedHashMap();
        setField(jSONObject, "org.json.JSONObject", "map", map);
        
        sourceMapConsumerV3.parse(jSONObject, ((SourceMapSupplier) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(org.json.JSONObject, com.google.debugging.sourcemap.SourceMapSupplier)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.invokes {@link org.json.JSONObject#getInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int version = sourceMapRoot.getInt("version");
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.parse] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.parse(SourceMapConsumerV3.java:102) */
        sourceMapConsumerV3.parse(((JSONObject) null), ((SourceMapSupplier) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.parse
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parse(org.json.JSONObject)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(org.json.JSONObject)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(sourceMapRoot, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONObject jSONObject = ((JSONObject) createInstance("org.json.JSONObject"));
        LinkedHashMap map = new LinkedHashMap();
        setField(jSONObject, "org.json.JSONObject", "map", map);
        
        sourceMapConsumerV3.parse(jSONObject);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.parse
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parse(java.lang.String, com.google.debugging.sourcemap.SourceMapSupplier)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.caughtException {@code JSONException ex}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException2() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "!";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(sourceMapRoot, sectionSupplier);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_1() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{}";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_2() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{{";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_3() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{\"\u0001";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.caughtException {@code JSONException ex}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_4() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{\"\"";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_5() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_6() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{\"\\u";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_7() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{\"\\x";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_8() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{[";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.caughtException {@code JSONException ex}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_9() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "";
        
        sourceMapConsumerV3.parse(string, ((SourceMapSupplier) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.parse
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException3() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{}";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_11() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{{";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_21() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\u0001";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_31() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{[";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_41() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{''";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_51() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_61() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\u";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_71() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\r";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_81() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\b";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_91() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\x ";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_10() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\f";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_111() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\t";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_12() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "{'\\n";
        
        sourceMapConsumerV3.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in: parse(contents, null);
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParse_ThrowSourceMapParseException_13() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        String string = "";
        
        sourceMapConsumerV3.parse(string);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3}
     * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parse(java.lang.String)}
     */
    @Test(expected = SourceMapParseException.class)
    public void testParseThrowsSMPEWithNonEmptyString() throws SourceMapParseException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        sourceMapConsumerV3.parse("ZX");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.parseMetaMap
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parseMetaMap(org.json.JSONObject, com.google.debugging.sourcemap.SourceMapSupplier)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parseMetaMap(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.executesCondition {@code (sectionSupplier == null): True}
 * @utbot.caughtException {@code JSONException ex}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMap_ThrowSourceMapParseException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONObject jSONObject = ((JSONObject) createInstance("org.json.JSONObject"));
        LinkedHashMap map = new LinkedHashMap();
        setField(jSONObject, "org.json.JSONObject", "map", map);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONObjectType = Class.forName("org.json.JSONObject");
        Class sourceMapSupplierType = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Method parseMetaMapMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("parseMetaMap", jSONObjectType, sourceMapSupplierType);
        parseMetaMapMethod.setAccessible(true);
        java.lang.Object[] parseMetaMapMethodArguments = new java.lang.Object[2];
        parseMetaMapMethodArguments[0] = jSONObject;
        parseMetaMapMethodArguments[1] = ((Object) null);
        try {
            parseMetaMapMethod.invoke(sourceMapConsumerV3, parseMetaMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parseMetaMap(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.executesCondition {@code (sectionSupplier == null): False}
 * @utbot.caughtException {@code JSONException ex}
 * @utbot.throwsException {@link com.google.debugging.sourcemap.SourceMapParseException} in:  catch (JSONException ex) {
 *     throw new SourceMapParseException("JSON parse exception: " + ex);
 * }
 *  */
    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMap_ThrowSourceMapParseException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONObject jSONObject = ((JSONObject) createInstance("org.json.JSONObject"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(jSONObject, "org.json.JSONObject", "map", map);
        SourceMapConsumerV3.DefaultSourceMapSupplier defaultSourceMapSupplier = new SourceMapConsumerV3.DefaultSourceMapSupplier();
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONObjectType = Class.forName("org.json.JSONObject");
        Class defaultSourceMapSupplierType = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Method parseMetaMapMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("parseMetaMap", jSONObjectType, defaultSourceMapSupplierType);
        parseMetaMapMethod.setAccessible(true);
        java.lang.Object[] parseMetaMapMethodArguments = new java.lang.Object[2];
        parseMetaMapMethodArguments[0] = jSONObject;
        parseMetaMapMethodArguments[1] = defaultSourceMapSupplier;
        try {
            parseMetaMapMethod.invoke(sourceMapConsumerV3, parseMetaMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseMetaMap(org.json.JSONObject, com.google.debugging.sourcemap.SourceMapSupplier)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parseMetaMap(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.executesCondition {@code (sectionSupplier == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int version = sourceMapRoot.getInt("version");
 *  */
    @Test
    public void testParseMetaMap_ThrowNullPointerException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        SourceMapConsumerV3.DefaultSourceMapSupplier defaultSourceMapSupplier = new SourceMapConsumerV3.DefaultSourceMapSupplier();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.parseMetaMap] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.parseMetaMap(SourceMapConsumerV3.java:145) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONObjectType = Class.forName("org.json.JSONObject");
        Class defaultSourceMapSupplierType = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Method parseMetaMapMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("parseMetaMap", jSONObjectType, defaultSourceMapSupplierType);
        parseMetaMapMethod.setAccessible(true);
        java.lang.Object[] parseMetaMapMethodArguments = new java.lang.Object[2];
        parseMetaMapMethodArguments[0] = ((Object) null);
        parseMetaMapMethodArguments[1] = defaultSourceMapSupplier;
        try {
            parseMetaMapMethod.invoke(sourceMapConsumerV3, parseMetaMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#parseMetaMap(org.json.JSONObject,com.google.debugging.sourcemap.SourceMapSupplier)}
 * @utbot.executesCondition {@code (sectionSupplier == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int version = sourceMapRoot.getInt("version");
 *  */
    @Test
    public void testParseMetaMap_ThrowNullPointerException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.parseMetaMap] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.parseMetaMap(SourceMapConsumerV3.java:145) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONObjectType = Class.forName("org.json.JSONObject");
        Class sourceMapSupplierType = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Method parseMetaMapMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("parseMetaMap", jSONObjectType, sourceMapSupplierType);
        parseMetaMapMethod.setAccessible(true);
        java.lang.Object[] parseMetaMapMethodArguments = new java.lang.Object[2];
        parseMetaMapMethodArguments[0] = ((Object) null);
        parseMetaMapMethodArguments[1] = ((Object) null);
        try {
            parseMetaMapMethod.invoke(sourceMapConsumerV3, parseMetaMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalSources
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOriginalSources()
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getOriginalSources()}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.asList(sources);}
 *  */
    @Test
    public void testGetOriginalSources_ArraysAsList() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        
        List actual = ((List) sourceMapConsumerV3.getOriginalSources());
        
        List expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
        
        java.lang.String[] sourceMapConsumerV3Sources = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources0 = ((String) get(sourceMapConsumerV3Sources, 0));
        
        assertNull(finalSourceMapConsumerV3Sources0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getOriginalSources()
    
    /**
     * @utbot.classUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3}
     * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getOriginalSources()}
     */
    @Test
    public void testGetOriginalSourcesThrowsNPE() {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalSources] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.Arrays$ArrayList.<init>(Arrays.java:4137)
            java.base/java.util.Arrays.asList(Arrays.java:4122)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalSources(SourceMapConsumerV3.java:238) */
        sourceMapConsumerV3.getOriginalSources();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMappingForLine(int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber < 0): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetMappingForLine_LineNumberLessThanZero() {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        Mapping.OriginalMapping actual = sourceMapConsumerV3.getMappingForLine(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber < 0): False}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetMappingForLine_LineNumberGreaterOrEqualLinesSize() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Mapping.OriginalMapping actual = sourceMapConsumerV3.getMappingForLine(1, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber < 0): False}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.executesCondition {@code (entries.get(0).getGeneratedColumn() > column): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(index >= 0, "unexpected:%s", index);): True}
 * @utbot.returnsFrom {@code return getOriginalMappingForEntry(entries.get(index));}
 *  */
    @Test
    public void testGetMappingForLine_PreconditionsCheckState_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object unnamedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry");
        setField(unnamedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry", "srcFile", -1);
        setField(unnamedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", -2147483393);
        arrayList.add(unnamedEntry);
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Mapping.OriginalMapping actual = sourceMapConsumerV3.getMappingForLine(1, 256);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber < 0): False}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.invokes com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)
 * @utbot.returnsFrom {@code return getPreviousMapping(lineNumber);}
 *  */
    @Test
    public void testGetMappingForLine_LinesGetEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Mapping.OriginalMapping actual = sourceMapConsumerV3.getMappingForLine(2, 1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber < 0): False}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.executesCondition {@code (entries.get(0).getGeneratedColumn() > column): True}
 * @utbot.invokes com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)
 * @utbot.returnsFrom {@code return getPreviousMapping(lineNumber);}
 *  */
    @Test
    public void testGetMappingForLine_EntriesGet0GetGeneratedColumnGreaterThanColumn() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", 1);
        arrayList.add(namedEntry);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Mapping.OriginalMapping actual = sourceMapConsumerV3.getMappingForLine(1, 1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber < 0): False}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.executesCondition {@code (entries.get(0).getGeneratedColumn() > column): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(index >= 0, "unexpected:%s", index);): True}
 * @utbot.returnsFrom {@code return getOriginalMappingForEntry(entries.get(index));}
 *  */
    @Test
    public void testGetMappingForLine_PreconditionsCheckState() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object unnamedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry");
        setField(unnamedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry", "srcFile", -1);
        arrayList.add(unnamedEntry);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Mapping.OriginalMapping actual = sourceMapConsumerV3.getMappingForLine(1, 1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMappingForLine(int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: entries.get(0).getGeneratedColumn() > column
 *  */
    @Test
    public void testGetMappingForLine_ThrowClassCastException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(lines);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class com.google.debugging.sourcemap.SourceMapConsumerV3$Entry (java.util.ArrayList is in module java.base of loader 'bootstrap'; com.google.debugging.sourcemap.SourceMapConsumerV3$Entry is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @a8e6393)]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:227) */
        sourceMapConsumerV3.getMappingForLine(1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getPreviousMapping(lineNumber);
 *  */
    @Test
    public void testGetMappingForLine_ThrowIndexOutOfBoundsException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        ArrayList arrayList = new ArrayList();
        lines.add(arrayList);
        ArrayList arrayList1 = new ArrayList();
        lines.add(arrayList1);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:476)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:221) */
        sourceMapConsumerV3.getMappingForLine(4, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getPreviousMapping(lineNumber);
 *  */
    @Test
    public void testGetMappingForLine_ThrowClassCastException_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        ArrayList arrayList = new ArrayList();
        lines.add(arrayList);
        lines.add(lines);
        lines.add(null);
        ArrayList arrayList1 = new ArrayList();
        lines.add(arrayList1);
        lines.add(arrayList1);
        lines.add(null);
        lines.add(arrayList1);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class com.google.debugging.sourcemap.SourceMapConsumerV3$Entry (java.util.ArrayList is in module java.base of loader 'bootstrap'; com.google.debugging.sourcemap.SourceMapConsumerV3$Entry is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @a8e6393)]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:476)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:221) */
        sourceMapConsumerV3.getMappingForLine(4, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lineNumber < 0 || lineNumber >= lines.size()
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:211) */
        sourceMapConsumerV3.getMappingForLine(1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapConsumerV3.Entry#getGeneratedColumn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entries.get(0).getGeneratedColumn() > column
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        lines.add(lines);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:227) */
        sourceMapConsumerV3.getMappingForLine(2, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPreviousMapping(lineNumber);
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException_4() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        lines.add(null);
        lines.add(lines);
        lines.add(null);
        ArrayList arrayList = new ArrayList();
        lines.add(arrayList);
        lines.add(null);
        lines.add(arrayList);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalMappingForEntry(SourceMapConsumerV3.java:483)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:476)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:221) */
        sourceMapConsumerV3.getMappingForLine(4, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.executesCondition {@code (entries.get(0).getGeneratedColumn() > column): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = search(entries, column, 0, entries.size() - 1);
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException_3() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object unmappedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry");
        setField(unmappedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", -2147483642);
        arrayList.add(unmappedEntry);
        arrayList.add(null);
        arrayList.add(unmappedEntry);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:231) */
        sourceMapConsumerV3.getMappingForLine(1, 4);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPreviousMapping(lineNumber);
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException_5() throws Exception  {
        Class unknownFieldSetClazz = Class.forName("com.google.protobuf.UnknownFieldSet");
        UnknownFieldSet prevDefaultInstance = ((UnknownFieldSet) getStaticFieldValue(unknownFieldSetClazz, "defaultInstance"));
        Class generatedMessageClazz = Class.forName("com.google.protobuf.GeneratedMessage");
        boolean prevAlwaysUseFieldBuilders = ((Boolean) getStaticFieldValue(generatedMessageClazz, "alwaysUseFieldBuilders"));
        try {
            UnknownFieldSet defaultInstance = ((UnknownFieldSet) createInstance("com.google.protobuf.UnknownFieldSet"));
            LinkedHashMap fields = new LinkedHashMap();
            setField(defaultInstance, "com.google.protobuf.UnknownFieldSet", "fields", fields);
            setStaticField(unknownFieldSetClazz, "defaultInstance", defaultInstance);
            setStaticField(generatedMessageClazz, "alwaysUseFieldBuilders", true);
            SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
            ArrayList lines = new ArrayList();
            lines.add(null);
            lines.add(null);
            lines.add(lines);
            lines.add(null);
            lines.add(null);
            lines.add(null);
            lines.add(null);
            lines.add(null);
            setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
            
            /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException] */
            sourceMapConsumerV3.getMappingForLine(4, 1);
        } finally {
            setStaticField(UnknownFieldSet.class, "defaultInstance", prevDefaultInstance);
            setStaticField(com.google.protobuf.GeneratedMessage.class, "alwaysUseFieldBuilders", prevAlwaysUseFieldBuilders);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.executesCondition {@code (entries.get(0).getGeneratedColumn() > column): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = search(entries, column, 0, entries.size() - 1);
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException_2() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object unnamedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry");
        arrayList.add(unnamedEntry);
        arrayList.add(null);
        arrayList.add(null);
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", 1073741824);
        arrayList.add(namedEntry);
        Object object = createInstance("java.lang.Object");
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461)
            com.google.debugging.sourcemap.SourceMapConsumerV3.search(SourceMapConsumerV3.java:438)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(SourceMapConsumerV3.java:231) */
        sourceMapConsumerV3.getMappingForLine(1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (lineNumber >= lines.size()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(lineNumber >= 0);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPreviousMapping(lineNumber);
 *  */
    @Test
    public void testGetMappingForLine_ThrowNullPointerException_6() throws Exception  {
        Class unknownFieldSetClazz = Class.forName("com.google.protobuf.UnknownFieldSet");
        UnknownFieldSet prevDefaultInstance = ((UnknownFieldSet) getStaticFieldValue(unknownFieldSetClazz, "defaultInstance"));
        Class generatedMessageClazz = Class.forName("com.google.protobuf.GeneratedMessage");
        boolean prevAlwaysUseFieldBuilders = ((Boolean) getStaticFieldValue(generatedMessageClazz, "alwaysUseFieldBuilders"));
        try {
            UnknownFieldSet defaultInstance = ((UnknownFieldSet) createInstance("com.google.protobuf.UnknownFieldSet"));
            LinkedHashMap fields = new LinkedHashMap();
            setField(defaultInstance, "com.google.protobuf.UnknownFieldSet", "fields", fields);
            setStaticField(unknownFieldSetClazz, "defaultInstance", defaultInstance);
            setStaticField(generatedMessageClazz, "alwaysUseFieldBuilders", true);
            SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
            java.lang.String[] sources = new java.lang.String[9];
            String string = "";
            sources[0] = string;
            setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
            ArrayList lines = new ArrayList();
            lines.add(null);
            lines.add(null);
            lines.add(lines);
            lines.add(null);
            lines.add(null);
            lines.add(null);
            lines.add(null);
            lines.add(null);
            setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
            
            /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine] produces [java.lang.NullPointerException] */
            sourceMapConsumerV3.getMappingForLine(4, 1);
        } finally {
            setStaticField(UnknownFieldSet.class, "defaultInstance", prevDefaultInstance);
            setStaticField(com.google.protobuf.GeneratedMessage.class, "alwaysUseFieldBuilders", prevAlwaysUseFieldBuilders);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMappingForLine(int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(column >= 0);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetMappingForLine_ThrowIllegalStateException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.getMappingForLine(1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(entries.size() > 0);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetMappingForLine_ThrowIllegalStateException_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.getMappingForLine(1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getMappingForLine(int,int)}
 * @utbot.executesCondition {@code (Preconditions.checkState(column >= 0);): True}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(entries.size() > 0);): True}
 * @utbot.executesCondition {@code (entries.get(0).getGeneratedColumn() > column): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(index >= 0, "unexpected:%s", index);): False}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapConsumerV3.Entry#getGeneratedColumn()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes com.google.debugging.sourcemap.SourceMapConsumerV3#search(java.util.ArrayList,int,int,int)
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(index >= 0, "unexpected:%s", index);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetMappingForLine_ThrowIllegalStateException_2() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object unmappedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry");
        setField(unmappedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry", "column", -2147483529);
        arrayList.add(unmappedEntry);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.getMappingForLine(1, 246);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.getReverseMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReverseMapping(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getReverseMapping(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (reverseSourceMapping == null): False}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testGetReverseMapping_ReverseSourceMappingNotEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        LinkedHashMap reverseSourceMapping = new LinkedHashMap();
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "reverseSourceMapping", reverseSourceMapping);
        String string = "";
        
        List actual = ((List) sourceMapConsumerV3.getReverseMapping(string, -255, -255));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getReverseMapping(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (reverseSourceMapping == null): True}
 * @utbot.invokes com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testGetReverseMapping_ReverseSourceMappingEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        List actual = ((List) sourceMapConsumerV3.getReverseMapping(null, -255, -255));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReverseMapping(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getReverseMapping(java.lang.String,int,int)}
 * @utbot.executesCondition {@code (reverseSourceMapping == null): True}
 * @utbot.invokes com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: createReverseMapping();
 *  */
    @Test
    public void testGetReverseMapping_ThrowNullPointerException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getReverseMapping] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping(SourceMapConsumerV3.java:507)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getReverseMapping(SourceMapConsumerV3.java:249) */
        sourceMapConsumerV3.getReverseMapping(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.getJavaStringArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJavaStringArray(org.json.JSONArray)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getJavaStringArray(org.json.JSONArray)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetJavaStringArray_ReturnResult() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONArray jSONArray = ((JSONArray) createInstance("org.json.JSONArray"));
        ArrayList myArrayList = new ArrayList();
        setField(jSONArray, "org.json.JSONArray", "myArrayList", myArrayList);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONArrayType = Class.forName("org.json.JSONArray");
        Method getJavaStringArrayMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getJavaStringArray", jSONArrayType);
        getJavaStringArrayMethod.setAccessible(true);
        java.lang.Object[] getJavaStringArrayMethodArguments = new java.lang.Object[1];
        getJavaStringArrayMethodArguments[0] = jSONArray;
        java.lang.String[] actual = ((java.lang.String[]) getJavaStringArrayMethod.invoke(sourceMapConsumerV3, getJavaStringArrayMethodArguments));
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getJavaStringArray(org.json.JSONArray)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetJavaStringArray_JSONArrayGetString() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONArray jSONArray = ((JSONArray) createInstance("org.json.JSONArray"));
        ArrayList myArrayList = new ArrayList();
        Integer integer = Integer.MIN_VALUE;
        myArrayList.add(integer);
        setField(jSONArray, "org.json.JSONArray", "myArrayList", myArrayList);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONArrayType = Class.forName("org.json.JSONArray");
        Method getJavaStringArrayMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getJavaStringArray", jSONArrayType);
        getJavaStringArrayMethod.setAccessible(true);
        java.lang.Object[] getJavaStringArrayMethodArguments = new java.lang.Object[1];
        getJavaStringArrayMethodArguments[0] = jSONArray;
        java.lang.String[] actual = ((java.lang.String[]) getJavaStringArrayMethod.invoke(sourceMapConsumerV3, getJavaStringArrayMethodArguments));
        
        java.lang.String[] expected = new java.lang.String[1];
        String string = "-2147483648";
        expected[0] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJavaStringArray(org.json.JSONArray)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getJavaStringArray(org.json.JSONArray)}
 * @utbot.invokes {@link org.json.JSONArray#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = array.length();
 *  */
    @Test
    public void testGetJavaStringArray_ThrowNullPointerException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getJavaStringArray] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getJavaStringArray(SourceMapConsumerV3.java:270) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONArrayType = Class.forName("org.json.JSONArray");
        Method getJavaStringArrayMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getJavaStringArray", jSONArrayType);
        getJavaStringArrayMethod.setAccessible(true);
        java.lang.Object[] getJavaStringArrayMethodArguments = new java.lang.Object[1];
        getJavaStringArrayMethodArguments[0] = ((Object) null);
        try {
            getJavaStringArrayMethod.invoke(sourceMapConsumerV3, getJavaStringArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getJavaStringArray(org.json.JSONArray)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getJavaStringArray(org.json.JSONArray)}
 * @utbot.invokes {@link org.json.JSONArray#length()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link org.json.JSONException} in: result[i] = array.getString(i);
 *  */
    @Test(expected = JSONException.class)
    public void testGetJavaStringArray_ThrowJSONException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONArray jSONArray = ((JSONArray) createInstance("org.json.JSONArray"));
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(null);
        setField(jSONArray, "org.json.JSONArray", "myArrayList", myArrayList);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONArrayType = Class.forName("org.json.JSONArray");
        Method getJavaStringArrayMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getJavaStringArray", jSONArrayType);
        getJavaStringArrayMethod.setAccessible(true);
        java.lang.Object[] getJavaStringArrayMethodArguments = new java.lang.Object[1];
        getJavaStringArrayMethodArguments[0] = jSONArray;
        try {
            getJavaStringArrayMethod.invoke(sourceMapConsumerV3, getJavaStringArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getJavaStringArray(org.json.JSONArray)
    
    @Test(expected = JSONException.class)
    public void testGetJavaStringArray1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        JSONArray jSONArray = ((JSONArray) createInstance("org.json.JSONArray"));
        ArrayList myArrayList = new ArrayList();
        Character character = '\u0200';
        myArrayList.add(character);
        myArrayList.add(null);
        myArrayList.add(null);
        setField(jSONArray, "org.json.JSONArray", "myArrayList", myArrayList);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class jSONArrayType = Class.forName("org.json.JSONArray");
        Method getJavaStringArrayMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getJavaStringArray", jSONArrayType);
        getJavaStringArrayMethod.setAccessible(true);
        java.lang.Object[] getJavaStringArrayMethodArguments = new java.lang.Object[1];
        getJavaStringArrayMethodArguments[0] = jSONArray;
        try {
            getJavaStringArrayMethod.invoke(sourceMapConsumerV3, getJavaStringArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareEntry(java.util.ArrayList, int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#compareEntry(java.util.ArrayList,int,int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapConsumerV3.Entry#getGeneratedColumn()}
 * @utbot.returnsFrom {@code return entries.get(entry).getGeneratedColumn() - target;}
 *  */
    @Test
    public void testCompareEntry_SourceMapConsumerV3GetGeneratedColumn() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method compareEntryMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("compareEntry", arrayListType, intType, intType);
        compareEntryMethod.setAccessible(true);
        java.lang.Object[] compareEntryMethodArguments = new java.lang.Object[3];
        compareEntryMethodArguments[0] = arrayList;
        compareEntryMethodArguments[1] = 0;
        compareEntryMethodArguments[2] = -255;
        int actual = ((Integer) compareEntryMethod.invoke(sourceMapConsumerV3, compareEntryMethodArguments));
        
        assertEquals(255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareEntry(java.util.ArrayList, int, int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#compareEntry(java.util.ArrayList,int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return entries.get(entry).getGeneratedColumn() - target;
 *  */
    @Test
    public void testCompareEntry_ThrowIndexOutOfBoundsException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method compareEntryMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("compareEntry", arrayListType, intType, intType);
        compareEntryMethod.setAccessible(true);
        java.lang.Object[] compareEntryMethodArguments = new java.lang.Object[3];
        compareEntryMethodArguments[0] = arrayList;
        compareEntryMethodArguments[1] = -1;
        compareEntryMethodArguments[2] = -255;
        try {
            compareEntryMethod.invoke(sourceMapConsumerV3, compareEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#compareEntry(java.util.ArrayList,int,int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(entry).getGeneratedColumn() - target;
 *  */
    @Test
    public void testCompareEntry_ThrowNullPointerException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method compareEntryMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("compareEntry", arrayListType, intType, intType);
        compareEntryMethod.setAccessible(true);
        java.lang.Object[] compareEntryMethodArguments = new java.lang.Object[3];
        compareEntryMethodArguments[0] = ((Object) null);
        compareEntryMethodArguments[1] = -255;
        compareEntryMethodArguments[2] = -255;
        try {
            compareEntryMethod.invoke(sourceMapConsumerV3, compareEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#compareEntry(java.util.ArrayList,int,int)}
 * @utbot.invokes {@link com.google.debugging.sourcemap.SourceMapConsumerV3.Entry#getGeneratedColumn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(entry).getGeneratedColumn() - target;
 *  */
    @Test
    public void testCompareEntry_ThrowNullPointerException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(SourceMapConsumerV3.java:461) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class intType = int.class;
        Method compareEntryMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("compareEntry", arrayListType, intType, intType);
        compareEntryMethod.setAccessible(true);
        java.lang.Object[] compareEntryMethodArguments = new java.lang.Object[3];
        compareEntryMethodArguments[0] = arrayList;
        compareEntryMethodArguments[1] = 0;
        compareEntryMethodArguments[2] = -255;
        try {
            compareEntryMethod.invoke(sourceMapConsumerV3, compareEntryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 *  */
    @Test
    public void testVisitMappings() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 *  */
    @Test
    public void testVisitMappings_LineEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 *  */
    @Test
    public void testVisitMappings_LineNotEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 *  */
    @Test
    public void testVisitMappings_EntryGetNameIdNotEqualsUNMAPPED() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "names", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry);
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        sourceMapConsumerV3.visitMappings(null);
        
        java.lang.String[] sourceMapConsumerV3Sources = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources0 = ((String) get(sourceMapConsumerV3Sources, 0));
        
        assertNull(finalSourceMapConsumerV3Sources0);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 *  */
    @Test
    public void testVisitMappings_EntryGetNameIdEqualsUNMAPPED() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry", "name", -1);
        arrayList.add(namedEntry);
        Object unmappedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry");
        arrayList.add(unmappedEntry);
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        SourceMapGeneratorV3.ConsumerEntryVisitor consumerEntryVisitor = ((SourceMapGeneratorV3.ConsumerEntryVisitor) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor"));
        SourceMapGeneratorV3 this$0 = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(consumerEntryVisitor, "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor", "this$0", this$0);
        
        sourceMapConsumerV3.visitMappings(consumerEntryVisitor);
        
        java.lang.String[] sourceMapConsumerV3Sources = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources0 = ((String) get(sourceMapConsumerV3Sources, 0));
        
        assertNull(finalSourceMapConsumerV3Sources0);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 *  */
    @Test
    public void testVisitMappings_EntryGetNameIdEqualsUNMAPPED_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = new java.lang.String[9];
        String string = "";
        sources[0] = string;
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry", "name", -1);
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry", "srcLine", -1);
        arrayList.add(namedEntry);
        Object unmappedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry");
        arrayList.add(unmappedEntry);
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        SourceMapGeneratorV3.ConsumerEntryVisitor consumerEntryVisitor = ((SourceMapGeneratorV3.ConsumerEntryVisitor) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor"));
        SourceMapGeneratorV3 this$0 = ((SourceMapGeneratorV3) createInstance("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(consumerEntryVisitor, "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor", "this$0", this$0);
        
        sourceMapConsumerV3.visitMappings(consumerEntryVisitor);
        
        java.lang.String[] sourceMapConsumerV3Sources = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources1 = ((String) get(sourceMapConsumerV3Sources, 1));
        java.lang.String[] sourceMapConsumerV3Sources1 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources2 = ((String) get(sourceMapConsumerV3Sources1, 2));
        java.lang.String[] sourceMapConsumerV3Sources2 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources3 = ((String) get(sourceMapConsumerV3Sources2, 3));
        java.lang.String[] sourceMapConsumerV3Sources3 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources4 = ((String) get(sourceMapConsumerV3Sources3, 4));
        java.lang.String[] sourceMapConsumerV3Sources4 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources5 = ((String) get(sourceMapConsumerV3Sources4, 5));
        java.lang.String[] sourceMapConsumerV3Sources5 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources6 = ((String) get(sourceMapConsumerV3Sources5, 6));
        java.lang.String[] sourceMapConsumerV3Sources6 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources7 = ((String) get(sourceMapConsumerV3Sources6, 7));
        java.lang.String[] sourceMapConsumerV3Sources7 = ((java.lang.String[]) getFieldValue(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources"));
        String finalSourceMapConsumerV3Sources8 = ((String) get(sourceMapConsumerV3Sources7, 8));
        
        assertNull(finalSourceMapConsumerV3Sources1);
        
        assertNull(finalSourceMapConsumerV3Sources2);
        
        assertNull(finalSourceMapConsumerV3Sources3);
        
        assertNull(finalSourceMapConsumerV3Sources4);
        
        assertNull(finalSourceMapConsumerV3Sources5);
        
        assertNull(finalSourceMapConsumerV3Sources6);
        
        assertNull(finalSourceMapConsumerV3Sources7);
        
        assertNull(finalSourceMapConsumerV3Sources8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Entry entry = line.get(j);
 *  */
    @Test
    public void testVisitMappings_ThrowClassCastException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(lines);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class com.google.debugging.sourcemap.SourceMapConsumerV3$Entry (java.util.ArrayList is in module java.base of loader 'bootstrap'; com.google.debugging.sourcemap.SourceMapConsumerV3$Entry is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @a8e6393)]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:697) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sourceName = sources[entry.getSourceFileId()];
 *  */
    @Test
    public void testVisitMappings_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object unnamedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry");
        setField(unnamedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry", "srcFile", 1073741824);
        arrayList.add(unnamedEntry);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:712) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: names[entry.getNameId()]
 *  */
    @Test
    public void testVisitMappings_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "names", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry", "name", 1073741824);
        arrayList.add(namedEntry);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:714) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int lineCount = lines.size();
 *  */
    @Test
    public void testVisitMappings_ThrowNullPointerException() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:691) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: visitor.visit(sourceName, symbolName, sourceStartPosition, startPosition, endPosition);
 *  */
    @Test
    public void testVisitMappings_ThrowNullPointerException_5() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry", "name", -1);
        arrayList.add(namedEntry);
        Object unmappedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry");
        arrayList.add(unmappedEntry);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:701) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < lineCount; i++)
 *  */
    @Test
    public void testVisitMappings_ThrowNullPointerException_4() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        setField(namedEntry, "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry", "name", -1);
        arrayList.add(namedEntry);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:700) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entry.getSourceFileId() != UNMAPPED
 *  */
    @Test
    public void testVisitMappings_ThrowNullPointerException_1() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:710) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceName = sources[entry.getSourceFileId()];
 *  */
    @Test
    public void testVisitMappings_ThrowNullPointerException_2() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:712) */
        sourceMapConsumerV3.visitMappings(null);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lineCount; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: names[entry.getNameId()]
 *  */
    @Test
    public void testVisitMappings_ThrowNullPointerException_3() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        java.lang.String[] sources = {null};
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object namedEntry = createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry");
        arrayList.add(namedEntry);
        arrayList.add(null);
        arrayList.add(null);
        lines.add(arrayList);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(SourceMapConsumerV3.java:714) */
        sourceMapConsumerV3.visitMappings(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPreviousMapping(int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPreviousMapping_ReturnNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SourceMapConsumerV3 sourceMapConsumerV3 = new SourceMapConsumerV3();
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = 0;
        Mapping.OriginalMapping actual = ((Mapping.OriginalMapping) getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.executesCondition {@code (lineNumber == 0): False}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): True}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPreviousMapping_LinesGetEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = 1;
        Mapping.OriginalMapping actual = ((Mapping.OriginalMapping) getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPreviousMapping(int)
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: lines.get(lineNumber) == null
 *  */
    @Test
    public void testGetPreviousMapping_ThrowIndexOutOfBoundsException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:474) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = 1;
        try {
            getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getOriginalMappingForEntry(entries.get(entries.size() - 1));
 *  */
    @Test
    public void testGetPreviousMapping_ThrowClassCastException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(lines);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class com.google.debugging.sourcemap.SourceMapConsumerV3$Entry (java.util.ArrayList is in module java.base of loader 'bootstrap'; com.google.debugging.sourcemap.SourceMapConsumerV3$Entry is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @a8e6393)]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:476) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = 1;
        try {
            getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.returnsFrom {@code return getOriginalMappingForEntry(entries.get(entries.size() - 1));}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getOriginalMappingForEntry(entries.get(entries.size() - 1));
 *  */
    @Test
    public void testGetPreviousMapping_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        Object graphAnnotationState = createInstance("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState");
        lines.add(graphAnnotationState);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:476) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = 1;
        try {
            getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lines.get(lineNumber) == null
 *  */
    @Test
    public void testGetPreviousMapping_ThrowNullPointerException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:474) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = -255;
        try {
            getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.returnsFrom {@code return getOriginalMappingForEntry(entries.get(entries.size() - 1));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getOriginalMappingForEntry(entries.get(entries.size() - 1));
 *  */
    @Test
    public void testGetPreviousMapping_ThrowNullPointerException_1() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(lines);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalMappingForEntry(SourceMapConsumerV3.java:483)
            com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(SourceMapConsumerV3.java:476) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class intType = int.class;
        Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
        getPreviousMappingMethod.setAccessible(true);
        java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
        getPreviousMappingMethodArguments[0] = 1;
        try {
            getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getOriginalMappingForEntry(entries.get(entries.size() - 1));
 *  */
    @Test
    public void testGetPreviousMapping_ThrowNullPointerException_2() throws Throwable  {
        Class unknownFieldSetClazz = Class.forName("com.google.protobuf.UnknownFieldSet");
        UnknownFieldSet prevDefaultInstance = ((UnknownFieldSet) getStaticFieldValue(unknownFieldSetClazz, "defaultInstance"));
        Class generatedMessageClazz = Class.forName("com.google.protobuf.GeneratedMessage");
        boolean prevAlwaysUseFieldBuilders = ((Boolean) getStaticFieldValue(generatedMessageClazz, "alwaysUseFieldBuilders"));
        try {
            UnknownFieldSet defaultInstance = ((UnknownFieldSet) createInstance("com.google.protobuf.UnknownFieldSet"));
            LinkedHashMap fields = new LinkedHashMap();
            setField(defaultInstance, "com.google.protobuf.UnknownFieldSet", "fields", fields);
            setStaticField(unknownFieldSetClazz, "defaultInstance", defaultInstance);
            setStaticField(generatedMessageClazz, "alwaysUseFieldBuilders", true);
            SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
            ArrayList lines = new ArrayList();
            Object graphAnnotationState = createInstance("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState");
            lines.add(graphAnnotationState);
            lines.add(null);
            setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
            
            /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.NullPointerException] */
            Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
            Class intType = int.class;
            Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
            getPreviousMappingMethod.setAccessible(true);
            java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
            getPreviousMappingMethodArguments[0] = 1;
            try {
                getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(UnknownFieldSet.class, "defaultInstance", prevDefaultInstance);
            setStaticField(com.google.protobuf.GeneratedMessage.class, "alwaysUseFieldBuilders", prevAlwaysUseFieldBuilders);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#getPreviousMapping(int)}
 * @utbot.executesCondition {@code (lines.get(lineNumber) == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getOriginalMappingForEntry(entries.get(entries.size() - 1));
 *  */
    @Test
    public void testGetPreviousMapping_ThrowNullPointerException_3() throws Throwable  {
        Class unknownFieldSetClazz = Class.forName("com.google.protobuf.UnknownFieldSet");
        UnknownFieldSet prevDefaultInstance = ((UnknownFieldSet) getStaticFieldValue(unknownFieldSetClazz, "defaultInstance"));
        Class generatedMessageClazz = Class.forName("com.google.protobuf.GeneratedMessage");
        boolean prevAlwaysUseFieldBuilders = ((Boolean) getStaticFieldValue(generatedMessageClazz, "alwaysUseFieldBuilders"));
        try {
            UnknownFieldSet defaultInstance = ((UnknownFieldSet) createInstance("com.google.protobuf.UnknownFieldSet"));
            LinkedHashMap fields = new LinkedHashMap();
            setField(defaultInstance, "com.google.protobuf.UnknownFieldSet", "fields", fields);
            setStaticField(unknownFieldSetClazz, "defaultInstance", defaultInstance);
            setStaticField(generatedMessageClazz, "alwaysUseFieldBuilders", true);
            SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
            java.lang.String[] sources = new java.lang.String[9];
            String string = "";
            sources[0] = string;
            setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "sources", sources);
            ArrayList lines = new ArrayList();
            Object graphAnnotationState = createInstance("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState");
            lines.add(graphAnnotationState);
            lines.add(null);
            setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
            
            /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping] produces [java.lang.NullPointerException] */
            Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
            Class intType = int.class;
            Method getPreviousMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("getPreviousMapping", intType);
            getPreviousMappingMethod.setAccessible(true);
            java.lang.Object[] getPreviousMappingMethodArguments = new java.lang.Object[1];
            getPreviousMappingMethodArguments[0] = 1;
            try {
                getPreviousMappingMethod.invoke(sourceMapConsumerV3, getPreviousMappingMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(UnknownFieldSet.class, "defaultInstance", prevDefaultInstance);
            setStaticField(com.google.protobuf.GeneratedMessage.class, "alwaysUseFieldBuilders", prevAlwaysUseFieldBuilders);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createReverseMapping()
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()}
 * @utbot.iterates iterate the loop {@code for(int targetLine = 0; targetLine < lines.size(); targetLine++)} once
 *  */
    @Test
    public void testCreateReverseMapping_IterateForLoop() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Method createReverseMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("createReverseMapping");
        createReverseMappingMethod.setAccessible(true);
        java.lang.Object[] createReverseMappingMethodArguments = new java.lang.Object[0];
        createReverseMappingMethod.invoke(sourceMapConsumerV3, createReverseMappingMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()}
 * @utbot.iterates iterate the loop {@code for(int targetLine = 0; targetLine < lines.size(); targetLine++)} twice
 *  */
    @Test
    public void testCreateReverseMapping_EntriesEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Method createReverseMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("createReverseMapping");
        createReverseMappingMethod.setAccessible(true);
        java.lang.Object[] createReverseMappingMethodArguments = new java.lang.Object[0];
        createReverseMappingMethod.invoke(sourceMapConsumerV3, createReverseMappingMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()}
 * @utbot.iterates iterate the loop {@code for(int targetLine = 0; targetLine < lines.size(); targetLine++)} twice
 *  */
    @Test
    public void testCreateReverseMapping_EntriesNotEqualsNull() throws Exception  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        ArrayList arrayList = new ArrayList();
        lines.add(arrayList);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Method createReverseMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("createReverseMapping");
        createReverseMappingMethod.setAccessible(true);
        java.lang.Object[] createReverseMappingMethodArguments = new java.lang.Object[0];
        createReverseMappingMethod.invoke(sourceMapConsumerV3, createReverseMappingMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createReverseMapping()
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()}
 * @utbot.iterates iterate the loop {@code for(int targetLine = 0; targetLine < lines.size(); targetLine++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(Entry entry: entries)
 *  */
    @Test
    public void testCreateReverseMapping_ThrowClassCastException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList lines = new ArrayList();
        lines.add(lines);
        lines.add(null);
        lines.add(null);
        setField(sourceMapConsumerV3, "com.google.debugging.sourcemap.SourceMapConsumerV3", "lines", lines);
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class com.google.debugging.sourcemap.SourceMapConsumerV3$Entry (java.util.ArrayList is in module java.base of loader 'bootstrap'; com.google.debugging.sourcemap.SourceMapConsumerV3$Entry is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @a8e6393)]
            com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping(SourceMapConsumerV3.java:511) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Method createReverseMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("createReverseMapping");
        createReverseMappingMethod.setAccessible(true);
        java.lang.Object[] createReverseMappingMethodArguments = new java.lang.Object[0];
        try {
            createReverseMappingMethod.invoke(sourceMapConsumerV3, createReverseMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SourceMapConsumerV3}
 * @utbot.methodUnderTest {@link com.google.debugging.sourcemap.SourceMapConsumerV3#createReverseMapping()}
 * @utbot.iterates iterate the loop {@code for(int targetLine = 0; targetLine < lines.size(); targetLine++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int targetLine = 0; targetLine < lines.size(); targetLine++)
 *  */
    @Test
    public void testCreateReverseMapping_ThrowNullPointerException() throws Throwable  {
        SourceMapConsumerV3 sourceMapConsumerV3 = ((SourceMapConsumerV3) createInstance("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        
        /* This test fails because method [com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping] produces [java.lang.NullPointerException]
            com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping(SourceMapConsumerV3.java:507) */
        Class sourceMapConsumerV3Clazz = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Method createReverseMappingMethod = sourceMapConsumerV3Clazz.getDeclaredMethod("createReverseMapping");
        createReverseMappingMethod.setAccessible(true);
        java.lang.Object[] createReverseMappingMethodArguments = new java.lang.Object[0];
        try {
            createReverseMappingMethod.invoke(sourceMapConsumerV3, createReverseMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalMappingForEntry
    
    ///region Errors report for getOriginalMappingForEntry
    
    public void testGetOriginalMappingForEntry_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field memoizedHashCode is not declared in class com.google.protobuf.AbstractMessageLite
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields890714478184100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields890714478184100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass890714478215600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890714478184100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890714478215600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields890714481640300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields890714481640300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass890714481644200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890714481640300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890714481644200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields890714482024400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields890714482024400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass890714482039900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890714482024400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890714482039900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields890714482665200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields890714482665200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass890714482668400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890714482665200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890714482668400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

