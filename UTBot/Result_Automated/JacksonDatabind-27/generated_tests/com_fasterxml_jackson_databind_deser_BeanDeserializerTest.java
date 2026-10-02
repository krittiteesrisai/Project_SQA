package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.HashMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_deser_BeanDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testDeserialize_ReturnBean_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = beanDeserializer.deserialize(jsonParserDelegate, null, null);
        
        assertNull(actual);
        
        JsonParser jsonParserDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonReadContext jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        Object finalJsonParserDelegateDelegateDelegateDelegate_parsingContext_currentValue = getFieldValue(jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        
        assertNull(finalJsonParserDelegateDelegateDelegateDelegate_parsingContext_currentValue);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testDeserialize_ReturnBean() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = beanDeserializer.deserialize(jsonParserDelegate, null, null);
        
        assertNull(actual);
        
        JsonParser jsonParserDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonReadContext jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        Object finalJsonParserDelegateDelegateDelegateDelegate_parsingContext_currentValue = getFieldValue(jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        
        assertNull(finalJsonParserDelegateDelegateDelegateDelegate_parsingContext_currentValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#setCurrentValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:183) */
        beanDeserializer.deserialize(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injectValues(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_ThrowIllegalArgumentException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        byte[] _valueId = {};
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer.deserialize(uTF8StreamJsonParser, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injectValues(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_ThrowIllegalArgumentException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer.deserialize(uTF8StreamJsonParser, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: injectValues(ctxt, bean);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer.deserialize(uTF8StreamJsonParser, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.isExpectedStartObjectToken()
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:123) */
        beanDeserializer.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deserializeOther(p, ctxt, t);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1222)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:152)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134) */
        beanDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deserializeOther(p, ctxt, t);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._vanillaProcessing = true;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:245)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:159)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134) */
        beanDeserializer.deserialize(jsonParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:779) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#start()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:777) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        HashMap _nameToPropertyIndex = new HashMap();
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex", _nameToPropertyIndex);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:779) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:623) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:623) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped1() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method deserializeUsingPropertyBasedWithUnwrappedMethod = beanDeserializerClazz.getDeclaredMethod("deserializeUsingPropertyBasedWithUnwrapped", parserType, deserializationContextType);
        deserializeUsingPropertyBasedWithUnwrappedMethod.setAccessible(true);
        java.lang.Object[] deserializeUsingPropertyBasedWithUnwrappedMethodArguments = new java.lang.Object[2];
        deserializeUsingPropertyBasedWithUnwrappedMethodArguments[0] = parser;
        deserializeUsingPropertyBasedWithUnwrappedMethodArguments[1] = ((Object) null);
        try {
            deserializeUsingPropertyBasedWithUnwrappedMethod.invoke(beanDeserializer, deserializeUsingPropertyBasedWithUnwrappedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 32);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 10);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate9 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate10 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate11 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate12 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate13 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate14 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate15 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate14, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate15);
        setField(delegate13, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate14);
        setField(delegate12, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate13);
        setField(delegate11, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate12);
        setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
        setField(delegate9, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate10);
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate9);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate9 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate10 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate11 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate12 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate13 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate14 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate13, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate14);
        setField(delegate12, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate13);
        setField(delegate11, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate12);
        setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
        setField(delegate9, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate10);
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate9);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializer actual = beanDeserializer.withObjectIdReader(((ObjectIdReader) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMethod actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = beanDeserializer.withObjectIdReader(((ObjectIdReader) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMethod actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BeanDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
            java.lang.Object[] _hashArea = {null};
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:186)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:345)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.<init>(BeanDeserializer.java:68)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader(BeanDeserializer.java:93) */
            beanDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BeanDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer");
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            java.lang.Object[] _hashArea = new java.lang.Object[1];
            BeanDeserializer beanDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            setField(beanDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            HashSet _ignorableProps = new HashSet();
            setField(beanDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            setField(beanDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
            _hashArea[0] = ((Object) beanDeserializer1);
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:166)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:345)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.<init>(BeanDeserializer.java:68)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader(BeanDeserializer.java:93) */
            beanDeserializer.withObjectIdReader(_objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new BeanDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowClassCastException() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            java.lang.Object[] _hashArea = new java.lang.Object[2];
            Object object = createInstance("java.lang.Object");
            _hashArea[1] = object;
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            HashSet _ignorableProps = new HashSet();
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:150)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:345)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.<init>(BeanDeserializer.java:68)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader(BeanDeserializer.java:93) */
            beanDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BeanDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowNullPointerException() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 128);
            java.lang.Object[] _hashArea = {null, null};
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:188)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:345)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.<init>(BeanDeserializer.java:68)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader(BeanDeserializer.java:93) */
            beanDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(t)
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141) */
        beanDeserializer._deserializeOther(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_vanillaProcessing): True}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)
 * @utbot.activatesSwitch {@code switch(t) case: END_OBJECT}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return vanillaDeserialize(p, ctxt, t);
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._vanillaProcessing = true;
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:245)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:159) */
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#mappingException(java.lang.Class)}
 * @utbot.activatesSwitch {@code switch(t) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: switch(t) case: default
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:166) */
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void test_deserializeOther1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        
        Object actual = beanDeserializer._deserializeOther(uTF8StreamJsonParser, null, jsonToken);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void test_deserializeOther2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:786)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1257)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:155) */
        beanDeserializer._deserializeOther(readerBasedJsonParser, impl, jsonToken);
    }
    
    @Test
    public void test_deserializeOther3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2854)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1239)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:155) */
        beanDeserializer._deserializeOther(uTF8StreamJsonParser, impl, jsonToken);
    }
    
    @Test
    public void test_deserializeOther4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_FALSE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1222)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:152) */
        beanDeserializer._deserializeOther(uTF8StreamJsonParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1235)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:155) */
        beanDeserializer._deserializeOther(readerBasedJsonParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther6() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        PropertyBasedObjectIdGenerator generator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:525)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1071)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:162) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _deserializeOtherMethod = beanDeserializerClazz.getDeclaredMethod("_deserializeOther", parserType, deserializationContextType, jsonTokenType);
        _deserializeOtherMethod.setAccessible(true);
        java.lang.Object[] _deserializeOtherMethodArguments = new java.lang.Object[3];
        _deserializeOtherMethodArguments[0] = parser;
        _deserializeOtherMethodArguments[1] = ((Object) null);
        _deserializeOtherMethodArguments[2] = jsonToken;
        try {
            _deserializeOtherMethod.invoke(beanDeserializer, _deserializeOtherMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_deserializeOther7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1239)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:155) */
        beanDeserializer._deserializeOther(readerBasedJsonParser, impl, jsonToken);
    }
    
    @Test
    public void test_deserializeOther8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:127)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1080)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1119)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:145) */
        beanDeserializer._deserializeOther(filteringParserDelegate, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:123)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1080)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1161)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:143) */
        beanDeserializer._deserializeOther(jsonParserSequence, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1080)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1119)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:145) */
        beanDeserializer._deserializeOther(filteringParserDelegate, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonToken jsonToken = JsonToken.VALUE_FALSE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1222)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:152) */
        beanDeserializer._deserializeOther(jsonParserSequence, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken jsonToken = JsonToken.VALUE_TRUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer.deserialize(JsonNodeDeserializer.java:126)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer.deserialize(JsonNodeDeserializer.java:108)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1214)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:152) */
        beanDeserializer._deserializeOther(filteringParserDelegate, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther13() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken jsonToken = JsonToken.VALUE_FALSE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1214)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:152) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _deserializeOtherMethod = beanDeserializerClazz.getDeclaredMethod("_deserializeOther", parserType, deserializationContextType, jsonTokenType);
        _deserializeOtherMethod.setAccessible(true);
        java.lang.Object[] _deserializeOtherMethodArguments = new java.lang.Object[3];
        _deserializeOtherMethodArguments[0] = parser;
        _deserializeOtherMethodArguments[1] = ((Object) null);
        _deserializeOtherMethodArguments[2] = jsonToken;
        try {
            _deserializeOtherMethod.invoke(beanDeserializer, _deserializeOtherMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_deserializeOther14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1235)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:155) */
        beanDeserializer._deserializeOther(jsonParserDelegate, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _fromStringCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:230)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1176)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:143) */
        beanDeserializer._deserializeOther(treeTraversingParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:41)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:47)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:777)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:716)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(treeTraversingParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther17() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._nonStandardCreation = true;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        PropertyBasedObjectIdGenerator generator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1102)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1071)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:162) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _deserializeOtherMethod = beanDeserializerClazz.getDeclaredMethod("_deserializeOther", parserType, deserializationContextType, jsonTokenType);
        _deserializeOtherMethod.setAccessible(true);
        java.lang.Object[] _deserializeOtherMethodArguments = new java.lang.Object[3];
        _deserializeOtherMethodArguments[0] = parser;
        _deserializeOtherMethodArguments[1] = ((Object) null);
        _deserializeOtherMethodArguments[2] = jsonToken;
        try {
            _deserializeOtherMethod.invoke(beanDeserializer, _deserializeOtherMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_deserializeOther18() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:521)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(readerBasedJsonParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1176)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:143) */
        beanDeserializer._deserializeOther(uTF8StreamJsonParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonToken jsonToken = JsonToken.VALUE_FALSE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:123)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1214)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:152) */
        beanDeserializer._deserializeOther(jsonParserDelegate, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther21() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:123)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:518)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther22() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:165)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:625)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:521)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther23() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:518)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(jsonParserSequence, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther24() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1096)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(treeTraversingParser, null, jsonToken);
    }
    
    @Test
    public void test_deserializeOther25() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:123)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1096)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:164) */
        beanDeserializer._deserializeOther(jsonParserDelegate, null, jsonToken);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    @Test(expected = IllegalStateException.class)
    public void test_deserializeOther26() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        PropertyBasedObjectIdGenerator generator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        beanDeserializer._deserializeOther(readerBasedJsonParser, null, jsonToken);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_deserializeOther27() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        PropertyBasedObjectIdGenerator generator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        beanDeserializer._deserializeOther(treeTraversingParser, null, jsonToken);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeOther28() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken jsonToken = JsonToken.VALUE_TRUE;
        
        beanDeserializer._deserializeOther(filteringParserDelegate, null, jsonToken);
    }
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeOther29() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_FALSE;
        
        beanDeserializer._deserializeOther(uTF8StreamJsonParser, null, jsonToken);
    }
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeOther30() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        beanDeserializer._nonStandardCreation = true;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    ///endregion
    
    ///region Errors report for _deserializeOther
    
    public void test_deserializeOther_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method vanillaDeserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException_1() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:247) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException_2() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:247) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException_3() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:247) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:245) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method vanillaDeserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVanillaDeserialize_ThrowIllegalStateException_1() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVanillaDeserialize_ThrowIllegalStateException() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method vanillaDeserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void testVanillaDeserialize1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class uTF8StreamJsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", uTF8StreamJsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = uTF8StreamJsonParser;
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = jsonToken;
        LinkedHashMap actual = ((LinkedHashMap) vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testVanillaDeserialize2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserDelegateType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = jsonParserDelegate;
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        ArrayList actual = ((ArrayList) vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region Errors report for vanillaDeserialize
    
    public void testVanillaDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _missingToken(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_missingToken(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.endOfInputException(handledType());
 *  */
    @Test
    public void test_missingToken_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken(BeanDeserializer.java:171) */
        beanDeserializer._missingToken(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.withIgnorableProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnorableProperties(java.util.HashSet)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withIgnorableProperties(java.util.HashSet)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((HashSet) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMethod actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withIgnorableProperties(java.util.HashSet)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((HashSet) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMethod actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map expected_backRefs = expected._backRefs;
        Map actual_backRefs = actual._backRefs;
        assertTrue(deepEquals(expected_backRefs, actual_backRefs));
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:363) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:368) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:363) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#build(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: wrapInstantiationProblem(e, ctxt);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeUsingPropertyBased1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate2, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:370) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:442) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:442) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate1, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:368) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate2, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:442) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeUsingPropertyBased7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 8);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeUsingPropertyBased8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) innerClassProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeUsingPropertyBased9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 10);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_deserializeUsingPropertyBased11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 8);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[12];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) innerClassProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 4);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region Errors report for _deserializeUsingPropertyBased
    
    public void test_deserializeUsingPropertyBased_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeWithUnwrapped(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:623)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:521)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeWithExternalTypeId(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNegativeArraySizeException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:779)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:716)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Object bean = deserializeFromObjectUsingNonDefault(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNegativeArraySizeException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:363)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1099)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:314) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:314) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:314) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:312) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#maySerializeAsObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator generator = ((com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:312) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject_ThrowIllegalStateException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject_ThrowIllegalStateException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object bean = deserializeFromObjectUsingNonDefault(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject_ThrowIllegalStateException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeWithExternalTypeId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeFromObject1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        LinkedHashMap actual = ((LinkedHashMap) beanDeserializer.deserializeFromObject(treeTraversingParser, null));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testDeserializeFromObject2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        LinkedHashMap actual = ((LinkedHashMap) beanDeserializer.deserializeFromObject(jsonParserSequence, null));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testDeserializeFromObject3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        HashMap actual = ((HashMap) beanDeserializer.deserializeFromObject(jsonParserSequence, null));
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObject4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObject5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.setCurrentValue(JsonParserDelegate.java:35)
            com.fasterxml.jackson.core.util.JsonParserDelegate.setCurrentValue(JsonParserDelegate.java:35)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:314) */
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObject7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator generator = ((com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:314) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator generator = ((com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:314) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:699)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:521)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:289) */
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObject10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:41)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:47)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:726)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:718)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:41)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:47)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:726)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:718)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:41)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:47)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:726)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:718)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:165)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:781)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:716)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:165)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:781)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:716)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:292) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        beanDeserializer._nonStandardCreation = true;
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTokenLocation(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:148)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1106)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294) */
        beanDeserializer.deserializeFromObject(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromObject17() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:127)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1096)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294) */
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObject18() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:193)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:193)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1270)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1096)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294) */
        beanDeserializer.deserializeFromObject(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserializeFromObject19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator generator = ((com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:442)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1099)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294) */
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1530)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:442)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1099)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:294) */
        beanDeserializer.deserializeFromObject(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject21() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator generator = ((com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        beanDeserializer.deserializeFromObject(uTF8StreamJsonParser, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject22() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject23() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        beanDeserializer.deserializeFromObject(uTF8StreamJsonParser, null);
    }
    ///endregion
    
    ///region Errors report for deserializeFromObject
    
    public void testDeserializeFromObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asArrayDeserializer()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#asArrayDeserializer()}
 * @utbot.returnsFrom {@code return new BeanAsArrayDeserializer(this, props);}
 *  */
    @Test
    public void testAsArrayDeserializer_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanDeserializer.asArrayDeserializer());
        
        BeanAsArrayDeserializer expected = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate", beanDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties", _propsInOrder);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        Annotations actual_delegate_classAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_delegate_classAnnotations);
        
        JavaType actual_delegate_beanType = actual_delegate._beanType;
        assertNull(actual_delegate_beanType);
        
        JsonFormat.Shape expected_delegate_serializationShape = expected_delegate._serializationShape;
        JsonFormat.Shape actual_delegate_serializationShape = actual_delegate._serializationShape;
        assertEquals(expected_delegate_serializationShape, actual_delegate_serializationShape);
        
        ValueInstantiator expected_delegate_valueInstantiator = expected_delegate._valueInstantiator;
        ValueInstantiator actual_delegate_valueInstantiator = actual_delegate._valueInstantiator;
        
        JsonDeserializer actual_delegate_delegateDeserializer = actual_delegate._delegateDeserializer;
        assertNull(actual_delegate_delegateDeserializer);
        
        PropertyBasedCreator expected_delegate_propertyBasedCreator = expected_delegate._propertyBasedCreator;
        PropertyBasedCreator actual_delegate_propertyBasedCreator = actual_delegate._propertyBasedCreator;
        ValueInstantiator actual_delegate_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_delegate_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_delegate_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_delegate_propertyBasedCreator_propertyLookup);
        
        int expected_delegate_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_delegate_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_delegate_propertyBasedCreator_propertyCount, actual_delegate_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegate_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_delegate_propertyBasedCreator_allProperties);
        
        boolean actual_delegate_nonStandardCreation = actual_delegate._nonStandardCreation;
        assertFalse(actual_delegate_nonStandardCreation);
        
        boolean actual_delegate_vanillaProcessing = actual_delegate._vanillaProcessing;
        assertFalse(actual_delegate_vanillaProcessing);
        
        BeanPropertyMap expected_delegate_beanProperties = expected_delegate._beanProperties;
        BeanPropertyMap actual_delegate_beanProperties = actual_delegate._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_delegate_beanProperties, actual_delegate_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegate_injectables = actual_delegate._injectables;
        assertNull(actual_delegate_injectables);
        
        SettableAnyProperty expected_delegate_anySetter = expected_delegate._anySetter;
        SettableAnyProperty actual_delegate_anySetter = actual_delegate._anySetter;
        BeanProperty actual_delegate_anySetter_property = actual_delegate_anySetter._property;
        assertNull(actual_delegate_anySetter_property);
        
        AnnotatedMethod actual_delegate_anySetter_setter = actual_delegate_anySetter._setter;
        assertNull(actual_delegate_anySetter_setter);
        
        JavaType actual_delegate_anySetter_type = actual_delegate_anySetter._type;
        assertNull(actual_delegate_anySetter_type);
        
        JsonDeserializer actual_delegate_anySetter_valueDeserializer = actual_delegate_anySetter._valueDeserializer;
        assertNull(actual_delegate_anySetter_valueDeserializer);
        
        TypeDeserializer actual_delegate_anySetter_valueTypeDeserializer = actual_delegate_anySetter._valueTypeDeserializer;
        assertNull(actual_delegate_anySetter_valueTypeDeserializer);
        
        HashSet actual_delegate_ignorableProps = actual_delegate._ignorableProps;
        assertNull(actual_delegate_ignorableProps);
        
        boolean actual_delegate_ignoreAllUnknown = actual_delegate._ignoreAllUnknown;
        assertFalse(actual_delegate_ignoreAllUnknown);
        
        boolean actual_delegate_needViewProcesing = actual_delegate._needViewProcesing;
        assertFalse(actual_delegate_needViewProcesing);
        
        Map actual_delegate_backRefs = actual_delegate._backRefs;
        assertNull(actual_delegate_backRefs);
        
        HashMap actual_delegate_subDeserializers = actual_delegate._subDeserializers;
        assertNull(actual_delegate_subDeserializers);
        
        UnwrappedPropertyHandler expected_delegate_unwrappedPropertyHandler = expected_delegate._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_delegate_unwrappedPropertyHandler = actual_delegate._unwrappedPropertyHandler;
        List actual_delegate_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_delegate_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_delegate_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_delegate_externalTypeIdHandler = actual_delegate._externalTypeIdHandler;
        assertNull(actual_delegate_externalTypeIdHandler);
        
        ObjectIdReader actual_delegate_objectIdReader = actual_delegate._objectIdReader;
        assertNull(actual_delegate_objectIdReader);
        
        Class actual_delegate_valueClass = ((Class) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegate_valueClass);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] expected_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        int expected_orderedPropertiesSize = expected_orderedProperties.length;
        assertEquals(expected_orderedPropertiesSize, actual_orderedProperties.length);
        assertTrue(deepEquals(expected_orderedProperties, actual_orderedProperties));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#asArrayDeserializer()}
 * @utbot.returnsFrom {@code return new BeanAsArrayDeserializer(this, props);}
 *  */
    @Test
    public void testAsArrayDeserializer_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        BuilderBasedDeserializer _delegateDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanDeserializer.asArrayDeserializer());
        
        BeanAsArrayDeserializer expected = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate", beanDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties", _propsInOrder);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        Annotations actual_delegate_classAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_delegate_classAnnotations);
        
        JavaType expected_delegate_beanType = expected_delegate._beanType;
        JavaType actual_delegate_beanType = actual_delegate._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_delegate_beanType, actual_delegate_beanType);
        
        JsonFormat.Shape expected_delegate_serializationShape = expected_delegate._serializationShape;
        JsonFormat.Shape actual_delegate_serializationShape = actual_delegate._serializationShape;
        assertEquals(expected_delegate_serializationShape, actual_delegate_serializationShape);
        
        ValueInstantiator actual_delegate_valueInstantiator = actual_delegate._valueInstantiator;
        assertNull(actual_delegate_valueInstantiator);
        
        JsonDeserializer expected_delegate_delegateDeserializer = expected_delegate._delegateDeserializer;
        JsonDeserializer actual_delegate_delegateDeserializer = actual_delegate._delegateDeserializer;
        AnnotatedMethod actual_delegate_delegateDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod"));
        assertNull(actual_delegate_delegateDeserializer_buildMethod);
        
        assertTrue(deepEquals(expected_delegate_delegateDeserializer, actual_delegate_delegateDeserializer));
        JavaType actual_delegate_delegateDeserializer_beanType = ((JavaType) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
        assertNull(actual_delegate_delegateDeserializer_beanType);
        
        JsonFormat.Shape actual_delegate_delegateDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
        assertNull(actual_delegate_delegateDeserializer_serializationShape);
        
        assertTrue(deepEquals(expected_delegate_delegateDeserializer, actual_delegate_delegateDeserializer));
        JsonDeserializer actual_delegate_delegateDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
        assertNull(actual_delegate_delegateDeserializer_delegateDeserializer);
        
        PropertyBasedCreator actual_delegate_delegateDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
        assertNull(actual_delegate_delegateDeserializer_propertyBasedCreator);
        
        boolean actual_delegate_delegateDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
        assertFalse(actual_delegate_delegateDeserializer_nonStandardCreation);
        
        boolean actual_delegate_delegateDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
        assertFalse(actual_delegate_delegateDeserializer_vanillaProcessing);
        
        BeanPropertyMap actual_delegate_delegateDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
        assertNull(actual_delegate_delegateDeserializer_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegate_delegateDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
        assertNull(actual_delegate_delegateDeserializer_injectables);
        
        SettableAnyProperty actual_delegate_delegateDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
        assertNull(actual_delegate_delegateDeserializer_anySetter);
        
        HashSet actual_delegate_delegateDeserializer_ignorableProps = ((HashSet) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
        assertNull(actual_delegate_delegateDeserializer_ignorableProps);
        
        boolean actual_delegate_delegateDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
        assertFalse(actual_delegate_delegateDeserializer_ignoreAllUnknown);
        
        boolean actual_delegate_delegateDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
        assertFalse(actual_delegate_delegateDeserializer_needViewProcesing);
        
        Map actual_delegate_delegateDeserializer_backRefs = ((Map) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
        assertNull(actual_delegate_delegateDeserializer_backRefs);
        
        HashMap actual_delegate_delegateDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
        assertNull(actual_delegate_delegateDeserializer_subDeserializers);
        
        UnwrappedPropertyHandler actual_delegate_delegateDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
        assertNull(actual_delegate_delegateDeserializer_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_delegate_delegateDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
        assertNull(actual_delegate_delegateDeserializer_externalTypeIdHandler);
        
        ObjectIdReader actual_delegate_delegateDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
        assertNull(actual_delegate_delegateDeserializer_objectIdReader);
        
        Class actual_delegate_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegate_delegateDeserializer_valueClass);
        
        PropertyBasedCreator expected_delegate_propertyBasedCreator = expected_delegate._propertyBasedCreator;
        PropertyBasedCreator actual_delegate_propertyBasedCreator = actual_delegate._propertyBasedCreator;
        ValueInstantiator actual_delegate_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_delegate_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_delegate_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_delegate_propertyBasedCreator_propertyLookup);
        
        int expected_delegate_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_delegate_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_delegate_propertyBasedCreator_propertyCount, actual_delegate_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegate_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_delegate_propertyBasedCreator_allProperties);
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        BeanPropertyMap expected_delegate_beanProperties = expected_delegate._beanProperties;
        BeanPropertyMap actual_delegate_beanProperties = actual_delegate._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_delegate_beanProperties, actual_delegate_beanProperties));
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        SettableAnyProperty expected_delegate_anySetter = expected_delegate._anySetter;
        SettableAnyProperty actual_delegate_anySetter = actual_delegate._anySetter;
        BeanProperty actual_delegate_anySetter_property = actual_delegate_anySetter._property;
        assertNull(actual_delegate_anySetter_property);
        
        AnnotatedMethod actual_delegate_anySetter_setter = actual_delegate_anySetter._setter;
        assertNull(actual_delegate_anySetter_setter);
        
        JavaType actual_delegate_anySetter_type = actual_delegate_anySetter._type;
        assertNull(actual_delegate_anySetter_type);
        
        JsonDeserializer actual_delegate_anySetter_valueDeserializer = actual_delegate_anySetter._valueDeserializer;
        assertNull(actual_delegate_anySetter_valueDeserializer);
        
        TypeDeserializer actual_delegate_anySetter_valueTypeDeserializer = actual_delegate_anySetter._valueTypeDeserializer;
        assertNull(actual_delegate_anySetter_valueTypeDeserializer);
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] expected_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        int expected_orderedPropertiesSize = expected_orderedProperties.length;
        assertEquals(expected_orderedPropertiesSize, actual_orderedProperties.length);
        assertTrue(deepEquals(expected_orderedProperties, actual_orderedProperties));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asArrayDeserializer()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#asArrayDeserializer()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#getPropertiesInInsertionOrder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty[] props = _beanProperties.getPropertiesInInsertionOrder();
 *  */
    @Test
    public void testAsArrayDeserializer_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer(BeanDeserializer.java:103) */
        beanDeserializer.asArrayDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return prop.deserialize(p, ctxt);}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ReturnPropDeserialize_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        AtomicReference actual = ((AtomicReference) beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, null, objectIdValueProperty));
        
        AtomicReference expected = new AtomicReference();
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return prop.deserialize(p, ctxt);}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ReturnPropDeserialize_2() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            JsonNodeDeserializer _valueDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            NullNode actual = ((NullNode) beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, null, objectIdValueProperty));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return prop.deserialize(p, ctxt);}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ReturnPropDeserialize() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        AtomicReference actual = ((AtomicReference) beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, null, objectIdValueProperty));
        
        AtomicReference expected = new AtomicReference();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, null, managedReferenceProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate1, null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, managedReferenceProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:463) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, objectIdValueProperty);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithErrorWrapping_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, impl, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -254);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, impl, managedReferenceProperty);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserSequence, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = beanDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler1_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBeanDeserializer_externalTypeIdHandler_typeIds0 = ((String) get(externalTypeHandler1_externalTypeIdHandler_typeIds, 0));
        ExternalTypeHandler externalTypeHandler2 = beanDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler2_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler2, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBeanDeserializer_externalTypeIdHandler_tokens0 = ((TokenBuffer) get(externalTypeHandler2_externalTypeIdHandler_tokens, 0));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_typeIds0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_tokens0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getActiveView()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.getActiveView()
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:725) */
        beanDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:726) */
        beanDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:726) */
        beanDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#start()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JsonToken t = p.getCurrentToken(); t == JsonToken.FIELD_NAME; t = p.nextToken())
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:728) */
        beanDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId__propertyBasedCreatorEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        LinkedHashMap actual = ((LinkedHashMap) beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeUsingPropertyBasedWithExternalTypeId(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:779)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:716) */
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:718) */
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithExternalTypeId_ThrowIllegalStateException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithExternalTypeId_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeWithExternalTypeId
    
    public void testDeserializeWithExternalTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        Object actual = beanDeserializer.deserializeWithView(filteringParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserSequence, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserSequence, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate3, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasTokenId(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasTokenId(JsonTokenId.ID_FIELD_NAME)
 *  */
    @Test
    public void testDeserializeWithView_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView(BeanDeserializer.java:479) */
        beanDeserializer.deserializeWithView(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testDeserializeWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:578) */
        beanDeserializer.deserializeWithUnwrapped(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testDeserializeWithUnwrapped_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:623)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:521) */
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueInstantiator.createUsingDelegate(ctxt, _delegateDeserializer.deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueInstantiator.createUsingDelegate(ctxt, _delegateDeserializer.deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped_ThrowIllegalStateException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.unwrappingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (getClass()): False}
    /// return from: {@code return new BeanDeserializer(this, unwrapper);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertTrue(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (getClass()): False}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_NotGetClass() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            
            Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
            Method unwrappingDeserializerMethod = beanDeserializerClazz.getDeclaredMethod("unwrappingDeserializer", nameTransformerClazz);
            unwrappingDeserializerMethod.setAccessible(true);
            java.lang.Object[] unwrappingDeserializerMethodArguments = new java.lang.Object[1];
            unwrappingDeserializerMethodArguments[0] = nop;
            BeanDeserializer actual = ((BeanDeserializer) unwrappingDeserializerMethod.invoke(beanDeserializer, unwrappingDeserializerMethodArguments));
            
            BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
            
            Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
            assertNull(actual_classAnnotations_annotations);
            
            JavaType expected_beanType = expected._beanType;
            JavaType actual_beanType = actual._beanType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_beanType, actual_beanType);
            
            JsonFormat.Shape actual_serializationShape = actual._serializationShape;
            assertNull(actual_serializationShape);
            
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            assertNull(actual_valueInstantiator);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
            assertNull(actual_propertyBasedCreator);
            
            boolean actual_nonStandardCreation = actual._nonStandardCreation;
            assertFalse(actual_nonStandardCreation);
            
            boolean actual_vanillaProcessing = actual._vanillaProcessing;
            assertFalse(actual_vanillaProcessing);
            
            BeanPropertyMap expected_beanProperties = expected._beanProperties;
            BeanPropertyMap actual_beanProperties = actual._beanProperties;
            // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
            assertNull(actual_injectables);
            
            SettableAnyProperty actual_anySetter = actual._anySetter;
            assertNull(actual_anySetter);
            
            HashSet actual_ignorableProps = actual._ignorableProps;
            assertNull(actual_ignorableProps);
            
            boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
            assertTrue(actual_ignoreAllUnknown);
            
            boolean actual_needViewProcesing = actual._needViewProcesing;
            assertFalse(actual_needViewProcesing);
            
            Map actual_backRefs = actual._backRefs;
            assertNull(actual_backRefs);
            
            HashMap actual_subDeserializers = actual._subDeserializers;
            assertNull(actual_subDeserializers);
            
            UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
            assertNull(actual_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
            assertNull(actual_externalTypeIdHandler);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueClass);
            
            Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
            
            assertNull(finalBeanDeserializer_backRefs);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1070040517229300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1070040517229300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1070040517234100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070040517229300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070040517234100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1070040517593000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1070040517593000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1070040517594600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070040517593000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070040517594600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1070040517966199 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1070040517966199.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1070040517967999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070040517966199.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070040517967999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

