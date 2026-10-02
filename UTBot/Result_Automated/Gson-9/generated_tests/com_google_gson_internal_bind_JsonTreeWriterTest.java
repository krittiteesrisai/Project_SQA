package com.google.gson.internal.bind;

import org.junit.Test;
import java.util.ArrayList;
import com.google.gson.JsonObject;
import java.io.IOException;
import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import java.lang.reflect.Method;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Comparator;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.io.Writer;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public final class com_google_gson_internal_bind_JsonTreeWriterTest {
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.name
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method name(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#name(java.lang.String)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testName_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.name] produces [java.lang.NullPointerException: name == null]
            com.google.gson.internal.bind.JsonTreeWriter.name(JsonTreeWriter.java:134) */
        jsonTreeWriter.name(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (stack.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testName_ThrowNullPointerException_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.name] produces [java.lang.NullPointerException: name == null]
            com.google.gson.internal.bind.JsonTreeWriter.name(JsonTreeWriter.java:134) */
        jsonTreeWriter.name(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (element instanceof JsonObject): True}
 * @utbot.returnsFrom {@code return this;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testName_ThrowNullPointerException_2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack.add(jsonObject);
        stack.add(jsonObject);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.name] produces [java.lang.NullPointerException: name == null]
            com.google.gson.internal.bind.JsonTreeWriter.name(JsonTreeWriter.java:134) */
        jsonTreeWriter.name(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (element instanceof JsonObject): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalStateException();
 *  */
    @Test
    public void testName_ThrowNullPointerException_3() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.name] produces [java.lang.NullPointerException: name == null]
            com.google.gson.internal.bind.JsonTreeWriter.name(JsonTreeWriter.java:134) */
        jsonTreeWriter.name(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testName_ThrowNullPointerException_4() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.name] produces [java.lang.NullPointerException: name == null]
            com.google.gson.internal.bind.JsonTreeWriter.name(JsonTreeWriter.java:134) */
        jsonTreeWriter.name(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method name(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#name(java.lang.String)}
     */
    @Test
    public void testNameThrowsISEWithNonEmptyString() throws IOException  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.name] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.name(JsonTreeWriter.java:137) */
        jsonTreeWriter.name("-\uFFF43");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#get()}
 * @utbot.executesCondition {@code (!stack.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return product;}
 *  */
    @Test
    public void testGet_StackIsEmpty() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonArray product = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        
        JsonArray actual = ((JsonArray) jsonTreeWriter.get());
        
        // com.google.gson.JsonArray is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(product, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#get()}
 * @utbot.executesCondition {@code (!stack.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !stack.isEmpty()
 *  */
    @Test
    public void testGet_ThrowIllegalStateException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.get] produces [java.lang.IllegalStateException: Expected one JSON element but was [null, null, null, null, null, null, null, null, null, null]]
            com.google.gson.internal.bind.JsonTreeWriter.get(JsonTreeWriter.java:66) */
        jsonTreeWriter.get();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#get()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !stack.isEmpty()
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.get] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.get(JsonTreeWriter.java:65) */
        jsonTreeWriter.get();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method get()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#get()}
     */
    @Test
    public void testGet() {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonNull actual = ((JsonNull) jsonTreeWriter.get());
        
        JsonNull expected = new JsonNull();
        
        // com.google.gson.JsonNull has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(com.google.gson.JsonElement)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): True}
 * @utbot.executesCondition {@code (getSerializeNulls()): False}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#getSerializeNulls()}
 *  */
    @Test
    public void testPut_NotGetSerializeNulls() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        JsonNull jsonNull = new JsonNull();
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonNullType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonNull;
        putMethod.invoke(jsonTreeWriter, putMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 *  */
    @Test
    public void testPut_StackIsEmpty() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonObject product = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonElementType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonElementType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = ((Object) null);
        putMethod.invoke(jsonTreeWriter, putMethodArguments);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertNull(finalJsonTreeWriterProduct);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (stack.isEmpty()): False}
 * @utbot.executesCondition {@code (element instanceof JsonArray): True}
 *  */
    @Test
    public void testPut_ElementInstanceOfJsonArray() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
        objectArray[1] = ((Object) jsonArray);
        stack.add(objectArray);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonPrimitiveType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonPrimitiveType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonPrimitive;
        putMethod.invoke(jsonTreeWriter, putMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (stack.isEmpty()): False}
 * @utbot.executesCondition {@code (element instanceof JsonArray): True}
 *  */
    @Test
    public void testPut_ElementInstanceOfJsonArray_1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
            setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
            stack.add(jsonArray);
            stack.add(jsonArray);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
            Class jsonElementType = Class.forName("com.google.gson.JsonElement");
            Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonElementType);
            putMethod.setAccessible(true);
            java.lang.Object[] putMethodArguments = new java.lang.Object[1];
            putMethodArguments[0] = ((Object) null);
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): False}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.invokes {@link com.google.gson.JsonObject#add(java.lang.String,com.google.gson.JsonElement)}
 *  */
    @Test
    public void testPut_ValueIsJsonNull() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object header = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            setField(header, "com.google.gson.internal.LinkedTreeMap$Node", "prev", header);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "header", header);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            JsonArray jsonArray = new JsonArray();
            
            Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
            Class jsonArrayType = Class.forName("com.google.gson.JsonElement");
            Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonArrayType);
            putMethod.setAccessible(true);
            java.lang.Object[] putMethodArguments = new java.lang.Object[1];
            putMethodArguments[0] = jsonArray;
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(com.google.gson.JsonElement)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: JsonObject object = (JsonObject) peek();
 *  */
    @Test
    public void testPut_ThrowIndexOutOfBoundsException() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        JsonArray jsonArray = new JsonArray();
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonArrayType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonArrayType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonArray;
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): True}
 * @utbot.executesCondition {@code (getSerializeNulls()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonObject object = (JsonObject) peek();
 *  */
    @Test
    public void testPut_ThrowClassCastException() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        stack.add(jsonPrimitive);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setSerializeNulls(true);
        JsonNull jsonNull = new JsonNull();
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.ClassCastException: class com.google.gson.JsonPrimitive cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonPrimitive and com.google.gson.JsonObject are in unnamed module of loader 'app')]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonNullType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonNull;
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (stack.isEmpty()): False}
 * @utbot.executesCondition {@code (element instanceof JsonArray): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: element instanceof JsonArray
 *  */
    @Test
    public void testPut_ThrowIllegalStateException() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonElementType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonElementType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = ((Object) null);
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): True}
 * @utbot.executesCondition {@code (getSerializeNulls()): True}
 * @utbot.invokes {@link com.google.gson.JsonObject#add(java.lang.String,com.google.gson.JsonElement)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: object.add(pendingName, value);
 *  */
    @Test
    public void testPut_ThrowClassCastException_1() throws Throwable  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.security.x509.AVAComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            int[] key = {};
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            JsonNull jsonNull = new JsonNull();
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
                java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
                com.google.gson.internal.LinkedTreeMap.find(LinkedTreeMap.java:139)
                com.google.gson.internal.LinkedTreeMap.put(LinkedTreeMap.java:97)
                com.google.gson.JsonObject.add(JsonObject.java:58)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79) */
            Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
            Class jsonNullType = Class.forName("com.google.gson.JsonElement");
            Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
            putMethod.setAccessible(true);
            java.lang.Object[] putMethodArguments = new java.lang.Object[1];
            putMethodArguments[0] = jsonNull;
            try {
                putMethod.invoke(jsonTreeWriter, putMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.invokes {@link com.google.gson.JsonElement#isJsonNull()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !value.isJsonNull() || getSerializeNulls()
 *  */
    @Test
    public void testPut_ThrowNullPointerException() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:77) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonElementType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonElementType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = ((Object) null);
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.isEmpty()
 *  */
    @Test
    public void testPut_ThrowNullPointerException_1() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonElementType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonElementType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = ((Object) null);
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonObject object = (JsonObject) peek();
 *  */
    @Test
    public void testPut_ThrowNullPointerException_2() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        JsonArray jsonArray = new JsonArray();
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonArrayType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonArrayType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonArray;
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): True}
 * @utbot.executesCondition {@code (getSerializeNulls()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonObject object = (JsonObject) peek();
 *  */
    @Test
    public void testPut_ThrowNullPointerException_3() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setSerializeNulls(true);
        JsonNull jsonNull = new JsonNull();
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonNullType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonNull;
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.executesCondition {@code (!value.isJsonNull()): True}
 * @utbot.executesCondition {@code (getSerializeNulls()): True}
 * @utbot.invokes {@link com.google.gson.JsonObject#add(java.lang.String,com.google.gson.JsonElement)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: object.add(pendingName, value);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_4() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setSerializeNulls(true);
        JsonNull jsonNull = new JsonNull();
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonNullType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonNull;
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method put(com.google.gson.JsonElement)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)}
     */
    @Test
    public void testPut() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(false);
        JsonArray jsonArray = new JsonArray();
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonArrayType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonArrayType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonArray;
        putMethod.invoke(jsonTreeWriter, putMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method put(com.google.gson.JsonElement)
    
    @Test
    public void testPut1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack.add(jsonObject);
        stack.add(jsonObject);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonObjectType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonObjectType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonObject;
        putMethod.invoke(jsonTreeWriter, putMethodArguments);
    }
    
    @Test
    public void testPut2() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            JsonNull jsonNull = new JsonNull();
            
            Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
            Class jsonNullType = Class.forName("com.google.gson.JsonElement");
            Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
            putMethod.setAccessible(true);
            java.lang.Object[] putMethodArguments = new java.lang.Object[1];
            putMethodArguments[0] = jsonNull;
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    @Test
    public void testPut3() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
            ArrayList elements = new ArrayList();
            setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
            stack.add(jsonArray);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
            Class jsonElementType = Class.forName("com.google.gson.JsonElement");
            Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonElementType);
            putMethod.setAccessible(true);
            java.lang.Object[] putMethodArguments = new java.lang.Object[1];
            putMethodArguments[0] = ((Object) null);
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method put(com.google.gson.JsonElement)
    
    @Test
    public void testPut4() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setSerializeNulls(true);
        JsonNull jsonNull = new JsonNull();
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.put] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class jsonNullType = Class.forName("com.google.gson.JsonElement");
        Method putMethod = jsonTreeWriterClazz.getDeclaredMethod("put", jsonNullType);
        putMethod.setAccessible(true);
        java.lang.Object[] putMethodArguments = new java.lang.Object[1];
        putMethodArguments[0] = jsonNull;
        try {
            putMethod.invoke(jsonTreeWriter, putMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for put
    
    public void testPut_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(long)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_Return() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(-255L));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_Return_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
        objectArray[1] = ((Object) jsonArray);
        stack.add(objectArray);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(-255L));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_Return_2() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.util.locale.provider.CalendarNameProviderImpl$LengthBasedComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object header = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            Object prev = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            setField(header, "com.google.gson.internal.LinkedTreeMap$Node", "prev", prev);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "header", header);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(-255L));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(long)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testValue_ThrowIndexOutOfBoundsException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:182) */
        jsonTreeWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowClassCastException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        stack.add(jsonPrimitive);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class com.google.gson.JsonPrimitive cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonPrimitive and com.google.gson.JsonObject are in unnamed module of loader 'app')]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:182) */
        jsonTreeWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowIllegalStateException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:182) */
        jsonTreeWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:182) */
        jsonTreeWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:182) */
        jsonTreeWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:182) */
        jsonTreeWriter.value(-255L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method value(long)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(long)}
     */
    @Test
    public void testValue() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(-9L));
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(long)
    
    @Test
    public void testValue1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(0L));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    @Test
    public void testValue2() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(-254L));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region Errors report for value
    
    public void testValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.value
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method value(boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(boolean)}
     */
    @Test
    public void testValue3() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(true));
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region Errors report for value
    
    public void testValue_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 6 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(double)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_Return1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonNull product = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        jsonTreeWriter.setLenient(true);
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(java.lang.Double.NaN));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_Return_11() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
        objectArray[1] = ((Object) jsonArray);
        stack.add(objectArray);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        jsonTreeWriter.setLenient(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(java.lang.Double.NaN));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_DoubleIsInfinite() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object header = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            setField(header, "com.google.gson.internal.LinkedTreeMap$Node", "prev", header);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "header", header);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(1.265E-321));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(double)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isLenient() && (Double.isNaN(value) || Double.isInfinite(value))
 *  */
    @Test
    public void testValue_ThrowIllegalArgumentException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalArgumentException: JSON forbids NaN and infinities: NaN]
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:175) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isLenient() && (Double.isNaN(value) || Double.isInfinite(value))
 *  */
    @Test
    public void testValue_ThrowIllegalArgumentException_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalArgumentException: JSON forbids NaN and infinities: Infinity]
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:175) */
        jsonTreeWriter.value(java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testValue_ThrowIndexOutOfBoundsException1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(-0.0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowClassCastException1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        stack.add(jsonPrimitive);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class com.google.gson.JsonPrimitive cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonPrimitive and com.google.gson.JsonObject are in unnamed module of loader 'app')]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testValue_ThrowClassCastException_1() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.security.x509.AVAComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setLenient(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
                java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
                com.google.gson.internal.LinkedTreeMap.find(LinkedTreeMap.java:139)
                com.google.gson.internal.LinkedTreeMap.put(LinkedTreeMap.java:97)
                com.google.gson.JsonObject.add(JsonObject.java:58)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
            jsonTreeWriter.value(java.lang.Double.NaN);
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowIllegalStateException1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        jsonTreeWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        jsonTreeWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_11() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(-3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_21() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_3() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method value(double)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(double)}
     */
    @Test
    public void testValue4() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(-1.1125369292536007E-308));
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(double)
    
    @Test
    public void testValue5() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", key);
            jsonTreeWriter.setLenient(true);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(3.337610787760802E-308));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertTrue(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(double)
    
    @Test
    public void testValue6() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(java.lang.Double.NaN);
    }
    
    @Test
    public void testValue7() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(-2.000000000000001);
    }
    
    @Test
    public void testValue8() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:177) */
        jsonTreeWriter.value(-3.337610787760802E-308);
    }
    ///endregion
    
    ///region Errors report for value
    
    public void testValue_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.returnsFrom {@code return nullValue();}
 *  */
    @Test
    public void testValue_ValueEqualsNull() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(((String) null)));
            
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertNull(actualStack);
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_ValueNotEqualsNull() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        String string = "";
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(string));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_ValueNotEqualsNull_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String string = "";
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(string));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testValue_ThrowIndexOutOfBoundsException2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
        jsonTreeWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowClassCastException2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        stack.add(jsonPrimitive);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class com.google.gson.JsonPrimitive cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonPrimitive and com.google.gson.JsonObject are in unnamed module of loader 'app')]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
        jsonTreeWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testValue_ThrowClassCastException_11() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.security.x509.AVAComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            byte[] key = {};
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            String string = "";
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
                java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
                com.google.gson.internal.LinkedTreeMap.find(LinkedTreeMap.java:139)
                com.google.gson.internal.LinkedTreeMap.put(LinkedTreeMap.java:97)
                com.google.gson.JsonObject.add(JsonObject.java:58)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
            jsonTreeWriter.value(string);
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowIllegalStateException2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
        jsonTreeWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
        jsonTreeWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_12() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
        jsonTreeWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_22() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:149) */
            jsonTreeWriter.value(((String) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_31() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        String string = "";
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:151) */
        jsonTreeWriter.value(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method value(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.String)}
     */
    @Test
    public void testValueWithNonEmptyString() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value("-\uFFF43"));
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(java.lang.String)
    
    @Test
    public void testValue9() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(((String) null)));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testValue10() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String string = "";
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(string));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    @Test
    public void testValue11() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            String string = "";
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(string));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(java.lang.String)
    
    @Test
    public void testValue12() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:149) */
            jsonTreeWriter.value(((String) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region Errors report for value
    
    public void testValue_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.returnsFrom {@code return nullValue();}
 *  */
    @Test
    public void testValue_ValueEqualsNull1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(((Number) null)));
            
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertNull(actualStack);
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_ValueNotEqualsNull1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        jsonTreeWriter.setLenient(true);
        Integer integer = 0;
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(integer));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testValue_ValueNotEqualsNull_11() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        jsonTreeWriter.setLenient(true);
        Long long1 = 0L;
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(((Number) long1)));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: Double.isNaN(d) || Double.isInfinite(d)
 *  */
    @Test
    public void testValue_ThrowIllegalArgumentException1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        Double double1 = java.lang.Double.NaN;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalArgumentException: JSON forbids NaN and infinities: NaN]
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:194) */
        jsonTreeWriter.value(((Number) double1));
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: Double.isNaN(d) || Double.isInfinite(d)
 *  */
    @Test
    public void testValue_ThrowIllegalArgumentException_11() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        Double double1 = java.lang.Double.POSITIVE_INFINITY;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalArgumentException: JSON forbids NaN and infinities: Infinity]
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:194) */
        jsonTreeWriter.value(((Number) double1));
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIndexOutOfBoundsException3() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.get(ArrayList.java:427)
                com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:188) */
            jsonTreeWriter.value(((Number) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowClassCastException3() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        Integer integer = 0;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class com.google.gson.JsonArray cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonArray and com.google.gson.JsonObject are in unnamed module of loader 'app')]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
        jsonTreeWriter.value(integer);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testValue_ThrowClassCastException_12() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.security.x509.AVAComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            short[] key = {};
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setLenient(true);
            Integer integer = 0;
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
                java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
                com.google.gson.internal.LinkedTreeMap.find(LinkedTreeMap.java:139)
                com.google.gson.internal.LinkedTreeMap.put(LinkedTreeMap.java:97)
                com.google.gson.JsonObject.add(JsonObject.java:58)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
            jsonTreeWriter.value(integer);
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowIllegalStateException3() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        jsonTreeWriter.setLenient(true);
        Double double1 = 0.0;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
        jsonTreeWriter.value(((Number) double1));
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException3() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        jsonTreeWriter.setLenient(true);
        Integer integer = 0;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
        jsonTreeWriter.value(integer);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_13() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        Integer integer = 0;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
        jsonTreeWriter.value(integer);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_23() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        Integer integer = -50338856;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
        jsonTreeWriter.value(integer);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#put(com.google.gson.JsonElement)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_32() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:188) */
            jsonTreeWriter.value(((Number) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_4() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:188) */
            jsonTreeWriter.value(((Number) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(new JsonPrimitive(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_5() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        jsonTreeWriter.setLenient(true);
        Double double1 = 0.0;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:198) */
        jsonTreeWriter.value(((Number) double1));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method value(java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#value(java.lang.Number)}
     */
    @Test
    public void testValue13() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class numberType = Class.forName("java.lang.Number");
        Method valueMethod = jsonTreeWriterClazz.getDeclaredMethod("value", numberType);
        valueMethod.setAccessible(true);
        java.lang.Object[] valueMethodArguments = new java.lang.Object[1];
        valueMethodArguments[0] = (byte) -1;
        JsonTreeWriter actual = ((JsonTreeWriter) valueMethod.invoke(jsonTreeWriter, valueMethodArguments));
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonPrimitive product = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(java.lang.Number)
    
    @Test
    public void testValue14() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        Integer integer = 612370432;
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(integer));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    @Test
    public void testValue15() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        jsonTreeWriter.setLenient(true);
        Float float1 = 0.0f;
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(float1));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    @Test
    public void testValue16() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        jsonTreeWriter.setLenient(true);
        Float float1 = 0.0f;
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(float1));
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    @Test
    public void testValue17() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", key);
            jsonTreeWriter.setLenient(true);
            Long long1 = 0L;
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.value(((Number) long1)));
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertTrue(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(java.lang.Number)
    
    @Test
    public void testValue18() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        Double double1 = java.lang.Double.NEGATIVE_INFINITY;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalArgumentException: JSON forbids NaN and infinities: -Infinity]
            com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:194) */
        jsonTreeWriter.value(((Number) double1));
    }
    
    @Test
    public void testValue19() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            stack.add(null);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.value] produces [java.lang.IllegalStateException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.internal.bind.JsonTreeWriter.value(JsonTreeWriter.java:188) */
            jsonTreeWriter.value(((Number) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region Errors report for value
    
    public void testValue_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.flush
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#flush()}
 *  */
    @Test
    public void testFlush() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        jsonTreeWriter.flush();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method flush()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#flush()}
     */
    @Test
    public void testFlush1() throws IOException  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        jsonTreeWriter.flush();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#close()}
 * @utbot.executesCondition {@code (!stack.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testClose_StackIsEmpty() throws Exception  {
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        JsonPrimitive prevSENTINEL_CLOSED = ((JsonPrimitive) getStaticFieldValue(jsonTreeWriterClazz, "SENTINEL_CLOSED"));
        try {
            JsonPrimitive sentinelClosed = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
            String value = "closed";
            setField(sentinelClosed, "com.google.gson.JsonPrimitive", "value", value);
            setStaticField(jsonTreeWriterClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            jsonTreeWriter.close();
        } finally {
            setStaticField(JsonTreeWriter.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#close()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !stack.isEmpty()
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.close] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.close(JsonTreeWriter.java:206) */
        jsonTreeWriter.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#close()}
 * @utbot.executesCondition {@code (!stack.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.io.IOException} when: !stack.isEmpty()
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        jsonTreeWriter.close();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method close()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#close()}
     */
    @Test
    public void testClose() throws IOException  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        jsonTreeWriter.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.peek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#peek()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return stack.get(stack.size() - 1);}
 *  */
    @Test
    public void testPeek_ListGet() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Method peekMethod = jsonTreeWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        JsonElement actual = ((JsonElement) peekMethod.invoke(jsonTreeWriter, peekMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#peek()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return stack.get(stack.size() - 1);
 *  */
    @Test
    public void testPeek_ThrowIndexOutOfBoundsException() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.peek] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Method peekMethod = jsonTreeWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonTreeWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#peek()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stack.get(stack.size() - 1);
 *  */
    @Test
    public void testPeek_ThrowNullPointerException() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.peek] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Method peekMethod = jsonTreeWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonTreeWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method peek()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#peek()}
     */
    @Test
    public void testPeekThrowsIOOBE() throws Throwable  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.peek] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72) */
        Class jsonTreeWriterClazz = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Method peekMethod = jsonTreeWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonTreeWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.endObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endObject()}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (element instanceof JsonObject): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEndObject_ElementInstanceOfJsonObject() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack.add(jsonObject);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.endObject());
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endObject()}
 * @utbot.executesCondition {@code (stack.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endObject] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endObject(JsonTreeWriter.java:122) */
        jsonTreeWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endObject()}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (element instanceof JsonObject): False}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException();
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endObject] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endObject(JsonTreeWriter.java:129) */
        jsonTreeWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endObject()}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endObject] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endObject(JsonTreeWriter.java:122) */
        jsonTreeWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endObject()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endObject] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.endObject(JsonTreeWriter.java:121) */
        jsonTreeWriter.endObject();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method endObject()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endObject()}
     */
    @Test
    public void testEndObjectThrowsISE() throws IOException  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endObject] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endObject(JsonTreeWriter.java:122) */
        jsonTreeWriter.endObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.beginArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testBeginArray_Return() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonObject product = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginArray());
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testBeginArray_Return_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
        objectArray[1] = ((Object) jsonArray);
        stack.add(objectArray);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginArray());
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testBeginArray_ThrowIndexOutOfBoundsException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
        jsonTreeWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(array);
 *  */
    @Test
    public void testBeginArray_ThrowClassCastException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.ClassCastException: class com.google.gson.JsonArray cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonArray and com.google.gson.JsonObject are in unnamed module of loader 'app')]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
        jsonTreeWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: put(array);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
            com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
        jsonTreeWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testBeginArray_ThrowClassCastException_1() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.security.x509.AVAComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            byte[] key = {};
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
                java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
                com.google.gson.internal.LinkedTreeMap.find(LinkedTreeMap.java:139)
                com.google.gson.internal.LinkedTreeMap.put(LinkedTreeMap.java:97)
                com.google.gson.JsonObject.add(JsonObject.java:58)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
            jsonTreeWriter.beginArray();
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(array);
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
            com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
        jsonTreeWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(array);
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
            com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
        jsonTreeWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(array);
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
            com.google.gson.internal.bind.JsonTreeWriter.beginArray(JsonTreeWriter.java:96) */
        jsonTreeWriter.beginArray();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method beginArray()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginArray()}
     */
    @Test
    public void testBeginArray() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginArray());
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack.add(jsonArray);
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonArray product = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method beginArray()
    
    @Test
    public void testBeginArray1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginArray());
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
    }
    
    @Test
    public void testBeginArray2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginArray());
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    @Test
    public void testBeginArray3() throws Exception  {
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginArray());
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region Errors report for beginArray
    
    public void testBeginArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.nullValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nullValue()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link com.google.gson.JsonElement#isJsonNull()}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeWriter#getSerializeNulls()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testNullValue_Return() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
            
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertNull(actualStack);
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testNullValue_Return_1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            JsonObject product = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
            
            JsonElement initialJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement jsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
            JsonElement finalJsonTreeWriterProduct = ((JsonElement) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            
            assertFalse(initialJsonTreeWriterProduct == finalJsonTreeWriterProduct);
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.invokes {@link com.google.gson.JsonArray#add(com.google.gson.JsonElement)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testNullValue_Return_2() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
            setField(jsonArray, "com.google.gson.JsonArray", "elements", stack);
            stack.add(jsonArray);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nullValue()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowIndexOutOfBoundsException() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.get(ArrayList.java:427)
                com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowClassCastException() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
            stack.add(jsonPrimitive);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.ClassCastException: class com.google.gson.JsonPrimitive cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonPrimitive and com.google.gson.JsonObject are in unnamed module of loader 'app')]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link com.google.gson.JsonObject#add(java.lang.String,com.google.gson.JsonElement)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowClassCastException_1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("sun.security.x509.AVAComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            byte[] key = {};
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class sun.security.x509.AVA (java.lang.String and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
                java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
                com.google.gson.internal.LinkedTreeMap.find(LinkedTreeMap.java:139)
                com.google.gson.internal.LinkedTreeMap.put(LinkedTreeMap.java:97)
                com.google.gson.JsonObject.add(JsonObject.java:58)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            stack.add(null);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.IllegalStateException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:89)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(JsonNull.INSTANCE);
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_2() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.nullValue] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156) */
            jsonTreeWriter.nullValue();
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nullValue()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#nullValue()}
     */
    @Test
    public void testNullValue() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonNull product = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nullValue()
    
    @Test
    public void testNullValue1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
            ArrayList elements = new ArrayList();
            setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
            stack.add(jsonArray);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testNullValue2() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
            ArrayList elements = new ArrayList();
            setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
            stack.add(jsonArray);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertFalse(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testNullValue3() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        Class linkedTreeMapClazz = Class.forName("com.google.gson.internal.LinkedTreeMap");
        Comparator prevNATURAL_ORDER = ((Comparator) getStaticFieldValue(linkedTreeMapClazz, "NATURAL_ORDER"));
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            Comparator naturalOrder = ((Comparator) createInstance("com.google.gson.internal.LinkedTreeMap$1"));
            setStaticField(linkedTreeMapClazz, "NATURAL_ORDER", naturalOrder);
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
            LinkedTreeMap members = ((LinkedTreeMap) createInstance("com.google.gson.internal.LinkedTreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(members, "com.google.gson.internal.LinkedTreeMap", "comparator", comparator);
            Object root = createInstance("com.google.gson.internal.LinkedTreeMap$Node");
            String key = "";
            setField(root, "com.google.gson.internal.LinkedTreeMap$Node", "key", key);
            setField(members, "com.google.gson.internal.LinkedTreeMap", "root", root);
            setField(jsonObject, "com.google.gson.JsonObject", "members", members);
            stack.add(jsonObject);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.nullValue());
            
            List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
            assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
            
            String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
            assertNull(actualPendingName);
            
            JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
            assertNull(actualProduct);
            
            Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
            assertNull(actualOut);
            
            int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
            assertNull(actualStack1);
            
            int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
            int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
            assertEquals(jsonTreeWriterStackSize, actualStackSize);
            
            String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
            assertNull(actualIndent);
            
            String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
            assertNull(actualSeparator);
            
            boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
            assertFalse(actualLenient);
            
            boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
            assertFalse(actualHtmlSafe);
            
            String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
            assertNull(actualDeferredName);
            
            boolean actualSerializeNulls = actual.getSerializeNulls();
            assertTrue(actualSerializeNulls);
            
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
            setStaticField(LinkedTreeMap.class, "NATURAL_ORDER", prevNATURAL_ORDER);
        }
    }
    ///endregion
    
    ///region Errors report for nullValue
    
    public void testNullValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.beginObject
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method beginObject()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#beginObject()}
     */
    @Test
    public void testBeginObject() throws Exception  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.beginObject());
        
        JsonTreeWriter expected = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack.add(jsonObject);
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        JsonObject product = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        setField(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product", product);
        Writer out = ((Writer) createInstance("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setField(expected, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack1 = new int[32];
        stack1[0] = 6;
        setField(expected, "com.google.gson.stream.JsonWriter", "stack", stack1);
        setField(expected, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = ":";
        setField(expected, "com.google.gson.stream.JsonWriter", "separator", separator);
        expected.setSerializeNulls(true);
        
        List expectedStack = ((List) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement expectedProduct = ((JsonElement) getFieldValue(expected, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        
        Writer expectedOut = ((Writer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        
        int[] expectedStack1 = ((int[]) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int expectedStack1Size = expectedStack1.length;
        assertEquals(expectedStack1Size, actualStack1.length);
        assertArrayEquals(expectedStack1, actualStack1);
        
        int expectedStackSize = ((Integer) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(expectedStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String expectedSeparator = ((String) getFieldValue(expected, "com.google.gson.stream.JsonWriter", "separator"));
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertEquals(expectedSeparator, actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertTrue(actualSerializeNulls);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeWriter.endArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endArray()}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (element instanceof JsonArray): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEndArray_ElementInstanceOfJsonArray() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack.add(jsonArray);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        JsonTreeWriter actual = ((JsonTreeWriter) jsonTreeWriter.endArray());
        
        List jsonTreeWriterStack = ((List) getFieldValue(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        List actualStack = ((List) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "stack"));
        assertTrue(deepEquals(jsonTreeWriterStack, actualStack));
        
        String actualPendingName = ((String) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName"));
        assertNull(actualPendingName);
        
        JsonElement actualProduct = ((JsonElement) getFieldValue(actual, "com.google.gson.internal.bind.JsonTreeWriter", "product"));
        assertNull(actualProduct);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack1 = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack1);
        
        int jsonTreeWriterStackSize = ((Integer) getFieldValue(jsonTreeWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonTreeWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endArray()}
 * @utbot.executesCondition {@code (stack.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endArray] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endArray(JsonTreeWriter.java:103) */
        jsonTreeWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endArray()}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): False}
 * @utbot.executesCondition {@code (element instanceof JsonArray): False}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeWriter#peek()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException();
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endArray] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endArray(JsonTreeWriter.java:110) */
        jsonTreeWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endArray()}
 * @utbot.executesCondition {@code (stack.isEmpty()): True}
 * @utbot.executesCondition {@code (pendingName != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
        String pendingName = "";
        setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endArray] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endArray(JsonTreeWriter.java:103) */
        jsonTreeWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeWriter}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endArray()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.isEmpty() || pendingName != null
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException() throws Exception  {
        JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeWriter.endArray(JsonTreeWriter.java:102) */
        jsonTreeWriter.endArray();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method endArray()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeWriter#endArray()}
     */
    @Test
    public void testEndArrayThrowsISE() throws IOException  {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        jsonTreeWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeWriter.endArray] produces [java.lang.IllegalStateException]
            com.google.gson.internal.bind.JsonTreeWriter.endArray(JsonTreeWriter.java:103) */
        jsonTreeWriter.endArray();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1015515088762300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1015515088762300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1015515088778100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015515088762300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015515088778100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1015515094195400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1015515094195400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1015515094205200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015515094195400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015515094205200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1015515094769500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1015515094769500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1015515094914600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015515094769500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015515094914600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1015515095482800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1015515095482800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1015515095491500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015515095482800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015515095491500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

