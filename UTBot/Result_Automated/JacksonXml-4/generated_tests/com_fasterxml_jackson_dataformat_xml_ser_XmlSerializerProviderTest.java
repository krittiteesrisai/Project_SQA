package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import java.util.HashMap;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import com.fasterxml.jackson.databind.type.SimpleType;
import javax.xml.namespace.QName;
import org.codehaus.stax2.ri.Stax2WriterAdapter;
import org.codehaus.stax2.util.StreamWriterDelegate;
import org.codehaus.stax2.XMLStreamWriter2;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter;
import java.util.LinkedList;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;
import java.io.PrintWriter;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_dataformat_xml_ser_XmlSerializerProviderTest {
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInstance(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.SerializerFactory)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#createInstance(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory)}
 * @utbot.returnsFrom {@code return new XmlSerializerProvider(this, config, jsf);}
 *  */
    @Test
    public void testCreateInstance_Return() throws Exception  {
        Class serializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        JsonSerializer prevDEFAULT_UNKNOWN_SERIALIZER = ((JsonSerializer) getStaticFieldValue(serializerProviderClazz, "DEFAULT_UNKNOWN_SERIALIZER"));
        NullSerializer prevInstance = NullSerializer.instance;
        JsonSerializer prevDEFAULT_NULL_KEY_SERIALIZER = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        try {
            Class class1 = Object.class;
            UnknownSerializer defaultUnknownSerializer = new UnknownSerializer(class1);
            setStaticField(serializerProviderClazz, "DEFAULT_UNKNOWN_SERIALIZER", defaultUnknownSerializer);
            NullSerializer instance = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(instance, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            Class nullSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NullSerializer");
            setStaticField(nullSerializerClazz, "instance", instance);
            String string = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
            FailingSerializer defaultNullKeySerializer = new FailingSerializer(string);
            setStaticField(serializerProviderClazz, "DEFAULT_NULL_KEY_SERIALIZER", defaultNullKeySerializer);
            XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            XmlRootNameLookup _rootNameLookup = ((XmlRootNameLookup) createInstance("com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameLookup", _rootNameLookup);
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            ReadOnlyClassToSerializerMap value = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            setField(_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value", value);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            ToStringSerializer _keySerializer = ((ToStringSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.ToStringSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer", _keySerializer);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _keySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view", class1);
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            
            Class initialSerializationConfig_view = ((Class) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            
            XmlSerializerProvider actual = ((XmlSerializerProvider) xmlSerializerProvider.createInstance(serializationConfig, null));
            
            XmlSerializerProvider expected = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            setField(expected, "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameLookup", _rootNameLookup);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_config", serializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", class1);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes", _attributes);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer", _keySerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _keySerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", value);
            
            XmlRootNameLookup expected_rootNameLookup = expected._rootNameLookup;
            XmlRootNameLookup actual_rootNameLookup = actual._rootNameLookup;
            LRUMap actual_rootNameLookup_rootNames = ((LRUMap) getFieldValue(actual_rootNameLookup, "com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup", "_rootNames"));
            assertNull(actual_rootNameLookup_rootNames);
            
            Map actual_seenObjectIds = ((Map) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_seenObjectIds"));
            assertNull(actual_seenObjectIds);
            
            ArrayList actual_objectIdGenerators = ((ArrayList) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_objectIdGenerators"));
            assertNull(actual_objectIdGenerators);
            
            JsonGenerator actual_generator = ((JsonGenerator) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
            assertNull(actual_generator);
            
            SerializationConfig expected_config = ((SerializationConfig) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_config"));
            SerializationConfig actual_config = ((SerializationConfig) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_config"));
            FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
            assertNull(actual_config_filterProvider);
            
            PrettyPrinter actual_config_defaultPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_defaultPrettyPrinter"));
            assertNull(actual_config_defaultPrettyPrinter);
            
            int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
            int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
            assertEquals(expected_config_serFeatures, actual_config_serFeatures);
            
            int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
            int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
            assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
            
            int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
            int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
            assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
            
            int expected_config_formatWriteFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
            int actual_config_formatWriteFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
            assertEquals(expected_config_formatWriteFeatures, actual_config_formatWriteFeatures);
            
            int expected_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
            int actual_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
            assertEquals(expected_config_formatWriteFeaturesToChange, actual_config_formatWriteFeaturesToChange);
            
            JsonInclude.Value actual_config_serializationInclusion = ((JsonInclude.Value) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
            assertNull(actual_config_serializationInclusion);
            
            SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            assertNull(actual_config_mixIns);
            
            SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
            assertNull(actual_config_subtypeResolver);
            
            PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
            assertNull(actual_config_rootName);
            
            Class expected_config_view = ((Class) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            assertEquals(Class.class, actual_config_view.getClass());
            
            ContextAttributes expected_config_attributes = ((ContextAttributes) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
            ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
            Map actual_config_attributes_shared = ((Map) getFieldValue(actual_config_attributes, "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", "_shared"));
            assertNull(actual_config_attributes_shared);
            
            Map actual_config_attributes_nonShared = ((Map) getFieldValue(actual_config_attributes, "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", "_nonShared"));
            assertNull(actual_config_attributes_nonShared);
            
            RootNameLookup actual_config_rootNames = ((RootNameLookup) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
            assertNull(actual_config_rootNames);
            
            ConfigOverrides actual_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
            assertNull(actual_config_configOverrides);
            
            int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
            int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
            assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
            
            BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
            assertNull(actual_config_base);
            
            Class expected_serializationView = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
            Class actual_serializationView = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
            assertEquals(Class.class, actual_serializationView.getClass());
            
            SerializerFactory actual_serializerFactory = ((SerializerFactory) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            assertNull(actual_serializerFactory);
            
            SerializerCache expected_serializerCache = ((SerializerCache) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            SerializerCache actual_serializerCache = ((SerializerCache) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            HashMap actual_serializerCache_sharedMap = ((HashMap) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            assertNull(actual_serializerCache_sharedMap);
            
            AtomicReference expected_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            AtomicReference actual_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object expected_serializerCache_readOnlyMapValue = getFieldValue(expected_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object actual_serializerCache_readOnlyMapValue = getFieldValue(actual_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object actual_serializerCache_readOnlyMapValue_buckets = getFieldValue(actual_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            assertNull(actual_serializerCache_readOnlyMapValue_buckets);
            
            int expected_serializerCache_readOnlyMapValue_size = ((Integer) getFieldValue(expected_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_size"));
            int actual_serializerCache_readOnlyMapValue_size = ((Integer) getFieldValue(actual_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_size"));
            assertEquals(expected_serializerCache_readOnlyMapValue_size, actual_serializerCache_readOnlyMapValue_size);
            
            int expected_serializerCache_readOnlyMapValue_mask = ((Integer) getFieldValue(expected_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask"));
            int actual_serializerCache_readOnlyMapValue_mask = ((Integer) getFieldValue(actual_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask"));
            assertEquals(expected_serializerCache_readOnlyMapValue_mask, actual_serializerCache_readOnlyMapValue_mask);
            
            ContextAttributes expected_attributes = ((ContextAttributes) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes"));
            ContextAttributes actual_attributes = ((ContextAttributes) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes"));
            assertTrue(deepEquals(expected_attributes, actual_attributes));
            assertTrue(deepEquals(expected_attributes, actual_attributes));
            
            JsonSerializer actual_unknownTypeSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            assertNull(actual_unknownTypeSerializer);
            
            JsonSerializer expected_keySerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            Class actual_keySerializer_handledType = ((Class) getFieldValue(actual_keySerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertNull(actual_keySerializer_handledType);
            
            JsonSerializer expected_nullValueSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            assertTrue(deepEquals(expected_nullValueSerializer, actual_nullValueSerializer));
            
            JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            assertNull(actual_nullKeySerializer);
            
            ReadOnlyClassToSerializerMap expected_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            
            DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
            assertNull(actual_dateFormat);
            
            boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
            assertFalse(actual_stdNullValueSerializer);
            
            Class finalSerializationConfig_view = ((Class) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            
            assertFalse(initialSerializationConfig_view == finalSerializationConfig_view);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createInstance(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.SerializerFactory)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#createInstance(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new XmlSerializerProvider(this, config, jsf);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCreateInstance_ThrowNullPointerException() throws Exception  {
        Class serializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        JsonSerializer prevDEFAULT_UNKNOWN_SERIALIZER = ((JsonSerializer) getStaticFieldValue(serializerProviderClazz, "DEFAULT_UNKNOWN_SERIALIZER"));
        NullSerializer prevInstance = NullSerializer.instance;
        JsonSerializer prevDEFAULT_NULL_KEY_SERIALIZER = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        try {
            Class class1 = Object.class;
            UnknownSerializer defaultUnknownSerializer = new UnknownSerializer(class1);
            setStaticField(serializerProviderClazz, "DEFAULT_UNKNOWN_SERIALIZER", defaultUnknownSerializer);
            NullSerializer instance = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(instance, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            Class nullSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NullSerializer");
            setStaticField(nullSerializerClazz, "instance", instance);
            String string = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
            FailingSerializer defaultNullKeySerializer = new FailingSerializer(string);
            setStaticField(serializerProviderClazz, "DEFAULT_NULL_KEY_SERIALIZER", defaultNullKeySerializer);
            XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            
            xmlSerializerProvider.createInstance(null, null);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInstance(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.SerializerFactory)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#createInstance(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new XmlSerializerProvider(this, config, jsf);
 *  */
    @Test
    public void testCreateInstance_ThrowClassCastException() throws Exception  {
        Class serializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        JsonSerializer prevDEFAULT_UNKNOWN_SERIALIZER = ((JsonSerializer) getStaticFieldValue(serializerProviderClazz, "DEFAULT_UNKNOWN_SERIALIZER"));
        NullSerializer prevInstance = NullSerializer.instance;
        JsonSerializer prevDEFAULT_NULL_KEY_SERIALIZER = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        try {
            Class class1 = Object.class;
            UnknownSerializer defaultUnknownSerializer = new UnknownSerializer(class1);
            setStaticField(serializerProviderClazz, "DEFAULT_UNKNOWN_SERIALIZER", defaultUnknownSerializer);
            NullSerializer instance = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(instance, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            Class nullSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NullSerializer");
            setStaticField(nullSerializerClazz, "instance", instance);
            String string = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
            FailingSerializer defaultNullKeySerializer = new FailingSerializer(string);
            setStaticField(serializerProviderClazz, "DEFAULT_NULL_KEY_SERIALIZER", defaultNullKeySerializer);
            XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            byte[] value = {};
            setField(_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value", value);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            ToStringSerializer _keySerializer = ((ToStringSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.ToStringSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer", _keySerializer);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _keySerializer);
            FailingSerializer _nullKeySerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            
            /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
                com.fasterxml.jackson.databind.ser.SerializerCache.getReadOnlyLookupMap(SerializerCache.java:50)
                com.fasterxml.jackson.databind.SerializerProvider.<init>(SerializerProvider.java:234)
                com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.<init>(DefaultSerializerProvider.java:69)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.<init>(XmlSerializerProvider.java:48)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance(XmlSerializerProvider.java:61) */
            xmlSerializerProvider.createInstance(serializationConfig, null);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.returnsFrom {@code return;}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return;
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValue_ThrowJsonMappingException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        NullSerializer _serializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[40];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 63);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 68);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider.serializeValue(writerBasedJsonGenerator, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (xgen == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#findTypedValueSerializer(java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final JsonSerializer<Object> ser = findTypedValueSerializer(cls, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 256);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.typedValueSerializer(ReadOnlyClassToSerializerMap.java:85)
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:687)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:90) */
        xmlSerializerProvider.serializeValue(tokenBuffer, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:252)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:78) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.executesCondition {@code (rootName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup#findRootName(java.lang.Class,com.fasterxml.jackson.databind.cfg.MapperConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rootName = _rootNameLookup.findRootName(cls, _config);
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:80) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
     */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValueThrowsJME() throws IOException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        xmlSerializerProvider.serializeValue(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.returnsFrom {@code return;}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return;
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValue_ThrowJsonMappingException1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        NullSerializer _serializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[40];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 63);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 68);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider.serializeValue(writerBasedJsonGenerator, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (xgen == null): True}
 * @utbot.executesCondition {@code (ser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#findTypedValueSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ser = findTypedValueSerializer(rootType, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", -2);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        int[] intArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_hash", -79);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -82 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.typedValueSerializer(ReadOnlyClassToSerializerMap.java:68)
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:732)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:180) */
        xmlSerializerProvider.serializeValue(tokenBuffer, intArray, simpleType, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:252)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:169) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:252)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:169) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.executesCondition {@code (rootName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup#findRootName(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.cfg.MapperConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rootName = _rootNameLookup.findRootName(rootType, _config);
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:171) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null, null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test(expected = JsonMappingException.class)
    public void testSerializeValueByFuzzer() throws IOException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        xmlSerializerProvider.serializeValue(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (xgen == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#findTypedValueSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final JsonSerializer<Object> ser = findTypedValueSerializer(rootType, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", -2);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        int[] intArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_hash", -79);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -82 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.typedValueSerializer(ReadOnlyClassToSerializerMap.java:68)
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:732)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:134) */
        xmlSerializerProvider.serializeValue(tokenBuffer, intArray, simpleType);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "\u0000";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:129)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:254)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:123) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, intArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_11() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:252)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:123) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:252)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:123) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.executesCondition {@code (rootName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup#findRootName(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.cfg.MapperConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rootName = _rootNameLookup.findRootName(rootType, _config);
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:125) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.returnsFrom {@code return;}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return;
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValue_ThrowJsonMappingException2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        NullSerializer _serializer1 = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[40];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 70);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 79);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider.serializeValue(writerBasedJsonGenerator, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 *  */
    @Test
    public void test_initWithRootName() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        toXmlGenerator._initialized = true;
        QName qName = ((QName) createInstance("javax.xml.namespace.QName"));
        
        QName initialToXmlGenerator_nextName = toXmlGenerator._nextName;
        
        xmlSerializerProvider._initWithRootName(toXmlGenerator, qName);
        
        QName finalToXmlGenerator_nextName = toXmlGenerator._nextName;
        
        assertFalse(initialToXmlGenerator_nextName == finalToXmlGenerator_nextName);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void test_initWithRootName_StringLength() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        toXmlGenerator._initialized = true;
        QName qName = ((QName) createInstance("javax.xml.namespace.QName"));
        String namespaceURI = "";
        setField(qName, "javax.xml.namespace.QName", "namespaceURI", namespaceURI);
        
        QName initialToXmlGenerator_nextName = toXmlGenerator._nextName;
        
        xmlSerializerProvider._initWithRootName(toXmlGenerator, qName);
        
        QName finalToXmlGenerator_nextName = toXmlGenerator._nextName;
        
        assertFalse(initialToXmlGenerator_nextName == finalToXmlGenerator_nextName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !xgen.setNextNameIfMissing(rootName)
 *  */
    @Test
    public void test_initWithRootName_ThrowNullPointerException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:223) */
        xmlSerializerProvider._initWithRootName(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String ns = rootName.getNamespaceURI();
 *  */
    @Test
    public void test_initWithRootName_ThrowNullPointerException_1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        toXmlGenerator._initialized = true;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:230) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator#setNextName(javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String ns = rootName.getNamespaceURI();
 *  */
    @Test
    public void test_initWithRootName_ThrowNullPointerException_2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        toXmlGenerator._initialized = true;
        QName _nextName = ((QName) createInstance("javax.xml.namespace.QName"));
        toXmlGenerator._nextName = _nextName;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:230) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String ns = rootName.getNamespaceURI();
 *  */
    @Test
    public void test_initWithRootName_ThrowNullPointerException_4() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:230) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.invokes {@link javax.xml.namespace.QName#getNamespaceURI()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator#getStaxWriter()}
 * @utbot.invokes {@link javax.xml.stream.XMLStreamWriter#setDefaultNamespace(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: xgen.getStaxWriter().setDefaultNamespace(ns);
 *  */
    @Test
    public void test_initWithRootName_ThrowNullPointerException_3() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        toXmlGenerator._initialized = true;
        QName _nextName = ((QName) createInstance("javax.xml.namespace.QName"));
        toXmlGenerator._nextName = _nextName;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        QName qName = ((QName) createInstance("javax.xml.namespace.QName"));
        String namespaceURI = "\u0000";
        setField(qName, "javax.xml.namespace.QName", "namespaceURI", namespaceURI);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException] */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, qName);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _initWithRootName(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    @Test
    public void test_initWithRootName1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        QName _nextName = ((QName) createInstance("javax.xml.namespace.QName"));
        toXmlGenerator._nextName = _nextName;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:230) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    @Test
    public void test_initWithRootName2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Stax2WriterAdapter _xmlWriter = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        Stax2WriterAdapter mDelegate = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        setField(_xmlWriter, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate);
        setField(toXmlGenerator, "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_xmlWriter", _xmlWriter);
        toXmlGenerator._formatFeatures = 1;
        QName _nextName = ((QName) createInstance("javax.xml.namespace.QName"));
        toXmlGenerator._nextName = _nextName;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.initGenerator(ToXmlGenerator.java:199)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:229) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    @Test
    public void test_initWithRootName3() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Stax2WriterAdapter _xmlWriter = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        StreamWriterDelegate mDelegate = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
        Stax2WriterAdapter mDelegate1 = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        StreamWriterDelegate mDelegate2 = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
        setField(mDelegate1, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate2);
        setField(mDelegate, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate1);
        setField(_xmlWriter, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate);
        setField(toXmlGenerator, "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_xmlWriter", _xmlWriter);
        toXmlGenerator._formatFeatures = 1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.initGenerator(ToXmlGenerator.java:199)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:229) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    @Test
    public void test_initWithRootName4() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Stax2WriterAdapter _xmlWriter = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        StreamWriterDelegate mDelegate = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
        StreamWriterDelegate mDelegate1 = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
        Stax2WriterAdapter mDelegate2 = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        setField(mDelegate1, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate2);
        setField(mDelegate, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate1);
        setField(_xmlWriter, "org.codehaus.stax2.util.StreamWriterDelegate", "mDelegate", mDelegate);
        setField(toXmlGenerator, "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_xmlWriter", _xmlWriter);
        toXmlGenerator._formatFeatures = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName] produces [java.lang.NullPointerException]
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            org.codehaus.stax2.util.StreamWriterDelegate.writeStartDocument(StreamWriterDelegate.java:209)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.initGenerator(ToXmlGenerator.java:197)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:229) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    ///endregion
    
    ///region Errors report for _initWithRootName
    
    public void test_initWithRootName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._asXmlGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _asXmlGenerator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_asXmlGenerator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (!(gen instanceof ToXmlGenerator)): True}
 * @utbot.executesCondition {@code (!(gen instanceof TokenBuffer)): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_asXmlGenerator_GenNotInstanceOfTokenBuffer() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        ToXmlGenerator actual = xmlSerializerProvider._asXmlGenerator(tokenBuffer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_asXmlGenerator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (!(gen instanceof ToXmlGenerator)): False}
 * @utbot.returnsFrom {@code return (ToXmlGenerator) gen;}
 *  */
    @Test
    public void test_asXmlGenerator_GenNotInstanceOfToXmlGenerator() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        
        ToXmlGenerator actual = xmlSerializerProvider._asXmlGenerator(toXmlGenerator);
        
        XMLStreamWriter2 actual_xmlWriter = actual._xmlWriter;
        assertNull(actual_xmlWriter);
        
        XMLStreamWriter actual_originalXmlWriter = actual._originalXmlWriter;
        assertNull(actual_originalXmlWriter);
        
        boolean actual_stax2Emulation = actual._stax2Emulation;
        assertFalse(actual_stax2Emulation);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        int toXmlGenerator_formatFeatures = toXmlGenerator._formatFeatures;
        int actual_formatFeatures = actual._formatFeatures;
        assertEquals(toXmlGenerator_formatFeatures, actual_formatFeatures);
        
        XmlPrettyPrinter actual_xmlPrettyPrinter = actual._xmlPrettyPrinter;
        assertNull(actual_xmlPrettyPrinter);
        
        boolean actual_initialized = actual._initialized;
        assertFalse(actual_initialized);
        
        QName actual_nextName = actual._nextName;
        assertNull(actual_nextName);
        
        boolean actual_nextIsAttribute = actual._nextIsAttribute;
        assertFalse(actual_nextIsAttribute);
        
        boolean actual_nextIsUnwrapped = actual._nextIsUnwrapped;
        assertFalse(actual_nextIsUnwrapped);
        
        boolean actual_nextIsCData = actual._nextIsCData;
        assertFalse(actual_nextIsCData);
        
        LinkedList actual_elementNameStack = actual._elementNameStack;
        assertNull(actual_elementNameStack);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        int toXmlGenerator_features = ((Integer) getFieldValue(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        assertEquals(toXmlGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        assertNull(actual_writeContext);
        
        boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void test_serializeXmlNull_2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        NullSerializer _nullValueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        JsonGenerator initialXmlSerializerProvider_generator = ((JsonGenerator) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
        
        xmlSerializerProvider._serializeXmlNull(writerBasedJsonGenerator);
        
        JsonGenerator finalXmlSerializerProvider_generator = ((JsonGenerator) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 11));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 12));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer13 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 13));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer14 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 14));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialXmlSerializerProvider_generator == finalXmlSerializerProvider_generator);
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer13);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer14);
        
        assertEquals(15, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void test_serializeXmlNull_1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        NullSerializer _nullValueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        JsonGenerator initialXmlSerializerProvider_generator = ((JsonGenerator) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
        
        xmlSerializerProvider._serializeXmlNull(writerBasedJsonGenerator);
        
        JsonGenerator finalXmlSerializerProvider_generator = ((JsonGenerator) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 7));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer8 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 8));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 9));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 10));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialXmlSerializerProvider_generator == finalXmlSerializerProvider_generator);
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals(11, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void test_serializeXmlNull() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        NullSerializer _nullValueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        JsonGenerator initialXmlSerializerProvider_generator = ((JsonGenerator) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
        
        xmlSerializerProvider._serializeXmlNull(writerBasedJsonGenerator);
        
        JsonGenerator finalXmlSerializerProvider_generator = ((JsonGenerator) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 11));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 12));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer13 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 13));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer14 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 14));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialXmlSerializerProvider_generator == finalXmlSerializerProvider_generator);
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer13);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer14);
        
        assertEquals(15, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (jgen instanceof ToXmlGenerator): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} 
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_serializeXmlNull_ThrowJsonMappingException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        NullSerializer _nullValueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._serializeXmlNull(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void test_serializeXmlNull1() throws IOException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        ObjectMapper objectMapper = new ObjectMapper(((JsonFactory) null));
        TokenBuffer tokenBuffer = new TokenBuffer(objectMapper);
        
        xmlSerializerProvider._serializeXmlNull(tokenBuffer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator#writeStartObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: xgen.writeStartObject();
 *  */
    @Test
    public void test_startRootArray_ThrowNullPointerException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: xgen.writeStartObject();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray_ThrowIllegalStateException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: xgen.writeStartObject();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray_ThrowIllegalStateException_3() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: xgen.writeStartObject();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray_ThrowIllegalStateException_2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$NopIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: xgen.writeStartObject();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray_ThrowIllegalStateException_1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    @Test
    public void test_startRootArray1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MAX_VALUE);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray3() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray4() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter.writeStartObject(DefaultXmlPrettyPrinter.java:185)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray5() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter.writeIndentation(DefaultXmlPrettyPrinter.java:520)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter.writeStartObject(DefaultXmlPrettyPrinter.java:187)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray6() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter.writeIndentation(DefaultXmlPrettyPrinter.java:520)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter.writeStartObject(DefaultXmlPrettyPrinter.java:187)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray7() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray8() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray9() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray10() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter.writeIndentation(DefaultXmlPrettyPrinter.java:520)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter.writeStartObject(DefaultXmlPrettyPrinter.java:187)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray11() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray12() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:702)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:258)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray13() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter.writeIndentation(DefaultXmlPrettyPrinter.java:520)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter.writeStartObject(DefaultXmlPrettyPrinter.java:187)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test
    public void test_startRootArray14() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeRaw(ToXmlGenerator.java:665)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter.writeIndentation(DefaultXmlPrettyPrinter.java:520)
            com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter.writeStartObject(DefaultXmlPrettyPrinter.java:187)
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.writeStartObject(ToXmlGenerator.java:487)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:212) */
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray15() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$NopIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray16() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$NopIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray17() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -131);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray18() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$NopIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray19() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$NopIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray20() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray21() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", -2147483647);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray22() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray23() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray24() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_nesting", -2147483647);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray25() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray26() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$NopIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator, javax.xml.namespace.QName)
    
    @Test(expected = JsonGenerationException.class)
    public void test_startRootArray27() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    ///endregion
    
    ///region Errors report for _startRootArray
    
    public void test_startRootArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _rootNameFromConfig()
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_rootNameFromConfig()}
 * @utbot.executesCondition {@code (name == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_rootNameFromConfig_NameEqualsNull() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        QName actual = xmlSerializerProvider._rootNameFromConfig();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_rootNameFromConfig()}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (ns == null): False}
 * @utbot.executesCondition {@code (ns.isEmpty()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#getSimpleName()}
 * @utbot.returnsFrom {@code return new QName(ns, name.getSimpleName());}
 *  */
    @Test
    public void test_rootNameFromConfig_NotNsIsEmpty() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _simpleName);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        QName actual = xmlSerializerProvider._rootNameFromConfig();
        
        QName expected = ((QName) createInstance("javax.xml.namespace.QName"));
        
        // javax.xml.namespace.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_rootNameFromConfig()}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (ns == null): False}
 * @utbot.executesCondition {@code (ns.isEmpty()): True}
 * @utbot.returnsFrom {@code return new QName(name.getSimpleName());}
 *  */
    @Test
    public void test_rootNameFromConfig_NsIsEmpty() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _simpleName);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        QName actual = xmlSerializerProvider._rootNameFromConfig();
        
        QName expected = ((QName) createInstance("javax.xml.namespace.QName"));
        
        // javax.xml.namespace.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_rootNameFromConfig()}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (ns == null): True}
 * @utbot.returnsFrom {@code return new QName(name.getSimpleName());}
 *  */
    @Test
    public void test_rootNameFromConfig_NsEqualsNull() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        QName actual = xmlSerializerProvider._rootNameFromConfig();
        
        QName expected = ((QName) createInstance("javax.xml.namespace.QName"));
        
        // javax.xml.namespace.QName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _rootNameFromConfig()
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_rootNameFromConfig()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getFullRootName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyName name = _config.getFullRootName();
 *  */
    @Test
    public void test_rootNameFromConfig_ThrowNullPointerException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:246) */
        xmlSerializerProvider._rootNameFromConfig();
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields878693289008700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878693289008700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878693289017100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878693289008700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878693289017100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields878693291882300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878693291882300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878693291884700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878693291882300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878693291884700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields878693292431500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields878693292431500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass878693292432400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878693292431500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878693292432400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields878693292743100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878693292743100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878693292745000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878693292743100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878693292745000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

