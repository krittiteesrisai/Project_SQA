package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import java.util.HashMap;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.DataInputStream;
import java.io.CharArrayReader;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.io.BufferedReader;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import java.io.FileInputStream;
import java.io.IOException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_impl_ObjectIdValuePropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdValueProperty actual = objectIdValueProperty.withName(((PropertyName) null));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_propName);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullProvider actual_nullProvider = ((NullProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        assertNull(actual_nullProvider);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata"));
        assertNull(actual_metadata);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        NumberDeserializers.FloatDeserializer floatDeserializer = new NumberDeserializers.FloatDeserializer(null, null);
        
        ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) floatDeserializer));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        NumberDeserializers.FloatDeserializer _valueDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_propName);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        Object actual_valueDeserializer_nullValue = getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer", "_nullValue");
        assertNull(actual_valueDeserializer_nullValue);
        
        Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueDeserializer_valueClass);
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullProvider actual_nullProvider = ((NullProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        assertNull(actual_nullProvider);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata"));
        assertNull(actual_metadata);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_2() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            JsonNodeDeserializer jsonNodeDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            
            JavaType objectIdValueProperty_type = ((JavaType) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            Class initialObjectIdValueProperty_type_class = ((Class) getFieldValue(objectIdValueProperty_type, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) jsonNodeDeserializer));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", jsonNodeDeserializer);
            NullProvider _nullProvider = ((NullProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullProvider"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_nullValue", instance);
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_rawType", _class);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_type, actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullProvider expected_nullProvider = ((NullProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullProvider actual_nullProvider = ((NullProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Object expected_nullProvider_nullValue = getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_nullValue");
            Object actual_nullProvider_nullValue = getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_nullValue");
            
            boolean actual_nullProvider_isPrimitive = ((Boolean) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_isPrimitive"));
            assertFalse(actual_nullProvider_isPrimitive);
            
            Class expected_nullProvider_rawType = ((Class) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_rawType"));
            Class actual_nullProvider_rawType = ((Class) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_rawType"));
            assertEquals(Class.class, actual_nullProvider_rawType.getClass());
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata"));
            assertNull(actual_metadata);
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            JavaType objectIdValueProperty_type1 = ((JavaType) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            Class finalObjectIdValueProperty_type_class = ((Class) getFieldValue(objectIdValueProperty_type1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialObjectIdValueProperty_type_class == finalObjectIdValueProperty_type_class);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((Converter) null));
        
        ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) stdDelegatingDeserializer));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        Class _valueClass = Object.class;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        PropertyName expected_propName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_propName, actual_propName);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        Converter actual_valueDeserializer_converter = ((Converter) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
        assertNull(actual_valueDeserializer_converter);
        
        JavaType actual_valueDeserializer_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        assertNull(actual_valueDeserializer_delegateType);
        
        JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        assertNull(actual_valueDeserializer_delegateDeserializer);
        
        Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullProvider actual_nullProvider = ((NullProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        assertNull(actual_nullProvider);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata"));
        assertNull(actual_metadata);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        AtomicReferenceDeserializer atomicReferenceDeserializer = new AtomicReferenceDeserializer(null);
        
        JavaType objectIdValueProperty_type = ((JavaType) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        Class initialObjectIdValueProperty_type_class = ((Class) getFieldValue(objectIdValueProperty_type, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) atomicReferenceDeserializer));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Class _valueClass = AtomicReference.class;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        NullProvider _nullProvider = ((NullProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullProvider"));
        AtomicReference _nullValue = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_nullValue", _nullValue);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_rawType", _class);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_propName);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JavaType actual_valueDeserializer_referencedType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_referencedType"));
        assertNull(actual_valueDeserializer_referencedType);
        
        TypeDeserializer actual_valueDeserializer_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_valueTypeDeserializer"));
        assertNull(actual_valueDeserializer_valueTypeDeserializer);
        
        JsonDeserializer actual_valueDeserializer_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_valueDeserializer"));
        assertNull(actual_valueDeserializer_valueDeserializer);
        
        Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullProvider expected_nullProvider = ((NullProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        NullProvider actual_nullProvider = ((NullProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        Object expected_nullProvider_nullValue = getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_nullValue");
        Object actual_nullProvider_nullValue = getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_nullValue");
        
        boolean actual_nullProvider_isPrimitive = ((Boolean) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_isPrimitive"));
        assertFalse(actual_nullProvider_isPrimitive);
        
        Class expected_nullProvider_rawType = ((Class) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_rawType"));
        Class actual_nullProvider_rawType = ((Class) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullProvider", "_rawType"));
        assertEquals(Class.class, actual_nullProvider_rawType.getClass());
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata"));
        assertNull(actual_metadata);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        JavaType objectIdValueProperty_type1 = ((JavaType) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        Class finalObjectIdValueProperty_type_class = ((Class) getFieldValue(objectIdValueProperty_type1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialObjectIdValueProperty_type_class == finalObjectIdValueProperty_type_class);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) null));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            PropertyName expected_propName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(expected_propName, actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations expected_contextAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            HashMap actual_contextAnnotations_annotations = ((HashMap) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
            assertNull(actual_contextAnnotations_annotations);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer expected_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            TypeIdResolver actual_valueTypeDeserializer_idResolver = ((TypeIdResolver) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver"));
            assertNull(actual_valueTypeDeserializer_idResolver);
            
            JavaType actual_valueTypeDeserializer_baseType = ((JavaType) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType"));
            assertNull(actual_valueTypeDeserializer_baseType);
            
            BeanProperty actual_valueTypeDeserializer_property = ((BeanProperty) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property"));
            assertNull(actual_valueTypeDeserializer_property);
            
            JavaType actual_valueTypeDeserializer_defaultImpl = ((JavaType) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl"));
            assertNull(actual_valueTypeDeserializer_defaultImpl);
            
            String actual_valueTypeDeserializer_typePropertyName = ((String) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_typePropertyName"));
            assertNull(actual_valueTypeDeserializer_typePropertyName);
            
            boolean actual_valueTypeDeserializer_typeIdVisible = ((Boolean) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_typeIdVisible"));
            assertFalse(actual_valueTypeDeserializer_typeIdVisible);
            
            HashMap actual_valueTypeDeserializer_deserializers = ((HashMap) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers"));
            assertNull(actual_valueTypeDeserializer_deserializers);
            
            JsonDeserializer actual_valueTypeDeserializer_defaultImplDeserializer = ((JsonDeserializer) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer"));
            assertNull(actual_valueTypeDeserializer_defaultImplDeserializer);
            
            NullProvider actual_nullProvider = ((NullProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            assertNull(actual_nullProvider);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata"));
            assertNull(actual_metadata);
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object id = _valueDeserializer.deserialize(jp, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85) */
        objectIdValueProperty.deserializeSetAndReturn(readerBasedJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object id = _valueDeserializer.deserialize(jp, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85) */
        objectIdValueProperty.deserializeSetAndReturn(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty idProp = _objectIdReader.idProperty;
 *  */
    @Test
    public void testSetAndReturn_ThrowNullPointerException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: idProp == null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        objectIdValueProperty.setAndReturn(objectArray, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdReferenceProperty _backProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        ObjectIdReferenceProperty _backProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _managedProperty);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        byte[] byteArray = {};
        
        objectIdValueProperty.setAndReturn(null, byteArray);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty2 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdReferenceProperty _managedProperty2 = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(jp, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(jp, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        NoClassDefFoundDeserializer _valueDeserializer = ((NoClassDefFoundDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    /// Actual number of generated tests (84) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testDeserializeAndSet3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[15];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '\\';
        _inputBuffer[14] = 'r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 31);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[15];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '\\';
        _inputBuffer[14] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 31);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2732)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '}', '}', '}', '}', '}', '}', '}',
            '\r'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 8);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 11);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1687)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 9, (byte) 9};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2752)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\', 't'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 11);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    @Test
    public void testDeserializeAndSet12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:241)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(treeTraversingParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet13() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:313)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(treeTraversingParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet14() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:510)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2729)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet15() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:510)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet16() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[13];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = ' ';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet17() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = ' ';
        _inputBuffer[38] = ' ';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:510)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet18() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '/', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:447)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1863)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet19() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:482)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1668)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet20() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet21() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet22() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'b';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet23() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {
            (byte) 91, (byte) 32, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91,
            (byte) 91, (byte) 91
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:685)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet24() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'f';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet25() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet26() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet27() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object _inputStream = createInstance("com.sun.org.apache.bcel.internal.util.ByteSequence$ByteArrayStream");
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream", _inputStream);
        byte[] _inputBuffer = {
            (byte) 13, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91,
            (byte) 91
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._closeInput(UTF8StreamJsonParser.java:241)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.loadMore(UTF8StreamJsonParser.java:187)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCR(UTF8StreamJsonParser.java:3276)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2745)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet28() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\t', '/'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:447)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1883)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet29() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {' ', '#'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet30() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:495)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2046)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet31() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 47};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:623)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:447)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipComment(UTF8StreamJsonParser.java:2901)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2780)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2736)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet32() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0001'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:418)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1487)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:469)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1874)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet33() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet34() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet35() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1196)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:162)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet36() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:72)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet37() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:241)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet38() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet39() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DataInputStream _inputStream = ((DataInputStream) createInstance("java.io.DataInputStream"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream", _inputStream);
        byte[] _inputBuffer = {(byte) 0};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            java.base/java.io.DataInputStream.read(DataInputStream.java:151)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.loadMore(UTF8StreamJsonParser.java:180)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2728)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet40() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        CharArrayReader _reader = ((CharArrayReader) createInstance("java.io.CharArrayReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {'\r'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            java.base/java.io.CharArrayReader.read(CharArrayReader.java:132)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1686)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet41() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        ObjectInputStream _inputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream", _inputStream);
        byte[] _inputBuffer = {(byte) 0};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.read(ObjectInputStream.java:1027)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.loadMore(UTF8StreamJsonParser.java:180)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2728)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet42() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        StringReader _reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {'#'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1643)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet43() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        BufferedReader _reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {' '};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1905)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, null);
    }
    
    @Test
    public void testDeserializeAndSet44() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, object);
    }
    
    @Test
    public void testDeserializeAndSet45() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2732)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, object);
    }
    
    @Test
    public void testDeserializeAndSet46() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\n', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.core.util.JsonParserDelegate[][] jsonParserDelegateArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:486)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._releaseBuffers(ReaderBasedJsonParser.java:201)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:390)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:576)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, impl, jsonParserDelegateArray);
    }
    
    @Test
    public void testDeserializeAndSet47() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:72)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate1, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet48() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:241)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate1, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet49() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        EnumSetDeserializer _deserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:125)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    @Test
    public void testDeserializeAndSet50() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[15];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = ' ';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 7);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:510)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:136)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(readerBasedJsonParser, null, object);
    }
    
    @Test
    public void testDeserializeAndSet51() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        EnumSetDeserializer _delegateDeserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:125)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:176)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    @Test
    public void testDeserializeAndSet52() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        EnumSetDeserializer _delegateDeserializer1 = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:125)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:176)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:176)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:85)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:77) */
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = IOException.class)
    public void testDeserializeAndSet53() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        FileInputStream _inputStream = ((FileInputStream) createInstance("java.io.FileInputStream"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream", _inputStream);
        byte[] _inputBuffer = {(byte) 0};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        objectIdValueProperty.deserializeAndSet(uTF8StreamJsonParser, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 22 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#getMember()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetMember_ReturnNull() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        
        AnnotatedMember actual = objectIdValueProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAnnotation_ReturnNull() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        
        Annotation actual = objectIdValueProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.set(objectArray, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        ObjectIdReferenceProperty _backProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", idProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[2] = object;
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdReferenceProperty _backProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        short[] shortArray = {};
        
        objectIdValueProperty.set(null, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdReferenceProperty _backProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        objectIdValueProperty.set(objectArray, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.set(null, objectArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSet1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", idProperty);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.set(object, object1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testSet5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(object, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", idProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(object, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", _managedProperty);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(object, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1065500814528000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1065500814528000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1065500814532400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065500814528000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065500814532400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1065500814915400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1065500814915400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1065500814917000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065500814915400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065500814917000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1065500815263800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1065500815263800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1065500815265300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065500815263800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065500815265300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1065500815965200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1065500815965200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1065500815966900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065500815965200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065500815966900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

