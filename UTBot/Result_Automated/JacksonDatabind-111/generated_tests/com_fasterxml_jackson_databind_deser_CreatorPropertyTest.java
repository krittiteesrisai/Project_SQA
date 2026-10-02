package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.BeanProperty;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
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

public final class com_fasterxml_jackson_databind_deser_CreatorPropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new CreatorProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
        creatorProperty._propertyIndex = -255;
        
        CreatorProperty actual = ((CreatorProperty) creatorProperty.withName(null));
        
        CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
        expected._propertyIndex = -255;
        
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.withNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new CreatorProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            creatorProperty._propertyIndex = -255;
            
            CreatorProperty actual = ((CreatorProperty) creatorProperty.withNullProvider(null));
            
            CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            expected._propertyIndex = -255;
            
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
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = expected._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
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
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new CreatorProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class creatorPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = creatorPropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            CreatorProperty actual = ((CreatorProperty) withNullProviderMethod.invoke(creatorProperty, withNullProviderMethodArguments));
            
            CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
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
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = expected._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider expected_nullProvider = expected._nullProvider;
            NullValueProvider actual_nullProvider = actual._nullProvider;
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = expected._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata expected_metadata = ((PropertyMetadata) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            Boolean actual_metadata_required = ((Boolean) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required"));
            assertNull(actual_metadata_required);
            
            String actual_metadata_description = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_description"));
            assertNull(actual_metadata_description);
            
            Integer actual_metadata_index = ((Integer) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_index"));
            assertNull(actual_metadata_index);
            
            String actual_metadata_defaultValue = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_defaultValue"));
            assertNull(actual_metadata_defaultValue);
            
            PropertyMetadata.MergeInfo actual_metadata_mergeInfo = ((PropertyMetadata.MergeInfo) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_mergeInfo"));
            assertNull(actual_metadata_mergeInfo);
            
            Nulls actual_metadata_valueNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls"));
            assertNull(actual_metadata_valueNulls);
            
            Nulls actual_metadata_contentNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_contentNulls"));
            assertNull(actual_metadata_contentNulls);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new CreatorProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
            SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName", _wrapperName);
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            Object _viewMatcher = createInstance("com.fasterxml.jackson.databind.util.ViewMatcher$Single");
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            creatorProperty._propertyIndex = -255;
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class creatorPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = creatorPropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            CreatorProperty actual = ((CreatorProperty) withNullProviderMethod.invoke(creatorProperty, withNullProviderMethodArguments));
            
            CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName", _wrapperName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            expected._propertyIndex = -255;
            
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
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType expected_type = expected._type;
            JavaType actual_type = actual._type;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_type, actual_type);
            
            PropertyName expected_wrapperName = expected._wrapperName;
            PropertyName actual_wrapperName = actual._wrapperName;
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(expected_wrapperName, actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = expected._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            Converter actual_valueDeserializer_converter = ((Converter) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
            assertNull(actual_valueDeserializer_converter);
            
            JavaType actual_valueDeserializer_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
            assertNull(actual_valueDeserializer_delegateType);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer expected_valueTypeDeserializer = expected._valueTypeDeserializer;
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
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
            
            Map actual_valueTypeDeserializer_deserializers = ((Map) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers"));
            assertNull(actual_valueTypeDeserializer_deserializers);
            
            JsonDeserializer actual_valueTypeDeserializer_defaultImplDeserializer = ((JsonDeserializer) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer"));
            assertNull(actual_valueTypeDeserializer_defaultImplDeserializer);
            
            NullValueProvider expected_nullProvider = expected._nullProvider;
            NullValueProvider actual_nullProvider = actual._nullProvider;
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher expected_viewMatcher = expected._viewMatcher;
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            Class actual_viewMatcher_view = ((Class) getFieldValue(actual_viewMatcher, "com.fasterxml.jackson.databind.util.ViewMatcher$Single", "_view"));
            assertNull(actual_viewMatcher_view);
            
            int expected_propertyIndex = expected._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.inject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inject(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#inject(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.CreatorProperty#findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInject_ThrowNullPointerException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        byte[] _injectableValueId = {};
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:71)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inject(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testInject1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        com.fasterxml.jackson.databind.util.ClassUtil[] classUtilArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:71)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(impl, classUtilArray);
    }
    
    @Test
    public void testInject2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:379)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(impl, object);
    }
    
    @Test
    public void testInject3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:79)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(impl, object);
    }
    
    @Test
    public void testInject4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:184)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(null, object);
    }
    
    @Test
    public void testInject5() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:184)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(null, null);
    }
    
    @Test
    public void testInject6() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(_injectableValueId, object);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(impl, object1);
    }
    
    @Test
    public void testInject7() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        _values.put(_injectableValueId, null);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.inject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.CreatorProperty.inject(CreatorProperty.java:197) */
        creatorProperty.inject(impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#getMember()}
 * @utbot.returnsFrom {@code return _annotated;}
 *  */
    @Test
    public void testGetMember_Return_annotated() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        AnnotatedMember actual = creatorProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (_fallbackSetter != null): False}
 *  */
    @Test
    public void testFixAccess__fallbackSetterEqualsNull() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        creatorProperty.fixAccess(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    @Test
    public void testFixAccess1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        CreatorProperty _fallbackSetter = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        creatorProperty.fixAccess(deserializationConfig);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    @Test(expected = StackOverflowError.class)
    public void testFixAccess2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        creatorProperty.fixAccess(null);
    }
    
    @Test
    public void testFixAccess3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        SetterlessProperty _fallbackSetter = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.fixAccess(SetterlessProperty.java:78)
            com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess(CreatorProperty.java:146) */
        creatorProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        SetterlessProperty _fallbackSetter = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.fixAccess(SetterlessProperty.java:78)
            com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess(CreatorProperty.java:146) */
        creatorProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess5() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:921)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:139)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.fixAccess(SetterlessProperty.java:78)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.fixAccess(ManagedReferenceProperty.java:49)
            com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess(CreatorProperty.java:146) */
        creatorProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess6() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.fixAccess(ManagedReferenceProperty.java:49)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.fixAccess(ManagedReferenceProperty.java:50)
            com.fasterxml.jackson.databind.deser.CreatorProperty.fixAccess(CreatorProperty.java:146) */
        creatorProperty.fixAccess(deserializationConfig);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.setFallbackSetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFallbackSetter(com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#setFallbackSetter(com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 *  */
    @Test
    public void testSetFallbackSetter() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        creatorProperty.setFallbackSetter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.isIgnorable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isIgnorable()
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#isIgnorable()}
 * @utbot.returnsFrom {@code return _ignorable;}
 *  */
    @Test
    public void testIsIgnorable_Return_ignorable() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        boolean actual = creatorProperty.isIgnorable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.getCreatorIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatorIndex()
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#getCreatorIndex()}
 * @utbot.returnsFrom {@code return _creatorIndex;}
 *  */
    @Test
    public void testGetCreatorIndex_Return_creatorIndex() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
        
        int actual = creatorProperty.getCreatorIndex();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.markAsIgnorable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markAsIgnorable()
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#markAsIgnorable()}
 *  */
    @Test
    public void testMarkAsIgnorable() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        creatorProperty.markAsIgnorable();
        
        boolean finalCreatorProperty_ignorable = creatorProperty._ignorable;
        
        assertTrue(finalCreatorProperty_ignorable);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _fallbackSetter.set(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MethodProperty _fallbackSetter = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        creatorProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _fallbackSetter.set(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ObjectIdReferenceProperty _fallbackSetter = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        creatorProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _fallbackSetter.set(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        creatorProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _fallbackSetter.set(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ObjectIdReferenceProperty _fallbackSetter = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        creatorProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _fallbackSetter.set(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        creatorProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.CreatorProperty#_verifySetter()
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: _fallbackSetter.set(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testDeserializeAndSet_ThrowMismatchedInputException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ObjectIdReferenceProperty _fallbackSetter = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        creatorProperty.deserializeAndSet(filteringParserDelegate, impl, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserializeAndSet1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        creatorProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        CreatorProperty _fallbackSetter = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        creatorProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet3() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _fallbackSetter);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
            JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
            Object object = new Object();
            
            creatorProperty.deserializeAndSet(jsonParserDelegate, null, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testDeserializeAndSet4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        CreatorProperty _fallbackSetter = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1426)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527)
            com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
        creatorProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet5() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
            ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
            setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
            setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
            setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
                com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
                com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
            creatorProperty.deserializeAndSet(filteringParserDelegate, null, null);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testDeserializeAndSet6() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        CreatorProperty _fallbackSetter = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:530)
            com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
        creatorProperty.deserializeAndSet(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeAndSet7() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        CreatorProperty _fallbackSetter = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:907)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1489)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:177)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527)
            com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
        creatorProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet8() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        InnerClassProperty _fallbackSetter = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:530)
            com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
        creatorProperty.deserializeAndSet(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeAndSet9() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MethodProperty _fallbackSetter = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.deserialize(SettableBeanProperty.java:527)
            com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
        creatorProperty.deserializeAndSet(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeAndSet10() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            CreatorProperty _fallbackSetter = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer1 = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
                com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
                com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
                com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
                com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
            creatorProperty.deserializeAndSet(jsonParserSequence, null, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testDeserializeAndSet11() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
            MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
            setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
                com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
                com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
            creatorProperty.deserializeAndSet(jsonParserDelegate, null, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testDeserializeAndSet12() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer2 = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
            setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
                com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
                com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeAndSet(CreatorProperty.java:231) */
            creatorProperty.deserializeAndSet(jsonParserSequence, null, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return _fallbackSetter.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_Return_fallbackSetterSetAndReturn_1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        Object actual = creatorProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return _fallbackSetter.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_Return_fallbackSetterSetAndReturn() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        Object actual = creatorProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.CreatorProperty#_verifySetter()
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _fallbackSetter.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _fallbackSetter);
        ObjectIdValueProperty delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        java.lang.Object[] objectArray = {};
        java.lang.Object[] objectArray1 = new java.lang.Object[2];
        Object object = new Object();
        objectArray1[1] = object;
        
        creatorProperty.setAndReturn(objectArray, objectArray1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        Object object1 = new Object();
        
        creatorProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn5() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn6() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.setAndReturn(object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifySetter()
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#_verifySetter()}
 * @utbot.executesCondition {@code (_fallbackSetter == null): False}
 *  */
    @Test
    public void test_verifySetter__fallbackSetterNotEqualsNull() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        Class creatorPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Method _verifySetterMethod = creatorPropertyClazz.getDeclaredMethod("_verifySetter");
        _verifySetterMethod.setAccessible(true);
        java.lang.Object[] _verifySetterMethodArguments = new java.lang.Object[0];
        _verifySetterMethod.invoke(creatorProperty, _verifySetterMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.deserializeSetAndReturn
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _fallbackSetter.setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MethodProperty _fallbackSetter = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        creatorProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _fallbackSetter.setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ObjectIdReferenceProperty _fallbackSetter = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        creatorProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _fallbackSetter.setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        creatorProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _fallbackSetter.setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ObjectIdReferenceProperty _fallbackSetter = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        creatorProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _fallbackSetter.setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        SetterlessProperty _fallbackSetter = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        creatorProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeSetAndReturn
    
    public void testDeserializeSetAndReturn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.getInjectableValueId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInjectableValueId()
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#getInjectableValueId()}
 * @utbot.returnsFrom {@code return _injectableValueId;}
 *  */
    @Test
    public void testGetInjectableValueId_Return_injectableValueId() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        Object actual = creatorProperty.getInjectableValueId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectableValueId == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findInjectableValue(java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object)}
 * @utbot.returnsFrom {@code return context.findInjectableValue(_injectableValueId, this, beanInstance);}
 *  */
    @Test
    public void testFindInjectableValue__injectableValueIdNotEqualsNull() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(_injectableValueId, object);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        Object actual = creatorProperty.findInjectableValue(impl, null);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findInjectableValue(java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return context.findInjectableValue(_injectableValueId, this, beanInstance);
 *  */
    @Test
    public void testFindInjectableValue_ThrowNullPointerException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188) */
        creatorProperty.findInjectableValue(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findInjectableValue(java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFindInjectableValue_ThrowNullPointerException_1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        byte[] _injectableValueId = {};
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:71)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188) */
        creatorProperty.findInjectableValue(impl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testFindInjectableValue1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
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
        Object object1 = new Object();
        
        Object actual = creatorProperty.findInjectableValue(impl, object1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findInjectableValue(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testFindInjectableValue2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:71)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188) */
        creatorProperty.findInjectableValue(impl, object);
    }
    
    @Test
    public void testFindInjectableValue3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:379)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188) */
        creatorProperty.findInjectableValue(impl, object);
    }
    
    @Test
    public void testFindInjectableValue4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:79)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:382)
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:188) */
        creatorProperty.findInjectableValue(impl, object);
    }
    
    @Test
    public void testFindInjectableValue5() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:184) */
        creatorProperty.findInjectableValue(null, null);
    }
    
    @Test
    public void testFindInjectableValue6() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.CreatorProperty.findInjectableValue(CreatorProperty.java:184) */
        creatorProperty.findInjectableValue(null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerEqualsDeser() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        CreatorProperty actual = ((CreatorProperty) creatorProperty.withValueDeserializer(null));
        
        AnnotatedParameter actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        Object actual_injectableValueId = actual._injectableValueId;
        assertNull(actual_injectableValueId);
        
        SettableBeanProperty actual_fallbackSetter = actual._fallbackSetter;
        assertNull(actual_fallbackSetter);
        
        int creatorProperty_creatorIndex = creatorProperty._creatorIndex;
        int actual_creatorIndex = actual._creatorIndex;
        assertEquals(creatorProperty_creatorIndex, actual_creatorIndex);
        
        boolean actual_ignorable = actual._ignorable;
        assertFalse(actual_ignorable);
        
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
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int creatorProperty_propertyIndex = creatorProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(creatorProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new CreatorProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
            MapEntryDeserializer _valueDeserializer = ((MapEntryDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            CreatorProperty actual = ((CreatorProperty) creatorProperty.withValueDeserializer(null));
            
            CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_creatorIndex", -255);
            FailingDeserializer _valueDeserializer1 = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer1, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer1);
            
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
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = expected._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
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
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new CreatorProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            Object _injectableValueId = createInstance("java.lang.Object");
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
            PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName", _wrapperName);
            AnnotationCollector.OneAnnotation _contextAnnotations = ((AnnotationCollector.OneAnnotation) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            FailingDeserializer _nullProvider = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            Object _viewMatcher = createInstance("com.fasterxml.jackson.databind.util.ViewMatcher$Single");
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            creatorProperty._propertyIndex = -248;
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((Converter) null));
            
            NullValueProvider nullValueProvider = creatorProperty._nullProvider;
            Class initialCreatorProperty_nullProvider_valueClass = ((Class) getFieldValue(nullValueProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            CreatorProperty actual = ((CreatorProperty) creatorProperty.withValueDeserializer(stdDelegatingDeserializer));
            
            CreatorProperty expected = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName", _wrapperName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            expected._propertyIndex = -248;
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
            
            AnnotatedParameter actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            Object expected_injectableValueId = expected._injectableValueId;
            Object actual_injectableValueId = actual._injectableValueId;
            
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
            
            PropertyName expected_wrapperName = expected._wrapperName;
            PropertyName actual_wrapperName = actual._wrapperName;
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(expected_wrapperName, actual_wrapperName);
            
            Annotations expected_contextAnnotations = expected._contextAnnotations;
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            Class actual_contextAnnotations_type = ((Class) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation", "_type"));
            assertNull(actual_contextAnnotations_type);
            
            Annotation actual_contextAnnotations_value = ((Annotation) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation", "_value"));
            assertNull(actual_contextAnnotations_value);
            
            JsonDeserializer expected_valueDeserializer = expected._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            Converter actual_valueDeserializer_converter = ((Converter) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
            assertNull(actual_valueDeserializer_converter);
            
            JavaType actual_valueDeserializer_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
            assertNull(actual_valueDeserializer_delegateType);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer expected_valueTypeDeserializer = expected._valueTypeDeserializer;
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
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
            
            Map actual_valueTypeDeserializer_deserializers = ((Map) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers"));
            assertNull(actual_valueTypeDeserializer_deserializers);
            
            JsonDeserializer actual_valueTypeDeserializer_defaultImplDeserializer = ((JsonDeserializer) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer"));
            assertNull(actual_valueTypeDeserializer_defaultImplDeserializer);
            
            NullValueProvider expected_nullProvider = expected._nullProvider;
            NullValueProvider actual_nullProvider = actual._nullProvider;
            String expected_nullProvider_message = ((String) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_nullProvider_message = ((String) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_nullProvider_message, actual_nullProvider_message);
            
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher expected_viewMatcher = expected._viewMatcher;
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            Class actual_viewMatcher_view = ((Class) getFieldValue(actual_viewMatcher, "com.fasterxml.jackson.databind.util.ViewMatcher$Single", "_view"));
            assertNull(actual_viewMatcher_view);
            
            int expected_propertyIndex = expected._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata expected_metadata = ((PropertyMetadata) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            Boolean actual_metadata_required = ((Boolean) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required"));
            assertNull(actual_metadata_required);
            
            String actual_metadata_description = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_description"));
            assertNull(actual_metadata_description);
            
            Integer actual_metadata_index = ((Integer) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_index"));
            assertNull(actual_metadata_index);
            
            String actual_metadata_defaultValue = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_defaultValue"));
            assertNull(actual_metadata_defaultValue);
            
            PropertyMetadata.MergeInfo actual_metadata_mergeInfo = ((PropertyMetadata.MergeInfo) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_mergeInfo"));
            assertNull(actual_metadata_mergeInfo);
            
            Nulls actual_metadata_valueNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls"));
            assertNull(actual_metadata_valueNulls);
            
            Nulls actual_metadata_contentNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_contentNulls"));
            assertNull(actual_metadata_contentNulls);
            
            JsonFormat.Value expected_propertyFormat = ((JsonFormat.Value) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
            assertEquals(expected_propertyFormat, actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            NullValueProvider nullValueProvider1 = creatorProperty._nullProvider;
            Class finalCreatorProperty_nullProvider_valueClass = ((Class) getFieldValue(nullValueProvider1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialCreatorProperty_nullProvider_valueClass == finalCreatorProperty_nullProvider_valueClass);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Integer _injectableValueId = 17;
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        String actual = creatorProperty.toString();
        
        String expected = "[creator property, name ''; inject id '17']";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code (_annotated == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAnnotation__annotatedEqualsNull() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        
        Annotation actual = creatorProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code (_annotated == null): False}
 * @utbot.returnsFrom {@code return _annotated.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__annotatedNotEqualsNull() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        AnnotatedParameter _annotated = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_annotated", _annotated);
        
        Annotation actual = creatorProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code (_annotated == null): False}
 * @utbot.returnsFrom {@code return _annotated.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__annotatedNotEqualsNull_1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        AnnotatedParameter _annotated = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_annotated", _annotated);
        
        Annotation actual = creatorProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.CreatorProperty.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        creatorProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet_1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        creatorProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet_2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        
        creatorProperty.set(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CreatorProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.CreatorProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.CreatorProperty#_verifySetter()
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _fallbackSetter.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ObjectIdValueProperty delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        creatorProperty.set(null, objectArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSet1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet2() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _fallbackSetter);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet3() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _fallbackSetter);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet4() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet5() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        MergingSettableBeanProperty _fallbackSetter = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet6() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        Object object1 = new Object();
        
        creatorProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet7() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet8() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(null, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testSet9() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet10() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        creatorProperty.set(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet11() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        Object object1 = new Object();
        
        creatorProperty.set(object, object1);
    }
    
    @Test
    public void testSet12() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        ManagedReferenceProperty _fallbackSetter = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _fallbackSetter);
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_fallbackSetter, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_fallbackSetter", _fallbackSetter);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.CreatorProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:246) */
        creatorProperty.set(null, object);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1094855070220600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1094855070220600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1094855070228300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094855070220600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094855070228300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1094855070929100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1094855070929100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1094855070931500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094855070929100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094855070931500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1094855071903700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1094855071903700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1094855071905500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094855071903700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094855071905500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

