package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.util.TypeKey;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.ShortArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.io.IOException;
import javax.xml.namespace.QName;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import org.codehaus.stax2.ri.Stax2WriterAdapter;
import org.codehaus.stax2.util.StreamWriterDelegate;
import org.codehaus.stax2.XMLStreamWriter2;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter;
import java.util.LinkedList;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;
import java.util.jar.JarException;
import java.util.List;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_dataformat_xml_ser_XmlSerializerProviderTest {
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#copy()}
 * @utbot.returnsFrom {@code return new XmlSerializerProvider(this);}
 *  */
    @Test
    public void testCopy_Return() throws Exception  {
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
            
            XmlSerializerProvider actual = ((XmlSerializerProvider) xmlSerializerProvider.copy());
            
            XmlSerializerProvider expected = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            HashMap _sharedMap = new HashMap();
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            
            XmlRootNameLookup actual_rootNameLookup = actual._rootNameLookup;
            assertNull(actual_rootNameLookup);
            
            Map actual_seenObjectIds = ((Map) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_seenObjectIds"));
            assertNull(actual_seenObjectIds);
            
            ArrayList actual_objectIdGenerators = ((ArrayList) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_objectIdGenerators"));
            assertNull(actual_objectIdGenerators);
            
            JsonGenerator actual_generator = ((JsonGenerator) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator"));
            assertNull(actual_generator);
            
            SerializationConfig actual_config = ((SerializationConfig) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_config"));
            assertNull(actual_config);
            
            Class actual_serializationView = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
            assertNull(actual_serializationView);
            
            SerializerFactory actual_serializerFactory = ((SerializerFactory) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            assertNull(actual_serializerFactory);
            
            SerializerCache expected_serializerCache = ((SerializerCache) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            SerializerCache actual_serializerCache = ((SerializerCache) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            HashMap expected_serializerCache_sharedMap = ((HashMap) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            HashMap actual_serializerCache_sharedMap = ((HashMap) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            assertTrue(deepEquals(expected_serializerCache_sharedMap, actual_serializerCache_sharedMap));
            
            AtomicReference expected_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            AtomicReference actual_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            
            ContextAttributes actual_attributes = ((ContextAttributes) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes"));
            assertNull(actual_attributes);
            
            JsonSerializer actual_unknownTypeSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            assertNull(actual_unknownTypeSerializer);
            
            JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            assertNull(actual_keySerializer);
            
            JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            assertNull(actual_nullValueSerializer);
            
            JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            assertNull(actual_nullKeySerializer);
            
            ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            assertNull(actual_knownSerializers);
            
            DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
            assertNull(actual_dateFormat);
            
            boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
            assertFalse(actual_stdNullValueSerializer);
            
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
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
            String string = "";
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
            FailingSerializer _nullValueSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg", string);
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
            NullSerializer _nullKeySerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view", class1);
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            
            JsonSerializer xmlSerializerProvider_nullValueSerializer = ((JsonSerializer) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            Class initialXmlSerializerProvider_nullValueSerializer_handledType = ((Class) getFieldValue(xmlSerializerProvider_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            
            Class initialSerializationConfig_view = ((Class) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            
            XmlSerializerProvider actual = ((XmlSerializerProvider) xmlSerializerProvider.createInstance(serializationConfig, null));
            
            XmlSerializerProvider expected = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            setField(expected, "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameLookup", _rootNameLookup);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_config", serializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", class1);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes", _attributes);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
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
            
            JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            assertNull(actual_keySerializer);
            
            JsonSerializer expected_nullValueSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            String expected_nullValueSerializer_msg = ((String) getFieldValue(expected_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
            String actual_nullValueSerializer_msg = ((String) getFieldValue(actual_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
            assertEquals(expected_nullValueSerializer_msg, actual_nullValueSerializer_msg);
            
            Class expected_nullValueSerializer_handledType = ((Class) getFieldValue(expected_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_nullValueSerializer_handledType = ((Class) getFieldValue(actual_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_nullValueSerializer_handledType.getClass());
            
            JsonSerializer expected_nullKeySerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            Class actual_nullKeySerializer_handledType = ((Class) getFieldValue(actual_nullKeySerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertNull(actual_nullKeySerializer_handledType);
            
            ReadOnlyClassToSerializerMap expected_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            
            DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
            assertNull(actual_dateFormat);
            
            boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
            assertFalse(actual_stdNullValueSerializer);
            
            JsonSerializer xmlSerializerProvider_nullValueSerializer1 = ((JsonSerializer) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            Class finalXmlSerializerProvider_nullValueSerializer_handledType = ((Class) getFieldValue(xmlSerializerProvider_nullValueSerializer1, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            
            Class finalSerializationConfig_view = ((Class) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            
            assertFalse(initialXmlSerializerProvider_nullValueSerializer_handledType == finalXmlSerializerProvider_nullValueSerializer_handledType);
            
            assertFalse(initialSerializationConfig_view == finalSerializationConfig_view);
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
            TypeWrappedSerializer _nullKeySerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            
            /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
                com.fasterxml.jackson.databind.ser.SerializerCache.getReadOnlyLookupMap(SerializerCache.java:50)
                com.fasterxml.jackson.databind.SerializerProvider.<init>(SerializerProvider.java:233)
                com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.<init>(DefaultSerializerProvider.java:70)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.<init>(XmlSerializerProvider.java:48)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance(XmlSerializerProvider.java:76) */
            xmlSerializerProvider.createInstance(serializationConfig, null);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createInstance(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.SerializerFactory)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#createInstance(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory)}
     */
    @Test
    public void testCreateInstanceThrowsNPE() {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.<init>(SerializerProvider.java:227)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.<init>(DefaultSerializerProvider.java:70)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.<init>(XmlSerializerProvider.java:48)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance(XmlSerializerProvider.java:76) */
        xmlSerializerProvider.createInstance(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createInstance(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.SerializerFactory)
    
    @Test
    public void testCreateInstance1() throws Exception  {
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
            HashMap _sharedMap = new HashMap();
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            ByteArraySerializer _unknownTypeSerializer = ((ByteArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.ByteArraySerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            NullSerializer _nullKeySerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            SerializerCache xmlSerializerProvider_serializerCache = ((SerializerCache) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            AtomicReference xmlSerializerProvider_serializerCache_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(xmlSerializerProvider_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object initialXmlSerializerProvider_serializerCache_readOnlyMapValue = getFieldValue(xmlSerializerProvider_serializerCache_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            
            XmlSerializerProvider actual = ((XmlSerializerProvider) xmlSerializerProvider.createInstance(serializationConfig, beanSerializerFactory));
            
            XmlSerializerProvider expected = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_config", serializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", beanSerializerFactory);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes", _attributes);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 8);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_size", 8);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 7);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            XmlRootNameLookup actual_rootNameLookup = actual._rootNameLookup;
            assertNull(actual_rootNameLookup);
            
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
            
            SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            assertNull(actual_config_mixIns);
            
            SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
            assertNull(actual_config_subtypeResolver);
            
            PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
            assertNull(actual_config_rootName);
            
            Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            assertNull(actual_config_view);
            
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
            
            Class actual_serializationView = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
            assertNull(actual_serializationView);
            
            SerializerFactory expected_serializerFactory = ((SerializerFactory) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            SerializerFactory actual_serializerFactory = ((SerializerFactory) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            SerializerFactoryConfig actual_serializerFactory_factoryConfig = ((SerializerFactoryConfig) getFieldValue(actual_serializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig"));
            assertNull(actual_serializerFactory_factoryConfig);
            
            SerializerCache expected_serializerCache = ((SerializerCache) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            SerializerCache actual_serializerCache = ((SerializerCache) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            HashMap expected_serializerCache_sharedMap = ((HashMap) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            HashMap actual_serializerCache_sharedMap = ((HashMap) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            assertTrue(deepEquals(expected_serializerCache_sharedMap, actual_serializerCache_sharedMap));
            
            AtomicReference expected_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            AtomicReference actual_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object expected_serializerCache_readOnlyMapValue = getFieldValue(expected_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object actual_serializerCache_readOnlyMapValue = getFieldValue(actual_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object expected_serializerCache_readOnlyMapValue_buckets = getFieldValue(expected_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            Object actual_serializerCache_readOnlyMapValue_buckets = getFieldValue(actual_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            int expected_serializerCache_readOnlyMapValue_bucketsSize = getArrayLength(expected_serializerCache_readOnlyMapValue_buckets);
            assertEquals(expected_serializerCache_readOnlyMapValue_bucketsSize, getArrayLength(actual_serializerCache_readOnlyMapValue_buckets));
            assertTrue(deepEquals(expected_serializerCache_readOnlyMapValue_buckets, actual_serializerCache_readOnlyMapValue_buckets));
            
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
            
            JsonSerializer expected_unknownTypeSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            JsonSerializer actual_unknownTypeSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            Class actual_unknownTypeSerializer_handledType = ((Class) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertNull(actual_unknownTypeSerializer_handledType);
            
            JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            assertNull(actual_keySerializer);
            
            JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            assertNull(actual_nullValueSerializer);
            
            JsonSerializer expected_nullKeySerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            assertTrue(deepEquals(expected_nullKeySerializer, actual_nullKeySerializer));
            
            ReadOnlyClassToSerializerMap expected_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            
            DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
            assertNull(actual_dateFormat);
            
            boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
            assertFalse(actual_stdNullValueSerializer);
            
            SerializerCache xmlSerializerProvider_serializerCache1 = ((SerializerCache) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            AtomicReference xmlSerializerProvider_serializerCache1_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(xmlSerializerProvider_serializerCache1, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object finalXmlSerializerProvider_serializerCache_readOnlyMapValue = getFieldValue(xmlSerializerProvider_serializerCache1_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            
            assertFalse(initialXmlSerializerProvider_serializerCache_readOnlyMapValue == finalXmlSerializerProvider_serializerCache_readOnlyMapValue);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    
    @Test
    public void testCreateInstance2() throws Exception  {
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
            HashMap _sharedMap = new HashMap();
            TypeKey typeKey = ((TypeKey) createInstance("com.fasterxml.jackson.databind.util.TypeKey"));
            StdArraySerializers.ShortArraySerializer shortArraySerializer = ((StdArraySerializers.ShortArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
            _sharedMap.put(typeKey, shortArraySerializer);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            IndexedStringListSerializer _unknownTypeSerializer = ((IndexedStringListSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            StdKeySerializers.StringKeySerializer _nullKeySerializer = ((StdKeySerializers.StringKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view", class1);
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            SerializerCache xmlSerializerProvider_serializerCache = ((SerializerCache) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            AtomicReference xmlSerializerProvider_serializerCache_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(xmlSerializerProvider_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object initialXmlSerializerProvider_serializerCache_readOnlyMapValue = getFieldValue(xmlSerializerProvider_serializerCache_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            
            Class initialSerializationConfig_view = ((Class) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            
            XmlSerializerProvider actual = ((XmlSerializerProvider) xmlSerializerProvider.createInstance(serializationConfig, beanSerializerFactory));
            
            XmlSerializerProvider expected = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_config", serializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", class1);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", beanSerializerFactory);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes", _attributes);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 8);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", shortArraySerializer);
            _buckets[0] = bucket;
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_size", 8);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 7);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            XmlRootNameLookup actual_rootNameLookup = actual._rootNameLookup;
            assertNull(actual_rootNameLookup);
            
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
            
            SerializerFactory expected_serializerFactory = ((SerializerFactory) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            SerializerFactory actual_serializerFactory = ((SerializerFactory) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            SerializerFactoryConfig actual_serializerFactory_factoryConfig = ((SerializerFactoryConfig) getFieldValue(actual_serializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig"));
            assertNull(actual_serializerFactory_factoryConfig);
            
            SerializerCache expected_serializerCache = ((SerializerCache) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            SerializerCache actual_serializerCache = ((SerializerCache) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            HashMap expected_serializerCache_sharedMap = ((HashMap) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            HashMap actual_serializerCache_sharedMap = ((HashMap) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            assertTrue(deepEquals(expected_serializerCache_sharedMap, actual_serializerCache_sharedMap));
            
            AtomicReference expected_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            AtomicReference actual_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object expected_serializerCache_readOnlyMapValue = getFieldValue(expected_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object actual_serializerCache_readOnlyMapValue = getFieldValue(actual_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object expected_serializerCache_readOnlyMapValue_buckets = getFieldValue(expected_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            Object actual_serializerCache_readOnlyMapValue_buckets = getFieldValue(actual_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            int expected_serializerCache_readOnlyMapValue_bucketsSize = getArrayLength(expected_serializerCache_readOnlyMapValue_buckets);
            assertEquals(expected_serializerCache_readOnlyMapValue_bucketsSize, getArrayLength(actual_serializerCache_readOnlyMapValue_buckets));
            assertTrue(deepEquals(expected_serializerCache_readOnlyMapValue_buckets, actual_serializerCache_readOnlyMapValue_buckets));
            
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
            
            JsonSerializer expected_unknownTypeSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            JsonSerializer actual_unknownTypeSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            Boolean actual_unknownTypeSerializer_unwrapSingle = ((Boolean) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase", "_unwrapSingle"));
            assertNull(actual_unknownTypeSerializer_unwrapSingle);
            
            Class actual_unknownTypeSerializer_handledType = ((Class) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertNull(actual_unknownTypeSerializer_handledType);
            
            JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            assertNull(actual_keySerializer);
            
            JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            assertNull(actual_nullValueSerializer);
            
            JsonSerializer expected_nullKeySerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            assertTrue(deepEquals(expected_nullKeySerializer, actual_nullKeySerializer));
            
            ReadOnlyClassToSerializerMap expected_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            
            DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
            assertNull(actual_dateFormat);
            
            boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
            assertFalse(actual_stdNullValueSerializer);
            
            SerializerCache xmlSerializerProvider_serializerCache1 = ((SerializerCache) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            AtomicReference xmlSerializerProvider_serializerCache1_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(xmlSerializerProvider_serializerCache1, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object finalXmlSerializerProvider_serializerCache_readOnlyMapValue = getFieldValue(xmlSerializerProvider_serializerCache1_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            
            Class finalSerializationConfig_view = ((Class) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            
            assertFalse(initialXmlSerializerProvider_serializerCache_readOnlyMapValue == finalXmlSerializerProvider_serializerCache_readOnlyMapValue);
            
            assertFalse(initialSerializationConfig_view == finalSerializationConfig_view);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    
    @Test
    public void testCreateInstance3() throws Exception  {
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
            String string = "";
            FailingSerializer defaultNullKeySerializer = new FailingSerializer(string);
            setStaticField(serializerProviderClazz, "DEFAULT_NULL_KEY_SERIALIZER", defaultNullKeySerializer);
            XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            HashMap _sharedMap = new HashMap();
            TypeKey typeKey = ((TypeKey) createInstance("com.fasterxml.jackson.databind.util.TypeKey"));
            UnknownSerializer unknownSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
            _sharedMap.put(typeKey, unknownSerializer);
            TypeKey typeKey1 = ((TypeKey) createInstance("com.fasterxml.jackson.databind.util.TypeKey"));
            setField(typeKey1, "com.fasterxml.jackson.databind.util.TypeKey", "_isTyped", true);
            _sharedMap.put(typeKey1, unknownSerializer);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            BeanAsArraySerializer _unknownTypeSerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            FailingSerializer _nullValueSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg", string);
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
            TypeWrappedSerializer _nullKeySerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            SerializerCache xmlSerializerProvider_serializerCache = ((SerializerCache) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            AtomicReference xmlSerializerProvider_serializerCache_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(xmlSerializerProvider_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object initialXmlSerializerProvider_serializerCache_readOnlyMapValue = getFieldValue(xmlSerializerProvider_serializerCache_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            JsonSerializer xmlSerializerProvider_nullValueSerializer = ((JsonSerializer) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            Class initialXmlSerializerProvider_nullValueSerializer_handledType = ((Class) getFieldValue(xmlSerializerProvider_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            
            XmlSerializerProvider actual = ((XmlSerializerProvider) xmlSerializerProvider.createInstance(serializationConfig, beanSerializerFactory));
            
            XmlSerializerProvider expected = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_config", serializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", beanSerializerFactory);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes", _attributes);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 8);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", unknownSerializer);
            Object next = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
            setField(next, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", unknownSerializer);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "next", next);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_isTyped", true);
            _buckets[0] = bucket;
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_size", 8);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 7);
            setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            XmlRootNameLookup actual_rootNameLookup = actual._rootNameLookup;
            assertNull(actual_rootNameLookup);
            
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
            
            SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            assertNull(actual_config_mixIns);
            
            SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
            assertNull(actual_config_subtypeResolver);
            
            PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
            assertNull(actual_config_rootName);
            
            Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            assertNull(actual_config_view);
            
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
            
            Class actual_serializationView = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
            assertNull(actual_serializationView);
            
            SerializerFactory expected_serializerFactory = ((SerializerFactory) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            SerializerFactory actual_serializerFactory = ((SerializerFactory) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
            SerializerFactoryConfig actual_serializerFactory_factoryConfig = ((SerializerFactoryConfig) getFieldValue(actual_serializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig"));
            assertNull(actual_serializerFactory_factoryConfig);
            
            SerializerCache expected_serializerCache = ((SerializerCache) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            SerializerCache actual_serializerCache = ((SerializerCache) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            HashMap expected_serializerCache_sharedMap = ((HashMap) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            HashMap actual_serializerCache_sharedMap = ((HashMap) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
            assertTrue(deepEquals(expected_serializerCache_sharedMap, actual_serializerCache_sharedMap));
            
            AtomicReference expected_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            AtomicReference actual_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object expected_serializerCache_readOnlyMapValue = getFieldValue(expected_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object actual_serializerCache_readOnlyMapValue = getFieldValue(actual_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            Object expected_serializerCache_readOnlyMapValue_buckets = getFieldValue(expected_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            Object actual_serializerCache_readOnlyMapValue_buckets = getFieldValue(actual_serializerCache_readOnlyMapValue, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
            int expected_serializerCache_readOnlyMapValue_bucketsSize = getArrayLength(expected_serializerCache_readOnlyMapValue_buckets);
            assertEquals(expected_serializerCache_readOnlyMapValue_bucketsSize, getArrayLength(actual_serializerCache_readOnlyMapValue_buckets));
            assertTrue(deepEquals(expected_serializerCache_readOnlyMapValue_buckets, actual_serializerCache_readOnlyMapValue_buckets));
            
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
            
            JsonSerializer expected_unknownTypeSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            JsonSerializer actual_unknownTypeSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
            BeanSerializerBase actual_unknownTypeSerializer_defaultSerializer = ((BeanSerializerBase) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer"));
            assertNull(actual_unknownTypeSerializer_defaultSerializer);
            
            JavaType actual_unknownTypeSerializer_beanType = ((JavaType) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_beanType"));
            assertNull(actual_unknownTypeSerializer_beanType);
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_unknownTypeSerializer_props = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props"));
            assertNull(actual_unknownTypeSerializer_props);
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_unknownTypeSerializer_filteredProps = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps"));
            assertNull(actual_unknownTypeSerializer_filteredProps);
            
            AnyGetterWriter actual_unknownTypeSerializer_anyGetterWriter = ((AnyGetterWriter) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter"));
            assertNull(actual_unknownTypeSerializer_anyGetterWriter);
            
            Object actual_unknownTypeSerializer_propertyFilterId = getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId");
            assertNull(actual_unknownTypeSerializer_propertyFilterId);
            
            AnnotatedMember actual_unknownTypeSerializer_typeId = ((AnnotatedMember) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_typeId"));
            assertNull(actual_unknownTypeSerializer_typeId);
            
            ObjectIdWriter actual_unknownTypeSerializer_objectIdWriter = ((ObjectIdWriter) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter"));
            assertNull(actual_unknownTypeSerializer_objectIdWriter);
            
            JsonFormat.Shape actual_unknownTypeSerializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape"));
            assertNull(actual_unknownTypeSerializer_serializationShape);
            
            Class actual_unknownTypeSerializer_handledType = ((Class) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertNull(actual_unknownTypeSerializer_handledType);
            
            JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
            assertNull(actual_keySerializer);
            
            JsonSerializer expected_nullValueSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            String expected_nullValueSerializer_msg = ((String) getFieldValue(expected_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
            String actual_nullValueSerializer_msg = ((String) getFieldValue(actual_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
            assertEquals(expected_nullValueSerializer_msg, actual_nullValueSerializer_msg);
            
            Class expected_nullValueSerializer_handledType = ((Class) getFieldValue(expected_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_nullValueSerializer_handledType = ((Class) getFieldValue(actual_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_nullValueSerializer_handledType.getClass());
            
            JsonSerializer expected_nullKeySerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
            TypeSerializer actual_nullKeySerializer_typeSerializer = ((TypeSerializer) getFieldValue(actual_nullKeySerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer"));
            assertNull(actual_nullKeySerializer_typeSerializer);
            
            JsonSerializer actual_nullKeySerializer_serializer = ((JsonSerializer) getFieldValue(actual_nullKeySerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer"));
            assertNull(actual_nullKeySerializer_serializer);
            
            ReadOnlyClassToSerializerMap expected_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            assertTrue(deepEquals(expected_knownSerializers, actual_knownSerializers));
            
            DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
            assertNull(actual_dateFormat);
            
            boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
            assertFalse(actual_stdNullValueSerializer);
            
            SerializerCache xmlSerializerProvider_serializerCache1 = ((SerializerCache) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
            AtomicReference xmlSerializerProvider_serializerCache1_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(xmlSerializerProvider_serializerCache1, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
            Object finalXmlSerializerProvider_serializerCache_readOnlyMapValue = getFieldValue(xmlSerializerProvider_serializerCache1_serializerCache_readOnlyMap, "java.util.concurrent.atomic.AtomicReference", "value");
            JsonSerializer xmlSerializerProvider_nullValueSerializer1 = ((JsonSerializer) getFieldValue(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
            Class finalXmlSerializerProvider_nullValueSerializer_handledType = ((Class) getFieldValue(xmlSerializerProvider_nullValueSerializer1, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            
            assertFalse(initialXmlSerializerProvider_serializerCache_readOnlyMapValue == finalXmlSerializerProvider_serializerCache_readOnlyMapValue);
            
            assertFalse(initialXmlSerializerProvider_nullValueSerializer_handledType == finalXmlSerializerProvider_nullValueSerializer_handledType);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createInstance(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.SerializerFactory)
    
    @Test
    public void testCreateInstance4() throws Exception  {
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
            String string = "";
            FailingSerializer defaultNullKeySerializer = new FailingSerializer(string);
            setStaticField(serializerProviderClazz, "DEFAULT_NULL_KEY_SERIALIZER", defaultNullKeySerializer);
            XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            HashMap _sharedMap = new HashMap();
            TypeKey typeKey = ((TypeKey) createInstance("com.fasterxml.jackson.databind.util.TypeKey"));
            MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(typeKey, "com.fasterxml.jackson.databind.util.TypeKey", "_type", _type);
            _sharedMap.put(typeKey, null);
            TypeKey typeKey1 = ((TypeKey) createInstance("com.fasterxml.jackson.databind.util.TypeKey"));
            CollectionType _type1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(typeKey1, "com.fasterxml.jackson.databind.util.TypeKey", "_type", _type1);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            _sharedMap.put(typeKey1, serializationConfig);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            FailingSerializer _nullValueSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg", string);
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
            IndexedStringListSerializer _nullKeySerializer = ((IndexedStringListSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.SerializationConfig cannot be cast to class com.fasterxml.jackson.databind.JsonSerializer (com.fasterxml.jackson.databind.SerializationConfig and com.fasterxml.jackson.databind.JsonSerializer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.<init>(ReadOnlyClassToSerializerMap.java:35)
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.from(ReadOnlyClassToSerializerMap.java:55)
                com.fasterxml.jackson.databind.ser.SerializerCache._makeReadOnlyLookupMap(SerializerCache.java:62)
                com.fasterxml.jackson.databind.ser.SerializerCache.getReadOnlyLookupMap(SerializerCache.java:54)
                com.fasterxml.jackson.databind.SerializerProvider.<init>(SerializerProvider.java:233)
                com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.<init>(DefaultSerializerProvider.java:70)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.<init>(XmlSerializerProvider.java:48)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance(XmlSerializerProvider.java:76) */
            xmlSerializerProvider.createInstance(serializationConfig, beanSerializerFactory);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    
    @Test
    public void testCreateInstance5() throws Exception  {
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
            HashMap _sharedMap = new HashMap();
            StdArraySerializers.ShortArraySerializer shortArraySerializer = ((StdArraySerializers.ShortArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
            _sharedMap.put(null, shortArraySerializer);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            IndexedStringListSerializer _keySerializer = ((IndexedStringListSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer", _keySerializer);
            StdKeySerializers.StringKeySerializer _nullKeySerializer = ((StdKeySerializers.StringKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.<init>(ReadOnlyClassToSerializerMap.java:34)
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.from(ReadOnlyClassToSerializerMap.java:55)
                com.fasterxml.jackson.databind.ser.SerializerCache._makeReadOnlyLookupMap(SerializerCache.java:62)
                com.fasterxml.jackson.databind.ser.SerializerCache.getReadOnlyLookupMap(SerializerCache.java:54)
                com.fasterxml.jackson.databind.SerializerProvider.<init>(SerializerProvider.java:233)
                com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.<init>(DefaultSerializerProvider.java:70)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.<init>(XmlSerializerProvider.java:48)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance(XmlSerializerProvider.java:76) */
            xmlSerializerProvider.createInstance(serializationConfig, beanSerializerFactory);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    
    @Test
    public void testCreateInstance6() throws Exception  {
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
            String string = "";
            FailingSerializer defaultNullKeySerializer = new FailingSerializer(string);
            setStaticField(serializerProviderClazz, "DEFAULT_NULL_KEY_SERIALIZER", defaultNullKeySerializer);
            XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            HashMap _sharedMap = new HashMap();
            TypeKey typeKey = ((TypeKey) createInstance("com.fasterxml.jackson.databind.util.TypeKey"));
            StdArraySerializers.ShortArraySerializer shortArraySerializer = ((StdArraySerializers.ShortArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
            _sharedMap.put(typeKey, shortArraySerializer);
            _sharedMap.put(null, shortArraySerializer);
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
            AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
            setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            TypeWrappedSerializer _unknownTypeSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
            FailingSerializer _nullValueSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg", string);
            setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", class1);
            setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ContextAttributes.Impl _attributes = ((ContextAttributes.Impl) createInstance("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes", _attributes);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.<init>(ReadOnlyClassToSerializerMap.java:34)
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.from(ReadOnlyClassToSerializerMap.java:55)
                com.fasterxml.jackson.databind.ser.SerializerCache._makeReadOnlyLookupMap(SerializerCache.java:62)
                com.fasterxml.jackson.databind.ser.SerializerCache.getReadOnlyLookupMap(SerializerCache.java:54)
                com.fasterxml.jackson.databind.SerializerProvider.<init>(SerializerProvider.java:233)
                com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.<init>(DefaultSerializerProvider.java:70)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.<init>(XmlSerializerProvider.java:48)
                com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.createInstance(XmlSerializerProvider.java:76) */
            xmlSerializerProvider.createInstance(serializationConfig, beanSerializerFactory);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_UNKNOWN_SERIALIZER", prevDEFAULT_UNKNOWN_SERIALIZER);
            setStaticField(NullSerializer.class, "instance", prevInstance);
            setStaticField(com.fasterxml.jackson.databind.SerializerProvider.class, "DEFAULT_NULL_KEY_SERIALIZER", prevDEFAULT_NULL_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (xgen == null): True}
 * @utbot.executesCondition {@code (ser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#findTypedValueSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ser = findTypedValueSerializer(rootType, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 0);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", -2);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        int[] intArray = {};
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_hash", -79);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -82 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.typedValueSerializer(ReadOnlyClassToSerializerMap.java:68)
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:747)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:144) */
        xmlSerializerProvider.serializeValue(tokenBuffer, intArray, arrayType, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): False}
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:133) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): False}
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
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:133) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, intArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "\u0000";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:129)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:216)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:133) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _serializeXmlNull(gen);
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_3() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "\u0000";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:129)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:216)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:125) */
        xmlSerializerProvider.serializeValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (xgen == null): False}
 * @utbot.executesCondition {@code (rootName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup#findRootName(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.cfg.MapperConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rootName = _rootNameLookup.findRootName(rootType, _config);
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:135) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test
    public void testSerializeValueByFuzzer() throws IOException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:208)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:125) */
        xmlSerializerProvider.serializeValue(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#findTypedValueSerializer(java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final JsonSerializer<Object> ser = findTypedValueSerializer(cls, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
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
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:702)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:105) */
        xmlSerializerProvider.serializeValue(tokenBuffer, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:93) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_11() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "\u0000";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:129)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:216)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:93) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_21() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:84) */
        xmlSerializerProvider.serializeValue(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testSerializeValue_ThrowIllegalArgumentException_31() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:84) */
        xmlSerializerProvider.serializeValue(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (rootName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup#findRootName(java.lang.Class,com.fasterxml.jackson.databind.cfg.MapperConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rootName = _rootNameLookup.findRootName(cls, _config);
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:95) */
        xmlSerializerProvider.serializeValue(toXmlGenerator, byteArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
     */
    @Test
    public void testSerializeValueThrowsNPE() throws IOException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:208)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider.serializeValue(XmlSerializerProvider.java:84) */
        xmlSerializerProvider.serializeValue(null, null);
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:185) */
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:192) */
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:192) */
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:192) */
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:192) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    @Test
    public void test_initWithRootName2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Stax2WriterAdapter _xmlWriter = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        StreamWriterDelegate mDelegate = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:191) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    @Test
    public void test_initWithRootName3() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Stax2WriterAdapter _xmlWriter = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        Stax2WriterAdapter mDelegate = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        StreamWriterDelegate mDelegate1 = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:191) */
        xmlSerializerProvider._initWithRootName(toXmlGenerator, null);
    }
    
    @Test
    public void test_initWithRootName4() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Stax2WriterAdapter _xmlWriter = ((Stax2WriterAdapter) createInstance("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        StreamWriterDelegate mDelegate = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
        StreamWriterDelegate mDelegate1 = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
        StreamWriterDelegate mDelegate2 = ((StreamWriterDelegate) createInstance("org.codehaus.stax2.util.StreamWriterDelegate"));
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._initWithRootName(XmlSerializerProvider.java:191) */
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
    
    ///region FUZZER: ERROR SUITE for method _asXmlGenerator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_asXmlGenerator(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void test_asXmlGeneratorThrowsNPE() throws JsonMappingException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._asXmlGenerator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._asXmlGenerator(XmlSerializerProvider.java:227) */
        xmlSerializerProvider._asXmlGenerator(null);
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
    public void test_serializeXmlNull() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        NullSerializer _nullValueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
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
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void test_serializeXmlNull_1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void test_serializeXmlNull_ThrowIllegalArgumentException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "\u0000";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:129)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:216)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162) */
        xmlSerializerProvider._serializeXmlNull(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void test_serializeXmlNull_ThrowIllegalArgumentException_1() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162) */
        xmlSerializerProvider._serializeXmlNull(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: QName rootName = _rootNameFromConfig();
 *  */
    @Test
    public void test_serializeXmlNull_ThrowIllegalArgumentException_2() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(xmlSerializerProvider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull] produces [java.lang.IllegalArgumentException: local part cannot be "null" when creating a QName]
            java.xml/javax.xml.namespace.QName.<init>(QName.java:185)
            java.xml/javax.xml.namespace.QName.<init>(QName.java:238)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:214)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162) */
        xmlSerializerProvider._serializeXmlNull(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method _serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_serializeXmlNull(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void test_serializeXmlNullThrowsNPE() throws IOException  {
        XmlRootNameLookup xmlRootNameLookup = new XmlRootNameLookup();
        XmlSerializerProvider xmlSerializerProvider = new XmlSerializerProvider(xmlRootNameLookup);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:208)
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._serializeXmlNull(XmlSerializerProvider.java:162) */
        xmlSerializerProvider._serializeXmlNull(null);
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._startRootArray(XmlSerializerProvider.java:174) */
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
    public void test_startRootArray_ThrowIllegalStateException_3() throws Exception  {
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
    public void test_startRootArray_ThrowIllegalStateException_4() throws Exception  {
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
    public void test_startRootArray_ThrowIllegalStateException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
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
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_startRootArray(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: xgen.writeStartObject();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_startRootArray_ThrowIllegalStateException_5() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        ToXmlGenerator toXmlGenerator = ((ToXmlGenerator) createInstance("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultXmlPrettyPrinter _cfgPrettyPrinter = ((DefaultXmlPrettyPrinter) createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        Object _objectIndenter = createInstance("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter$Lf2SpacesIndenter");
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(toXmlGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        xmlSerializerProvider._startRootArray(toXmlGenerator, null);
    }
    ///endregion
    
    ///region Errors report for _startRootArray
    
    public void test_startRootArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._wrapAsIOE
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): True}
 * @utbot.returnsFrom {@code return (IOException) e;}
 *  */
    @Test
    public void test_wrapAsIOE_EInstanceOfIOException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        JarException jarException = new JarException();
        
        JarException actual = ((JarException) xmlSerializerProvider._wrapAsIOE(((JsonGenerator) null), ((Exception) jarException)));
        
        JarException expected = ((JarException) createInstance("java.util.jar.JarException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 2;
        shortArray[1] = (short) 3;
        shortArray[2] = (short) 1;
        shortArray[3] = (short) 39;
        shortArray[4] = (short) 7;
        shortArray[6] = (short) 1;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 2;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 4;
        shortArray[16] = (short) 5;
        shortArray[17] = (short) 6;
        shortArray[18] = (short) 19;
        shortArray[19] = (short) 25;
        shortArray[20] = (short) 33;
        shortArray[21] = (short) 27;
        shortArray[22] = (short) 21;
        shortArray[23] = (short) 9;
        shortArray[25] = (short) 1;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 1;
        intArray[1] = 7733249;
        intArray[2] = 327680;
        intArray[3] = 4259846;
        intArray[4] = 1966086;
        intArray[5] = 2555904;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 1441792;
        intArray[19] = 14024704;
        intArray[20] = 1900544;
        intArray[21] = 11534336;
        intArray[22] = 6553600;
        intArray[23] = 2097152;
        intArray[24] = 917504;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = Class.forName("jdk.internal.reflect.NativeConstructorAccessorImpl");
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.DelegatingConstructorAccessorImpl");
        objectArray[2] = ((Object) class2);
        Class class3 = java.lang.reflect.Constructor.class;
        objectArray[3] = ((Object) class3);
        objectArray[4] = ((Object) class3);
        Class class4 = Class.forName("org.utbot.instrumentation.instrumentation.execution.constructors.InstrumentationContextAwareValueConstructor$call$2");
        objectArray[5] = ((Object) class4);
        objectArray[6] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class9);
        Class class10 = java.security.AccessController.class;
        objectArray[12] = ((Object) class10);
        Class class11 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class11);
        objectArray[14] = ((Object) class11);
        objectArray[15] = ((Object) class11);
        objectArray[16] = ((Object) class11);
        objectArray[17] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.instrumentation.execution.constructors.InstrumentationContextAwareValueConstructor.class;
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        objectArray[20] = ((Object) class12);
        objectArray[21] = ((Object) class12);
        objectArray[22] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.execution.phases.ValueConstructionPhase.class;
        objectArray[23] = ((Object) class13);
        Class class14 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$applyPreprocessing$constructedData$1");
        objectArray[24] = ((Object) class14);
        objectArray[25] = ((Object) class14);
        Class class15 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class17);
        objectArray[29] = ((Object) class17);
        Class class18 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class18);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2187082416048L;
        longArray[1] = 2187082456888L;
        longArray[2] = 2187082456888L;
        longArray[3] = 2187082558552L;
        longArray[4] = 2187082456888L;
        longArray[5] = 2187082407936L;
        longArray[6] = 2187082407936L;
        longArray[7] = 2187082407936L;
        longArray[8] = 2187082407936L;
        longArray[9] = 2187082407936L;
        longArray[10] = 2187082407936L;
        longArray[11] = 2187082415304L;
        longArray[12] = 2187082456048L;
        longArray[13] = 2188175515616L;
        longArray[14] = 2188175515616L;
        longArray[15] = 2188175515616L;
        longArray[16] = 2188175515616L;
        longArray[17] = 2188175515968L;
        longArray[18] = 2187083219600L;
        longArray[19] = 2188258745888L;
        longArray[20] = 2188266547056L;
        longArray[21] = 2188264200032L;
        longArray[22] = 2188170776576L;
        longArray[23] = 2188170514944L;
        longArray[24] = 2187082407936L;
        longArray[25] = 2187082407936L;
        longArray[26] = 2187082407936L;
        longArray[27] = 2187082407936L;
        longArray[28] = 2187082407936L;
        longArray[29] = 2187082407936L;
        longArray[30] = 2187082415304L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): False}
 * @utbot.executesCondition {@code (msg == null): False}
 * @utbot.returnsFrom {@code return new JsonMappingException(g, msg, e);}
 *  */
    @Test
    public void test_wrapAsIOE_MsgNotEqualsNull() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        String detailMessage = "";
        setField(numberFormatException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        JsonMappingException actual = ((JsonMappingException) xmlSerializerProvider._wrapAsIOE(((JsonGenerator) null), ((Exception) numberFormatException)));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 12;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 2;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 4;
        shortArray[16] = (short) 5;
        shortArray[17] = (short) 6;
        shortArray[18] = (short) 1;
        shortArray[19] = (short) 6;
        shortArray[21] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 24903680;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = XmlSerializerProvider.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2188264991968L;
        longArray[1] = 2187083133104L;
        longArray[2] = 2187082407936L;
        longArray[3] = 2187082407936L;
        longArray[4] = 2187082407936L;
        longArray[5] = 2188267472960L;
        longArray[6] = 2187082407936L;
        longArray[7] = 2187082407936L;
        longArray[8] = 2187082407936L;
        longArray[9] = 2187082407936L;
        longArray[10] = 2187082407936L;
        longArray[11] = 2187082415304L;
        longArray[12] = 2187082456048L;
        longArray[13] = 2188175515616L;
        longArray[14] = 2188175515616L;
        longArray[15] = 2188175515616L;
        longArray[16] = 2188175515616L;
        longArray[17] = 2188175515968L;
        longArray[18] = 2188175514784L;
        longArray[19] = 2188260763376L;
        longArray[20] = 2187082407936L;
        longArray[21] = 2188176145392L;
        longArray[22] = 2186145515120L;
        longArray[23] = 2188267472960L;
        longArray[24] = 2187082407936L;
        longArray[25] = 2187082407936L;
        longArray[26] = 2187082407936L;
        longArray[27] = 2187082407936L;
        longArray[28] = 2187082407936L;
        longArray[29] = 2187082415304L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", numberFormatException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): False}
 * @utbot.executesCondition {@code (msg == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return new JsonMappingException(g, msg, e);}
 *  */
    @Test
    public void test_wrapAsIOE_MsgEqualsNull() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        JsonMappingException actual = ((JsonMappingException) xmlSerializerProvider._wrapAsIOE(((JsonGenerator) null), ((Exception) cloneNotSupportedException)));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 12;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 2;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 4;
        shortArray[16] = (short) 5;
        shortArray[17] = (short) 6;
        shortArray[18] = (short) 1;
        shortArray[19] = (short) 6;
        shortArray[21] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 24903680;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = XmlSerializerProvider.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2188264991968L;
        longArray[1] = 2187083133104L;
        longArray[2] = 2187082407936L;
        longArray[3] = 2187082407936L;
        longArray[4] = 2187082407936L;
        longArray[5] = 2188267472960L;
        longArray[6] = 2187082407936L;
        longArray[7] = 2187082407936L;
        longArray[8] = 2187082407936L;
        longArray[9] = 2187082407936L;
        longArray[10] = 2187082407936L;
        longArray[11] = 2187082415304L;
        longArray[12] = 2187082456048L;
        longArray[13] = 2188175515616L;
        longArray[14] = 2188175515616L;
        longArray[15] = 2188175515616L;
        longArray[16] = 2188175515616L;
        longArray[17] = 2188175515968L;
        longArray[18] = 2188175514784L;
        longArray[19] = 2188260763376L;
        longArray[20] = 2187082407936L;
        longArray[21] = 2188176145392L;
        longArray[22] = 2186145515120L;
        longArray[23] = 2188267472960L;
        longArray[24] = 2187082407936L;
        longArray[25] = 2187082407936L;
        longArray[26] = 2187082407936L;
        longArray[27] = 2187082407936L;
        longArray[28] = 2187082407936L;
        longArray[29] = 2187082415304L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "[no message for java.lang.CloneNotSupportedException]";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", cloneNotSupportedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertNull(actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link XmlSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): False}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String msg = e.getMessage();
 *  */
    @Test
    public void test_wrapAsIOE_ThrowNullPointerException() throws Exception  {
        XmlSerializerProvider xmlSerializerProvider = ((XmlSerializerProvider) createInstance("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._wrapAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._wrapAsIOE(XmlSerializerProvider.java:238) */
        xmlSerializerProvider._wrapAsIOE(((JsonGenerator) null), ((Exception) null));
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
            com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider._rootNameFromConfig(XmlSerializerProvider.java:208) */
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
                
            java.lang.reflect.Method methodForGetDeclaredFields878872381429400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878872381429400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878872381437300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878872381429400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878872381437300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields878872383772200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878872383772200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878872383776500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878872383772200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878872383776500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields878872384275600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields878872384275600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass878872384278600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878872384275600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878872384278600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields878872384573800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878872384573800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878872384576900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878872384573800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878872384576900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

