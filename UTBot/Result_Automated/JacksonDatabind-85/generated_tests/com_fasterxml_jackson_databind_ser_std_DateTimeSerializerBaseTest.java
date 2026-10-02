package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import java.util.GregorianCalendar;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import sun.util.calendar.LocalGregorianCalendar;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_ser_std_DateTimeSerializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
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
            SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
            CalendarSerializer calendarSerializer = new CalendarSerializer(null, simpleDateFormat);
            
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
    public void testGetSchema_ReturnCreateSchemaNode() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            Boolean boolean1 = false;
            CalendarSerializer calendarSerializer = new CalendarSerializer(boolean1, null);
            
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
    public void testGetSchema_ReturnCreateSchemaNode_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            Boolean boolean1 = true;
            CalendarSerializer calendarSerializer = new CalendarSerializer(boolean1, null);
            
            ObjectNode actual = ((ObjectNode) calendarSerializer.getSchema(null, null));
            
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
            DateSerializer dateSerializer = new DateSerializer(null, null);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) dateSerializer.getSchema(impl, null));
            
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
    public void testGetSchema_ReturnCreateSchemaNode_4() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _asTimestamp(serializers)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSchema_ThrowIllegalArgumentException() {
        DateSerializer dateSerializer = new DateSerializer(null, null);
        
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
    public void testAcceptJsonFormatVisitor() throws Exception  {
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, simpleDateFormat);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        calendarSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_1() throws Exception  {
        Boolean boolean1 = false;
        CalendarSerializer calendarSerializer = new CalendarSerializer(boolean1, null);
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
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
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
        Boolean boolean1 = true;
        DateSerializer dateSerializer = new DateSerializer(boolean1, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        dateSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_4() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 256);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        calendarSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _acceptJsonFormatVisitor(visitor, typeHint, _asTimestamp(visitor.getProvider()));
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.acceptJsonFormatVisitor(DateTimeSerializerBase.java:127) */
        calendarSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _acceptJsonFormatVisitor(visitor, typeHint, _asTimestamp(visitor.getProvider()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_ThrowIllegalArgumentException() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(null);
        
        calendarSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType, boolean)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): False}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_NotAsNumber_1() throws Exception  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        sqlDateSerializer._acceptJsonFormatVisitor(anonymousBase, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): False}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_NotAsNumber() throws JsonMappingException  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        
        sqlDateSerializer._acceptJsonFormatVisitor(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): True}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_AsNumber() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        calendarSerializer._acceptJsonFormatVisitor(null, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean)}
 * @utbot.executesCondition {@code (asNumber): True}
 *  */
    @Test
    public void test_acceptJsonFormatVisitor_AsNumber_1() throws JsonMappingException  {
        DateSerializer dateSerializer = new DateSerializer();
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        dateSerializer._acceptJsonFormatVisitor(base, null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase._asTimestamp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)
    
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
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(null);
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
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = sqlDateSerializer._asTimestamp(impl);
        
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
    public void test_asTimestamp__customFormatNotEqualsNull() {
        StdDateFormat stdDateFormat = new StdDateFormat();
        DateSerializer dateSerializer = new DateSerializer(null, stdDateFormat);
        
        boolean actual = dateSerializer._asTimestamp(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_useTimestamp != null): True}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return _useTimestamp.booleanValue();}
 *  */
    @Test
    public void test_asTimestamp__useTimestampNotEqualsNull() {
        Boolean boolean1 = false;
        CalendarSerializer calendarSerializer = new CalendarSerializer(boolean1, null);
        
        boolean actual = calendarSerializer._asTimestamp(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _asTimestamp(com.fasterxml.jackson.databind.SerializerProvider)
    
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: _customFormat == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_asTimestamp_ThrowIllegalArgumentException() {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        
        calendarSerializer._asTimestamp(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): True}
 *  */
    @Test
    public void testCreateContextual_PropertyEqualsNull() throws JsonMappingException  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        CalendarSerializer actual = ((CalendarSerializer) calendarSerializer.createContextual(null, null));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        Class calendarSerializer_handledType = calendarSerializer._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (property == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#handledType()} twice,
    ///     {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#findFormatOverrides(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class)} twice,
    ///     {@link com.fasterxml.jackson.annotation.JsonFormat.Value#getShape()} twice,
    ///     {@link com.fasterxml.jackson.annotation.JsonFormat.Shape#isNumeric()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testCreateContextual_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(null);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
            _overrides.put(null, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
            
            Class initialSqlDateSerializer_handledType = sqlDateSerializer._handledType;
            
            Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            SqlDateSerializer actual = ((SqlDateSerializer) createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments));
            
            Boolean actual_useTimestamp = actual._useTimestamp;
            assertNull(actual_useTimestamp);
            
            DateFormat actual_customFormat = actual._customFormat;
            assertNull(actual_customFormat);
            
            Class sqlDateSerializer_handledType = sqlDateSerializer._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
            Class finalSqlDateSerializer_handledType = sqlDateSerializer._handledType;
            
            assertFalse(initialSqlDateSerializer_handledType == finalSqlDateSerializer_handledType);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testCreateContextual() throws Exception  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
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
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        Class initialSqlDateSerializer_handledType = sqlDateSerializer._handledType;
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        SqlDateSerializer actual = ((SqlDateSerializer) createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        Class sqlDateSerializer_handledType = sqlDateSerializer._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalSqlDateSerializer_handledType = sqlDateSerializer._handledType;
        
        assertFalse(initialSqlDateSerializer_handledType == finalSqlDateSerializer_handledType);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testCreateContextual_1() throws Exception  {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        Class initialSqlDateSerializer_handledType = sqlDateSerializer._handledType;
        
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        SqlDateSerializer actual = ((SqlDateSerializer) createContextualMethod.invoke(sqlDateSerializer, createContextualMethodArguments));
        
        Boolean actual_useTimestamp = actual._useTimestamp;
        assertNull(actual_useTimestamp);
        
        DateFormat actual_customFormat = actual._customFormat;
        assertNull(actual_customFormat);
        
        Class sqlDateSerializer_handledType = sqlDateSerializer._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalSqlDateSerializer_handledType = sqlDateSerializer._handledType;
        
        assertFalse(initialSqlDateSerializer_handledType == finalSqlDateSerializer_handledType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#findFormatOverrides(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonFormat.Value#getShape()}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonFormat.Shape#isNumeric()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shape.isNumeric()
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Throwable  {
        CalendarSerializer calendarSerializer = new CalendarSerializer(null, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.createContextual(DateTimeSerializerBase.java:61) */
        Class dateTimeSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = dateTimeSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(calendarSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createContextual
    
    public void testCreateContextual_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isEmpty(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "time", 1L);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        boolean actual = calendarSerializer.isEmpty(gregorianCalendar);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero() {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        boolean actual = calendarSerializer.isEmpty(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isEmpty(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero_1() {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = new Date(0L);
        
        boolean actual = dateSerializer.isEmpty(date);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_1() {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = new Time(1L);
        
        boolean actual = dateSerializer.isEmpty(time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_2() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(524288);
        setField(timestamp, "java.util.Date", "fastTime", 2L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(timestamp, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(timestamp);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_3() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(1025900544);
        setField(timestamp, "java.util.Date", "fastTime", 2L);
        
        boolean actual = dateSerializer.isEmpty(timestamp);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_4() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.Gregorian$Date");
        setField(date, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero_2() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = ((Date) createInstance("java.sql.Date"));
        setField(date, "java.util.Date", "fastTime", 0L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date2 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date3 = createInstance("sun.util.calendar.Gregorian$Date");
        setField(date3, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date2, "sun.util.calendar.ImmutableGregorianDate", "date", date3);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(date);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException() {
        DateSerializer dateSerializer = new DateSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Date ([B and java.util.Date are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.DateSerializer._timestamp(DateSerializer.java:15)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        dateSerializer.isEmpty(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException_1() {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Calendar ([B and java.util.Calendar are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        calendarSerializer.isEmpty(byteArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isEmpty(java.lang.Object)
    
    @Test
    public void testIsEmpty1() {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.sql.Date (java.lang.Object is in module java.base of loader 'bootstrap'; java.sql.Date is in module java.sql of loader 'platform')]
            com.fasterxml.jackson.databind.ser.std.SqlDateSerializer._timestamp(SqlDateSerializer.java:18)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        sqlDateSerializer.isEmpty(object);
    }
    
    @Test
    public void testIsEmpty2() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[4] = 1;
        stamp[6] = -2147483645;
        stamp[7] = 2;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty3() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[11];
        stamp[3] = 1;
        stamp[5] = -1;
        stamp[7] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty4() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[12];
        stamp[0] = 256;
        stamp[3] = 76;
        stamp[4] = 76;
        stamp[5] = 76;
        stamp[6] = 76;
        stamp[7] = 76;
        stamp[11] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12]
            java.base/java.util.Calendar.selectFields(Calendar.java:2570)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        calendarSerializer.isEmpty(gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty5() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.JapaneseImperialCalendar.computeTime(JapaneseImperialCalendar.java:1839)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:107) */
        calendarSerializer.isEmpty(japaneseImperialCalendar);
    }
    ///endregion
    
    ///region Errors report for isEmpty
    
    public void testIsEmpty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 249 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero1() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "time", 1L);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        boolean actual = calendarSerializer.isEmpty(null, gregorianCalendar);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero1() {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        
        boolean actual = calendarSerializer.isEmpty(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#_timestamp(java.lang.Object)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueEqualsNullOr_timestampEqualsZero_11() {
        DateSerializer dateSerializer = new DateSerializer();
        Date date = new Date(0L);
        
        boolean actual = dateSerializer.isEmpty(null, date);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_11() {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = new Time(1L);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_21() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_31() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.Gregorian$Date");
        setField(date, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_41() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Timestamp timestamp = ((Timestamp) createInstance("java.sql.Timestamp"));
        timestamp.setNanos(-196608);
        setField(timestamp, "java.util.Date", "fastTime", 3L);
        
        boolean actual = dateSerializer.isEmpty(null, timestamp);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.returnsFrom {@code return (value == null) || (_timestamp(value) == 0L);}
 *  */
    @Test
    public void testIsEmpty_ValueNotEqualsNullOr_timestampNotEqualsZero_5() throws Exception  {
        DateSerializer dateSerializer = new DateSerializer();
        Time time = ((Time) createInstance("java.sql.Time"));
        setField(time, "java.util.Date", "fastTime", 1L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.Gregorian$Date");
        setField(date1, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date);
        setField(time, "java.util.Date", "cdate", cdate);
        
        boolean actual = dateSerializer.isEmpty(null, time);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException1() {
        DateSerializer dateSerializer = new DateSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Date ([B and java.util.Date are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.DateSerializer._timestamp(DateSerializer.java:15)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        dateSerializer.isEmpty(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException_11() {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Calendar ([B and java.util.Calendar are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsEmpty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {1, 0, 0, 0, 1, 0, 0, 1};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8]
            java.base/java.util.Calendar.selectFields(Calendar.java:2466)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (value == null) || (_timestamp(value) == 0L);
 *  */
    @Test
    public void testIsEmpty_ThrowIllegalArgumentException() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {2};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "stamp", fields);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.IllegalArgumentException: ERA]
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2609)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase#isEmpty(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsEmpty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {0};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.isExternallySet(Calendar.java:2301)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2606)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isEmpty(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object)
    
    @Test
    public void testIsEmpty6() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[15];
        stamp[3] = 134217731;
        stamp[4] = -2146435072;
        stamp[6] = 1073741826;
        stamp[7] = -2013265919;
        stamp[8] = -2147483646;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            java.base/java.util.Calendar.selectFields(Calendar.java:2579)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty7() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {
            1, 0, 0, 0, -2147483645, 0, -2147483647, -2147483646,
            0
        };
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 9]
            java.base/java.util.Calendar.selectFields(Calendar.java:2550)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty8() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[13];
        stamp[0] = 1;
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1879048192;
        stamp[6] = 1610612737;
        stamp[10] = 1;
        stamp[11] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            java.base/java.util.Calendar.selectFields(Calendar.java:2573)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty9() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[16];
        stamp[0] = 16;
        stamp[1] = 3;
        stamp[2] = 3;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1879048192;
        stamp[6] = 1610612737;
        stamp[9] = 3;
        stamp[11] = 1;
        stamp[12] = 1;
        stamp[15] = 1073741824;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16]
            java.base/java.util.Calendar.selectFields(Calendar.java:2582)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty10() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[12];
        stamp[0] = 131072;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1879048192;
        stamp[6] = 1610612737;
        stamp[11] = 1;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12]
            java.base/java.util.Calendar.selectFields(Calendar.java:2570)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty11() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[14];
        stamp[0] = 1;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1879048192;
        stamp[6] = 1610612737;
        stamp[9] = -2147483647;
        stamp[11] = Integer.MIN_VALUE;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            java.base/java.util.Calendar.selectFields(Calendar.java:2576)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty12() {
        SqlDateSerializer sqlDateSerializer = new SqlDateSerializer();
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.sql.Date (java.lang.Object is in module java.base of loader 'bootstrap'; java.sql.Date is in module java.sql of loader 'platform')]
            com.fasterxml.jackson.databind.ser.std.SqlDateSerializer._timestamp(SqlDateSerializer.java:18)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        sqlDateSerializer.isEmpty(null, object);
    }
    
    @Test
    public void testIsEmpty13() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {0, 0};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = new int[26];
        stamp[0] = 16;
        stamp[1] = 1;
        stamp[2] = 3;
        stamp[3] = 1;
        stamp[4] = 1;
        stamp[5] = 1683285896;
        stamp[6] = 1683285896;
        stamp[9] = 1;
        stamp[11] = -1;
        stamp[12] = 1;
        stamp[15] = 2;
        stamp[16] = 2;
        stamp[17] = 3;
        stamp[18] = 3;
        stamp[19] = 3;
        stamp[20] = 3;
        stamp[21] = 3;
        stamp[22] = 3;
        stamp[23] = 3;
        stamp[24] = 3;
        stamp[25] = 3;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 2]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2648)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(null, gregorianCalendar);
    }
    
    @Test
    public void testIsEmpty14() throws Exception  {
        CalendarSerializer calendarSerializer = new CalendarSerializer();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = new int[25];
        stamp[0] = 1;
        stamp[1] = 18;
        stamp[2] = 18;
        stamp[6] = 134086672;
        stamp[7] = 134086672;
        stamp[8] = -1879310317;
        stamp[9] = 18;
        stamp[10] = 18;
        stamp[11] = 18;
        stamp[12] = 18;
        stamp[13] = 18;
        stamp[14] = 18;
        stamp[15] = 18;
        stamp[16] = 18;
        stamp[17] = 18;
        stamp[18] = 18;
        stamp[19] = 18;
        stamp[20] = 18;
        stamp[21] = 18;
        stamp[22] = 18;
        stamp[23] = 18;
        stamp[24] = 18;
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2623)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.getTimeInMillis(Calendar.java:1805)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:36)
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer._timestamp(CalendarSerializer.java:16)
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.isEmpty(DateTimeSerializerBase.java:113) */
        calendarSerializer.isEmpty(impl, gregorianCalendar);
    }
    ///endregion
    
    ///region Errors report for isEmpty
    
    public void testIsEmpty_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 91 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1085409047922000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1085409047922000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1085409047926600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1085409047922000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1085409047926600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1085409050132599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1085409050132599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1085409050133999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1085409050132599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1085409050133999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

