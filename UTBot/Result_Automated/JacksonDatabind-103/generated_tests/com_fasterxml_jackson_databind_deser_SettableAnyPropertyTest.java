package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.lang.reflect.Parameter;
import java.util.Map;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import java.io.IOException;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import java.io.UnsupportedEncodingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_SettableAnyPropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty()
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#getProperty()}
 * @utbot.returnsFrom {@code return _property;}
 *  */
    @Test
    public void testGetProperty_Return_property() {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        
        BeanProperty actual = settableAnyProperty.getProperty();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.toString
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.set
    
    ///region Errors report for set
    
    public void testSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 24 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.getType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getType()
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#getType()}
 * @utbot.returnsFrom {@code return _type;}
 *  */
    @Test
    public void testGetType_Return_type() {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        
        JavaType actual = settableAnyProperty.getType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Return() throws Exception  {
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        AnnotatedField annotatedField = new AnnotatedField(null, field, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedField, null, null, null, null);
        
        SettableAnyProperty actual = ((SettableAnyProperty) settableAnyProperty.readResolve());
        
        SettableAnyProperty expected = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        AnnotatedField _setter = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_field", field);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_setter", _setter);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_setterIsField", true);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        AnnotatedMember expected_setter = expected._setter;
        AnnotatedMember actual_setter = actual._setter;
        Field expected_setter_field = ((Field) getFieldValue(expected_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_field"));
        Field actual_setter_field = ((Field) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_field"));
        // java.lang.reflect.Field has overridden equals method
        assertEquals(expected_setter_field, actual_setter_field);
        
        Object actual_setter_serialization = getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_serialization");
        assertNull(actual_setter_serialization);
        
        TypeResolutionContext actual_setter_typeContext = ((TypeResolutionContext) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_typeContext"));
        assertNull(actual_setter_typeContext);
        
        AnnotationMap actual_setter_annotations = ((AnnotationMap) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_setter_annotations);
        
        boolean actual_setterIsField = actual._setterIsField;
        assertTrue(actual_setterIsField);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Return_1() throws Exception  {
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedConstructor, null, null, null, null);
        
        SettableAnyProperty actual = ((SettableAnyProperty) settableAnyProperty.readResolve());
        
        SettableAnyProperty expected = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_setter", annotatedConstructor);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        AnnotatedMember expected_setter = expected._setter;
        AnnotatedMember actual_setter = actual._setter;
        Constructor expected_setter_constructor = ((Constructor) getFieldValue(expected_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor"));
        Constructor actual_setter_constructor = ((Constructor) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor"));
        boolean actual_setter_constructorHasRealParameterData = ((Boolean) getFieldValue(actual_setter_constructor, "java.lang.reflect.Executable", "hasRealParameterData"));
        assertFalse(actual_setter_constructorHasRealParameterData);
        
        java.lang.reflect.Parameter[] actual_setter_constructorParameters = actual_setter_constructor.getParameters();
        assertNull(actual_setter_constructorParameters);
        
        Map actual_setter_constructorDeclaredAnnotations = ((Map) getFieldValue(actual_setter_constructor, "java.lang.reflect.Executable", "declaredAnnotations"));
        assertNull(actual_setter_constructorDeclaredAnnotations);
        
        Object actual_setter_serialization = getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_serialization");
        assertNull(actual_setter_serialization);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_setter_paramAnnotations = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "_paramAnnotations"));
        assertNull(actual_setter_paramAnnotations);
        
        TypeResolutionContext actual_setter_typeContext = ((TypeResolutionContext) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_typeContext"));
        assertNull(actual_setter_typeContext);
        
        AnnotationMap actual_setter_annotations = ((AnnotationMap) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_setter_annotations);
        
        boolean actual_setterIsField = actual._setterIsField;
        assertFalse(actual_setterIsField);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Return_2() throws Exception  {
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedMethod, null, null, null, null);
        
        SettableAnyProperty actual = ((SettableAnyProperty) settableAnyProperty.readResolve());
        
        SettableAnyProperty expected = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_setter", annotatedMethod);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        AnnotatedMember expected_setter = expected._setter;
        AnnotatedMember actual_setter = actual._setter;
        Method expected_setter_method = ((Method) getFieldValue(expected_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method"));
        Method actual_setter_method = ((Method) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method"));
        // java.lang.reflect.Method has overridden equals method
        assertEquals(expected_setter_method, actual_setter_method);
        
        java.lang.Class[] actual_setter_paramClasses = ((java.lang.Class[]) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses"));
        assertNull(actual_setter_paramClasses);
        
        Object actual_setter_serialization = getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_serialization");
        assertNull(actual_setter_serialization);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_setter_paramAnnotations = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "_paramAnnotations"));
        assertNull(actual_setter_paramAnnotations);
        
        TypeResolutionContext actual_setter_typeContext = ((TypeResolutionContext) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_typeContext"));
        assertNull(actual_setter_typeContext);
        
        AnnotationMap actual_setter_annotations = ((AnnotationMap) getFieldValue(actual_setter, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_setter_annotations);
        
        boolean actual_setterIsField = actual._setterIsField;
        assertFalse(actual_setterIsField);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.executesCondition {@code (_setter == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: _setter == null || _setter.getAnnotated() == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException() {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        
        settableAnyProperty.readResolve();
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.executesCondition {@code (_setter == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: _setter == null || _setter.getAnnotated() == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException_1() {
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedField, null, null, null, null);
        
        settableAnyProperty.readResolve();
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.executesCondition {@code (_setter == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: _setter == null || _setter.getAnnotated() == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException_2() {
        AnnotatedParameter annotatedParameter = new AnnotatedParameter(null, null, null, null, 0);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedParameter, null, null, null, null);
        
        settableAnyProperty.readResolve();
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#readResolve()}
 * @utbot.executesCondition {@code (_setter == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: _setter == null || _setter.getAnnotated() == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException_3() {
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, virtualAnnotatedMember, null, null, null, null);
        
        settableAnyProperty.readResolve();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.getClassName
    
    ///region Errors report for getClassName
    
    public void testGetClassName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _valueDeserializer.getNullValue(ctxt);}
 *  */
    @Test
    public void testDeserialize_Return_valueDeserializerGetNullValue_1() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, jsonNodeDeserializer, null);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            
            NullNode actual = ((NullNode) settableAnyProperty.deserialize(jsonParserDelegate, null));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _valueDeserializer.getNullValue(ctxt);}
 *  */
    @Test
    public void testDeserialize_Return_valueDeserializerGetNullValue() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, jsonNodeDeserializer);
            SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer, null);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            
            NullNode actual = ((NullNode) settableAnyProperty.deserialize(jsonParserDelegate, null));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _valueDeserializer.getNullValue(ctxt);}
 *  */
    @Test
    public void testDeserialize_Return_valueDeserializerGetNullValue_2() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, jsonNodeDeserializer);
            TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
            SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer1, null);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            NullNode actual = ((NullNode) settableAnyProperty.deserialize(jsonParserSequence, null));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:147) */
        settableAnyProperty.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:149) */
        settableAnyProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueDeserializer.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:149) */
        settableAnyProperty.deserialize(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:154) */
        settableAnyProperty.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueDeserializer.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_5() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:149) */
        settableAnyProperty.deserialize(jsonParserDelegate1, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = new AsArrayTypeDeserializer(null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, asArrayTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize] produces [java.lang.NullPointerException] */
        settableAnyProperty.deserialize(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, stdDelegatingDeserializer, asWrapperTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        settableAnyProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer1, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        settableAnyProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer1 = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, stdDelegatingDeserializer, asPropertyTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        settableAnyProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_1() throws Exception  {
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer, asPropertyTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        settableAnyProperty.deserialize(jsonParserSequence, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 *  */
    @Test
    public void testFixAccess_1() throws Exception  {
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedConstructor, null, null, null, null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        settableAnyProperty.fixAccess(deserializationConfig);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 *  */
    @Test
    public void testFixAccess() throws Exception  {
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedField, null, null, null, null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        settableAnyProperty.fixAccess(deserializationConfig);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _setter.fixAccess(config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
 *  */
    @Test
    public void testFixAccess_ThrowNullPointerException_1() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess(SettableAnyProperty.java:84) */
        settableAnyProperty.fixAccess(deserializationConfig);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _setter.fixAccess(config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
 *  */
    @Test
    public void testFixAccess_ThrowNullPointerException_2() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess(SettableAnyProperty.java:84) */
        settableAnyProperty.fixAccess(deserializationConfig);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)
 *  */
    @Test
    public void testFixAccess_ThrowNullPointerException() {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess(SettableAnyProperty.java:85) */
        settableAnyProperty.fixAccess(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    @Test
    public void testFixAccess1() throws Exception  {
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(annotatedConstructor, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedConstructor, null, null, null, null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:914)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:139)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess(SettableAnyProperty.java:84) */
        settableAnyProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess2() throws Exception  {
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        AnnotatedField annotatedField = new AnnotatedField(null, field, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, annotatedField, null, null, null, null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Field.toString(Field.java:330)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:914)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:139)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.fixAccess(SettableAnyProperty.java:84) */
        settableAnyProperty.fixAccess(deserializationConfig);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code ((_keyDeserializer == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.KeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: set(instance, key, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        Object stringCtorKeyDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer");
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Class settableAnyPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty");
        Class beanPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class stringCtorKeyDeserializerType = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        Class typeWrappedDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Constructor settableAnyPropertyConstructor = settableAnyPropertyClazz.getDeclaredConstructor(beanPropertyType, annotatedMemberType, javaTypeType, stringCtorKeyDeserializerType, typeWrappedDeserializerType, asWrapperTypeDeserializerType);
        settableAnyPropertyConstructor.setAccessible(true);
        java.lang.Object[] settableAnyPropertyConstructorArguments = new java.lang.Object[6];
        settableAnyPropertyConstructorArguments[0] = ((Object) null);
        settableAnyPropertyConstructorArguments[1] = ((Object) null);
        settableAnyPropertyConstructorArguments[2] = ((Object) null);
        settableAnyPropertyConstructorArguments[3] = stringCtorKeyDeserializer;
        settableAnyPropertyConstructorArguments[4] = typeWrappedDeserializer;
        settableAnyPropertyConstructorArguments[5] = asWrapperTypeDeserializer;
        SettableAnyProperty settableAnyProperty = ((SettableAnyProperty) settableAnyPropertyConstructor.newInstance(settableAnyPropertyConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        settableAnyProperty.deserializeAndSet(filteringParserDelegate, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code ((_keyDeserializer == null)): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: set(instance, key, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asPropertyTypeDeserializer, typeWrappedDeserializer);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer1, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        settableAnyProperty.deserializeAndSet(jsonParserDelegate, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code ((_keyDeserializer == null)): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: set(instance, key, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asPropertyTypeDeserializer, typeWrappedDeserializer);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer1, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        settableAnyProperty.deserializeAndSet(filteringParserDelegate, null, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet1() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 9);
        FromStringDeserializer.Std _deser = ((FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(_deser, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind", 4);
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser", _deser);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        settableAnyProperty.deserializeAndSet(jsonParserSequence, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet2() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 10);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        settableAnyProperty.deserializeAndSet(filteringParserDelegate, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet3() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 11);
        Class _keyClass = Object.class;
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass", _keyClass);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        settableAnyProperty.deserializeAndSet(readerBasedJsonParser, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet4() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 4);
        Class _keyClass = Object.class;
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass", _keyClass);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        Object object = new Object();
        String string = "";
        
        settableAnyProperty.deserializeAndSet(null, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet5() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 16);
        UUIDDeserializer _deser = ((UUIDDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UUIDDeserializer"));
        Class _valueClass = Object.class;
        setField(_deser, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser", _deser);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        settableAnyProperty.deserializeAndSet(treeTraversingParser, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet6() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 4);
        Class _keyClass = Object.class;
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass", _keyClass);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        settableAnyProperty.deserializeAndSet(null, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet7() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 9);
        UUIDDeserializer _deser = ((UUIDDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UUIDDeserializer"));
        Class _valueClass = Object.class;
        setField(_deser, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser", _deser);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        settableAnyProperty.deserializeAndSet(jsonParserSequence, impl, object, string);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeAndSet8() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 10);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        settableAnyProperty.deserializeAndSet(uTF8StreamJsonParser, impl, object, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    @Test
    public void testDeserializeAndSet9() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 10);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        Object object = new Object();
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:852)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:133)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:133) */
        settableAnyProperty.deserializeAndSet(readerBasedJsonParser, impl, object, string);
    }
    
    @Test
    public void testDeserializeAndSet10() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 11);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        Object object = new Object();
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:852)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:133)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:133) */
        settableAnyProperty.deserializeAndSet(jsonParserSequence, impl, object, string);
    }
    
    @Test
    public void testDeserializeAndSet11() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 9);
        FromStringDeserializer.Std _deser = ((FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(_deser, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind", 2);
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser", _deser);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:133)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:133) */
        settableAnyProperty.deserializeAndSet(treeTraversingParser, null, object, string);
    }
    
    @Test
    public void testDeserializeAndSet12() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 9);
        FromStringDeserializer.Std _deser = ((FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(_deser, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind", 7);
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser", _deser);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object object = new Object();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:154)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:134) */
        settableAnyProperty.deserializeAndSet(treeTraversingParser, null, object, string);
    }
    
    @Test
    public void testDeserializeAndSet13() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 11);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:852)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:133)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:133) */
        settableAnyProperty.deserializeAndSet(null, impl, object, string);
    }
    
    @Test
    public void testDeserializeAndSet14() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 16);
        FromStringDeserializer.Std _deser = ((FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(_deser, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind", 3);
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser", _deser);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserialize(SettableAnyProperty.java:147)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:134) */
        settableAnyProperty.deserializeAndSet(null, null, object, string);
    }
    
    @Test
    public void testDeserializeAndSet15() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(stdKeyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", 5);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, stdKeyDeserializer, null, null);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:133)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.deserializeAndSet(SettableAnyProperty.java:133) */
        settableAnyProperty.deserializeAndSet(null, null, object, string);
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* An object with addr: (BVInt32 staticVariable37501176) and java.net.InetAddressImpl doesn't have
        concrete possible types,but there is no mock info generator provided
        to construct a mock value. */
        
        // 2 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _throwAsIOE(java.lang.Exception, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#_throwAsIOE(java.lang.Exception,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.io.UnsupportedEncodingException} in: ClassUtil.throwIfIOE(e);
 *  */
    @Test(expected = UnsupportedEncodingException.class)
    public void test_throwAsIOE_ThrowUnsupportedEncodingException() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null);
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        
        settableAnyProperty._throwAsIOE(unsupportedEncodingException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#_throwAsIOE(java.lang.Exception,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#getRootCause(java.lang.Throwable)}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw new JsonMappingException(null, t.getMessage(), t);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        settableAnyProperty._throwAsIOE(cloneNotSupportedException, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _throwAsIOE(java.lang.Exception, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#_throwAsIOE(java.lang.Exception,java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (e instanceof IllegalArgumentException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#classNameOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String actType = ClassUtil.classNameOf(value);
 *  */
    @Test
    public void test_throwAsIOE_ThrowNullPointerException() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        short[] shortArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.getClassName(SettableAnyProperty.java:217)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE(SettableAnyProperty.java:200) */
        settableAnyProperty._throwAsIOE(numberFormatException, null, shortArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _throwAsIOE(java.lang.Exception, java.lang.Object, java.lang.Object)
    
    @Test
    public void test_throwAsIOE1() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.getClassName(SettableAnyProperty.java:217)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE(SettableAnyProperty.java:200) */
        settableAnyProperty._throwAsIOE(numberFormatException, object, object);
    }
    
    @Test
    public void test_throwAsIOE2() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        Integer integer = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableAnyProperty.getClassName(SettableAnyProperty.java:217)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty._throwAsIOE(SettableAnyProperty.java:200) */
        settableAnyProperty._throwAsIOE(numberFormatException, integer, null);
    }
    ///endregion
    
    ///region Errors report for _throwAsIOE
    
    public void test_throwAsIOE_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new SettableAnyProperty(_property, _setter, _type, _keyDeserializer, deser, _valueTypeDeserializer);}
 *  */
    @Test
    public void testWithValueDeserializer_Return() throws Exception  {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        
        SettableAnyProperty actual = settableAnyProperty.withValueDeserializer(null);
        
        SettableAnyProperty expected = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        AnnotatedMember actual_setter = actual._setter;
        assertNull(actual_setter);
        
        boolean actual_setterIsField = actual._setterIsField;
        assertFalse(actual_setterIsField);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableAnyProperty.hasValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasValueDeserializer()
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#hasValueDeserializer()}
 * @utbot.returnsFrom {@code return (_valueDeserializer != null);}
 *  */
    @Test
    public void testHasValueDeserializer_Return_valueDeserializerEqualsNull() {
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, null, null);
        
        boolean actual = settableAnyProperty.hasValueDeserializer();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SettableAnyProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableAnyProperty#hasValueDeserializer()}
 * @utbot.returnsFrom {@code return (_valueDeserializer != null);}
 *  */
    @Test
    public void testHasValueDeserializer_Return_valueDeserializerEqualsNull_1() {
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(null, null, null, null, typeWrappedDeserializer, null);
        
        boolean actual = settableAnyProperty.hasValueDeserializer();
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1091194033470700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1091194033470700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1091194033478100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091194033470700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091194033478100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091194033876900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091194033876900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091194033879100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091194033876900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091194033879100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091194034481100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091194034481100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091194034484900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091194034481100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091194034484900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

