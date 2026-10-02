package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.Collection;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer.FactoryBasedDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla;
import java.util.TreeMap;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_std_CollectionDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.getContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentType()
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _collectionType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_collectionTypeGetContentType_4() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ResolvedRecursiveType _collectionType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType actual = collectionDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _collectionType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_collectionTypeGetContentType() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        MapLikeType _collectionType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType actual = collectionDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _collectionType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_collectionTypeGetContentType_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        CollectionLikeType _collectionType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType actual = collectionDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _collectionType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_collectionTypeGetContentType_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ReferenceType _collectionType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType actual = collectionDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _collectionType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_collectionTypeGetContentType_3() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ArrayType _collectionType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType actual = collectionDeserializer.getContentType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentType()
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _collectionType.getContentType();
 *  */
    @Test
    public void testGetContentType_ThrowNullPointerException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.getContentType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.getContentType(CollectionDeserializer.java:218) */
        collectionDeserializer.getContentType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#isExpectedStartArrayToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !p.isExpectedStartArrayToken()
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:260) */
        collectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!p.isExpectedStartArrayToken()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (valueDes.getObjectIdReader() == null)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:269) */
        collectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) null), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!p.isExpectedStartArrayToken()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (valueDes.getObjectIdReader() == null)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:269) */
        collectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!p.isExpectedStartArrayToken()): False}
 * @utbot.executesCondition {@code ((valueDes.getObjectIdReader() == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#getObjectIdReader()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new CollectionReferringAccumulator(_collectionType.getContentType().getRawClass(), result)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:270) */
        collectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null), ((Collection) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return deserialize(p, ctxt, (Collection<Object>) _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserialize_ThrowClassCastException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.ClassCastException: class java.util.HashMap cannot be cast to class java.util.Collection (java.util.HashMap and java.util.Collection are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:251) */
        collectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return deserialize(p, ctxt, (Collection<Object>) _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserialize_ThrowClassCastException_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.ClassCastException: class java.util.LinkedHashMap cannot be cast to class java.util.Collection (java.util.LinkedHashMap and java.util.Collection are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:251) */
        collectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_STRING)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:245) */
        collectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserialize(p, ctxt, (Collection<Object>) _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_11() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:251) */
        collectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserialize(p, ctxt, (Collection<Object>) _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_21() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:251) */
        collectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        collectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserialize(p, ctxt, (Collection<Object>) _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        collectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserialize(p, ctxt, (Collection<Object>) _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        collectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray(CollectionDeserializer.java:327) */
        collectionDeserializer.handleNonArray(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): False}
 * @utbot.executesCondition {@code (!canWrap): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !canWrap
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_3() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray(CollectionDeserializer.java:329) */
        collectionDeserializer.handleNonArray(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!canWrap): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !canWrap
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Boolean _unwrapSingle = false;
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_unwrapSingle", _unwrapSingle);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray(CollectionDeserializer.java:329) */
        collectionDeserializer.handleNonArray(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!canWrap): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !canWrap
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        MapLikeType _collectionType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        Boolean _unwrapSingle = false;
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_unwrapSingle", _unwrapSingle);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray(CollectionDeserializer.java:329) */
        collectionDeserializer.handleNonArray(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): True}
 * @utbot.executesCondition {@code (!canWrap): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_4() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.handleNonArray(CollectionDeserializer.java:333) */
        collectionDeserializer.handleNonArray(null, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateUsingDelegate()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType delegateType = _valueInstantiator.getDelegateType(ctxt.getConfig());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:177) */
        collectionDeserializer.createContextual(((DeserializationContext) null), ((BeanProperty) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.findPropertyFormat(ConcreteBeanPropertyBase.java:75)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides(StdDeserializer.java:1024)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatFeature(StdDeserializer.java:1043)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:189) */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = collectionDeserializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        try {
            createContextualMethod.invoke(collectionDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual2() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:948)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:183) */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = collectionDeserializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        try {
            createContextualMethod.invoke(collectionDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual3() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        ResolvedRecursiveType _delegateType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:948)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:183) */
        collectionDeserializer.createContextual(((DeserializationContext) impl), ((BeanProperty) null));
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        ArrayType _delegateType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:948)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:183) */
        collectionDeserializer.createContextual(((DeserializationContext) impl), ((BeanProperty) null));
    }
    
    @Test
    public void testCreateContextual5() throws Throwable  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        JsonInclude.Value prevEMPTY = ((JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY1 = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        try {
            JsonInclude.Value empty = ((JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            JsonFormat.Features empty1 = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty1);
            CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
            JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
            setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:196) */
            Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = collectionDeserializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            try {
                createContextualMethod.invoke(collectionDeserializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(JsonInclude.Value.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY1);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)}
 * @utbot.returnsFrom {@code return withResolved(dd, vd, vtd, _unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_CollectionDeserializerWithResolved() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null);
        
        JavaType actual_collectionType = actual._collectionType;
        assertNull(actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)} twice
    /// return from: {@code return withResolved(dd, vd, vtd, _unwrapSingle);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.returnsFrom {@code return withResolved(dd, vd, vtd, _unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_ReturnWithResolved_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        JavaType actual_collectionType = actual._collectionType;
        assertNull(actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.returnsFrom {@code return withResolved(dd, vd, vtd, _unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_ReturnWithResolved_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        JavaType actual_collectionType = actual._collectionType;
        assertNull(actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.returnsFrom {@code return withResolved(dd, vd, vtd, _unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_ReturnWithResolved() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        MapLikeType _collectionType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType expected_collectionType = expected._collectionType;
        JavaType actual_collectionType = actual._collectionType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_collectionType, actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)}
 * @utbot.executesCondition {@code (dd == _delegateDeserializer): True}
 * @utbot.executesCondition {@code (vd == _valueDeserializer): True}
 * @utbot.executesCondition {@code (vtd == _valueTypeDeserializer): True}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithResolved__unwrapSingleEqualsUnwrapSingle() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null, null);
        
        JavaType actual_collectionType = actual._collectionType;
        assertNull(actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, java.lang.Boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new CollectionDeserializer(_collectionType, (JsonDeserializer<Object>) vd, vtd, _valueInstantiator, (JsonDeserializer<Object>) dd, unwrapSingle);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)}
 * @utbot.executesCondition {@code (dd == _delegateDeserializer): False}
 * @utbot.returnsFrom {@code return new CollectionDeserializer(_collectionType, (JsonDeserializer<Object>) vd, vtd, _valueInstantiator, (JsonDeserializer<Object>) dd, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_DdNotEquals_delegateDeserializer() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        JavaType actual_collectionType = actual._collectionType;
        assertNull(actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)}
 * @utbot.executesCondition {@code (dd == _delegateDeserializer): True}
 * @utbot.executesCondition {@code (vd == _valueDeserializer): True}
 * @utbot.executesCondition {@code (vtd == _valueTypeDeserializer): True}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): False}
 * @utbot.returnsFrom {@code return new CollectionDeserializer(_collectionType, (JsonDeserializer<Object>) vd, vtd, _valueInstantiator, (JsonDeserializer<Object>) dd, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved__unwrapSingleNotEqualsUnwrapSingle() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Boolean _unwrapSingle = false;
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_unwrapSingle", _unwrapSingle);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        JavaType actual_collectionType = actual._collectionType;
        assertNull(actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)}
 * @utbot.executesCondition {@code (dd == _delegateDeserializer): True}
 * @utbot.executesCondition {@code (vd == _valueDeserializer): False}
 * @utbot.returnsFrom {@code return new CollectionDeserializer(_collectionType, (JsonDeserializer<Object>) vd, vtd, _valueInstantiator, (JsonDeserializer<Object>) dd, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_VdNotEquals_valueDeserializer() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ReferenceType _collectionType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        EnumDeserializer.FactoryBasedDeserializer _valueDeserializer = ((EnumDeserializer.FactoryBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumDeserializer$FactoryBasedDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType expected_collectionType = expected._collectionType;
        JavaType actual_collectionType = actual._collectionType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_collectionType, actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,java.lang.Boolean)}
 * @utbot.executesCondition {@code (dd == _delegateDeserializer): True}
 * @utbot.executesCondition {@code (vd == _valueDeserializer): True}
 * @utbot.executesCondition {@code (vtd == _valueTypeDeserializer): False}
 * @utbot.returnsFrom {@code return new CollectionDeserializer(_collectionType, (JsonDeserializer<Object>) vd, vtd, _valueInstantiator, (JsonDeserializer<Object>) dd, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved_VtdNotEquals_valueTypeDeserializer() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        ReferenceType _collectionType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        CollectionDeserializer actual = collectionDeserializer.withResolved(null, null, null, null);
        
        CollectionDeserializer expected = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        
        JavaType expected_collectionType = expected._collectionType;
        JavaType actual_collectionType = actual._collectionType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_collectionType, actual_collectionType);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.isCachable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCachable()
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_valueTypeDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerNotEqualsNullAnd_valueTypeDeserializerNotEqualsNullAnd_delegateDeserializerNotEqualsNull() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        
        boolean actual = collectionDeserializer.isCachable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_valueTypeDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerNotEqualsNullAnd_valueTypeDeserializerNotEqualsNullAnd_delegateDeserializerNotEqualsNull_1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        boolean actual = collectionDeserializer.isCachable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_valueTypeDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerNotEqualsNullAnd_valueTypeDeserializerNotEqualsNullAnd_delegateDeserializerNotEqualsNull_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        UntypedObjectDeserializer.Vanilla _delegateDeserializer = ((UntypedObjectDeserializer.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        boolean actual = collectionDeserializer.isCachable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_valueTypeDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerEqualsNullAnd_valueTypeDeserializerEqualsNullAnd_delegateDeserializerEqualsNull() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        boolean actual = collectionDeserializer.isCachable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.getContentDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentDeserializer()
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#getContentDeserializer()}
 * @utbot.returnsFrom {@code return _valueDeserializer;}
 *  */
    @Test
    public void testGetContentDeserializer_Return_valueDeserializer() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        JsonDeserializer actual = collectionDeserializer.getContentDeserializer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        int[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.Integer ([I and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1887)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1611)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:83)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = collectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(collectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException_1() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asExternalTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = collectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asExternalTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asExternalTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(collectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException_2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        collectionDeserializer.deserializeWithType(filteringParserDelegate, null, asExternalTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException_3() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -129;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object right = createInstance("java.util.TreeMap$Entry");
        short[] key1 = {};
        setField(right, "java.util.TreeMap$Entry", "key", key1);
        setField(root, "java.util.TreeMap$Entry", "right", right);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asExternalTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = collectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asExternalTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asExternalTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(collectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.CollectionDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.TypeDeserializer#deserializeTypedFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromArray(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        collectionDeserializer.deserializeWithType(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test
    public void testDeserializeWithType1() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:151)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:50)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        collectionDeserializer.deserializeWithType(filteringParserDelegate, null, asArrayTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType2() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:247)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:60)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:51)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:158)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:50)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        collectionDeserializer.deserializeWithType(filteringParserDelegate, impl, asArrayTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType3() throws Exception  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "value", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:158)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:248)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:89)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:50)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        collectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asArrayTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType4() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Integer value = Integer.MIN_VALUE;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:158)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:248)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:89)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:50)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asArrayTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = collectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asArrayTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asArrayTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(collectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType5() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "";
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:158)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:248)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:89)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:50)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserializeWithType(CollectionDeserializer.java:312) */
        Class collectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asArrayTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = collectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asArrayTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asArrayTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(collectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Failed requirement.
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1079648971176800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1079648971176800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1079648971184199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079648971176800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079648971184199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1079648971826399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1079648971826399.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1079648971830400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079648971826399.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079648971830400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1079648972387200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1079648972387200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1079648972390400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079648972387200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079648972390400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

