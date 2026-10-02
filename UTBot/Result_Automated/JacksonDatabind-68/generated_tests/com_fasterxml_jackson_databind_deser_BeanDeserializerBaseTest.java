package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import java.io.CharConversionException;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.LinkedList;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import java.util.List;
import java.io.OptionalDataException;
import java.nio.charset.CharacterCodingException;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.TreeMap;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.net.MalformedURLException;
import java.io.InvalidObjectException;
import java.io.UnsupportedEncodingException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.util.concurrent.TimeoutException;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_deser_BeanDeserializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        boolean actual = beanDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[1] = ((Object) objectIdValueProperty);
        Object object = createInstance("java.lang.Object");
        _hashArea[5] = object;
        _hashArea[7] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        boolean actual = beanDeserializer.hasProperty(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        boolean actual = throwableDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "[";
        
        boolean actual = builderBasedDeserializer.hasProperty(string1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        _hashArea[6] = object;
        _hashArea[8] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        boolean actual = builderBasedDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        String string = "  ";
        _hashArea[2] = ((Object) string);
        Object object1 = createInstance("java.lang.Object");
        _hashArea[10] = object1;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        boolean actual = beanDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        beanDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowClassCastException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        Object object1 = createInstance("java.lang.Object");
        _hashArea[5] = object1;
        _hashArea[7] = object1;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        beanDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        throwableDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index -510 out of bounds for length 10]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        throwableDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", Integer.MIN_VALUE);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_spillCount", 1);
        java.lang.Object[] _hashArea = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        _hashArea[2] = object;
        _hashArea[6] = object;
        _hashArea[10] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483646 out of bounds for length 11]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:405)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        builderBasedDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        builderBasedDeserializer.hasProperty(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasProperty_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        builderBasedDeserializer.hasProperty(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    @Test
    public void testHasProperty1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 10);
        java.lang.Object[] _hashArea = new java.lang.Object[37];
        _hashArea[0] = ((Object) _beanProperties);
        _hashArea[1] = ((Object) _beanProperties);
        _hashArea[2] = ((Object) _beanProperties);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[4] = ((Object) _beanProperties);
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[6] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[8] = ((Object) _beanProperties);
        _hashArea[9] = ((Object) _beanProperties);
        _hashArea[10] = ((Object) _beanProperties);
        _hashArea[11] = ((Object) _beanProperties);
        _hashArea[12] = ((Object) _beanProperties);
        _hashArea[13] = ((Object) _beanProperties);
        _hashArea[14] = ((Object) _beanProperties);
        _hashArea[15] = ((Object) _beanProperties);
        _hashArea[16] = ((Object) _beanProperties);
        _hashArea[17] = ((Object) _beanProperties);
        _hashArea[18] = ((Object) _beanProperties);
        _hashArea[19] = ((Object) _beanProperties);
        Object object = createInstance("java.lang.Object");
        _hashArea[20] = object;
        _hashArea[21] = ((Object) _beanProperties);
        _hashArea[22] = ((Object) _beanProperties);
        _hashArea[23] = ((Object) _beanProperties);
        _hashArea[24] = ((Object) _beanProperties);
        _hashArea[25] = ((Object) _beanProperties);
        _hashArea[26] = ((Object) _beanProperties);
        _hashArea[27] = ((Object) _beanProperties);
        _hashArea[28] = ((Object) _beanProperties);
        _hashArea[29] = ((Object) _beanProperties);
        _hashArea[30] = ((Object) _beanProperties);
        _hashArea[31] = ((Object) _beanProperties);
        String string = "";
        _hashArea[32] = ((Object) string);
        _hashArea[33] = ((Object) _beanProperties);
        _hashArea[34] = ((Object) _beanProperties);
        _hashArea[35] = ((Object) _beanProperties);
        _hashArea[36] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "";
        
        boolean actual = builderBasedDeserializer.hasProperty(string1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasProperty2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = {null, null, null, null, null, null, null, null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        boolean actual = beanAsArrayDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasProperty(java.lang.String)
    
    @Test
    public void testHasProperty3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        String string = "";
        _hashArea[0] = ((Object) string);
        _hashArea[1] = ((Object) _beanProperties);
        _hashArea[2] = ((Object) _beanProperties);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[4] = ((Object) _beanProperties);
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[6] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[8] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap and com.fasterxml.jackson.databind.deser.SettableBeanProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        builderBasedDeserializer.hasProperty(string1);
    }
    
    @Test
    public void testHasProperty4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:897) */
        beanAsArrayDeserializer.hasProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueInstantiator.canCreateFromObjectWith()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromObjectWith()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: creatorProps = _valueInstantiator.getFromObjectArguments(ctxt.getConfig());
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve(BeanDeserializerBase.java:466) */
        builderBasedDeserializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromObjectWith()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _valueInstantiator.canCreateFromObjectWith()
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve(BeanDeserializerBase.java:465) */
        builderBasedDeserializer.resolve(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testResolve1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve(BeanDeserializerBase.java:493) */
        beanAsArrayDeserializer.resolve(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.executesCondition {@code (_beanProperties == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#iterator()}
 * @utbot.returnsFrom {@code return _beanProperties.iterator();}
 *  */
    @Test
    public void testProperties__beanPropertiesNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        Object actual = builderBasedDeserializer.properties();
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.executesCondition {@code (_beanProperties == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _beanProperties == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProperties_ThrowIllegalStateException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        throwableDeserializer.properties();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -1);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:316)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:941) */
        builderBasedDeserializer.properties();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:941) */
        builderBasedDeserializer.properties();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowClassCastException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[14];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[3] = ((Object) innerClassProperty);
        Object object = createInstance("java.lang.Object");
        _hashArea[5] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:941) */
        builderBasedDeserializer.properties();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:941) */
        builderBasedDeserializer.properties();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testWrapInstantiationProblem_ThrowNumberFormatException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        throwableDeserializer.wrapInstantiationProblem(numberFormatException, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapInstantiationProblem_ThrowError() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        builderBasedDeserializer.wrapInstantiationProblem(error, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.CharConversionException} when: t instanceof IOException
 *  */
    @Test(expected = CharConversionException.class)
    public void testWrapInstantiationProblem_ThrowCharConversionException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        CharConversionException charConversionException = ((CharConversionException) createInstance("java.io.CharConversionException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        builderBasedDeserializer.wrapInstantiationProblem(charConversionException, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.CharConversionException} when: t instanceof IOException
 *  */
    @Test(expected = CharConversionException.class)
    public void testWrapInstantiationProblem_ThrowCharConversionException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        CharConversionException charConversionException = ((CharConversionException) createInstance("java.io.CharConversionException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -192);
        
        builderBasedDeserializer.wrapInstantiationProblem(charConversionException, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.CharConversionException} when: t instanceof IOException
 *  */
    @Test(expected = CharConversionException.class)
    public void testWrapInstantiationProblem_ThrowCharConversionException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        CharConversionException charConversionException = ((CharConversionException) createInstance("java.io.CharConversionException"));
        
        builderBasedDeserializer.wrapInstantiationProblem(charConversionException, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleInstantiationProblem(_beanType.getRawClass(), null, t);
 *  */
    @Test
    public void testWrapInstantiationProblem_ThrowNullPointerException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657) */
        throwableDeserializer.wrapInstantiationProblem(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleInstantiationProblem(_beanType.getRawClass(), null, t);
 *  */
    @Test
    public void testWrapInstantiationProblem_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657) */
        builderBasedDeserializer.wrapInstantiationProblem(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleInstantiationProblem(_beanType.getRawClass(), null, t);
 *  */
    @Test
    public void testWrapInstantiationProblem_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657) */
        builderBasedDeserializer.wrapInstantiationProblem(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testWrapInstantiationProblem1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        builderBasedDeserializer.wrapInstantiationProblem(interruptedException, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testWrapInstantiationProblem2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657) */
        beanAsArrayBuilderDeserializer.wrapInstantiationProblem(invocationTargetException, null);
    }
    
    @Test
    public void testWrapInstantiationProblem3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657) */
        builderBasedDeserializer.wrapInstantiationProblem(null, impl);
    }
    ///endregion
    
    ///region Errors report for wrapInstantiationProblem
    
    public void testWrapInstantiationProblem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return _deserializeUsingPropertyBased(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNegativeArraySizeException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        throwableDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return _deserializeUsingPropertyBased(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNegativeArraySizeException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:337)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _beanType.isAbstract()
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1200) */
        throwableDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isAbstract()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleMissingInstantiator(java.lang.Class,com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(_beanType.getRawClass(), p, "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enable type information?)");
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1204) */
        throwableDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObjectUsingNonDefault_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectUsingNonDefault1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectUsingNonDefault2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        throwableDeserializer.deserializeFromObjectUsingNonDefault(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:390)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        throwableDeserializer.deserializeFromObjectUsingNonDefault(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 143);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:342)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 31);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:344)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault6() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 31);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:405)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[40];
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:473)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        beanDeserializer.deserializeFromObjectUsingNonDefault(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault8() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        throwableDeserializer.deserializeFromObjectUsingNonDefault(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault9() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 31);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:342)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserializeFromObjectUsingNonDefault10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1657)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:473)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        beanDeserializer.deserializeFromObjectUsingNonDefault(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromObjectUsingNonDefault11() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method deserializeFromObjectUsingNonDefaultMethod = beanDeserializerBaseClazz.getDeclaredMethod("deserializeFromObjectUsingNonDefault", parserType, implType);
        deserializeFromObjectUsingNonDefaultMethod.setAccessible(true);
        java.lang.Object[] deserializeFromObjectUsingNonDefaultMethodArguments = new java.lang.Object[2];
        deserializeFromObjectUsingNonDefaultMethodArguments[0] = parser;
        deserializeFromObjectUsingNonDefaultMethodArguments[1] = impl;
        try {
            deserializeFromObjectUsingNonDefaultMethod.invoke(throwableDeserializer, deserializeFromObjectUsingNonDefaultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withBeanProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testWithBeanProperties_StringBuilderToString() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        BeanDeserializer actual = ((BeanDeserializer) throwableDeserializer.withBeanProperties(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasViews()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasViews()}
 * @utbot.returnsFrom {@code return _needViewProcesing;}
 *  */
    @Test
    public void testHasViews_Return_needViewProcesing() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        boolean actual = builderBasedDeserializer.hasViews();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = ctxt.getAnnotationIntrospector();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:685) */
        builderBasedDeserializer.createContextual(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        ThrowableDeserializer actual = ((ThrowableDeserializer) throwableDeserializer.createContextual(impl, null));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType throwableDeserializer_beanType = throwableDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(throwableDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
        DeserializationConfig impl_config = ((DeserializationConfig) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config"));
        ConfigOverrides impl_config_config_configOverrides = ((ConfigOverrides) getFieldValue(impl_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(impl_config_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
        
        assertNull(finalImpl_config_configOverrides_overrides);
    }
    
    @Test
    public void testCreateContextual2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanAsArrayDeserializer.createContextual(impl, null));
        
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        assertNull(actual_delegate);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        assertNull(actual_orderedProperties);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType beanAsArrayDeserializer_beanType = beanAsArrayDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(beanAsArrayDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
    }
    
    @Test
    public void testCreateContextual3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        JsonFormat.Value initialSingleView_propertyFormat = ((JsonFormat.Value) getFieldValue(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        ThrowableDeserializer actual = ((ThrowableDeserializer) createContextualMethod.invoke(throwableDeserializer, createContextualMethodArguments));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType throwableDeserializer_beanType = throwableDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(throwableDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
        ObjectIdReader throwableDeserializer_objectIdReader = throwableDeserializer._objectIdReader;
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        JavaType actual_objectIdReader_idType = ((JavaType) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
        assertNull(actual_objectIdReader_idType);
        
        PropertyName actual_objectIdReaderPropertyName = actual_objectIdReader.propertyName;
        assertNull(actual_objectIdReaderPropertyName);
        
        ObjectIdGenerator actual_objectIdReaderGenerator = actual_objectIdReader.generator;
        assertNull(actual_objectIdReaderGenerator);
        
        ObjectIdResolver actual_objectIdReaderResolver = actual_objectIdReader.resolver;
        assertNull(actual_objectIdReaderResolver);
        
        JsonDeserializer actual_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
        assertNull(actual_objectIdReader_deserializer);
        
        SettableBeanProperty actual_objectIdReaderIdProperty = actual_objectIdReader.idProperty;
        assertNull(actual_objectIdReaderIdProperty);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        JsonFormat.Value finalSingleView_propertyFormat = ((JsonFormat.Value) getFieldValue(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        assertFalse(initialSingleView_propertyFormat == finalSingleView_propertyFormat);
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        BeanDeserializer actual = ((BeanDeserializer) createContextualMethod.invoke(beanDeserializer, createContextualMethodArguments));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType beanDeserializer_beanType = beanDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(beanDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
        DeserializationConfig impl_config = ((DeserializationConfig) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config"));
        ConfigOverrides impl_config_config_configOverrides = ((ConfigOverrides) getFieldValue(impl_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(impl_config_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
        
        assertNull(finalImpl_config_configOverrides_overrides);
    }
    
    @Test
    public void testCreateContextual5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        JavaType javaType = builderBasedDeserializer._beanType;
        Class initialBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) createContextualMethod.invoke(builderBasedDeserializer, createContextualMethodArguments));
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType builderBasedDeserializer_beanType = builderBasedDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(builderBasedDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
        ObjectIdReader builderBasedDeserializer_objectIdReader = builderBasedDeserializer._objectIdReader;
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        JavaType actual_objectIdReader_idType = ((JavaType) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
        assertNull(actual_objectIdReader_idType);
        
        PropertyName actual_objectIdReaderPropertyName = actual_objectIdReader.propertyName;
        assertNull(actual_objectIdReaderPropertyName);
        
        ObjectIdGenerator actual_objectIdReaderGenerator = actual_objectIdReader.generator;
        assertNull(actual_objectIdReaderGenerator);
        
        ObjectIdResolver actual_objectIdReaderResolver = actual_objectIdReader.resolver;
        assertNull(actual_objectIdReaderResolver);
        
        JsonDeserializer actual_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
        assertNull(actual_objectIdReader_deserializer);
        
        SettableBeanProperty actual_objectIdReaderIdProperty = actual_objectIdReader.idProperty;
        assertNull(actual_objectIdReaderIdProperty);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        JavaType javaType1 = builderBasedDeserializer._beanType;
        Class finalBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialBuilderBasedDeserializer_beanType_class == finalBuilderBasedDeserializer_beanType_class);
    }
    
    @Test
    public void testCreateContextual6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        ThrowableDeserializer actual = ((ThrowableDeserializer) createContextualMethod.invoke(throwableDeserializer, createContextualMethodArguments));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType throwableDeserializer_beanType = throwableDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(throwableDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
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
        
        Set actual_ignorableProps = actual._ignorableProps;
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
        
        ObjectIdReader throwableDeserializer_objectIdReader = throwableDeserializer._objectIdReader;
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        JavaType actual_objectIdReader_idType = ((JavaType) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
        assertNull(actual_objectIdReader_idType);
        
        PropertyName actual_objectIdReaderPropertyName = actual_objectIdReader.propertyName;
        assertNull(actual_objectIdReaderPropertyName);
        
        ObjectIdGenerator actual_objectIdReaderGenerator = actual_objectIdReader.generator;
        assertNull(actual_objectIdReaderGenerator);
        
        ObjectIdResolver actual_objectIdReaderResolver = actual_objectIdReader.resolver;
        assertNull(actual_objectIdReaderResolver);
        
        JsonDeserializer actual_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
        assertNull(actual_objectIdReader_deserializer);
        
        SettableBeanProperty actual_objectIdReaderIdProperty = actual_objectIdReader.idProperty;
        assertNull(actual_objectIdReaderIdProperty);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        DeserializationConfig impl_config = ((DeserializationConfig) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config"));
        ConfigOverrides impl_config_config_configOverrides = ((ConfigOverrides) getFieldValue(impl_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(impl_config_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
        
        assertNull(finalImpl_config_configOverrides_overrides);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual7() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:883)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:742) */
            beanAsArrayBuilderDeserializer.createContextual(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual8() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        Object _member = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:883)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:742) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, attributePropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = attributePropertyWriter;
        try {
            createContextualMethod.invoke(throwableDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual9() throws Throwable  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultPropertyFormat(MapperConfigBase.java:524)
            com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.findPropertyFormat(ConcreteBeanPropertyBase.java:76)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides(StdDeserializer.java:1040)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:742) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        try {
            createContextualMethod.invoke(builderBasedDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual10() throws Throwable  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(JsonFormat.java:700)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:749) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, attributePropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = attributePropertyWriter;
        try {
            createContextualMethod.invoke(builderBasedDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getValueType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueType()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getValueType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetValueType_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        JavaType actual = builderBasedDeserializer.getValueType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handledType()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return _beanType.getRawClass();}
 *  */
    @Test
    public void testHandledType_JavaTypeGetRawClass() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Class actual = builderBasedDeserializer.handledType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handledType()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanType.getRawClass();
 *  */
    @Test
    public void testHandledType_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:883) */
        builderBasedDeserializer.handledType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObjectIdReader()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getObjectIdReader()}
 * @utbot.returnsFrom {@code return _objectIdReader;}
 *  */
    @Test
    public void testGetObjectIdReader_Return_objectIdReader() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        ObjectIdReader actual = builderBasedDeserializer.getObjectIdReader();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getPropertyCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyCount()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getPropertyCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#size()}
 * @utbot.returnsFrom {@code return _beanProperties.size();}
 *  */
    @Test
    public void testGetPropertyCount_BeanPropertyMapSize() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -255);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        int actual = builderBasedDeserializer.getPropertyCount();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyCount()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getPropertyCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanProperties.size();
 *  */
    @Test
    public void testGetPropertyCount_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getPropertyCount] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getPropertyCount(BeanDeserializerBase.java:908) */
        builderBasedDeserializer.getPropertyCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.isCachable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCachable()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#isCachable()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsCachable_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        boolean actual = builderBasedDeserializer.isCachable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 *  */
    @Test
    public void testReplaceProperty() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[14];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object initialBuilderBasedDeserializer_beanProperties_hashArea1 = get(beanPropertyMap_beanProperties_hashArea, 1);
        
        builderBasedDeserializer.replaceProperty(null, objectIdValueProperty);
        
        BeanPropertyMap beanPropertyMap1 = builderBasedDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap1_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object finalBuilderBasedDeserializer_beanProperties_hashArea1 = get(beanPropertyMap1_beanProperties_hashArea, 1);
        
        assertFalse(initialBuilderBasedDeserializer_beanProperties_hashArea1 == finalBuilderBasedDeserializer_beanProperties_hashArea1);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 *  */
    @Test
    public void testReplaceProperty_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "\u0000";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        _propsInOrder[0] = ((SettableBeanProperty) setterlessProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object initialBeanDeserializer_beanProperties_hashArea1 = get(beanPropertyMap_beanProperties_hashArea, 1);
        
        beanDeserializer.replaceProperty(null, objectIdValueProperty);
        
        BeanPropertyMap beanPropertyMap1 = beanDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap1_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object finalBeanDeserializer_beanProperties_hashArea1 = get(beanPropertyMap1_beanProperties_hashArea, 1);
        
        assertFalse(initialBeanDeserializer_beanProperties_hashArea1 == finalBeanDeserializer_beanProperties_hashArea1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:563)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowClassCastException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        _hashArea[5] = ((Object) propertyName);
        _hashArea[7] = ((Object) propertyName);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", propertyName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:305)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        beanDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:305)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:569)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 128);
        java.lang.Object[] _hashArea = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "[";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 258 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:569)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        beanDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._hashCode(BeanPropertyMap.java:602)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:559)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findFromOrdered(BeanPropertyMap.java:588)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:308)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, managedReferenceProperty);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test
    public void testReplaceProperty1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        String string = "[";
        _hashArea[0] = ((Object) string);
        String string1 = "";
        _hashArea[1] = ((Object) string1);
        _hashArea[2] = ((Object) string1);
        _hashArea[3] = ((Object) string1);
        _hashArea[4] = ((Object) string1);
        _hashArea[5] = ((Object) string1);
        _hashArea[6] = ((Object) string1);
        _hashArea[7] = ((Object) string1);
        _hashArea[8] = ((Object) string1);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.String is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:305)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(objectIdValueProperty, innerClassProperty);
    }
    
    @Test
    public void testReplaceProperty2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000\u0000";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:563)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    @Test
    public void testReplaceProperty3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        String string = "";
        _hashArea[0] = ((Object) string);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _hashArea[1] = ((Object) innerClassProperty);
        _hashArea[2] = ((Object) innerClassProperty);
        _hashArea[3] = ((Object) innerClassProperty);
        _hashArea[4] = ((Object) innerClassProperty);
        _hashArea[5] = ((Object) innerClassProperty);
        _hashArea[6] = ((Object) innerClassProperty);
        _hashArea[7] = ((Object) innerClassProperty);
        _hashArea[8] = ((Object) innerClassProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findFromOrdered(BeanPropertyMap.java:583)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:308)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        beanDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    @Test
    public void testReplaceProperty4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[1] = ((Object) objectIdValueProperty);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _hashArea[2] = ((Object) innerClassProperty);
        _hashArea[3] = ((Object) innerClassProperty);
        _hashArea[4] = ((Object) innerClassProperty);
        _hashArea[5] = ((Object) innerClassProperty);
        _hashArea[6] = ((Object) innerClassProperty);
        _hashArea[7] = ((Object) innerClassProperty);
        _hashArea[8] = ((Object) innerClassProperty);
        _hashArea[9] = ((Object) innerClassProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        _propsInOrder[0] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[1] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[2] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[3] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[4] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[5] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[6] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[7] = ((SettableBeanProperty) innerClassProperty);
        _propsInOrder[8] = ((SettableBeanProperty) innerClassProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findFromOrdered(BeanPropertyMap.java:588)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:308)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1040) */
        builderBasedDeserializer.replaceProperty(null, innerClassProperty);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test(expected = NoSuchElementException.class)
    public void testReplaceProperty5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 11);
        java.lang.Object[] _hashArea = new java.lang.Object[39];
        Object object = createInstance("java.lang.Object");
        _hashArea[22] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        builderBasedDeserializer.replaceProperty(objectIdValueProperty, innerClassProperty);
    }
    
    @Test(expected = NoSuchElementException.class)
    public void testReplaceProperty6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = {null, null, null, null, null, null, null, null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdValueProperty objectIdValueProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "K";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdValueProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        beanAsArrayBuilderDeserializer.replaceProperty(objectIdValueProperty, objectIdValueProperty1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findBackReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findBackReference(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findBackReference(java.lang.String)}
 * @utbot.executesCondition {@code (_backRefs == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindBackReference__backRefsEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        SettableBeanProperty actual = beanDeserializer.findBackReference(null);
        
        assertNull(actual);
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findBackReference(java.lang.String)}
 * @utbot.executesCondition {@code (_backRefs == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return _backRefs.get(logicalName);}
 *  */
    @Test
    public void testFindBackReference__backRefsNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        String string = "";
        
        SettableBeanProperty actual = builderBasedDeserializer.findBackReference(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBeanClass()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getBeanClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetBeanClass_JavaTypeGetRawClass() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Class actual = builderBasedDeserializer.getBeanClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBeanClass()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getBeanClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetBeanClass_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass(BeanDeserializerBase.java:924) */
        builderBasedDeserializer.getBeanClass();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.creatorProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method creatorProperties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#creatorProperties()}
 * @utbot.executesCondition {@code (_propertyBasedCreator == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#properties()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return _propertyBasedCreator.properties().iterator();}
 *  */
    @Test
    public void testCreatorProperties__propertyBasedCreatorNotEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        String string = "";
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _propertyLookup.put(string, objectIdValueProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        Object actual = throwableDeserializer.creatorProperties();
        
        Object expected = createInstance("java.util.HashMap$ValueIterator");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findProperty(int)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): True}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(-255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findProperty(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code ((_beanProperties == null)): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(int)} once
    /// return from: {@code return prop;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[1] = ((Object) objectIdValueProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        SettableBeanProperty actual = beanDeserializer.findProperty(1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty_PropNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        objectIdValueProperty._propertyIndex = -255;
        _hashArea[1] = ((Object) objectIdValueProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) builderBasedDeserializer.findProperty(-255));
        
        ObjectIdReader actual_objectIdReader = ((ObjectIdReader) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_objectIdReader);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
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
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int objectIdValueProperty_propertyIndex = objectIdValueProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(objectIdValueProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findProperty(int)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _beanProperties.find(propertyIndex)
 *  */
    @Test
    public void testFindProperty_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:360)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:995) */
        builderBasedDeserializer.findProperty(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        SettableBeanProperty actual = throwableDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = " ";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[1] = ((Object) innerClassProperty);
        Object object = createInstance("java.lang.Object");
        _hashArea[5] = object;
        _hashArea[7] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        InnerClassProperty actual = ((InnerClassProperty) beanDeserializer.findProperty(propertyName));
        
        SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        assertNull(actual_delegate);
        
        Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_annotated);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
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
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:962) */
        builderBasedDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:962) */
        throwableDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowClassCastException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:962) */
        builderBasedDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "@";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:962) */
        beanDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:962) */
        builderBasedDeserializer.findProperty(((PropertyName) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#getSimpleName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindProperty_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        builderBasedDeserializer.findProperty(propertyName);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): True}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__beanPropertiesEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty_PropNotEqualsNull1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[1] = ((Object) objectIdValueProperty);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[5] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) builderBasedDeserializer.findProperty(string));
        
        ObjectIdReader actual_objectIdReader = ((ObjectIdReader) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_objectIdReader);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
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
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int objectIdValueProperty_propertyIndex = objectIdValueProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(objectIdValueProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty_PropNotEqualsNull_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        _hashArea[1] = ((Object) managedReferenceProperty);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[9] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "";
        
        ManagedReferenceProperty actual = ((ManagedReferenceProperty) beanDeserializer.findProperty(string1));
        
        String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
        assertNull(actual_referenceName);
        
        boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
        assertFalse(actual_isContainer);
        
        SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
        assertNull(actual_managedProperty);
        
        SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
        assertNull(actual_backProperty);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
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
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _beanProperties.find(propertyName)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindProperty_ThrowIllegalArgumentException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        builderBasedDeserializer.findProperty(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975) */
        builderBasedDeserializer.findProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowClassCastException2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        Object object1 = createInstance("java.lang.Object");
        _hashArea[5] = object1;
        _hashArea[7] = object1;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975) */
        throwableDeserializer.findProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975) */
        builderBasedDeserializer.findProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 514 out of bounds for length 10]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:975) */
        builderBasedDeserializer.findProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromString(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_valueInstantiator.canCreateFromString()
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1270) */
        throwableDeserializer.deserializeFromString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.executesCondition {@code (!_valueInstantiator.canCreateFromString()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _fromStringCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1279) */
        throwableDeserializer.deserializeFromString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1279) */
        throwableDeserializer.deserializeFromString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1279) */
        throwableDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1279) */
        beanDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:292)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1279) */
        beanDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownVanilla
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownVanilla() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownVanilla(treeTraversingParser, null, null, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownVanilla_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        beanDeserializer.handleUnknownVanilla(treeTraversingParser, null, null, null);
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        
        assertNull(finalBeanDeserializer_ignorableProps);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownVanilla_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownVanilla(treeTraversingParser, null, null, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getValueInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueInstantiator()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getValueInstantiator()}
 * @utbot.returnsFrom {@code return _valueInstantiator;}
 *  */
    @Test
    public void testGetValueInstantiator_Return_valueInstantiator() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        ValueInstantiator actual = builderBasedDeserializer.getValueInstantiator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromDouble(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromDouble(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getNumberType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NumberType t = p.getNumberType();
 *  */
    @Test
    public void testDeserializeFromDouble_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble(BeanDeserializerBase.java:1288) */
        builderBasedDeserializer.deserializeFromDouble(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleTypedObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_handleTypedObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#getDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> idDeser = _objectIdReader.getDeserializer();
 *  */
    @Test
    public void test_handleTypedObjectId_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1104) */
        builderBasedDeserializer._handleTypedObjectId(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_handleTypedObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#getDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: idDeser.handledType() == rawId.getClass()
 *  */
    @Test
    public void test_handleTypedObjectId_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1108) */
        throwableDeserializer._handleTypedObjectId(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        throwableDeserializer.handleIgnoredProperty(jsonParserSequence, impl, null, null);
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleIgnoredProperty(jsonParserSequence, impl, null, null);
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        builderBasedDeserializer.handleIgnoredProperty(jsonParserDelegate, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        builderBasedDeserializer.handleIgnoredProperty(jsonParserDelegate1, impl, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -1);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:316)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1493) */
        builderBasedDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1493) */
        builderBasedDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#skipChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.skipChildren();
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1495) */
        builderBasedDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1492) */
        builderBasedDeserializer.handleIgnoredProperty(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1493) */
        builderBasedDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.throwOrReturnThrowable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_NotTNotInstanceOfRuntimeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class throwableType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", throwableType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = ((Object) null);
        throwOrReturnThrowableMethodArguments[1] = impl;
        Throwable actual = ((Throwable) throwOrReturnThrowableMethod.invoke(beanDeserializer, throwOrReturnThrowableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof IOException): True}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonProcessingException)): False}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_TNotInstanceOfJsonProcessingException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        InvalidFormatException invalidFormatException = ((InvalidFormatException) createInstance("com.fasterxml.jackson.databind.exc.InvalidFormatException"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class invalidFormatExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", invalidFormatExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = invalidFormatException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        InvalidFormatException actual = ((InvalidFormatException) throwOrReturnThrowableMethod.invoke(beanDeserializer, throwOrReturnThrowableMethodArguments));
        
        Object actual_value = getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidFormatException", "_value");
        assertNull(actual_value);
        
        Class actual_targetType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidFormatException", "_targetType"));
        assertNull(actual_targetType);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int invalidFormatExceptionDepth = ((Integer) getFieldValue(invalidFormatException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(invalidFormatExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (t instanceof IOException): False},
    ///     {@code (!wrap): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_BooleanWrapInitializedByCtxtNotEqualsNullOrCtxtIsEnabled() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class throwableType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", throwableType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = ((Object) null);
        throwOrReturnThrowableMethodArguments[1] = impl;
        Throwable actual = ((Throwable) throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_BooleanWrapInitializedByCtxtEqualsNullOrCtxtIsEnabled() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class throwableType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", throwableType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = ((Object) null);
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        Throwable actual = ((Throwable) throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_TNotInstanceOfInvocationTargetExceptionAndTGetCauseEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class invocationTargetExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", invocationTargetExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = invocationTargetException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        InvocationTargetException actual = ((InvocationTargetException) throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments));
        
        Throwable actualTarget = ((Throwable) getFieldValue(actual, "java.lang.reflect.InvocationTargetException", "target"));
        assertNull(actualTarget);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int invocationTargetExceptionDepth = ((Integer) getFieldValue(invocationTargetException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(invocationTargetExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testThrowOrReturnThrowable_ThrowNumberFormatException() throws Throwable  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class numberFormatExceptionType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", numberFormatExceptionType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = numberFormatException;
        throwOrReturnThrowableMethodArguments[1] = impl;
        try {
            throwOrReturnThrowableMethod.invoke(builderBasedDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testThrowOrReturnThrowable_ThrowError() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class errorType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", errorType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = error;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        try {
            throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testThrowOrReturnThrowable_ThrowError_1() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        Error target = ((Error) createInstance("java.lang.Error"));
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class invocationTargetExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", invocationTargetExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = invocationTargetException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        try {
            throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException1) {
            throw invocationTargetException1.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.io.OptionalDataException} when: !wrap || !(t instanceof JsonProcessingException)
 *  */
    @Test(expected = OptionalDataException.class)
    public void testThrowOrReturnThrowable_ThrowOptionalDataException() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        OptionalDataException optionalDataException = ((OptionalDataException) createInstance("java.io.OptionalDataException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class optionalDataExceptionType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", optionalDataExceptionType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = optionalDataException;
        throwOrReturnThrowableMethodArguments[1] = impl;
        try {
            throwOrReturnThrowableMethod.invoke(beanDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonProcessingException)): True}
 * @utbot.throwsException {@link java.nio.charset.CharacterCodingException} when: !wrap || !(t instanceof JsonProcessingException)
 *  */
    @Test(expected = CharacterCodingException.class)
    public void testThrowOrReturnThrowable_ThrowCharacterCodingException() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        CharacterCodingException characterCodingException = ((CharacterCodingException) createInstance("java.nio.charset.CharacterCodingException"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class characterCodingExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", characterCodingExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = characterCodingException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        try {
            throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeFromObject(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithObjectId_ThrowIllegalStateException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        throwableDeserializer.deserializeWithObjectId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testDeserializeWithObjectId_ThrowNegativeArraySizeException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:383)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:65)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1168) */
        throwableDeserializer.deserializeWithObjectId(null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeWithObjectId
    
    public void testDeserializeWithObjectId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean value = (p.getCurrentToken() == JsonToken.VALUE_TRUE);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1328) */
        throwableDeserializer.deserializeFromBoolean(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromBoolean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_valueInstantiator.canCreateFromBoolean()
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonNodeDeserializer _delegateDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1319) */
        throwableDeserializer.deserializeFromBoolean(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.executesCondition {@code (!_valueInstantiator.canCreateFromBoolean()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromBoolean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean value = (p.getCurrentToken() == JsonToken.VALUE_TRUE);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _fromBooleanCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonNodeDeserializer _delegateDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1328) */
        builderBasedDeserializer.deserializeFromBoolean(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1329) */
        beanDeserializer.deserializeFromBoolean(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1329) */
        throwableDeserializer.deserializeFromBoolean(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1329) */
        throwableDeserializer.deserializeFromBoolean(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1329) */
        throwableDeserializer.deserializeFromBoolean(jsonParserSequence, null);
    }
    ///endregion
    
    ///region Errors report for deserializeFromBoolean
    
    public void testDeserializeFromBoolean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.nextToken();
 *  */
    @Test
    public void testDeserializeFromArray_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1361) */
        beanDeserializer.deserializeFromArray(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserializeFromArray_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1360) */
        beanDeserializer.deserializeFromArray(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.nextToken();
 *  */
    @Test
    public void testDeserializeFromArray_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:723)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1361) */
        builderBasedDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#canReadObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.canReadObjectId()
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1064) */
        throwableDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1089) */
        builderBasedDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (p.canReadObjectId()): False}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.executesCondition {@code (t.isScalarValue()): False}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1076) */
        beanDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (p.canReadObjectId()): False}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.executesCondition {@code (t.isScalarValue()): False}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): True}
 * @utbot.executesCondition {@code (_objectIdReader.maySerializeAsObject()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#maySerializeAsObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1089) */
        beanDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (p.canReadObjectId()): False}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.executesCondition {@code (t.isScalarValue()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeFromObjectId(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1089) */
        throwableDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (p.canReadObjectId()): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1089) */
        beanDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (p.canReadObjectId()): True}
 * @utbot.executesCondition {@code (id != null): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeObjectIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1089) */
        builderBasedDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getEmbeddedObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return p.getEmbeddedObject();
 *  */
    @Test
    public void testDeserializeFromEmbedded_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1393) */
        throwableDeserializer.deserializeFromEmbedded(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeFromObjectId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromEmbedded_ThrowIllegalStateException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        throwableDeserializer.deserializeFromEmbedded(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeFromEmbedded1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = beanDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = beanDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = beanDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate2 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(delegate2, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = beanDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(delegate4, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(delegate4, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromEmbedded7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromEmbedded8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        builderBasedDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromEmbedded9() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1388) */
        throwableDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromEmbedded10() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1388) */
        beanAsArrayDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownProperties(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperties(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unknownTokens.writeEndObject();
 *  */
    @Test
    public void testHandleUnknownProperties_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        builderBasedDeserializer.handleUnknownProperties(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleUnknownProperties(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void testHandleUnknownProperties1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        beanAsArrayDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        Object _typeId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        Object _objectId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _objectId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        builderBasedDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        Object _typeId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        beanDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
        Object _objectId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _objectId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        throwableDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1433) */
        builderBasedDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties6() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1433) */
        beanAsArrayDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        Object _typeId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        beanDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        beanDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties9() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1073741824);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:672)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1425) */
        beanAsArrayDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    
    @Test
    public void testHandleUnknownProperties10() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1433) */
        beanAsArrayDeserializer.handleUnknownProperties(null, object, tokenBuffer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignoreAllUnknown): False}
 * @utbot.executesCondition {@code (_ignorableProps != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty__ignorablePropsEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        byte[] byteArray = {};
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownProperty(jsonParserSequence, impl, byteArray, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignoreAllUnknown): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#skipChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.skipChildren();
 *  */
    @Test
    public void testHandleUnknownProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1471) */
        builderBasedDeserializer.handleUnknownProperty(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    @Test
    public void testHandleUnknownProperty1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        beanDeserializer.handleUnknownProperty(treeTraversingParser, impl, jsonToken, null);
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    @Test
    public void testHandleUnknownProperty2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        beanAsArrayDeserializer.handleUnknownProperty(readerBasedJsonParser, impl, object, null);
        
        Set finalBeanAsArrayDeserializer_ignorableProps = beanAsArrayDeserializer._ignorableProps;
        
        assertNull(finalBeanAsArrayDeserializer_ignorableProps);
    }
    
    @Test
    public void testHandleUnknownProperty3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        
        beanDeserializer.handleUnknownProperty(treeTraversingParser, impl, jsonToken, null);
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        
        assertNull(finalBeanDeserializer_ignorableProps);
    }
    
    @Test
    public void testHandleUnknownProperty4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        throwableDeserializer.handleUnknownProperty(treeTraversingParser, impl, object, string);
        
        Set finalThrowableDeserializer_ignorableProps = throwableDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalThrowableDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    @Test
    public void testHandleUnknownProperty5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        JsonParser jsonParserDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        beanAsArrayDeserializer.handleUnknownProperty(jsonParserDelegate, impl, jsonToken, null);
        
        Set finalBeanAsArrayDeserializer_ignorableProps = beanAsArrayDeserializer._ignorableProps;
        
        JsonParser jsonParserDelegateDelegate1 = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBeanAsArrayDeserializer_ignorableProps);
        
        assertFalse(initialJsonParserDelegateDelegate_currToken == finalJsonParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testHandleUnknownProperty6() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        beanAsArrayDeserializer.handleUnknownProperty(jsonParserSequence, null, object, null);
    }
    
    @Test
    public void testHandleUnknownProperty7() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty(DeserializationContext.java:833)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479) */
        beanAsArrayDeserializer.handleUnknownProperty(readerBasedJsonParser, impl, object, string);
    }
    
    @Test
    public void testHandleUnknownProperty8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        LinkedHashSet _ignorableProps = new LinkedHashSet();
        _ignorableProps.add(null);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479) */
        builderBasedDeserializer.handleUnknownProperty(treeTraversingParser, null, object, string);
    }
    
    @Test
    public void testHandleUnknownProperty9() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        LinkedHashSet _ignorableProps = new LinkedHashSet();
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty(DeserializationContext.java:829)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479) */
        throwableDeserializer.handleUnknownProperty(null, impl, object, string);
    }
    
    @Test
    public void testHandleUnknownProperty10() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        LinkedHashSet _ignorableProps = new LinkedHashSet();
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479) */
        builderBasedDeserializer.handleUnknownProperty(filteringParserDelegate, null, null, string);
    }
    
    @Test
    public void testHandleUnknownProperty11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:222)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:222)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:222)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty(DeserializationContext.java:829)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1479) */
        beanDeserializer.handleUnknownProperty(jsonParserDelegate, impl, object, string);
    }
    
    @Test
    public void testHandleUnknownProperty12() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        LinkedHashSet _ignorableProps = new LinkedHashSet();
        _ignorableProps.add(null);
        String string = "";
        _ignorableProps.add(string);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1492)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1475) */
        beanAsArrayDeserializer.handleUnknownProperty(uTF8DataInputJsonParser, null, object, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code ((_subDeserializers == null)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_findSubclassDeserializer_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        HashMap _subDeserializers = new HashMap();
        beanDeserializer._subDeserializers = _subDeserializers;
        
        beanDeserializer._findSubclassDeserializer(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = ctxt.constructType(bean.getClass());
 *  */
    @Test
    public void test_findSubclassDeserializer_ThrowNullPointerException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1559) */
        throwableDeserializer._findSubclassDeserializer(null, byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = ctxt.constructType(bean.getClass());
 *  */
    @Test
    public void test_findSubclassDeserializer_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1559) */
        throwableDeserializer._findSubclassDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void test_findSubclassDeserializer1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        HashMap _subDeserializers = new HashMap();
        beanAsArrayDeserializer._subDeserializers = _subDeserializers;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1559) */
        beanAsArrayDeserializer._findSubclassDeserializer(null, object, null);
    }
    
    @Test
    public void test_findSubclassDeserializer2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:476)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1566) */
        beanAsArrayBuilderDeserializer._findSubclassDeserializer(impl, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#readObjectReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object id = _objectIdReader.readObjectReference(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObjectId_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177) */
        builderBasedDeserializer.deserializeFromObjectId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _objectIdReader.readObjectReference(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObjectId_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        builderBasedDeserializer.deserializeFromObjectId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _objectIdReader.readObjectReference(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObjectId_ThrowIllegalStateException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer1 = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        throwableDeserializer.deserializeFromObjectId(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanAsArrayDeserializer.deserializeFromObjectId(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        builderBasedDeserializer.deserializeFromObjectId(readerBasedJsonParser, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId3() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanAsArrayDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        builderBasedDeserializer.deserializeFromObjectId(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserializeFromObjectId5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177) */
        beanDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObjectId6() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177) */
        beanAsArrayDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObjectId7() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177) */
        builderBasedDeserializer.deserializeFromObjectId(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectId8() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177) */
        throwableDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObjectId9() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177) */
        builderBasedDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromNumber(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeFromObjectId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromNumber_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        builderBasedDeserializer.deserializeFromNumber(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromNumber(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getNumberType())
 *  */
    @Test
    public void testDeserializeFromNumber_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1220) */
        throwableDeserializer.deserializeFromNumber(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromNumber1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        builderBasedDeserializer.deserializeFromNumber(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromNumber2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        builderBasedDeserializer.deserializeFromNumber(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromNumber3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        _delegateDeserializer._vanillaProcessing = true;
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:140)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1218) */
        builderBasedDeserializer.deserializeFromNumber(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1218) */
        builderBasedDeserializer.deserializeFromNumber(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1218) */
        beanDeserializer.deserializeFromNumber(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1218) */
        beanDeserializer.deserializeFromNumber(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber7() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1218) */
        throwableDeserializer.deserializeFromNumber(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromNumber8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1177)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1218) */
        builderBasedDeserializer.deserializeFromNumber(jsonParserSequence, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic
    
    ///region OTHER: ERROR SUITE for method handlePolymorphic(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void testHandlePolymorphic1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        HashMap _subDeserializers = new HashMap();
        beanDeserializer._subDeserializers = _subDeserializers;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1559)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic(BeanDeserializerBase.java:1515) */
        beanDeserializer.handlePolymorphic(null, null, object, null);
    }
    
    @Test
    public void testHandlePolymorphic2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:476)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1566)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic(BeanDeserializerBase.java:1515) */
        builderBasedDeserializer.handlePolymorphic(null, impl, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testInjectValues() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        
        builderBasedDeserializer.injectValues(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: injector.inject(ctxt, bean);
 *  */
    @Test
    public void testInjectValues_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1410) */
        builderBasedDeserializer.injectValues(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ValueInjector injector: _injectables)
 *  */
    @Test
    public void testInjectValues_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1409) */
        beanDeserializer.injectValues(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injector.inject(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInjectValues_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        byte[] _valueId = {};
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        builderBasedDeserializer.injectValues(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injector.inject(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInjectValues_ThrowIllegalArgumentException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        builderBasedDeserializer.injectValues(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: injector.inject(ctxt, bean);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInjectValues_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        builderBasedDeserializer.injectValues(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testInjectValues1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        _injectables[1] = valueInjector;
        _injectables[2] = valueInjector;
        _injectables[3] = valueInjector;
        _injectables[4] = valueInjector;
        _injectables[5] = valueInjector;
        _injectables[6] = valueInjector;
        _injectables[7] = valueInjector;
        _injectables[8] = valueInjector;
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.BeanProperty$Std.getName(BeanProperty.java:294)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:75)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:381)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.findValue(ValueInjector.java:46)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1410) */
        beanAsArrayDeserializer.injectValues(impl, object);
    }
    
    @Test
    public void testInjectValues2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_member", _member);
        _injectables[0] = valueInjector;
        ValueInjector valueInjector1 = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[1] = valueInjector1;
        _injectables[2] = valueInjector1;
        _injectables[3] = valueInjector1;
        _injectables[4] = valueInjector1;
        _injectables[5] = valueInjector1;
        _injectables[6] = valueInjector1;
        _injectables[7] = valueInjector1;
        _injectables[8] = valueInjector1;
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        String string = "";
        Object object = createInstance("java.lang.Object");
        _values.put(string, object);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.setValue(AnnotatedMethod.java:180)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1410) */
        throwableDeserializer.injectValues(impl, object1);
    }
    
    @Test
    public void testInjectValues3() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(_valueId, object);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1410) */
        beanAsArrayBuilderDeserializer.injectValues(impl, object1);
    }
    
    @Test
    public void testInjectValues4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        String string = "";
        Object object = createInstance("java.lang.Object");
        _values.put(string, object);
        String string1 = "";
        _values.put(string1, null);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1410) */
        beanAsArrayDeserializer.injectValues(impl, string1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInjectValues5() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        VirtualAnnotatedMember _member = ((VirtualAnnotatedMember) createInstance("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_member", _member);
        _injectables[0] = valueInjector;
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(null, object);
        String string = "";
        _values.put(string, _injectables);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object1 = new Object();
        
        beanAsArrayBuilderDeserializer.injectValues(impl, object1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInjectValues6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        VirtualAnnotatedMember _member = ((VirtualAnnotatedMember) createInstance("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_member", _member);
        _injectables[0] = valueInjector;
        ValueInjector valueInjector1 = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[1] = valueInjector1;
        _injectables[2] = valueInjector1;
        _injectables[3] = valueInjector1;
        _injectables[4] = valueInjector1;
        _injectables[5] = valueInjector1;
        _injectables[6] = valueInjector1;
        _injectables[7] = valueInjector1;
        _injectables[8] = valueInjector1;
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(null, object);
        String string = "";
        _values.put(string, null);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object1 = new Object();
        
        throwableDeserializer.injectValues(impl, object1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.throwsException {@link java.lang.Error} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, fieldName);
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        throwableDeserializer.wrapAndThrow(((Throwable) error), ((Object) null), ((String) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.net.MalformedURLException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, fieldName);
 *  */
    @Test(expected = MalformedURLException.class)
    public void testWrapAndThrow_ThrowMalformedURLException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MalformedURLException malformedURLException = ((MalformedURLException) createInstance("java.net.MalformedURLException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) malformedURLException), ((Object) null), ((String) null), ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.net.MalformedURLException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, fieldName);
 *  */
    @Test(expected = MalformedURLException.class)
    public void testWrapAndThrow_ThrowMalformedURLException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MalformedURLException malformedURLException = ((MalformedURLException) createInstance("java.net.MalformedURLException"));
        
        beanDeserializer.wrapAndThrow(((Throwable) malformedURLException), ((Object) null), ((String) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = InvalidObjectException.class)
    public void testWrapAndThrow1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        InvalidObjectException invalidObjectException = ((InvalidObjectException) createInstance("java.io.InvalidObjectException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        throwableDeserializer.wrapAndThrow(((Throwable) invalidObjectException), ((Object) null), ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = UnresolvedForwardReference.class)
    public void testWrapAndThrow2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        String string = "";
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, string, ((DeserializationContext) null));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        Object object = new Object();
        String string = "";
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) interruptedException), object, string, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = RuntimeException.class)
    public void testWrapAndThrow4() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        RuntimeException runtimeException = ((RuntimeException) createInstance("java.lang.RuntimeException"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) runtimeException), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow6() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, ((String) null), ((DeserializationContext) null));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow7() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        throwableDeserializer.wrapAndThrow(((Throwable) null), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow8() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) null), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow9() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        Object object = new Object();
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) interruptedException), object, ((String) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.throwsException {@link java.lang.Error} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, index);
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) error), ((Object) null), 1, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.UnsupportedEncodingException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, index);
 *  */
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapAndThrow_ThrowUnsupportedEncodingException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) unsupportedEncodingException), ((Object) null), -240, ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.CharConversionException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, index);
 *  */
    @Test(expected = CharConversionException.class)
    public void testWrapAndThrow_ThrowCharConversionException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CharConversionException charConversionException = ((CharConversionException) createInstance("java.io.CharConversionException"));
        
        beanDeserializer.wrapAndThrow(((Throwable) charConversionException), ((Object) null), -128, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = UnresolvedForwardReference.class)
    public void testWrapAndThrow10() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, 0, ((DeserializationContext) impl));
    }
    
    @Test(expected = UnrecognizedPropertyException.class)
    public void testWrapAndThrow11() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) unrecognizedPropertyException), object, 0, ((DeserializationContext) null));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow12() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        TimeoutException timeoutException = ((TimeoutException) createInstance("java.util.concurrent.TimeoutException"));
        String detailMessage = "";
        setField(timeoutException, "java.lang.Throwable", "detailMessage", detailMessage);
        Object object = new Object();
        
        beanAsArrayDeserializer.wrapAndThrow(((Throwable) timeoutException), object, 0, ((DeserializationContext) null));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow13() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TimeoutException timeoutException = ((TimeoutException) createInstance("java.util.concurrent.TimeoutException"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) timeoutException), object, 0, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = InvalidPathException.class)
    public void testWrapAndThrow14() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        InvalidPathException invalidPathException = ((InvalidPathException) createInstance("java.nio.file.InvalidPathException"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) invalidPathException), object, 0, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testWrapAndThrow15() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:375)
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:360)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow(BeanDeserializerBase.java:1607) */
        builderBasedDeserializer.wrapAndThrow(((Throwable) null), object, 0, ((DeserializationContext) impl));
    }
    
    @Test
    public void testWrapAndThrow16() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:375)
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:360)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow(BeanDeserializerBase.java:1607) */
        builderBasedDeserializer.wrapAndThrow(((Throwable) null), object, 0, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region Errors report for wrapAndThrow
    
    public void testWrapAndThrow_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveUnwrappedProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, objectIdValueProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = throwableDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        SettableBeanProperty actual = throwableDeserializer._resolveUnwrappedProperty(null, innerClassProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = throwableDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty5 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMember am = prop.getMember();
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveUnwrappedProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveUnwrappedProperty(BeanDeserializerBase.java:822) */
        builderBasedDeserializer._resolveUnwrappedProperty(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test
    public void test_resolveUnwrappedProperty1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = beanAsArrayBuilderDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    
    @Test
    public void test_resolveUnwrappedProperty2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty2 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        SettableBeanProperty actual = beanAsArrayDeserializer._resolveUnwrappedProperty(null, innerClassProperty);
        
        assertNull(actual);
    }
    
    @Test
    public void test_resolveUnwrappedProperty3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty6 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        SettableBeanProperty actual = throwableDeserializer._resolveUnwrappedProperty(null, innerClassProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test(expected = StackOverflowError.class)
    public void test_resolveUnwrappedProperty4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", managedReferenceProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        beanAsArrayDeserializer._resolveUnwrappedProperty(null, innerClassProperty);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_resolveUnwrappedProperty5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _delegate);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        beanAsArrayDeserializer._resolveUnwrappedProperty(null, innerClassProperty);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_resolveUnwrappedProperty6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty7 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _delegate);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        throwableDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKnownPropertyNames()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#iterator()}
 * @utbot.returnsFrom {@code return names;}
 *  */
    @Test
    public void testGetKnownPropertyNames_BeanPropertyMapIterator() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ArrayList actual = ((ArrayList) throwableDeserializer.getKnownPropertyNames());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKnownPropertyNames()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowIllegalArgumentException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:316)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914) */
        beanDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914) */
        builderBasedDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914) */
        builderBasedDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:914) */
        beanDeserializer.getKnownPropertyNames();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getKnownPropertyNames()
    
    @Test
    public void testGetKnownPropertyNames1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null, null, null, null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ArrayList actual = ((ArrayList) beanAsArrayDeserializer.getKnownPropertyNames());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetKnownPropertyNames2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        _hashArea[0] = ((Object) _beanProperties);
        _hashArea[2] = ((Object) _beanProperties);
        _hashArea[4] = ((Object) _beanProperties);
        _hashArea[6] = ((Object) _beanProperties);
        _hashArea[8] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ArrayList actual = ((ArrayList) beanAsArrayDeserializer.getKnownPropertyNames());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getKnownPropertyNames()
    
    @Test
    public void testGetKnownPropertyNames3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        _hashArea[2] = object;
        _hashArea[4] = object;
        _hashArea[6] = object;
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[7] = ((Object) objectIdValueProperty);
        _hashArea[8] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:915) */
        builderBasedDeserializer.getKnownPropertyNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderEqualsNull() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            InnerClassProperty actual = ((InnerClassProperty) builderBasedDeserializer._resolvedObjectIdProperty(null, innerClassProperty));
            
            SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
            assertNull(actual_delegate);
            
            Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
            assertNull(actual_annotated);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer innerClassProperty_valueDeserializer = innerClassProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertNull(actual_valueDeserializer_message);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderEqualsNull_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            InnerClassProperty actual = ((InnerClassProperty) throwableDeserializer._resolvedObjectIdProperty(null, innerClassProperty));
            
            SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
            assertNull(actual_delegate);
            
            Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
            assertNull(actual_annotated);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer innerClassProperty_valueDeserializer = innerClassProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            JavaType actual_valueDeserializer_baseType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
            assertNull(actual_valueDeserializer_baseType);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Map actual_valueDeserializer_backRefProperties = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
            assertNull(actual_valueDeserializer_backRefProperties);
            
            boolean actual_valueDeserializer_acceptString = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
            assertFalse(actual_valueDeserializer_acceptString);
            
            boolean actual_valueDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
            assertFalse(actual_valueDeserializer_acceptBoolean);
            
            boolean actual_valueDeserializer_acceptInt = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
            assertFalse(actual_valueDeserializer_acceptInt);
            
            boolean actual_valueDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
            assertFalse(actual_valueDeserializer_acceptDouble);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderEqualsNull_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            InnerClassProperty actual = ((InnerClassProperty) beanDeserializer._resolvedObjectIdProperty(null, innerClassProperty));
            
            SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
            assertNull(actual_delegate);
            
            Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
            assertNull(actual_annotated);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer innerClassProperty_valueDeserializer = innerClassProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            BeanDeserializerBase actual_valueDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
            assertNull(actual_valueDeserializer_delegate);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
            assertNull(actual_valueDeserializer_orderedProperties);
            
            AnnotatedMethod actual_valueDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
            assertNull(actual_valueDeserializer_buildMethod);
            
            Annotations actual_valueDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_valueDeserializer_classAnnotations);
            
            JavaType actual_valueDeserializer_beanType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
            assertNull(actual_valueDeserializer_beanType);
            
            JsonFormat.Shape actual_valueDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
            assertNull(actual_valueDeserializer_serializationShape);
            
            ValueInstantiator actual_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            assertNull(actual_valueDeserializer_valueInstantiator);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            JsonDeserializer actual_valueDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
            assertNull(actual_valueDeserializer_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_valueDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
            assertNull(actual_valueDeserializer_propertyBasedCreator);
            
            boolean actual_valueDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
            assertFalse(actual_valueDeserializer_nonStandardCreation);
            
            boolean actual_valueDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
            assertFalse(actual_valueDeserializer_vanillaProcessing);
            
            BeanPropertyMap actual_valueDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
            assertNull(actual_valueDeserializer_beanProperties);
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_valueDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
            assertNull(actual_valueDeserializer_injectables);
            
            SettableAnyProperty actual_valueDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
            assertNull(actual_valueDeserializer_anySetter);
            
            Set actual_valueDeserializer_ignorableProps = ((Set) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
            assertNull(actual_valueDeserializer_ignorableProps);
            
            boolean actual_valueDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
            assertFalse(actual_valueDeserializer_ignoreAllUnknown);
            
            boolean actual_valueDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
            assertFalse(actual_valueDeserializer_needViewProcesing);
            
            Map actual_valueDeserializer_backRefs = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
            assertNull(actual_valueDeserializer_backRefs);
            
            HashMap actual_valueDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
            assertNull(actual_valueDeserializer_subDeserializers);
            
            UnwrappedPropertyHandler actual_valueDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
            assertNull(actual_valueDeserializer_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_valueDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
            assertNull(actual_valueDeserializer_externalTypeIdHandler);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(prop, objectIdInfo);}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_Return() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
            objectIdValueProperty._objectIdInfo = _objectIdInfo;
            objectIdValueProperty._propertyIndex = -255;
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) beanDeserializer._resolvedObjectIdProperty(null, objectIdValueProperty));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", objectIdValueProperty);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            expected._objectIdInfo = _objectIdInfo;
            expected._propertyIndex = -255;
            
            SettableBeanProperty expected_forward = ((SettableBeanProperty) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            ObjectIdReader actual_forward_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
            assertNull(actual_forward_objectIdReader);
            
            PropertyName actual_forward_propName = actual_forward._propName;
            assertNull(actual_forward_propName);
            
            JavaType actual_forward_type = actual_forward._type;
            assertNull(actual_forward_type);
            
            PropertyName actual_forward_wrapperName = actual_forward._wrapperName;
            assertNull(actual_forward_wrapperName);
            
            Annotations actual_forward_contextAnnotations = actual_forward._contextAnnotations;
            assertNull(actual_forward_contextAnnotations);
            
            JsonDeserializer expected_forward_valueDeserializer = expected_forward._valueDeserializer;
            JsonDeserializer actual_forward_valueDeserializer = actual_forward._valueDeserializer;
            JavaType actual_forward_valueDeserializer_baseType = ((JavaType) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
            assertNull(actual_forward_valueDeserializer_baseType);
            
            ObjectIdReader actual_forward_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            assertNull(actual_forward_valueDeserializer_objectIdReader);
            
            Map actual_forward_valueDeserializer_backRefProperties = ((Map) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
            assertNull(actual_forward_valueDeserializer_backRefProperties);
            
            boolean actual_forward_valueDeserializer_acceptString = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
            assertFalse(actual_forward_valueDeserializer_acceptString);
            
            boolean actual_forward_valueDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
            assertFalse(actual_forward_valueDeserializer_acceptBoolean);
            
            boolean actual_forward_valueDeserializer_acceptInt = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
            assertFalse(actual_forward_valueDeserializer_acceptInt);
            
            boolean actual_forward_valueDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
            assertFalse(actual_forward_valueDeserializer_acceptDouble);
            
            TypeDeserializer actual_forward_valueTypeDeserializer = actual_forward._valueTypeDeserializer;
            assertNull(actual_forward_valueTypeDeserializer);
            
            String actual_forward_managedReferenceName = actual_forward._managedReferenceName;
            assertNull(actual_forward_managedReferenceName);
            
            ObjectIdInfo expected_forward_objectIdInfo = expected_forward._objectIdInfo;
            ObjectIdInfo actual_forward_objectIdInfo = actual_forward._objectIdInfo;
            PropertyName actual_forward_objectIdInfo_propertyName = ((PropertyName) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_propertyName"));
            assertNull(actual_forward_objectIdInfo_propertyName);
            
            Class actual_forward_objectIdInfo_generator = ((Class) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator"));
            assertNull(actual_forward_objectIdInfo_generator);
            
            Class actual_forward_objectIdInfo_resolver = ((Class) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver"));
            assertNull(actual_forward_objectIdInfo_resolver);
            
            Class actual_forward_objectIdInfo_scope = ((Class) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_scope"));
            assertNull(actual_forward_objectIdInfo_scope);
            
            boolean actual_forward_objectIdInfo_alwaysAsId = ((Boolean) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_alwaysAsId"));
            assertFalse(actual_forward_objectIdInfo_alwaysAsId);
            
            ViewMatcher actual_forward_viewMatcher = actual_forward._viewMatcher;
            assertNull(actual_forward_viewMatcher);
            
            int expected_forward_propertyIndex = expected_forward._propertyIndex;
            int actual_forward_propertyIndex = actual_forward._propertyIndex;
            assertEquals(expected_forward_propertyIndex, actual_forward_propertyIndex);
            
            PropertyMetadata actual_forward_metadata = ((PropertyMetadata) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_forward_metadata);
            
            JsonFormat.Value actual_forward_propertyFormat = ((JsonFormat.Value) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_forward_propertyFormat);
            
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
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): False}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(prop, objectIdInfo);}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderNotEqualsNull() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) builderBasedDeserializer._resolvedObjectIdProperty(null, objectIdValueProperty));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", objectIdValueProperty);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            SettableBeanProperty expected_forward = ((SettableBeanProperty) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            ObjectIdReader actual_forward_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
            assertNull(actual_forward_objectIdReader);
            
            PropertyName actual_forward_propName = actual_forward._propName;
            assertNull(actual_forward_propName);
            
            JavaType actual_forward_type = actual_forward._type;
            assertNull(actual_forward_type);
            
            PropertyName actual_forward_wrapperName = actual_forward._wrapperName;
            assertNull(actual_forward_wrapperName);
            
            Annotations actual_forward_contextAnnotations = actual_forward._contextAnnotations;
            assertNull(actual_forward_contextAnnotations);
            
            JsonDeserializer expected_forward_valueDeserializer = expected_forward._valueDeserializer;
            JsonDeserializer actual_forward_valueDeserializer = actual_forward._valueDeserializer;
            JavaType actual_forward_valueDeserializer_baseType = ((JavaType) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
            assertNull(actual_forward_valueDeserializer_baseType);
            
            ObjectIdReader expected_forward_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(expected_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            ObjectIdReader actual_forward_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            JavaType actual_forward_valueDeserializer_objectIdReader_idType = ((JavaType) getFieldValue(actual_forward_valueDeserializer_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
            assertNull(actual_forward_valueDeserializer_objectIdReader_idType);
            
            PropertyName actual_forward_valueDeserializer_objectIdReaderPropertyName = actual_forward_valueDeserializer_objectIdReader.propertyName;
            assertNull(actual_forward_valueDeserializer_objectIdReaderPropertyName);
            
            ObjectIdGenerator actual_forward_valueDeserializer_objectIdReaderGenerator = actual_forward_valueDeserializer_objectIdReader.generator;
            assertNull(actual_forward_valueDeserializer_objectIdReaderGenerator);
            
            ObjectIdResolver actual_forward_valueDeserializer_objectIdReaderResolver = actual_forward_valueDeserializer_objectIdReader.resolver;
            assertNull(actual_forward_valueDeserializer_objectIdReaderResolver);
            
            JsonDeserializer actual_forward_valueDeserializer_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_forward_valueDeserializer_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
            assertNull(actual_forward_valueDeserializer_objectIdReader_deserializer);
            
            SettableBeanProperty actual_forward_valueDeserializer_objectIdReaderIdProperty = actual_forward_valueDeserializer_objectIdReader.idProperty;
            assertNull(actual_forward_valueDeserializer_objectIdReaderIdProperty);
            
            Map actual_forward_valueDeserializer_backRefProperties = ((Map) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
            assertNull(actual_forward_valueDeserializer_backRefProperties);
            
            boolean actual_forward_valueDeserializer_acceptString = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
            assertFalse(actual_forward_valueDeserializer_acceptString);
            
            boolean actual_forward_valueDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
            assertFalse(actual_forward_valueDeserializer_acceptBoolean);
            
            boolean actual_forward_valueDeserializer_acceptInt = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
            assertFalse(actual_forward_valueDeserializer_acceptInt);
            
            boolean actual_forward_valueDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
            assertFalse(actual_forward_valueDeserializer_acceptDouble);
            
            TypeDeserializer actual_forward_valueTypeDeserializer = actual_forward._valueTypeDeserializer;
            assertNull(actual_forward_valueTypeDeserializer);
            
            String actual_forward_managedReferenceName = actual_forward._managedReferenceName;
            assertNull(actual_forward_managedReferenceName);
            
            ObjectIdInfo actual_forward_objectIdInfo = actual_forward._objectIdInfo;
            assertNull(actual_forward_objectIdInfo);
            
            ViewMatcher actual_forward_viewMatcher = actual_forward._viewMatcher;
            assertNull(actual_forward_viewMatcher);
            
            int expected_forward_propertyIndex = expected_forward._propertyIndex;
            int actual_forward_propertyIndex = actual_forward._propertyIndex;
            assertEquals(expected_forward_propertyIndex, actual_forward_propertyIndex);
            
            PropertyMetadata actual_forward_metadata = ((PropertyMetadata) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_forward_metadata);
            
            JsonFormat.Value actual_forward_propertyFormat = ((JsonFormat.Value) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_forward_propertyFormat);
            
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
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getObjectIdInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdInfo objectIdInfo = prop.getObjectIdInfo();
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty(BeanDeserializerBase.java:806) */
        builderBasedDeserializer._resolvedObjectIdProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getObjectIdInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdReader objectIdReader = valueDeser.getObjectIdReader();
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ThrowNullPointerException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty(BeanDeserializerBase.java:808) */
            beanDeserializer._resolvedObjectIdProperty(null, managedReferenceProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (refName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveManagedReferenceProperty_RefNameEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        
        InnerClassProperty actual = ((InnerClassProperty) beanDeserializer._resolveManagedReferenceProperty(null, innerClassProperty));
        
        SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        assertNull(actual_delegate);
        
        Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_annotated);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
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
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String refName = prop.getManagedReferenceName();
 *  */
    @Test
    public void test_resolveManagedReferenceProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty(BeanDeserializerBase.java:776) */
        builderBasedDeserializer._resolveManagedReferenceProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (refName == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty backProp = valueDeser.findBackReference(refName);
 *  */
    @Test
    public void test_resolveManagedReferenceProperty_ThrowNullPointerException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            String _managedReferenceName = "";
            managedReferenceProperty._managedReferenceName = _managedReferenceName;
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty(BeanDeserializerBase.java:781) */
            builderBasedDeserializer._resolveManagedReferenceProperty(null, managedReferenceProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SettableBeanProperty backProp = valueDeser.findBackReference(refName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_resolveManagedReferenceProperty_ThrowIllegalArgumentException() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            throwableDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: prop.getType()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_resolveManagedReferenceProperty_ThrowIllegalArgumentException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            builderBasedDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: prop.getType()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_resolveManagedReferenceProperty_ThrowIllegalArgumentException_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            LinkedHashMap _backRefProperties = new LinkedHashMap();
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties", _backRefProperties);
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            beanDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test
    public void test_resolveManagedReferenceProperty1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            LinkedHashMap _backRefProperties = new LinkedHashMap();
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            _backRefProperties.put(string, fieldProperty);
            _backRefProperties.put(null, null);
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties", _backRefProperties);
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty(BeanDeserializerBase.java:789) */
            beanAsArrayBuilderDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingDeserializer_DeserializationContextGetAnnotationIntrospector() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer actual = throwableDeserializer.findConvertingDeserializer(impl, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = ctxt.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindConvertingDeserializer_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:658) */
        builderBasedDeserializer.findConvertingDeserializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = intr.findDeserializationConverter(prop.getMember());
 *  */
    @Test
    public void testFindConvertingDeserializer_ThrowNullPointerException_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:660) */
            beanDeserializer.findConvertingDeserializer(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = intr.findDeserializationConverter(prop.getMember());
 *  */
    @Test
    public void testFindConvertingDeserializer_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:660) */
        builderBasedDeserializer.findConvertingDeserializer(impl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test
    public void testFindConvertingDeserializer1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            
            JsonDeserializer actual = beanAsArrayBuilderDeserializer.findConvertingDeserializer(impl, objectIdValueProperty);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testFindConvertingDeserializer2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ObjectIdValueProperty _managedProperty5 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
            setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
            setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
            setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
            setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
            
            JsonDeserializer actual = beanDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingDeserializer3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
            
            beanAsArrayDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingDeserializer4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        beanAsArrayDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingDeserializer5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        beanAsArrayDeserializer.findConvertingDeserializer(impl, objectIdValueProperty);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingDeserializer6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        beanDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingDeserializer7() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        beanAsArrayBuilderDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
    }
    
    @Test
    public void testFindConvertingDeserializer8() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty4 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter(JacksonAnnotationIntrospector.java:994)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:660) */
        beanAsArrayDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
    }
    
    @Test
    public void testFindConvertingDeserializer9() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary6 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter(JacksonAnnotationIntrospector.java:994)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:660) */
        beanAsArrayBuilderDeserializer.findConvertingDeserializer(impl, objectIdValueProperty);
    }
    
    @Test
    public void testFindConvertingDeserializer10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty2 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:617)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:660) */
        beanDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
    }
    
    @Test
    public void testFindConvertingDeserializer11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException] */
        beanDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_NotDeserNotInstanceOfBeanDeserializerBase() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            
            ManagedReferenceProperty actual = ((ManagedReferenceProperty) builderBasedDeserializer._resolveInnerClassValuedProperty(null, managedReferenceProperty));
            
            String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
            assertNull(actual_referenceName);
            
            boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
            assertFalse(actual_isContainer);
            
            SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
            assertNull(actual_managedProperty);
            
            SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
            assertNull(actual_backProperty);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
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
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_DeserInstanceOfBeanDeserializerBase() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            Object _defaultCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
            setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            ManagedReferenceProperty actual = ((ManagedReferenceProperty) builderBasedDeserializer._resolveInnerClassValuedProperty(null, managedReferenceProperty));
            
            String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
            assertNull(actual_referenceName);
            
            boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
            assertFalse(actual_isContainer);
            
            SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
            assertNull(actual_managedProperty);
            
            SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
            assertNull(actual_backProperty);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer managedReferenceProperty_valueDeserializer = managedReferenceProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            BeanDeserializerBase actual_valueDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
            assertNull(actual_valueDeserializer_delegate);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
            assertNull(actual_valueDeserializer_orderedProperties);
            
            AnnotatedMethod actual_valueDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
            assertNull(actual_valueDeserializer_buildMethod);
            
            Annotations actual_valueDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_valueDeserializer_classAnnotations);
            
            JavaType actual_valueDeserializer_beanType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
            assertNull(actual_valueDeserializer_beanType);
            
            JsonFormat.Shape actual_valueDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
            assertNull(actual_valueDeserializer_serializationShape);
            
            ValueInstantiator managedReferenceProperty_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(managedReferenceProperty_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            ValueInstantiator actual_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            String actual_valueDeserializer_valueInstantiator_valueTypeDesc = ((String) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueTypeDesc);
            
            Class actual_valueDeserializer_valueInstantiator_valueClass = ((Class) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueClass);
            
            AnnotatedWithParams managedReferenceProperty_valueDeserializer_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(managedReferenceProperty_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_defaultCreator_base = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor", "_base"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_base);
            
            int managedReferenceProperty_valueDeserializer_valueInstantiator_defaultCreator_type = ((Integer) getFieldValue(managedReferenceProperty_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor", "_type"));
            int actual_valueDeserializer_valueInstantiator_defaultCreator_type = ((Integer) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor", "_type"));
            assertEquals(managedReferenceProperty_valueDeserializer_valueInstantiator_defaultCreator_type, actual_valueDeserializer_valueInstantiator_defaultCreator_type);
            
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_valueDeserializer_valueInstantiator_defaultCreator_paramAnnotations = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "_paramAnnotations"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_paramAnnotations);
            
            TypeResolutionContext actual_valueDeserializer_valueInstantiator_defaultCreator_typeContext = ((TypeResolutionContext) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_typeContext"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_typeContext);
            
            AnnotationMap actual_valueDeserializer_valueInstantiator_defaultCreator_annotations = ((AnnotationMap) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_annotations);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_withArgsCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_withArgsCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_constructorArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_constructorArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_constructorArguments);
            
            JavaType actual_valueDeserializer_valueInstantiator_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateType);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_delegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_delegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateArguments);
            
            JavaType actual_valueDeserializer_valueInstantiator_arrayDelegateType = ((JavaType) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateType);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_arrayDelegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_arrayDelegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateArguments);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromStringCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromStringCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromIntCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromIntCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromLongCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromLongCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromDoubleCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromDoubleCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromBooleanCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromBooleanCreator);
            
            AnnotatedParameter actual_valueDeserializer_valueInstantiator_incompleteParameter = ((AnnotatedParameter) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_incompleteParameter"));
            assertNull(actual_valueDeserializer_valueInstantiator_incompleteParameter);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            JsonDeserializer actual_valueDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
            assertNull(actual_valueDeserializer_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_valueDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
            assertNull(actual_valueDeserializer_propertyBasedCreator);
            
            boolean actual_valueDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
            assertFalse(actual_valueDeserializer_nonStandardCreation);
            
            boolean actual_valueDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
            assertFalse(actual_valueDeserializer_vanillaProcessing);
            
            BeanPropertyMap actual_valueDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
            assertNull(actual_valueDeserializer_beanProperties);
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_valueDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
            assertNull(actual_valueDeserializer_injectables);
            
            SettableAnyProperty actual_valueDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
            assertNull(actual_valueDeserializer_anySetter);
            
            Set actual_valueDeserializer_ignorableProps = ((Set) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
            assertNull(actual_valueDeserializer_ignorableProps);
            
            boolean actual_valueDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
            assertFalse(actual_valueDeserializer_ignoreAllUnknown);
            
            boolean actual_valueDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
            assertFalse(actual_valueDeserializer_needViewProcesing);
            
            Map actual_valueDeserializer_backRefs = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
            assertNull(actual_valueDeserializer_backRefs);
            
            HashMap actual_valueDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
            assertNull(actual_valueDeserializer_subDeserializers);
            
            UnwrappedPropertyHandler actual_valueDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
            assertNull(actual_valueDeserializer_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_valueDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
            assertNull(actual_valueDeserializer_externalTypeIdHandler);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
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
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#getOuterClass(java.lang.Class)}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ClassUtilGetOuterClass() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", clsObject);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            BeanAsArrayDeserializer _valueDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            JavaType javaType = managedReferenceProperty._type;
            Class initialManagedReferenceProperty_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            ManagedReferenceProperty actual = ((ManagedReferenceProperty) throwableDeserializer._resolveInnerClassValuedProperty(null, managedReferenceProperty));
            
            String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
            assertNull(actual_referenceName);
            
            boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
            assertFalse(actual_isContainer);
            
            SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
            assertNull(actual_managedProperty);
            
            SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
            assertNull(actual_backProperty);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType managedReferenceProperty_type = managedReferenceProperty._type;
            JavaType actual_type = actual._type;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(managedReferenceProperty_type, actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer managedReferenceProperty_valueDeserializer = managedReferenceProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            BeanDeserializerBase actual_valueDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
            assertNull(actual_valueDeserializer_delegate);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
            assertNull(actual_valueDeserializer_orderedProperties);
            
            Annotations actual_valueDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_valueDeserializer_classAnnotations);
            
            JavaType actual_valueDeserializer_beanType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
            assertNull(actual_valueDeserializer_beanType);
            
            JsonFormat.Shape actual_valueDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
            assertNull(actual_valueDeserializer_serializationShape);
            
            ValueInstantiator managedReferenceProperty_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(managedReferenceProperty_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            ValueInstantiator actual_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            String actual_valueDeserializer_valueInstantiator_valueTypeDesc = ((String) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueTypeDesc);
            
            Class actual_valueDeserializer_valueInstantiator_valueClass = ((Class) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueClass);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_withArgsCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_withArgsCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_constructorArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_constructorArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_constructorArguments);
            
            JavaType actual_valueDeserializer_valueInstantiator_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateType);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_delegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_delegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateArguments);
            
            JavaType actual_valueDeserializer_valueInstantiator_arrayDelegateType = ((JavaType) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateType);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_arrayDelegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_arrayDelegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateArguments);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromStringCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromStringCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromIntCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromIntCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromLongCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromLongCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromDoubleCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromDoubleCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromBooleanCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromBooleanCreator);
            
            AnnotatedParameter actual_valueDeserializer_valueInstantiator_incompleteParameter = ((AnnotatedParameter) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_incompleteParameter"));
            assertNull(actual_valueDeserializer_valueInstantiator_incompleteParameter);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            JsonDeserializer actual_valueDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
            assertNull(actual_valueDeserializer_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_valueDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
            assertNull(actual_valueDeserializer_propertyBasedCreator);
            
            boolean actual_valueDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
            assertFalse(actual_valueDeserializer_nonStandardCreation);
            
            boolean actual_valueDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
            assertFalse(actual_valueDeserializer_vanillaProcessing);
            
            BeanPropertyMap actual_valueDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
            assertNull(actual_valueDeserializer_beanProperties);
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_valueDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
            assertNull(actual_valueDeserializer_injectables);
            
            SettableAnyProperty actual_valueDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
            assertNull(actual_valueDeserializer_anySetter);
            
            Set actual_valueDeserializer_ignorableProps = ((Set) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
            assertNull(actual_valueDeserializer_ignorableProps);
            
            boolean actual_valueDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
            assertFalse(actual_valueDeserializer_ignoreAllUnknown);
            
            boolean actual_valueDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
            assertFalse(actual_valueDeserializer_needViewProcesing);
            
            Map actual_valueDeserializer_backRefs = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
            assertNull(actual_valueDeserializer_backRefs);
            
            HashMap actual_valueDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
            assertNull(actual_valueDeserializer_subDeserializers);
            
            UnwrappedPropertyHandler actual_valueDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
            assertNull(actual_valueDeserializer_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_valueDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
            assertNull(actual_valueDeserializer_externalTypeIdHandler);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
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
            
            JavaType javaType1 = managedReferenceProperty._type;
            Class finalManagedReferenceProperty_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialManagedReferenceProperty_type_class == finalManagedReferenceProperty_type_class);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(com.fasterxml.jackson.databind.util.ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> deser = prop.getValueDeserializer();
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:847) */
        builderBasedDeserializer._resolveInnerClassValuedProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !vi.canCreateUsingDefault()
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:852) */
            beanDeserializer._resolveInnerClassValuedProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> valueClass = prop.getType().getRawClass();
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException_3() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:853) */
            builderBasedDeserializer._resolveInnerClassValuedProperty(null, managedReferenceProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> valueClass = prop.getType().getRawClass();
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:853) */
            throwableDeserializer._resolveInnerClassValuedProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TypeDeserializer td = delegateType.getTypeHandler();
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowClassCastException() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            int[] _typeHandler = {};
            setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.jsontype.TypeDeserializer ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.jsontype.TypeDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:634) */
            Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class referenceTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", deserializationContextType, referenceTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = ((Object) null);
            _findDelegateDeserializerMethodArguments[1] = referenceType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(builderBasedDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeDeserializer td = delegateType.getTypeHandler();
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowNullPointerException() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:634) */
            Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", deserializationContextType, javaTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = ((Object) null);
            _findDelegateDeserializerMethodArguments[1] = ((Object) null);
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(builderBasedDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.executesCondition {@code (td == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: td = ctxt.getConfig().findTypeDeserializer(delegateType);
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowNullPointerException_1() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:636) */
            Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", deserializationContextType, mapTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = ((Object) null);
            _findDelegateDeserializerMethodArguments[1] = mapType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(builderBasedDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.executesCondition {@code (td == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: td = ctxt.getConfig().findTypeDeserializer(delegateType);
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowNullPointerException_2() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:636) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(throwableDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void test_findDelegateDeserializer1() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210)
                com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
                com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:443)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:964)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:638) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class collectionTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, collectionTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = collectionType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    @Test
    public void test_findDelegateDeserializer2() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            Class _class = Object.class;
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.DeserializationConfig.introspectClassAnnotations(DeserializationConfig.java:763)
                com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:320)
                com.fasterxml.jackson.databind.DeserializationConfig.findTypeDeserializer(DeserializationConfig.java:936)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:636) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class collectionTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, collectionTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = collectionType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanAsArrayDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    @Test
    public void test_findDelegateDeserializer3() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
            BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:228)
                com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:142)
                com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:443)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:964)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:638) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapLikeTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapLikeType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(throwableDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    @Test
    public void test_findDelegateDeserializer4() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
            BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            AsWrapperTypeDeserializer _typeHandler1 = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:228)
                com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:142)
                com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:443)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:964)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:638) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapLikeTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapLikeType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanAsArrayDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1080989393128700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1080989393128700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1080989393133699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1080989393128700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1080989393133699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1080989393936900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1080989393936900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1080989393939100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1080989393936900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1080989393939100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1080989394180000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1080989394180000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1080989394181900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1080989394180000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1080989394181900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1080989396768600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1080989396768600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1080989396770400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1080989396768600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1080989396770400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

