package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.FilterExceptFilter;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_ser_std_StdSerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectAnyFormat(com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_JsonFormatVisitorWrapperExpectAnyFormat() throws JsonMappingException  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        beanAsArraySerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectAnyFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: visitor.expectAnyFormat(typeHint);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws JsonMappingException  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdSerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException] */
        beanAsArraySerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.createObjectNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createObjectNode()
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createObjectNode()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.JsonNodeFactory#objectNode()}
 * @utbot.returnsFrom {@code return JsonNodeFactory.instance.objectNode();}
 *  */
    @Test
    public void testCreateObjectNode_JsonNodeFactoryObjectNode() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            
            ObjectNode actual = unwrappingBeanSerializer.createObjectNode();
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String)}
 * @utbot.returnsFrom {@code return createSchemaNode("string");}
 *  */
    @Test
    public void testGetSchema_StdSerializerCreateSchemaNode() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, JsonMappingException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
            
            ObjectNode actual = ((ObjectNode) beanAsArraySerializer.getSchema(null, null));
            
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type, boolean)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): False}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testGetSchema_IsOptional() throws JsonMappingException  {
        UnknownSerializer unknownSerializer = new UnknownSerializer();
        
        JsonNode actual = unknownSerializer.getSchema(null, null, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): False}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testGetSchema_IsOptional_2() throws JsonMappingException  {
        FailingSerializer failingSerializer = new FailingSerializer(null);
        
        JsonNode actual = failingSerializer.getSchema(null, null, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): False}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testGetSchema_IsOptional_1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            
            ObjectNode actual = ((ObjectNode) nullSerializer.getSchema(null, null, true));
            
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
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): True}
 * @utbot.executesCondition {@code (schema.put("required", !isOptional);): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#put(java.lang.String,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#booleanNode(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#booleanNode(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#_put(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#_put(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#put(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testGetSchema_SchemaPut() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        BooleanNode prevTRUE = BooleanNode.TRUE;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            BooleanNode true1 = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
            setField(true1, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
            Class booleanNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.BooleanNode");
            setStaticField(booleanNodeClazz, "TRUE", true1);
            NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            
            ObjectNode actual = ((ObjectNode) nullSerializer.getSchema(null, null, false));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            String string2 = "required";
            linkedHashMap.put(string2, true1);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(BooleanNode.class, "TRUE", prevTRUE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): False}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testGetSchema_IsOptional_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, JsonMappingException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            MapSerializer mapSerializer = new MapSerializer(null, null);
            
            ObjectNode actual = ((ObjectNode) mapSerializer.getSchema(null, null, true));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "object";
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
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.StringArraySerializer#createSchemaNode(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#set(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testGetSchema_IsOptional_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, JsonMappingException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StringArraySerializer stringArraySerializer = new StringArraySerializer(null, null, null);
            
            ObjectNode actual = ((ObjectNode) stringArraySerializer.getSchema(null, null, true));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "array";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            String string2 = "items";
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            String string3 = "type";
            String string4 = "string";
            TextNode textNode1 = new TextNode(string4);
            linkedHashMap1.put(string3, textNode1);
            ObjectNode objectNode = new ObjectNode(instance, linkedHashMap1);
            linkedHashMap.put(string2, objectNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type, boolean)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.executesCondition {@code (!isOptional): True}
 * @utbot.executesCondition {@code (schema.put("required", !isOptional);): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#put(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: schema.put("required", !isOptional);
 *  */
    @Test
    public void testGetSchema_ThrowNullPointerException() throws JsonMappingException  {
        UnknownSerializer unknownSerializer = new UnknownSerializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdSerializer.getSchema] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdSerializer.getSchema(StdSerializer.java:108) */
        unknownSerializer.getSchema(null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.findConvertingContentSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prop != null): False}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_PropEqualsNull_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        JsonSerializer actual = beanSerializer.findConvertingContentSerializer(impl, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prop != null): False}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_PropEqualsNull() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            JsonSerializer actual = unwrappingBeanSerializer.findConvertingContentSerializer(impl, null, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_ReturnExistingSerializer() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        JsonSerializer actual = unwrappingBeanSerializer.findConvertingContentSerializer(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonSerializer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (intr != null): True},
    ///     {@code (prop != null): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.BeanProperty#getMember()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_ReturnExistingSerializer_4() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        Class stdSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonSerializerType = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Method findConvertingContentSerializerMethod = stdSerializerClazz.getDeclaredMethod("findConvertingContentSerializer", implType, objectIdValuePropertyType, jsonSerializerType);
        findConvertingContentSerializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentSerializerMethodArguments = new java.lang.Object[3];
        findConvertingContentSerializerMethodArguments[0] = impl;
        findConvertingContentSerializerMethodArguments[1] = objectIdValueProperty;
        findConvertingContentSerializerMethodArguments[2] = ((Object) null);
        JsonSerializer actual = ((JsonSerializer) findConvertingContentSerializerMethod.invoke(beanSerializer, findConvertingContentSerializerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_ReturnExistingSerializer_1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
            AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
            setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            
            Class stdSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class jsonSerializerType = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
            Method findConvertingContentSerializerMethod = stdSerializerClazz.getDeclaredMethod("findConvertingContentSerializer", implType, singleViewType, jsonSerializerType);
            findConvertingContentSerializerMethod.setAccessible(true);
            java.lang.Object[] findConvertingContentSerializerMethodArguments = new java.lang.Object[3];
            findConvertingContentSerializerMethodArguments[0] = impl;
            findConvertingContentSerializerMethodArguments[1] = singleView;
            findConvertingContentSerializerMethodArguments[2] = ((Object) null);
            JsonSerializer actual = ((JsonSerializer) findConvertingContentSerializerMethod.invoke(unwrappingBeanSerializer, findConvertingContentSerializerMethodArguments));
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_ReturnExistingSerializer_2() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Class stdSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonSerializerType = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Method findConvertingContentSerializerMethod = stdSerializerClazz.getDeclaredMethod("findConvertingContentSerializer", implType, singleViewType, jsonSerializerType);
        findConvertingContentSerializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentSerializerMethodArguments = new java.lang.Object[3];
        findConvertingContentSerializerMethodArguments[0] = impl;
        findConvertingContentSerializerMethodArguments[1] = singleView;
        findConvertingContentSerializerMethodArguments[2] = ((Object) null);
        JsonSerializer actual = ((JsonSerializer) findConvertingContentSerializerMethod.invoke(beanAsArraySerializer, findConvertingContentSerializerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return existingSerializer;}
 *  */
    @Test
    public void testFindConvertingContentSerializer_ReturnExistingSerializer_3() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        Class stdSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonSerializerType = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Method findConvertingContentSerializerMethod = stdSerializerClazz.getDeclaredMethod("findConvertingContentSerializer", implType, multiViewType, jsonSerializerType);
        findConvertingContentSerializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentSerializerMethodArguments = new java.lang.Object[3];
        findConvertingContentSerializerMethodArguments[0] = impl;
        findConvertingContentSerializerMethodArguments[1] = multiView;
        findConvertingContentSerializerMethodArguments[2] = ((Object) null);
        JsonSerializer actual = ((JsonSerializer) findConvertingContentSerializerMethod.invoke(unwrappingBeanSerializer, findConvertingContentSerializerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findConvertingContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = provider.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindConvertingContentSerializer_ThrowNullPointerException() throws JsonMappingException  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdSerializer.findConvertingContentSerializer] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer.findConvertingContentSerializer(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.isDefaultSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#isDefaultSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isJacksonStdImpl(java.lang.Object)}
 * @utbot.returnsFrom {@code return ClassUtil.isJacksonStdImpl(serializer);}
 *  */
    @Test
    public void testIsDefaultSerializer_ClassUtilIsJacksonStdImpl() {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        
        boolean actual = unwrappingBeanSerializer.isDefaultSerializer(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.handledType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handledType()
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#handledType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHandledType_Return() {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, null, null);
        
        Class actual = unwrappingBeanSerializer.handledType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.createSchemaNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createSchemaNode(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_ReturnSchema() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        NullNode prevInstance1 = NullNode.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            NullNode instance1 = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance1);
            BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
            
            ObjectNode actual = beanSerializer.createSchemaNode(null, true);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            linkedHashMap.put(string, instance1);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(NullNode.class, "instance", prevInstance1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_ReturnSchema_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
            String string = "@";
            
            ObjectNode actual = beanAsArraySerializer.createSchemaNode(string, true);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string1 = "type";
            TextNode textNode = new TextNode(string);
            linkedHashMap.put(string1, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_ReturnSchema_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        Class textNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.TextNode");
        TextNode prevEMPTY_STRING_NODE = ((TextNode) getStaticFieldValue(textNodeClazz, "EMPTY_STRING_NODE"));
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            String string = "";
            TextNode emptyStringNode = new TextNode(string);
            setStaticField(textNodeClazz, "EMPTY_STRING_NODE", emptyStringNode);
            BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
            String string1 = "";
            
            ObjectNode actual = beanAsArraySerializer.createSchemaNode(string1, true);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string2 = "type";
            linkedHashMap.put(string2, emptyStringNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(TextNode.class, "EMPTY_STRING_NODE", prevEMPTY_STRING_NODE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (schema.put("required", !isOptional);): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#put(java.lang.String,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#booleanNode(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.JsonNodeFactory#booleanNode(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.JsonNodeFactory#booleanNode(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#booleanNode(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#_put(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.UtHashMap#preconditionCheck()}
 * @utbot.invokes org.utbot.engine.overrides.collections.UtHashMap#getKeyIndex(java.lang.Object)
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#set(int,java.lang.Object)}
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.AssociativeArray#store(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#_put(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#put(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_SchemaPut() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        NullNode prevInstance1 = NullNode.instance;
        BooleanNode prevTRUE = BooleanNode.TRUE;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            NullNode instance1 = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance1);
            BooleanNode true1 = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
            setField(true1, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
            Class booleanNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.BooleanNode");
            setStaticField(booleanNodeClazz, "TRUE", true1);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            
            ObjectNode actual = unwrappingBeanSerializer.createSchemaNode(null, false);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            linkedHashMap.put(string, instance1);
            String string1 = "required";
            linkedHashMap.put(string1, true1);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(NullNode.class, "instance", prevInstance1);
            setStaticField(BooleanNode.class, "TRUE", prevTRUE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.createSchemaNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createSchemaNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#nullNode()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#nullNode()}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_ReturnSchema_11() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        NullNode prevInstance1 = NullNode.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            NullNode instance1 = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance1);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            
            ObjectNode actual = unwrappingBeanSerializer.createSchemaNode(null);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            linkedHashMap.put(string, instance1);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(NullNode.class, "instance", prevInstance1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_ReturnSchema1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            String string = " ";
            
            ObjectNode actual = unwrappingBeanSerializer.createSchemaNode(string);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string1 = "type";
            TextNode textNode = new TextNode(string);
            linkedHashMap.put(string1, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#createSchemaNode(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return schema;}
 *  */
    @Test
    public void testCreateSchemaNode_ReturnSchema_21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        Class textNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.TextNode");
        TextNode prevEMPTY_STRING_NODE = ((TextNode) getStaticFieldValue(textNodeClazz, "EMPTY_STRING_NODE"));
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            String string = "";
            TextNode emptyStringNode = new TextNode(string);
            setStaticField(textNodeClazz, "EMPTY_STRING_NODE", emptyStringNode);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            String string1 = "";
            
            ObjectNode actual = unwrappingBeanSerializer.createSchemaNode(string1);
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string2 = "type";
            linkedHashMap.put(string2, emptyStringNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(TextNode.class, "EMPTY_STRING_NODE", prevEMPTY_STRING_NODE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Throwable, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        Error error = ((Error) createInstance("java.lang.Error"));
        
        beanAsArraySerializer.wrapAndThrow(((SerializerProvider) null), ((Throwable) error), ((Object) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testWrapAndThrow_ThrowNumberFormatException() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        beanAsArraySerializer.wrapAndThrow(((SerializerProvider) impl), ((Throwable) numberFormatException), ((Object) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, bean, fieldName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_3() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        
        beanSerializer.wrapAndThrow(((SerializerProvider) null), ((Throwable) null), ((Object) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, bean, fieldName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanAsArraySerializer.wrapAndThrow(((SerializerProvider) impl), ((Throwable) null), ((Object) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): True}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonMappingException)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, bean, fieldName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        
        unwrappingBeanSerializer.wrapAndThrow(((SerializerProvider) null), ((Throwable) unrecognizedPropertyException), ((Object) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, bean, fieldName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_2() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        unwrappingBeanSerializer.wrapAndThrow(((SerializerProvider) null), ((Throwable) invocationTargetException), ((Object) null), ((String) null));
    }
    ///endregion
    
    ///region Errors report for wrapAndThrow
    
    public void testWrapAndThrow_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Exception com.sun.org.apache.xml.internal.serializer.utils.URI$MalformedURIException is not accessible from package com.fasterxml.jackson.databind.ser.std
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Throwable, java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        beanSerializer.wrapAndThrow(((SerializerProvider) null), ((Throwable) error), ((Object) null), 1);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testWrapAndThrow_ThrowNumberFormatException1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        unwrappingBeanSerializer.wrapAndThrow(((SerializerProvider) impl), ((Throwable) numberFormatException), ((Object) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#wrapAndThrow(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        Error target = ((Error) createInstance("java.lang.Error"));
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        unwrappingBeanSerializer.wrapAndThrow(((SerializerProvider) null), ((Throwable) invocationTargetException), ((Object) null), 1);
    }
    ///endregion
    
    ///region Errors report for wrapAndThrow
    
    public void testWrapAndThrow_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Exception com.sun.org.apache.xml.internal.serializer.utils.URI$MalformedURIException is not accessible from package com.fasterxml.jackson.databind.ser.std
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdSerializer.findPropertyFilter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_3() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        byte[] byteArray = {};
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) unwrappingBeanSerializer.findPropertyFilter(impl, byteArray, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        byte[] byteArray = {};
        
        PropertyFilter actual = unwrappingBeanSerializer.findPropertyFilter(impl, byteArray, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_9() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        PropertyFilter actual = beanSerializer.findPropertyFilter(impl, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_4() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Character character = '\u0000';
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) beanAsArraySerializer.findPropertyFilter(impl, character, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_5() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        _filtersById.put(null, null);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Double double1 = 0.0;
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) beanAsArraySerializer.findPropertyFilter(impl, double1, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_6() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Integer integer = 0;
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) unwrappingBeanSerializer.findPropertyFilter(impl, integer, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_7() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        _filtersById.put(null, null);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Long long1 = 0L;
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) unwrappingBeanSerializer.findPropertyFilter(impl, long1, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_1() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "\u0000\u0000\u0001";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        String string1 = "\u0000\u0000\u0000";
        _filtersById.put(string1, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ArrayList arrayList = new ArrayList();
        
        PropertyFilter actual = beanAsArraySerializer.findPropertyFilter(impl, arrayList, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_8() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "\u0444\u0000";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        String string1 = "\u0000\u0000";
        _filtersById.put(string1, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) unwrappingBeanSerializer.findPropertyFilter(impl, null, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_2() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "\u0000";
        _filtersById.put(string, null);
        String string1 = "";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string1, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        PropertyFilter actual = unwrappingBeanSerializer.findPropertyFilter(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_10() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        PropertyFilter anonymousPropertyFilter = ((PropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$1"));
        _filtersById.put(null, anonymousPropertyFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        PropertyFilter actual = beanAsArraySerializer.findPropertyFilter(impl, null, null);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return filter;}
 *  */
    @Test
    public void testFindPropertyFilter_ReturnFilter_11() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        _filtersById.put(null, null);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter _defaultFilter = ((SimpleBeanPropertyFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        SimpleBeanPropertyFilter actual = ((SimpleBeanPropertyFilter) unwrappingBeanSerializer.findPropertyFilter(impl, null, null));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getFilterProvider()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FilterProvider filters = provider.getFilterProvider();
 *  */
    @Test
    public void testFindPropertyFilter_ThrowNullPointerException() throws JsonMappingException  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdSerializer.findPropertyFilter] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer.findPropertyFilter(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getFilterProvider()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} when: filters == null
 *  */
    @Test(expected = JsonMappingException.class)
    public void testFindPropertyFilter_ThrowJsonMappingException() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        unwrappingBeanSerializer.findPropertyFilter(impl, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getFilterProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.FilterProvider#findPropertyFilter(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: PropertyFilter filter = filters.findPropertyFilter(filterId, valueToFilter);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyFilter_ThrowIllegalArgumentException() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_cfgFailOnUnknownId", true);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        short[] shortArray = {};
        
        beanAsArraySerializer.findPropertyFilter(impl, shortArray, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1066629853414699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066629853414699.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066629853424100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066629853414699.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066629853424100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1066629857899700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1066629857899700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1066629857903800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066629857899700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066629857903800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1066629858163800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066629858163800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066629858168300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066629858163800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066629858168300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

