package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.text.DateFormat;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.util.SimpleTimeZone;
import java.util.Locale;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import java.util.Date;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_ser_std_DateTimeSerializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ReturnFalse() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        
        boolean actual = dateSerializer.isEmpty(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
            Boolean _useTimestamp = false;
            setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
            
            ObjectNode actual = ((ObjectNode) dateSerializer.getSchema(null, null));
            
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
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_2() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
            Boolean _useTimestamp = true;
            setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
            
            ObjectNode actual = ((ObjectNode) dateSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "number";
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
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_3() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
            SimpleDateFormat _customFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
            setField(calendarSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_customFormat", _customFormat);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(null, null));
            
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
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(impl, null));
            
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
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode(_asTimestamp(serializers) ? "number" : "string", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_4() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -256);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) sqlDateSerializer.getSchema(impl, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "number";
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _asTimestamp(serializers)
 *  */
    @Test
    public void testGetSchema_ThrowNullPointerException() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.getSchema] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp(DateTimeSerializerBase.java:192)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.getSchema(DateTimeSerializerBase.java:157) */
        dateSerializer.getSchema(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_1() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        Boolean _useTimestamp = false;
        setField(sqlDateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        sqlDateSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        SimpleDateFormat _customFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(calendarSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_customFormat", _customFormat);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        calendarSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_2() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        Boolean _useTimestamp = true;
        setField(sqlDateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        sqlDateSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_4() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 256);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        calendarSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_3() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        sqlDateSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _acceptJsonFormatVisitor(visitor, typeHint, _asTimestamp(visitor.getProvider()));
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor(DateTimeSerializerBase.java:163) */
        calendarSerializer.acceptJsonFormatVisitor(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _acceptJsonFormatVisitor(visitor, typeHint, _asTimestamp(visitor.getProvider()));
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_1() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp(DateTimeSerializerBase.java:192)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor(DateTimeSerializerBase.java:163) */
        dateSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): True}
 *  */
    @Test
    public void testCreateContextual_PropertyEqualsNull() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        
        DateSerializer actual = ((DateSerializer) dateSerializer.createContextual(null, null));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        AtomicReference actual_reusedCustomFormat = actual._reusedCustomFormat;
        assertNull(actual_reusedCustomFormat);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): False}
 * @utbot.returnsFrom {@code return withFormat(Boolean.TRUE, null);}
 *  */
    @Test
    public void testCreateContextual_PropertyNotEqualsNull() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER_FLOAT;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        DateSerializer actual = ((DateSerializer) createContextualMethod.invoke(dateSerializer, createContextualMethodArguments));
        
        DateSerializer expected = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        Boolean _useTimestamp = true;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
        Class _handledType = Date.class;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        Boolean expected_useTimestamp = expected._useTimestamp;
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertEquals(expected_useTimestamp, actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        AtomicReference actual_reusedCustomFormat = actual._reusedCustomFormat;
        assertNull(actual_reusedCustomFormat);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): False}
 * @utbot.returnsFrom {@code return withFormat(Boolean.TRUE, null);}
 *  */
    @Test
    public void testCreateContextual_PropertyNotEqualsNull_1() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER_FLOAT;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        CalendarSerializer actual = ((CalendarSerializer) createContextualMethod.invoke(calendarSerializer, createContextualMethodArguments));
        
        CalendarSerializer expected = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Boolean _useTimestamp = true;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
        Class _handledType = java.util.Calendar.class;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        Boolean expected_useTimestamp = expected._useTimestamp;
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertEquals(expected_useTimestamp, actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        AtomicReference actual_reusedCustomFormat = actual._reusedCustomFormat;
        assertNull(actual_reusedCustomFormat);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): False}
 * @utbot.executesCondition {@code (!hasLocale): True}
 * @utbot.executesCondition {@code (!hasTZ): True}
 * @utbot.executesCondition {@code (!asString): True}
 *  */
    @Test
    public void testCreateContextual_NotAsString_1() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        String _timezoneStr = "";
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_timezoneStr", _timezoneStr);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        DateSerializer actual = ((DateSerializer) createContextualMethod.invoke(dateSerializer, createContextualMethodArguments));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        AtomicReference actual_reusedCustomFormat = actual._reusedCustomFormat;
        assertNull(actual_reusedCustomFormat);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): False}
 * @utbot.executesCondition {@code (!hasLocale): True}
 * @utbot.executesCondition {@code (!hasTZ): True}
 * @utbot.executesCondition {@code (!asString): True}
 *  */
    @Test
    public void testCreateContextual_NotAsString_2() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "";
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER_FLOAT;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        SqlDateSerializer actual = ((SqlDateSerializer) createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments));
        
        SqlDateSerializer expected = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        Boolean _useTimestamp = true;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
        Class _handledType = java.sql.Date.class;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        Boolean expected_useTimestamp = expected._useTimestamp;
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertEquals(expected_useTimestamp, actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        AtomicReference actual_reusedCustomFormat = actual._reusedCustomFormat;
        assertNull(actual_reusedCustomFormat);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): False}
 * @utbot.executesCondition {@code (!hasLocale): True}
 * @utbot.executesCondition {@code (!hasTZ): True}
 * @utbot.executesCondition {@code (!asString): True}
 *  */
    @Test
    public void testCreateContextual_NotAsString() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ARRAY;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        CalendarSerializer actual = ((CalendarSerializer) createContextualMethod.invoke(calendarSerializer, createContextualMethodArguments));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        AtomicReference actual_reusedCustomFormat = actual._reusedCustomFormat;
        assertNull(actual_reusedCustomFormat);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shape.isNumeric()
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_5() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
            Class _handledType = Object.class;
            setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
            _overrides.put(_handledType, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:76) */
            Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            try {
                createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shape.isNumeric()
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Throwable  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        Class _handledType = Object.class;
        setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(_handledType, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:76) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (!hasLocale): True}
 * @utbot.executesCondition {@code (!hasTZ): False}
 * @utbot.executesCondition {@code (df0 instanceof StdDateFormat): False}
 * @utbot.executesCondition {@code (!(df0 instanceof SimpleDateFormat)): False}
 * @utbot.executesCondition {@code (hasLocale): False}
 * @utbot.invokes {@link java.text.SimpleDateFormat#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df = (SimpleDateFormat) df.clone();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Throwable  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.BOOLEAN;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        SimpleTimeZone _timezone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_timezone", _timezone);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:128) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonFormat.Value#hasLocale()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getLocale()}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonFormat.Value#getPattern()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SimpleDateFormat df = new SimpleDateFormat(format.getPattern(), loc);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_3() throws Throwable  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "\u0000";
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.NATURAL;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.<init>(SimpleDateFormat.java:621)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:86) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(calendarSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (!hasLocale): True}
 * @utbot.executesCondition {@code (!hasTZ): True}
 * @utbot.executesCondition {@code (!asString): False}
 * @utbot.executesCondition {@code (df0 instanceof StdDateFormat): False}
 * @utbot.executesCondition {@code (!(df0 instanceof SimpleDateFormat)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df0.getClass().getName()
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Throwable  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.STRING;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:121) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (!hasLocale): False}
 * @utbot.executesCondition {@code (df0 instanceof StdDateFormat): False}
 * @utbot.executesCondition {@code (!(df0 instanceof SimpleDateFormat)): False}
 * @utbot.executesCondition {@code (hasLocale): True}
 * @utbot.invokes {@link java.text.SimpleDateFormat#toPattern()}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonFormat.Value#getLocale()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df = new SimpleDateFormat(df.toPattern(), format.getLocale());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_4() throws Throwable  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.STRING;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        Locale _locale = ((Locale) createInstance("java.util.Locale"));
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_locale", _locale);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.<init>(SimpleDateFormat.java:621)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:126) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(dateSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): True}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return _useTimestamp.booleanValue();}
 *  */
    @Test
    public void test_asTimestamp__useTimestampNotEqualsNull() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Boolean _useTimestamp = false;
        setField(calendarSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_useTimestamp", _useTimestamp);
        
        boolean actual = calendarSerializer._asTimestamp(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_asTimestamp__customFormatNotEqualsNull() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        ISO8601DateFormat _customFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_customFormat", _customFormat);
        
        boolean actual = dateSerializer._asTimestamp(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.executesCondition {@code (serializers != null): True}
 * @utbot.returnsFrom {@code return serializers.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);}
 *  */
    @Test
    public void test_asTimestamp_SerializersNotEqualsNull() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = sqlDateSerializer._asTimestamp(impl);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.executesCondition {@code (serializers != null): True}
 * @utbot.returnsFrom {@code return serializers.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);}
 *  */
    @Test
    public void test_asTimestamp_SerializersNotEqualsNull_1() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = sqlDateSerializer._asTimestamp(impl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): False}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.executesCondition {@code (serializers != null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#handledType()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _customFormat == null
 *  */
    @Test
    public void test_asTimestamp_ThrowNullPointerException() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp(DateTimeSerializerBase.java:192) */
        dateSerializer._asTimestamp(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeAsString(java.util.Date, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Date date = new Date(0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -15 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedLong(WriterBasedJsonGenerator.java:717)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1088)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        calendarSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        Date date = new Date(0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483632);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483632 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedLong(WriterBasedJsonGenerator.java:717)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1088)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        sqlDateSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Date date = new Date(0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 22);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedLong(WriterBasedJsonGenerator.java:717)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1088)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        calendarSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        java.sql.Date date = new java.sql.Date(0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -526383103);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -526383103);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -526383103);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -256);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -526383103 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:872)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:701)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1088)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        sqlDateSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        Date date = new Date(0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:872)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:701)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1088)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        dateSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowIndexOutOfBoundsException() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        calendarSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowNullPointerException_1() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        dateSerializer._serializeAsString(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): False}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#getAndSet(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DateFormat f = _reusedCustomFormat.getAndSet(null);
 *  */
    @Test
    public void test_serializeAsString_ThrowNullPointerException_2() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        SimpleDateFormat _customFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_customFormat", _customFormat);
        AtomicReference _reusedCustomFormat = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
        setField(dateSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_reusedCustomFormat", _reusedCustomFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:227) */
        dateSerializer._serializeAsString(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DateFormat f = _reusedCustomFormat.getAndSet(null);
 *  */
    @Test
    public void test_serializeAsString_ThrowNullPointerException() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        SimpleDateFormat _customFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(calendarSerializer, "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_customFormat", _customFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:225) */
        calendarSerializer._serializeAsString(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowNullPointerException_4() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        java.sql.Date date = ((java.sql.Date) createInstance("java.sql.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483633);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483639);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.NullPointerException] */
        dateSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowNullPointerException_5() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.SerializerProvider._dateFormat(SerializerProvider.java:1434)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1090)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        dateSerializer._serializeAsString(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_serializeAsString(java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_customFormat == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: provider.defaultSerializeDateValue(value, g);
 *  */
    @Test
    public void test_serializeAsString_ThrowNullPointerException_3() throws Exception  {
        SqlDateSerializer sqlDateSerializer = ((SqlDateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
        Date date = new Date(0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 21);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1946)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedLong(WriterBasedJsonGenerator.java:715)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateValue(SerializerProvider.java:1088)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._serializeAsString(DateTimeSerializerBase.java:214) */
        sqlDateSerializer._serializeAsString(date, writerBasedJsonGenerator, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType, boolean)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#visitIntFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser.NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat)}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_AsNumber() throws Exception  {
        CalendarSerializer calendarSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        calendarSerializer._acceptJsonFormatVisitor(anonymousBase, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#visitStringFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat)}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_NotAsNumber() throws Exception  {
        DateSerializer dateSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        dateSerializer._acceptJsonFormatVisitor(base, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1090001187537600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090001187537600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090001187545200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090001187537600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090001187545200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1090001188754299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1090001188754299.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1090001188757600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090001188754299.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090001188757600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

