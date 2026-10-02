package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_ser_std_JsonValueSerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.serialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getName()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in:  catch (Exception e) {
 *     Throwable t = e;
 *     while (t instanceof InvocationTargetException && t.getCause() != null) {
 *         t = t.getCause();
 *     }
 *     if (t instanceof Error) {
 *         throw (Error) t;
 *     }
 *     throw JsonMappingException.wrapWithPath(t, bean, _accessorMethod.getName() + "()");
 * }
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.serialize(JsonValueSerializer.java:191) */
        jsonValueSerializer.serialize(null, null, null);
    }
    ///endregion
    
    ///region Errors report for serialize
    
    public void testSerialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.toString
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final JavaType type = _accessorMethod.getType();
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.acceptJsonFormatVisitor(JsonValueSerializer.java:268) */
        jsonValueSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.serializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeWithType(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#serializeWithType(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getName()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in:  catch (Exception e) {
 *     Throwable t = e;
 *     while (t instanceof InvocationTargetException && t.getCause() != null) {
 *         t = t.getCause();
 *     }
 *     if (t instanceof Error) {
 *         throw (Error) t;
 *     }
 *     throw JsonMappingException.wrapWithPath(t, bean, _accessorMethod.getName() + "()");
 * }
 *  */
    @Test
    public void testSerializeWithType_ThrowNullPointerException() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.serializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.serializeWithType(JsonValueSerializer.java:240) */
        jsonValueSerializer.serializeWithType(null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for serializeWithType
    
    public void testSerializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_valueSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema__valueSerializerInstanceOfSchemaAware() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        UnknownSerializer _valueSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        
        JsonNode actual = jsonValueSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_valueSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema__valueSerializerInstanceOfSchemaAware_2() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        FailingSerializer _valueSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        
        JsonNode actual = jsonValueSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_valueSerializer instanceof SchemaAware): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonschema.JsonSchema#getDefaultSchemaNode()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#put(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonschema.JsonSchema#getDefaultSchemaNode()}
 * @utbot.returnsFrom {@code return com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();}
 *  */
    @Test
    public void testGetSchema_Not_valueSerializerNotInstanceOfSchemaAware() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
            TypeWrappedSerializer _valueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
            
            ObjectNode actual = ((ObjectNode) jsonValueSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "any";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_valueSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema__valueSerializerInstanceOfSchemaAware_1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
            NullSerializer _valueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
            
            ObjectNode actual = ((ObjectNode) jsonValueSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_valueSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema__valueSerializerInstanceOfSchemaAware_3() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
            StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            TypeWrappedSerializer _delegateSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
            
            ObjectNode actual = ((ObjectNode) jsonValueSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_valueSerializer instanceof SchemaAware): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.jsonschema.SchemaAware#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)} twice
    /// return from: {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_valueSerializerGetSchema() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnknownSerializer _delegateSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        
        JsonNode actual = jsonValueSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_valueSerializerGetSchema_2() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        FailingSerializer _delegateSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        
        JsonNode actual = jsonValueSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_valueSerializerGetSchema_3() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnknownSerializer _delegateSerializer1 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
        setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        
        JsonNode actual = jsonValueSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _valueSerializer).getSchema(provider, null);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_valueSerializerGetSchema_1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
            StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
            
            ObjectNode actual = ((ObjectNode) jsonValueSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    @Test(expected = StackOverflowError.class)
    public void testGetSchema1() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _valueSerializer);
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        
        jsonValueSerializer.getSchema(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer._notNullClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _notNullClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#_notNullClass(java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null)): False}
 * @utbot.returnsFrom {@code return (cls == null) ? Object.class : (Class<Object>) cls;}
 *  */
    @Test
    public void test_notNullClass_ClsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class jsonValueSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class class1Type = Class.forName("java.lang.Class");
        Method _notNullClassMethod = jsonValueSerializerClazz.getDeclaredMethod("_notNullClass", class1Type);
        _notNullClassMethod.setAccessible(true);
        java.lang.Object[] _notNullClassMethodArguments = new java.lang.Object[1];
        _notNullClassMethodArguments[0] = class1;
        Class actual = ((Class) _notNullClassMethod.invoke(null, _notNullClassMethodArguments));
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#_notNullClass(java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null)): True}
 * @utbot.returnsFrom {@code return (cls == null) ? Object.class : (Class<Object>) cls;}
 *  */
    @Test
    public void test_notNullClass_ClsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class jsonValueSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class classType = Class.forName("java.lang.Class");
        Method _notNullClassMethod = jsonValueSerializerClazz.getDeclaredMethod("_notNullClass", classType);
        _notNullClassMethod.setAccessible(true);
        java.lang.Object[] _notNullClassMethodArguments = new java.lang.Object[1];
        _notNullClassMethodArguments[0] = ((Object) null);
        Class actual = ((Class) _notNullClassMethod.invoke(null, _notNullClassMethodArguments));
        
        Class expected = Object.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withResolved(com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonSerializer, boolean)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#withResolved(com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean)}
 * @utbot.executesCondition {@code (_property == property): True}
 * @utbot.executesCondition {@code (_valueSerializer == ser): True}
 * @utbot.executesCondition {@code (forceTypeInfo == _forceTypeInformation): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithResolved_ForceTypeInfoEquals_forceTypeInformation() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        
        JsonValueSerializer actual = jsonValueSerializer.withResolved(null, null, false);
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        assertNull(actual_valueSerializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withResolved(com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonSerializer, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new JsonValueSerializer(this, property, ser, forceTypeInfo);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#withResolved(com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean)}
 * @utbot.executesCondition {@code (_property == property): False}
 * @utbot.returnsFrom {@code return new JsonValueSerializer(this, property, ser, forceTypeInfo);}
 *  */
    @Test
    public void testWithResolved__propertyNotEqualsProperty() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_property", _property);
        Class _handledType = Object.class;
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        Class initialJsonValueSerializer_handledType = jsonValueSerializer._handledType;
        
        JsonValueSerializer actual = jsonValueSerializer.withResolved(null, null, false);
        
        JsonValueSerializer expected = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        assertNull(actual_valueSerializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalJsonValueSerializer_handledType = jsonValueSerializer._handledType;
        
        assertFalse(initialJsonValueSerializer_handledType == finalJsonValueSerializer_handledType);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#withResolved(com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean)}
 * @utbot.executesCondition {@code (_property == property): True}
 * @utbot.executesCondition {@code (_valueSerializer == ser): False}
 * @utbot.returnsFrom {@code return new JsonValueSerializer(this, property, ser, forceTypeInfo);}
 *  */
    @Test
    public void testWithResolved__valueSerializerNotEqualsSer() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        NumberSerializers.IntLikeSerializer _valueSerializer = ((NumberSerializers.IntLikeSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        Class _handledType = Object.class;
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        Class initialJsonValueSerializer_handledType = jsonValueSerializer._handledType;
        
        JsonValueSerializer actual = jsonValueSerializer.withResolved(null, null, false);
        
        JsonValueSerializer expected = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        assertNull(actual_valueSerializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalJsonValueSerializer_handledType = jsonValueSerializer._handledType;
        
        assertFalse(initialJsonValueSerializer_handledType == finalJsonValueSerializer_handledType);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#withResolved(com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean)}
 * @utbot.executesCondition {@code (_property == property): True}
 * @utbot.executesCondition {@code (_valueSerializer == ser): True}
 * @utbot.executesCondition {@code (forceTypeInfo == _forceTypeInformation): False}
 * @utbot.returnsFrom {@code return new JsonValueSerializer(this, property, ser, forceTypeInfo);}
 *  */
    @Test
    public void testWithResolved_ForceTypeInfoNotEquals_forceTypeInformation() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_forceTypeInformation", true);
        
        JsonValueSerializer actual = jsonValueSerializer.withResolved(null, null, false);
        
        JsonValueSerializer expected = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class _handledType = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        assertNull(actual_valueSerializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return withResolved(property, ser, _forceTypeInformation);}
 *  */
    @Test
    public void testCreateContextual_ReturnWithResolved() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        TypeWrappedSerializer _valueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JsonValueSerializer actual = ((JsonValueSerializer) jsonValueSerializer.createContextual(impl, null));
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer jsonValueSerializer_valueSerializer = jsonValueSerializer._valueSerializer;
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        TypeSerializer actual_valueSerializer_typeSerializer = ((TypeSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer"));
        assertNull(actual_valueSerializer_typeSerializer);
        
        JsonSerializer actual_valueSerializer_serializer = ((JsonSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer"));
        assertNull(actual_valueSerializer_serializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return withResolved(property, ser, _forceTypeInformation);}
 *  */
    @Test
    public void testCreateContextual_ReturnWithResolved_3() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        TypeWrappedSerializer _valueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_property", _property);
        Class _handledType = Object.class;
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        Class initialJsonValueSerializer_handledType = jsonValueSerializer._handledType;
        
        JsonValueSerializer actual = ((JsonValueSerializer) jsonValueSerializer.createContextual(impl, null));
        
        JsonValueSerializer expected = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer expected_valueSerializer = expected._valueSerializer;
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        TypeSerializer actual_valueSerializer_typeSerializer = ((TypeSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer"));
        assertNull(actual_valueSerializer_typeSerializer);
        
        JsonSerializer actual_valueSerializer_serializer = ((JsonSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer"));
        assertNull(actual_valueSerializer_serializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalJsonValueSerializer_handledType = jsonValueSerializer._handledType;
        
        assertFalse(initialJsonValueSerializer_handledType == finalJsonValueSerializer_handledType);
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return withResolved(property, ser, _forceTypeInformation);}
 *  */
    @Test
    public void testCreateContextual_ReturnWithResolved_4() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        TypeWrappedSerializer _valueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_property", _property);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JsonValueSerializer actual = ((JsonValueSerializer) jsonValueSerializer.createContextual(impl, null));
        
        JsonValueSerializer expected = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        Class _handledType = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer expected_valueSerializer = expected._valueSerializer;
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        TypeSerializer actual_valueSerializer_typeSerializer = ((TypeSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer"));
        assertNull(actual_valueSerializer_typeSerializer);
        
        JsonSerializer actual_valueSerializer_serializer = ((JsonSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer"));
        assertNull(actual_valueSerializer_serializer);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return withResolved(property, ser, _forceTypeInformation);}
 *  */
    @Test
    public void testCreateContextual_ReturnWithResolved_1() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        InetAddressSerializer _delegateSerializer = ((InetAddressSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.InetAddressSerializer"));
        setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JsonValueSerializer actual = ((JsonValueSerializer) jsonValueSerializer.createContextual(impl, null));
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer jsonValueSerializer_valueSerializer = jsonValueSerializer._valueSerializer;
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        Converter actual_valueSerializer_converter = ((Converter) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_converter"));
        assertNull(actual_valueSerializer_converter);
        
        JavaType actual_valueSerializer_delegateType = ((JavaType) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        assertNull(actual_valueSerializer_delegateType);
        
        JsonSerializer jsonValueSerializer_valueSerializer_delegateSerializer = ((JsonSerializer) getFieldValue(jsonValueSerializer_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        JsonSerializer actual_valueSerializer_delegateSerializer = ((JsonSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        Class actual_valueSerializer_delegateSerializer_handledType = ((Class) getFieldValue(actual_valueSerializer_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_valueSerializer_delegateSerializer_handledType);
        
        assertTrue(deepEquals(jsonValueSerializer_valueSerializer, actual_valueSerializer));
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        assertTrue(deepEquals(jsonValueSerializer, actual));
    }
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return withResolved(property, ser, _forceTypeInformation);}
 *  */
    @Test
    public void testCreateContextual_ReturnWithResolved_2() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        StdDelegatingSerializer _valueSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        ReferenceType _delegateType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_delegateType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        setField(jsonValueSerializer, "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_valueSerializer", _valueSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JsonSerializer jsonSerializer = jsonValueSerializer._valueSerializer;
        JavaType jsonSerializer_valueSerializer_delegateType = ((JavaType) getFieldValue(jsonSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        Class initialJsonValueSerializer_valueSerializer_delegateType_class = ((Class) getFieldValue(jsonSerializer_valueSerializer_delegateType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonValueSerializer actual = ((JsonValueSerializer) jsonValueSerializer.createContextual(impl, null));
        
        AnnotatedMethod actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        JsonSerializer jsonValueSerializer_valueSerializer = jsonValueSerializer._valueSerializer;
        JsonSerializer actual_valueSerializer = actual._valueSerializer;
        Converter actual_valueSerializer_converter = ((Converter) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_converter"));
        assertNull(actual_valueSerializer_converter);
        
        JavaType jsonValueSerializer_valueSerializer_delegateType = ((JavaType) getFieldValue(jsonValueSerializer_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        JavaType actual_valueSerializer_delegateType = ((JavaType) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(jsonValueSerializer_valueSerializer_delegateType, actual_valueSerializer_delegateType);
        
        JsonSerializer actual_valueSerializer_delegateSerializer = ((JsonSerializer) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        assertNull(actual_valueSerializer_delegateSerializer);
        
        Class actual_valueSerializer_handledType = ((Class) getFieldValue(actual_valueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_valueSerializer_handledType);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        boolean actual_forceTypeInformation = actual._forceTypeInformation;
        assertFalse(actual_forceTypeInformation);
        
        assertTrue(deepEquals(jsonValueSerializer, actual));
        
        JsonSerializer jsonSerializer1 = jsonValueSerializer._valueSerializer;
        JavaType jsonSerializer1_valueSerializer_delegateType = ((JavaType) getFieldValue(jsonSerializer1, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        Class finalJsonValueSerializer_valueSerializer_delegateType_class = ((Class) getFieldValue(jsonSerializer1_valueSerializer_delegateType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialJsonValueSerializer_valueSerializer_delegateType_class == finalJsonValueSerializer_valueSerializer_delegateType_class);
    }
    ///endregion
    
    ///region Errors report for createContextual
    
    public void testCreateContextual_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.isNaturalTypeWithStdHandling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaturalTypeWithStdHandling(java.lang.Class, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#isNaturalTypeWithStdHandling(java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (rawType.isPrimitive()): False}
 * @utbot.executesCondition {@code (rawType): True}
 * @utbot.executesCondition {@code (rawType): True}
 * @utbot.executesCondition {@code (rawType): True}
 * @utbot.executesCondition {@code (rawType): True}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 *  */
    @Test
    public void testIsNaturalTypeWithStdHandling_RawType() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class class1 = Object.class;
        
        boolean actual = jsonValueSerializer.isNaturalTypeWithStdHandling(class1, null);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNaturalTypeWithStdHandling(java.lang.Class, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#isNaturalTypeWithStdHandling(java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rawType.isPrimitive()
 *  */
    @Test
    public void testIsNaturalTypeWithStdHandling_ThrowNullPointerException() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.isNaturalTypeWithStdHandling] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.isNaturalTypeWithStdHandling(JsonValueSerializer.java:328) */
        jsonValueSerializer.isNaturalTypeWithStdHandling(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.JsonValueSerializer._acceptJsonFormatVisitorForEnum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _acceptJsonFormatVisitorForEnum(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#_acceptJsonFormatVisitorForEnum(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (stringVisitor != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectStringFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_acceptJsonFormatVisitorForEnum_StringVisitorEqualsNull() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        boolean actual = jsonValueSerializer._acceptJsonFormatVisitorForEnum(base, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _acceptJsonFormatVisitorForEnum(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JsonValueSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.JsonValueSerializer#_acceptJsonFormatVisitorForEnum(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectStringFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonStringFormatVisitor stringVisitor = visitor.expectStringFormat(typeHint);
 *  */
    @Test
    public void test_acceptJsonFormatVisitorForEnum_ThrowNullPointerException() throws Exception  {
        JsonValueSerializer jsonValueSerializer = ((JsonValueSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.JsonValueSerializer._acceptJsonFormatVisitorForEnum] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer._acceptJsonFormatVisitorForEnum(JsonValueSerializer.java:300) */
        jsonValueSerializer._acceptJsonFormatVisitorForEnum(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1079078647384600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1079078647384600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1079078647390300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079078647384600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079078647390300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1079078648250500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1079078648250500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1079078648251700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079078648250500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079078648251700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1079078649047800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1079078649047800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1079078649049399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079078649047800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079078649049399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

