package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.nio.channels.AcceptPendingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.InvocationTargetException;
import com.sun.org.apache.xpath.internal.XPathException;
import javax.xml.transform.TransformerException;
import java.nio.charset.CharacterCodingException;
import java.nio.channels.NotYetBoundException;
import java.io.OptionalDataException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.NoAnnotations;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.TwoAnnotations;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_SettableBeanPropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#getSimpleName()}
 * @utbot.returnsFrom {@code return _propName.getSimpleName();}
 *  */
    @Test
    public void testGetName_PropertyNameGetSimpleName() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        String actual = mergingSettableBeanProperty.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#getSimpleName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _propName.getSimpleName();
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352) */
        mergingSettableBeanProperty.getName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "[property '" + getName() + "']";}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        String actual = mergingSettableBeanProperty.toString();
        
        String expected = "[property 'null']";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getDeclaringClass
    
    ///region Errors report for getDeclaringClass
    
    public void testGetDeclaringClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getType()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetType_Return() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        JavaType actual = mergingSettableBeanProperty.getType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getFullName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFullName()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getFullName()}
 * @utbot.returnsFrom {@code return _propName;}
 *  */
    @Test
    public void testGetFullName_Return_propName() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        PropertyName actual = mergingSettableBeanProperty.getFullName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _nullProvider.getNullValue(ctxt);}
 *  */
    @Test
    public void testDeserialize_Return_nullProviderGetNullValue() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            
            NullNode actual = ((NullNode) innerClassProperty.deserialize(filteringParserDelegate, null));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _nullProvider.getNullValue(ctxt);}
 *  */
    @Test
    public void testDeserialize_Return_nullProviderGetNullValue_1() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer1 = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            
            NullNode actual = ((NullNode) mergingSettableBeanProperty.deserialize(filteringParserDelegate, null));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _nullProvider.getNullValue(ctxt);}
 *  */
    @Test
    public void testDeserialize_Return_nullProviderGetNullValue_2() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        AtomicReference actual = ((AtomicReference) mergingSettableBeanProperty.deserialize(jsonParserDelegate, null));
        
        AtomicReference expected = new AtomicReference();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NULL)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:523) */
        mergingSettableBeanProperty.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:524) */
        innerClassProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:530) */
        mergingSettableBeanProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527) */
        innerClassProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:524) */
        innerClassProperty.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_5() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:524) */
        managedReferenceProperty.deserialize(jsonParserSequence, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        innerClassProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_1() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        mergingSettableBeanProperty.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        managedReferenceProperty.deserialize(filteringParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserialize1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        NullNode actual = ((NullNode) objectIdValueProperty.deserialize(jsonParserDelegate, null));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        JsonNodeDeserializer _deserializer2 = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        NullNode actual = ((NullNode) objectIdReferenceProperty.deserialize(jsonParserDelegate1, null));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize3() throws Exception  {
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(methodProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        methodProperty.deserialize(filteringParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize4() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        fieldProperty.deserialize(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1426)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:530) */
        mergingSettableBeanProperty.deserialize(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        _delegateDeserializer._vanillaProcessing = true;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527) */
        fieldProperty.deserialize(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527) */
        fieldProperty.deserialize(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(methodProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(methodProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527) */
        methodProperty.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer4 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer3, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer4);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:524) */
        objectIdValueProperty.deserialize(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        objectIdValueProperty.deserialize(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.setObjectIdInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setObjectIdInfo(com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setObjectIdInfo(com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 *  */
    @Test
    public void testSetObjectIdInfo() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        mergingSettableBeanProperty.setObjectIdInfo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.setViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setViews([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setViews(java.lang.Class[])}
 * @utbot.executesCondition {@code (views == null): False}
 *  */
    @Test
    public void testSetViews_ViewsNotEqualsNull() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        java.lang.Class[] classArray = {null};
        
        ViewMatcher initialMergingSettableBeanProperty_viewMatcher = mergingSettableBeanProperty._viewMatcher;
        
        mergingSettableBeanProperty.setViews(classArray);
        
        ViewMatcher finalMergingSettableBeanProperty_viewMatcher = mergingSettableBeanProperty._viewMatcher;
        
        Class finalClassArray0 = classArray[0];
        
        assertFalse(initialMergingSettableBeanProperty_viewMatcher == finalMergingSettableBeanProperty_viewMatcher);
        
        assertNull(finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setViews(java.lang.Class[])}
 * @utbot.executesCondition {@code (views == null): False}
 *  */
    @Test
    public void testSetViews_ViewsNotEqualsNull_1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        java.lang.Class[] classArray = {null, null};
        
        ViewMatcher initialManagedReferenceProperty_viewMatcher = managedReferenceProperty._viewMatcher;
        
        managedReferenceProperty.setViews(classArray);
        
        ViewMatcher finalManagedReferenceProperty_viewMatcher = managedReferenceProperty._viewMatcher;
        
        Class finalClassArray0 = classArray[0];
        Class finalClassArray1 = classArray[1];
        
        assertFalse(initialManagedReferenceProperty_viewMatcher == finalManagedReferenceProperty_viewMatcher);
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray1);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setViews(java.lang.Class[])}
 * @utbot.executesCondition {@code (views == null): True}
 *  */
    @Test
    public void testSetViews_ViewsEqualsNull() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        mergingSettableBeanProperty.setViews(null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setViews(java.lang.Class[])}
 * @utbot.executesCondition {@code (views == null): False}
 *  */
    @Test
    public void testSetViews_ViewsNotEqualsNull_2() throws Exception  {
        Class viewMatcherClazz = Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher");
        ViewMatcher prevEMPTY = ((ViewMatcher) getStaticFieldValue(viewMatcherClazz, "EMPTY"));
        try {
            ViewMatcher empty = new ViewMatcher();
            setStaticField(viewMatcherClazz, "EMPTY", empty);
            MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
            java.lang.Class[] classArray = {};
            
            ViewMatcher initialMergingSettableBeanProperty_viewMatcher = mergingSettableBeanProperty._viewMatcher;
            
            mergingSettableBeanProperty.setViews(classArray);
            
            ViewMatcher finalMergingSettableBeanProperty_viewMatcher = mergingSettableBeanProperty._viewMatcher;
            
            assertFalse(initialMergingSettableBeanProperty_viewMatcher == finalMergingSettableBeanProperty_viewMatcher);
        } finally {
            setStaticField(ViewMatcher.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.withSimpleName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSimpleName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#withSimpleName(java.lang.String)}
 * @utbot.executesCondition {@code ((_propName == null)): False}
 * @utbot.executesCondition {@code ((n == _propName)): True}
 * @utbot.returnsFrom {@code return (n == _propName) ? this : withName(n);}
 *  */
    @Test
    public void testWithSimpleName_NEquals_propName() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        MergingSettableBeanProperty actual = ((MergingSettableBeanProperty) mergingSettableBeanProperty.withSimpleName(null));
        
        AnnotatedMember actual_accessor = ((AnnotatedMember) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty", "_accessor"));
        assertNull(actual_accessor);
        
        SettableBeanProperty actualDelegate = actual.delegate;
        assertNull(actualDelegate);
        
        PropertyName mergingSettableBeanProperty_propName = mergingSettableBeanProperty._propName;
        PropertyName actual_propName = actual._propName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(mergingSettableBeanProperty_propName, actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int mergingSettableBeanProperty_propertyIndex = mergingSettableBeanProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(mergingSettableBeanProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#withSimpleName(java.lang.String)}
 * @utbot.executesCondition {@code ((_propName == null)): False}
 * @utbot.executesCondition {@code ((n == _propName)): True}
 * @utbot.returnsFrom {@code return (n == _propName) ? this : withName(n);}
 *  */
    @Test
    public void testWithSimpleName_NEquals_propName_1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        ManagedReferenceProperty actual = ((ManagedReferenceProperty) managedReferenceProperty.withSimpleName(_simpleName));
        
        String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
        assertNull(actual_referenceName);
        
        boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
        assertFalse(actual_isContainer);
        
        SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
        assertNull(actual_backProperty);
        
        SettableBeanProperty actualDelegate = actual.delegate;
        assertNull(actualDelegate);
        
        PropertyName managedReferenceProperty_propName = managedReferenceProperty._propName;
        PropertyName actual_propName = actual._propName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(managedReferenceProperty_propName, actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int managedReferenceProperty_propertyIndex = managedReferenceProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(managedReferenceProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#withSimpleName(java.lang.String)}
 * @utbot.executesCondition {@code ((_propName == null)): True}
 * @utbot.executesCondition {@code ((n == _propName)): False}
 * @utbot.returnsFrom {@code return (n == _propName) ? this : withName(n);}
 *  */
    @Test
    public void testWithSimpleName_NNotEquals_propName() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withSimpleName(null));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        ObjectIdReader actual_objectIdReader = ((ObjectIdReader) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_objectIdReader);
        
        PropertyName expected_propName = expected._propName;
        PropertyName actual_propName = actual._propName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_propName, actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = expected._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#withSimpleName(java.lang.String)}
 * @utbot.executesCondition {@code ((_propName == null)): False}
 * @utbot.executesCondition {@code ((n == _propName)): False}
 * @utbot.returnsFrom {@code return (n == _propName) ? this : withName(n);}
 *  */
    @Test
    public void testWithSimpleName_NNotEquals_propName_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        String _managedReferenceName = "";
        objectIdValueProperty._managedReferenceName = _managedReferenceName;
        String string = " ";
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withSimpleName(string));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName1);
        expected._managedReferenceName = _managedReferenceName;
        
        ObjectIdReader actual_objectIdReader = ((ObjectIdReader) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_objectIdReader);
        
        PropertyName expected_propName = expected._propName;
        PropertyName actual_propName = actual._propName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_propName, actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String expected_managedReferenceName = expected._managedReferenceName;
        String actual_managedReferenceName = actual._managedReferenceName;
        assertEquals(expected_managedReferenceName, actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = expected._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#withSimpleName(java.lang.String)}
 * @utbot.executesCondition {@code ((_propName == null)): True}
 * @utbot.executesCondition {@code ((n == _propName)): False}
 * @utbot.returnsFrom {@code return (n == _propName) ? this : withName(n);}
 *  */
    @Test
    public void testWithSimpleName_NNotEquals_propName_1() throws Exception  {
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        
        SetterlessProperty actual = ((SetterlessProperty) setterlessProperty.withSimpleName(null));
        
        SetterlessProperty expected = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        AnnotatedMethod actual_annotated = ((AnnotatedMethod) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated"));
        assertNull(actual_annotated);
        
        Method actual_getter = ((Method) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_getter"));
        assertNull(actual_getter);
        
        PropertyName expected_propName = expected._propName;
        PropertyName actual_propName = actual._propName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_propName, actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = expected._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#withSimpleName(java.lang.String)}
 * @utbot.executesCondition {@code ((_propName == null)): False}
 * @utbot.executesCondition {@code ((n == _propName)): False}
 * @utbot.returnsFrom {@code return (n == _propName) ? this : withName(n);}
 *  */
    @Test
    public void testWithSimpleName_NNotEquals_propName_3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        CreatorProperty actual = ((CreatorProperty) creatorProperty.withSimpleName(null));
        
        CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName1);
        
        AnnotatedParameter actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        Object actual_injectableValueId = actual._injectableValueId;
        assertNull(actual_injectableValueId);
        
        SettableBeanProperty actual_fallbackSetter = actual._fallbackSetter;
        assertNull(actual_fallbackSetter);
        
        int expected_creatorIndex = expected._creatorIndex;
        int actual_creatorIndex = actual._creatorIndex;
        assertEquals(expected_creatorIndex, actual_creatorIndex);
        
        boolean actual_ignorable = actual._ignorable;
        assertFalse(actual_ignorable);
        
        PropertyName expected_propName = expected._propName;
        PropertyName actual_propName = actual._propName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_propName, actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = expected._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withSimpleName(java.lang.String)
    
    @Test
    public void testWithSimpleName1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.withSimpleName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating.withName(SettableBeanProperty.java:673)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.withSimpleName(SettableBeanProperty.java:289) */
        managedReferenceProperty.withSimpleName(null);
    }
    
    @Test
    public void testWithSimpleName2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.withSimpleName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating.withName(SettableBeanProperty.java:673)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.withSimpleName(SettableBeanProperty.java:289) */
        managedReferenceProperty.withSimpleName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.assignIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assignIndex(int)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#assignIndex(int)}
 * @utbot.executesCondition {@code (_propertyIndex != -1): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _propertyIndex != -1
 *  */
    @Test
    public void testAssignIndex_ThrowNullPointerException() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        managedReferenceProperty._propertyIndex = -255;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.assignIndex] produces [java.lang.NullPointerException] */
        managedReferenceProperty.assignIndex(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.fixAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 *  */
    @Test
    public void testFixAccess() {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        innerClassProperty.fixAccess(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.visibleInView
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visibleInView(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#visibleInView(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ViewMatcher#isVisibleForView(java.lang.Class)}
 * @utbot.returnsFrom {@code return (_viewMatcher == null) || _viewMatcher.isVisibleForView(activeView);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_viewMatcher == null) || _viewMatcher.isVisibleForView(activeView);
 *  */
    @Test
    public void testVisibleInView_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ViewMatcher _viewMatcher = ((ViewMatcher) createInstance("com.fasterxml.jackson.databind.util.ViewMatcher"));
        mergingSettableBeanProperty._viewMatcher = _viewMatcher;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.visibleInView] produces [java.lang.NullPointerException] */
        mergingSettableBeanProperty.visibleInView(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getObjectIdInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getObjectIdInfo()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getObjectIdInfo()}
 * @utbot.returnsFrom {@code return _objectIdInfo;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _objectIdInfo;
 *  */
    @Test
    public void testGetObjectIdInfo_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getObjectIdInfo] produces [java.lang.NullPointerException] */
        mergingSettableBeanProperty.getObjectIdInfo();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.markAsIgnorable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markAsIgnorable()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#markAsIgnorable()}
 * @utbot.returnsFrom {@code /**
 *  * @since 2.9.4
 *  */
 * public void markAsIgnorable() {
 * }}
 *  */
    @Test
    public void testMarkAsIgnorable_Return() {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        
        managedReferenceProperty.markAsIgnorable();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getPropertyIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyIndex()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getPropertyIndex()}
 * @utbot.returnsFrom {@code return _propertyIndex;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _propertyIndex;
 *  */
    @Test
    public void testGetPropertyIndex_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        mergingSettableBeanProperty._propertyIndex = -255;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getPropertyIndex] produces [java.lang.NullPointerException] */
        mergingSettableBeanProperty.getPropertyIndex();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.isIgnorable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isIgnorable()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#isIgnorable()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsIgnorable_ReturnFalse() {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        
        boolean actual = managedReferenceProperty.isIgnorable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCreatorIndex()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getCreatorIndex()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", this.getName(), getClass().getName()));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetCreatorIndex_ThrowIllegalStateException() {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        
        managedReferenceProperty.getCreatorIndex();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _throwAsIOE(java.lang.Exception, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException} in: _throwAsIOE((JsonParser) null, e, value);
 *  */
    @Test(expected = UnrecognizedPropertyException.class)
    public void test_throwAsIOE_ThrowUnrecognizedPropertyException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        
        mergingSettableBeanProperty._throwAsIOE(unrecognizedPropertyException, ((Object) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwAsIOE(java.lang.Exception, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.throwsException {@link java.nio.channels.AcceptPendingException} in: _throwAsIOE((JsonParser) null, e, value);
 *  */
    @Test(expected = AcceptPendingException.class)
    public void test_throwAsIOE_ThrowAcceptPendingException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AcceptPendingException acceptPendingException = ((AcceptPendingException) createInstance("java.nio.channels.AcceptPendingException"));
        
        mergingSettableBeanProperty._throwAsIOE(acceptPendingException, ((Object) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _throwAsIOE(java.lang.Exception, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_throwAsIOE_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE(SettableBeanProperty.java:585)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE(SettableBeanProperty.java:622) */
        mergingSettableBeanProperty._throwAsIOE(numberFormatException, byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _throwAsIOE(java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_3() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        mergingSettableBeanProperty._throwAsIOE(cloneNotSupportedException);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_5() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        InterruptedException target = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        setField(target, "java.lang.Throwable", "cause", target);
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        mergingSettableBeanProperty._throwAsIOE(interruptedException);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = UnrecognizedPropertyException.class)
    public void test_throwAsIOE_ThrowUnrecognizedPropertyException1() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        
        innerClassProperty._throwAsIOE(unrecognizedPropertyException);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        XPathException xPathException = ((XPathException) createInstance("com.sun.org.apache.xpath.internal.XPathException"));
        CloneNotSupportedException containedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(xPathException, "javax.xml.transform.TransformerException", "containedException", containedException);
        
        mergingSettableBeanProperty._throwAsIOE(xPathException);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_4() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        mergingSettableBeanProperty._throwAsIOE(interruptedException);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_1() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        TransformerException transformerException = ((TransformerException) createInstance("javax.xml.transform.TransformerException"));
        
        innerClassProperty._throwAsIOE(transformerException);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_2() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        NullPointerException cause = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        String detailMessage = "";
        setField(cause, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cause);
        
        innerClassProperty._throwAsIOE(cloneNotSupportedException);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwAsIOE(java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(java.lang.Exception)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return _throwAsIOE((JsonParser) null, e);
 *  */
    @Test(expected = NumberFormatException.class)
    public void test_throwAsIOE_ThrowNumberFormatException() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        innerClassProperty._throwAsIOE(numberFormatException);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _throwAsIOE(com.fasterxml.jackson.core.JsonParser, java.lang.Exception, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.throwsException {@link java.nio.charset.CharacterCodingException} in: _throwAsIOE(p, e);
 *  */
    @Test(expected = CharacterCodingException.class)
    public void test_throwAsIOE_ThrowCharacterCodingException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CharacterCodingException characterCodingException = ((CharacterCodingException) createInstance("java.nio.charset.CharacterCodingException"));
        
        mergingSettableBeanProperty._throwAsIOE(null, characterCodingException, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: _throwAsIOE(p, e);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException1() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cloneNotSupportedException);
        
        mergingSettableBeanProperty._throwAsIOE(null, cloneNotSupportedException, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwAsIOE(com.fasterxml.jackson.core.JsonParser, java.lang.Exception, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.executesCondition {@code (e instanceof IllegalArgumentException): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link java.nio.channels.NotYetBoundException} in: _throwAsIOE(p, e);
 *  */
    @Test(expected = NotYetBoundException.class)
    public void test_throwAsIOE_ThrowNotYetBoundException() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        NotYetBoundException notYetBoundException = ((NotYetBoundException) createInstance("java.nio.channels.NotYetBoundException"));
        
        managedReferenceProperty._throwAsIOE(null, notYetBoundException, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _throwAsIOE(com.fasterxml.jackson.core.JsonParser, java.lang.Exception, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.executesCondition {@code (e instanceof IllegalArgumentException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#classNameOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_throwAsIOE_ThrowNullPointerException1() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        short[] shortArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE(SettableBeanProperty.java:585) */
        mergingSettableBeanProperty._throwAsIOE(null, numberFormatException, shortArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty._throwAsIOE
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _throwAsIOE(com.fasterxml.jackson.core.JsonParser, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link java.io.OptionalDataException} in: ClassUtil.throwIfIOE(e);
 *  */
    @Test(expected = OptionalDataException.class)
    public void test_throwAsIOE_ThrowOptionalDataException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        OptionalDataException optionalDataException = ((OptionalDataException) createInstance("java.io.OptionalDataException"));
        
        mergingSettableBeanProperty._throwAsIOE(((JsonParser) null), ((Exception) optionalDataException));
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw JsonMappingException.from(p, th.getMessage(), th);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException2() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        TransformerException transformerException = ((TransformerException) createInstance("javax.xml.transform.TransformerException"));
        setField(transformerException, "javax.xml.transform.TransformerException", "containedException", transformerException);
        
        innerClassProperty._throwAsIOE(((JsonParser) null), ((Exception) transformerException));
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw JsonMappingException.from(p, th.getMessage(), th);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_11() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        NullPointerException cause = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        String detailMessage = "";
        setField(cause, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(cause, "java.lang.Throwable", "cause", cause);
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cause);
        
        innerClassProperty._throwAsIOE(((JsonParser) null), ((Exception) cloneNotSupportedException));
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw JsonMappingException.from(p, th.getMessage(), th);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_21() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        managedReferenceProperty._throwAsIOE(((JsonParser) null), ((Exception) cloneNotSupportedException));
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw JsonMappingException.from(p, th.getMessage(), th);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_31() throws Exception  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        CloneNotSupportedException target = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        String detailMessage = "";
        setField(target, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        innerClassProperty._throwAsIOE(((JsonParser) null), ((Exception) interruptedException));
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw JsonMappingException.from(p, th.getMessage(), th);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_throwAsIOE_ThrowJsonMappingException_41() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        managedReferenceProperty._throwAsIOE(((JsonParser) null), ((Exception) interruptedException));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwAsIOE(com.fasterxml.jackson.core.JsonParser, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: ClassUtil.throwIfRTE(e);
 *  */
    @Test(expected = NumberFormatException.class)
    public void test_throwAsIOE_ThrowNumberFormatException1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        managedReferenceProperty._throwAsIOE(((JsonParser) null), ((Exception) numberFormatException));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.hasViews
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasViews()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#hasViews()}
 * @utbot.returnsFrom {@code return _viewMatcher != null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _viewMatcher != null;
 *  */
    @Test
    public void testHasViews_ThrowNullPointerException() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        Object _viewMatcher = createInstance("com.fasterxml.jackson.databind.util.ViewMatcher$Single");
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.hasViews] produces [java.lang.NullPointerException] */
        managedReferenceProperty.hasViews();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWith(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserializeWith(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider#isSkipper(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 *  */
    @Test
    public void testDeserializeWith_NullsConstantProviderIsSkipper() throws Exception  {
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", skipper);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            
            Object actual = managedReferenceProperty.deserializeWith(filteringParserDelegate, null, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWith(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserializeWith(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NULL)
 *  */
    @Test
    public void testDeserializeWith_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:545) */
        mergingSettableBeanProperty.deserializeWith(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserializeWith(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = _valueDeserializer.deserialize(p, ctxt, toUpdate);
 *  */
    @Test
    public void testDeserializeWith_ThrowNullPointerException_1() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        mergingSettableBeanProperty.deserializeWith(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserializeWith(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = _valueDeserializer.deserialize(p, ctxt, toUpdate);
 *  */
    @Test
    public void testDeserializeWith_ThrowNullPointerException_2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:550) */
        innerClassProperty.deserializeWith(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserializeWith(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider#isSkipper(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.NullValueProvider#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserializeWith_ThrowNullPointerException_4() throws Exception  {
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:550) */
            managedReferenceProperty.deserializeWith(filteringParserDelegate, null, null);
        } finally {
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserializeWith(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = _valueDeserializer.deserialize(p, ctxt, toUpdate);
 *  */
    @Test
    public void testDeserializeWith_ThrowNullPointerException_3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        managedReferenceProperty.deserializeWith(jsonParserDelegate1, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWith(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testDeserializeWith1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        _deserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler.processUnwrapped(UnwrappedPropertyHandler.java:58)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:220)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:86)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        objectIdValueProperty.deserializeWith(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeWith2() throws Exception  {
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        Object _valueId = createInstance("java.lang.Object");
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(methodProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:71)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.findValue(ValueInjector.java:45)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:51)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1520)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:217)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        methodProperty.deserializeWith(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeWith3() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        _deserializer._externalTypeIdHandler = _externalTypeIdHandler;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:53)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:70)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:873)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:223)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:86)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        fieldProperty.deserializeWith(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWith4() throws Exception  {
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(setterlessProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.BeanProperty$Std.getName(BeanProperty.java:322)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:79)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.findValue(ValueInjector.java:45)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:51)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1520)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:217)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        setterlessProperty.deserializeWith(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeWith5() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        _valueDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:53)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:70)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:873)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:223)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserializeWith(SettableBeanProperty.java:560) */
        managedReferenceProperty.deserializeWith(filteringParserDelegate, impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getWrapperName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWrapperName()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getWrapperName()}
 * @utbot.returnsFrom {@code return _wrapperName;}
 *  */
    @Test
    public void testGetWrapperName_Return_wrapperName() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        PropertyName actual = mergingSettableBeanProperty.getWrapperName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getManagedReferenceName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getManagedReferenceName()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.returnsFrom {@code return _managedReferenceName;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _managedReferenceName;
 *  */
    @Test
    public void testGetManagedReferenceName_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getManagedReferenceName] produces [java.lang.NullPointerException] */
        mergingSettableBeanProperty.getManagedReferenceName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.hasValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasValueDeserializer()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#hasValueDeserializer()}
 * @utbot.returnsFrom {@code return (_valueDeserializer != null) && (_valueDeserializer != MISSING_VALUE_DESERIALIZER);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_valueDeserializer != null) && (_valueDeserializer != MISSING_VALUE_DESERIALIZER);
 *  */
    @Test
    public void testHasValueDeserializer_ThrowNullPointerException() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.hasValueDeserializer] produces [java.lang.NullPointerException] */
        managedReferenceProperty.hasValueDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (isRequired()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor#optionalProperty(com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testDepositSchemaProperty_NotIsRequired() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        innerClassProperty.depositSchemaProperty(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (isRequired()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor#property(com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testDepositSchemaProperty_IsRequired() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        innerClassProperty.depositSchemaProperty(base, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (isRequired()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: objectVisitor.optionalProperty(this);
 *  */
    @Test
    public void testDepositSchemaProperty_ThrowNullPointerException() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty(SettableBeanProperty.java:387) */
        managedReferenceProperty.depositSchemaProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (isRequired()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: objectVisitor.optionalProperty(this);
 *  */
    @Test
    public void testDepositSchemaProperty_ThrowNullPointerException_1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty(SettableBeanProperty.java:387) */
        managedReferenceProperty.depositSchemaProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (isRequired()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor#property(com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: objectVisitor.property(this);
 *  */
    @Test
    public void testDepositSchemaProperty_ThrowNullPointerException_2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.depositSchemaProperty(SettableBeanProperty.java:385) */
        managedReferenceProperty.depositSchemaProperty(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getNullValueProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullValueProvider()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getNullValueProvider()}
 * @utbot.returnsFrom {@code return _nullProvider;}
 *  */
    @Test
    public void testGetNullValueProvider_Return_nullProvider() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        NullValueProvider actual = managedReferenceProperty.getNullValueProvider();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getContextAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet_6() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationCollector.NoAnnotations _contextAnnotations = ((AnnotationCollector.NoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet_3() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationCollector.TwoAnnotations _contextAnnotations = ((AnnotationCollector.TwoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Class _type1 = Object.class;
        setField(_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1", _type1);
        setField(_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type2", _type1);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotations annotations = mergingSettableBeanProperty._contextAnnotations;
        Class initialMergingSettableBeanProperty_contextAnnotations_type1 = ((Class) getFieldValue(annotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1"));
        Annotations annotations1 = mergingSettableBeanProperty._contextAnnotations;
        Class initialMergingSettableBeanProperty_contextAnnotations_type2 = ((Class) getFieldValue(annotations1, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type2"));
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
        
        Annotations annotations2 = mergingSettableBeanProperty._contextAnnotations;
        Class finalMergingSettableBeanProperty_contextAnnotations_type1 = ((Class) getFieldValue(annotations2, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1"));
        Annotations annotations3 = mergingSettableBeanProperty._contextAnnotations;
        Class finalMergingSettableBeanProperty_contextAnnotations_type2 = ((Class) getFieldValue(annotations3, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type2"));
        
        assertFalse(initialMergingSettableBeanProperty_contextAnnotations_type1 == finalMergingSettableBeanProperty_contextAnnotations_type1);
        
        assertFalse(initialMergingSettableBeanProperty_contextAnnotations_type2 == finalMergingSettableBeanProperty_contextAnnotations_type2);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet_4() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationCollector.OneAnnotation _contextAnnotations = ((AnnotationCollector.OneAnnotation) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Class _type = Object.class;
        setField(_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation", "_type", _type);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotations annotations = mergingSettableBeanProperty._contextAnnotations;
        Class initialMergingSettableBeanProperty_contextAnnotations_type = ((Class) getFieldValue(annotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation", "_type"));
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
        
        Annotations annotations1 = mergingSettableBeanProperty._contextAnnotations;
        Class finalMergingSettableBeanProperty_contextAnnotations_type = ((Class) getFieldValue(annotations1, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation", "_type"));
        
        assertFalse(initialMergingSettableBeanProperty_contextAnnotations_type == finalMergingSettableBeanProperty_contextAnnotations_type);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet_1() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationCollector.TwoAnnotations _contextAnnotations = ((AnnotationCollector.TwoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet_5() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationCollector.OneAnnotation _contextAnnotations = ((AnnotationCollector.OneAnnotation) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_Return_contextAnnotationsGet_2() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        AnnotationCollector.TwoAnnotations _contextAnnotations = ((AnnotationCollector.TwoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Class _type1 = Object.class;
        setField(_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1", _type1);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        
        Annotations annotations = mergingSettableBeanProperty._contextAnnotations;
        Class initialMergingSettableBeanProperty_contextAnnotations_type1 = ((Class) getFieldValue(annotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1"));
        
        Annotation actual = mergingSettableBeanProperty.getContextAnnotation(null);
        
        assertNull(actual);
        
        Annotations annotations1 = mergingSettableBeanProperty._contextAnnotations;
        Class finalMergingSettableBeanProperty_contextAnnotations_type1 = ((Class) getFieldValue(annotations1, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1"));
        
        assertFalse(initialMergingSettableBeanProperty_contextAnnotations_type1 == finalMergingSettableBeanProperty_contextAnnotations_type1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContextAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getContextAnnotation(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.Annotations#get(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _contextAnnotations.get(acls);
 *  */
    @Test
    public void testGetContextAnnotation_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getContextAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getContextAnnotation(SettableBeanProperty.java:376) */
        mergingSettableBeanProperty.getContextAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueDeserializer()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.executesCondition {@code (deser == MISSING_VALUE_DESERIALIZER): False}
 * @utbot.returnsFrom {@code return deser;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deser;
 *  */
    @Test
    public void testGetValueDeserializer_ThrowNullPointerException() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getValueDeserializer] produces [java.lang.NullPointerException] */
            mergingSettableBeanProperty.getValueDeserializer();
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.setManagedReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setManagedReferenceName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setManagedReferenceName(java.lang.String)}
 *  */
    @Test
    public void testSetManagedReferenceName() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        mergingSettableBeanProperty.setManagedReferenceName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.hasValueTypeDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasValueTypeDeserializer()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#hasValueTypeDeserializer()}
 * @utbot.returnsFrom {@code return (_valueTypeDeserializer != null);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_valueTypeDeserializer != null);
 *  */
    @Test
    public void testHasValueTypeDeserializer_ThrowNullPointerException() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.hasValueTypeDeserializer] produces [java.lang.NullPointerException] */
        managedReferenceProperty.hasValueTypeDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getValueTypeDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueTypeDeserializer()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueTypeDeserializer()}
 * @utbot.returnsFrom {@code return _valueTypeDeserializer;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueTypeDeserializer;
 *  */
    @Test
    public void testGetValueTypeDeserializer_ThrowNullPointerException() throws Exception  {
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.SettableBeanProperty.getValueTypeDeserializer] produces [java.lang.NullPointerException] */
        mergingSettableBeanProperty.getValueTypeDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.SettableBeanProperty.getInjectableValueId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInjectableValueId()
    
    /**
    @utbot.classUnderTest {@link SettableBeanProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getInjectableValueId()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetInjectableValueId_ReturnNull() {
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        
        Object actual = managedReferenceProperty.getInjectableValueId();
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1091346835027700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1091346835027700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1091346835033600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091346835027700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091346835033600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091346835404499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091346835404499.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091346835406400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091346835404499.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091346835406400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1091346836143099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091346836143099.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091346836144600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091346836143099.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091346836144600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1091346836780499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091346836780499.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091346836782099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091346836780499.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091346836782099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

