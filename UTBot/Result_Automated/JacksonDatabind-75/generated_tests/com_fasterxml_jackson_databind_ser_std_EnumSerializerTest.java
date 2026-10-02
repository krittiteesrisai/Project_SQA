package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import java.util.concurrent.TimeUnit;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.annotation.RetentionPolicy;
import java.time.temporal.ChronoUnit;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.MapType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import java.util.EnumMap;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_ser_std_EnumSerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(java.lang.Enum, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:821)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:626)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) timeUnit), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        RetentionPolicy retentionPolicy = RetentionPolicy.SOURCE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 10);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberOutput.outputInt(NumberOutput.java:71)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:635)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) retentionPolicy), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483644);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483638);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483644 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:642)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:628)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) timeUnit), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:821)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:626)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) timeUnit), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_2() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        RetentionPolicy retentionPolicy = RetentionPolicy.CLASS;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) retentionPolicy), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link java.lang.Enum#toString()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeString(en.toString());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_5() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 8192);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:138) */
        enumSerializer.serialize(((Enum) chronoUnit), ((JsonGenerator) null), ((SerializerProvider) impl));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) null), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: serializers.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:137) */
        enumSerializer.serialize(((Enum) null), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_3() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) null), ((JsonGenerator) null), ((SerializerProvider) impl));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeString(en.toString());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_4() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 8192);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:138) */
        enumSerializer.serialize(((Enum) null), ((JsonGenerator) null), ((SerializerProvider) impl));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.EnumValues#serializedValueFor(java.lang.Enum)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeString(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeString(_values.serializedValueFor(en));
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_7() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        EnumValues _values = ((EnumValues) createInstance("com.fasterxml.jackson.databind.util.EnumValues"));
        com.fasterxml.jackson.core.SerializableString[] _textual = {null};
        setField(_values, "com.fasterxml.jackson.databind.util.EnumValues", "_textual", _textual);
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        RetentionPolicy retentionPolicy = RetentionPolicy.SOURCE;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:141) */
        enumSerializer.serialize(((Enum) retentionPolicy), ((JsonGenerator) null), ((SerializerProvider) impl));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeString(_values.serializedValueFor(en));
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_6() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:141) */
        enumSerializer.serialize(((Enum) null), ((JsonGenerator) null), ((SerializerProvider) impl));
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#serialize(java.lang.Enum,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeNumber(en.ordinal());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_8() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        RetentionPolicy retentionPolicy = RetentionPolicy.CLASS;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483636);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:642)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:628)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.serialize(EnumSerializer.java:133) */
        enumSerializer.serialize(((Enum) retentionPolicy), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method construct(java.lang.Class, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.annotation.JsonFormat$Value)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#construct(java.lang.Class,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.annotation.JsonFormat.Value)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.EnumValues#constructFromName(com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: EnumValues v = EnumValues.constructFromName(config, (Class<Enum<?>>) enumClass);
 *  */
    @Test
    public void testConstruct_ThrowNullPointerException() {
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.EnumValues.constructFromName(EnumValues.java:47)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct(EnumSerializer.java:85) */
        EnumSerializer.construct(class1, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method construct(java.lang.Class, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.annotation.JsonFormat$Value)
    
    @Test
    public void testConstruct1() throws Exception  {
        Class class1 = Object.class;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.EnumValues.constructFromName(EnumValues.java:47)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct(EnumSerializer.java:85) */
        EnumSerializer.construct(class1, serializationConfig, basicBeanDescription, value);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode("integer", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            Boolean _serializeAsIndex = true;
            setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
            
            ObjectNode actual = ((ObjectNode) enumSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "integer";
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
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return createSchemaNode("integer", true);}
 *  */
    @Test
    public void testGetSchema_ReturnCreateSchemaNode_1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) enumSerializer.getSchema(impl, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "integer";
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
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createSchemaNode(java.lang.String,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createSchemaNode(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return objectNode;}
 *  */
    @Test
    public void testGetSchema_EnumSerializerCreateSchemaNode() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 2);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ObjectNode actual = ((ObjectNode) enumSerializer.getSchema(impl, null));
            
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    @Test
    public void testGetSchema1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            Boolean _serializeAsIndex = false;
            setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
            
            ObjectNode actual = ((ObjectNode) enumSerializer.getSchema(null, null));
            
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
    
    ///region OTHER: ERROR SUITE for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    @Test
    public void testGetSchema2() throws Throwable  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.getSchema] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.isEnumType(JavaType.java:292)
                com.fasterxml.jackson.databind.ser.std.EnumSerializer.getSchema(EnumSerializer.java:159) */
            Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class mapTypeType = Class.forName("java.lang.reflect.Type");
            Method getSchemaMethod = enumSerializerClazz.getDeclaredMethod("getSchema", implType, mapTypeType);
            getSchemaMethod.setAccessible(true);
            java.lang.Object[] getSchemaMethodArguments = new java.lang.Object[2];
            getSchemaMethodArguments[0] = impl;
            getSchemaMethodArguments[1] = mapType;
            try {
                getSchemaMethod.invoke(enumSerializer, getSchemaMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        enumSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_Return() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = true;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        enumSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        enumSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_Return_1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 16384);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base(impl);
        
        enumSerializer.acceptJsonFormatVisitor(base, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SerializerProvider serializers = visitor.getProvider();
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.acceptJsonFormatVisitor(EnumSerializer.java:173) */
        enumSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer._serializeAsIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _serializeAsIndex(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_serializeAsIndex(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_serializeAsIndex != null): True}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return _serializeAsIndex.booleanValue();}
 *  */
    @Test
    public void test_serializeAsIndex__serializeAsIndexNotEqualsNull() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Boolean _serializeAsIndex = false;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        boolean actual = enumSerializer._serializeAsIndex(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_serializeAsIndex(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_serializeAsIndex != null): False}
 * @utbot.returnsFrom {@code return serializers.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);}
 *  */
    @Test
    public void test_serializeAsIndex__serializeAsIndexEqualsNull() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = enumSerializer._serializeAsIndex(impl);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_serializeAsIndex(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_serializeAsIndex != null): False}
 * @utbot.returnsFrom {@code return serializers.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);}
 *  */
    @Test
    public void test_serializeAsIndex__serializeAsIndexEqualsNull_1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 1);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = enumSerializer._serializeAsIndex(impl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeAsIndex(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_serializeAsIndex(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_serializeAsIndex != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return serializers.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
 *  */
    @Test
    public void test_serializeAsIndex_ThrowNullPointerException() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer._serializeAsIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer._serializeAsIndex(EnumSerializer.java:209) */
        enumSerializer._serializeAsIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_PropertyEqualsNull() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        
        EnumSerializer actual = ((EnumSerializer) enumSerializer.createContextual(null, null));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property != null): True}
 * @utbot.executesCondition {@code (serializeAsIndex != _serializeAsIndex): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_SerializeAsIndexEquals_serializeAsIndex() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Class _handledType = Object.class;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class initialEnumSerializer_handledType = enumSerializer._handledType;
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class enumSerializer_handledType = enumSerializer._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalEnumSerializer_handledType = enumSerializer._handledType;
        
        assertFalse(initialEnumSerializer_handledType == finalEnumSerializer_handledType);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property != null): True}
 * @utbot.executesCondition {@code (serializeAsIndex != _serializeAsIndex): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_SerializeAsIndexEquals_serializeAsIndex_1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(multiView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.SCALAR;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(multiView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (property != null): True}
 * @utbot.executesCondition {@code (serializeAsIndex != _serializeAsIndex): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_SerializeAsIndexEquals_serializeAsIndex_2() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Boolean serializeAsIndex = _isShapeWrittenUsingIndex(property.getType().getRawClass(), format, false);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Boolean serializeAsIndex = _isShapeWrittenUsingIndex(property.getType().getRawClass(), format, false);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_4() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        AttributePropertyWriter _property = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_property", _property);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (serializeAsIndex != _serializeAsIndex): False}
 * @utbot.returnsFrom {@code return this;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.STRING;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.<init>(EnumSerializer.java:66)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:106) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (serializeAsIndex != _serializeAsIndex): False}
 * @utbot.returnsFrom {@code return this;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NATURAL;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(singleView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.<init>(EnumSerializer.java:66)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:106) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (serializeAsIndex != _serializeAsIndex): False}
 * @utbot.returnsFrom {@code return this;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_3() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(multiView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER_INT;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(multiView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.<init>(EnumSerializer.java:66)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:106) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    @Test
    public void testCreateContextual2() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        
        JsonFormat.Value initialMapProperty_propertyFormat = ((JsonFormat.Value) getFieldValue(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
        JsonFormat.Value finalMapProperty_propertyFormat = ((JsonFormat.Value) getFieldValue(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        assertFalse(initialMapProperty_propertyFormat == finalMapProperty_propertyFormat);
    }
    
    @Test
    public void testCreateContextual3() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        AttributePropertyWriter _property = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_property, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_property", _property);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(class1, mutableConfigOverride);
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        
        JsonFormat.Value initialMapProperty_propertyFormat = ((JsonFormat.Value) getFieldValue(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumValues actual_values = actual._values;
        assertNull(actual_values);
        
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertNull(actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
        JsonFormat.Value finalMapProperty_propertyFormat = ((JsonFormat.Value) getFieldValue(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        assertFalse(initialMapProperty_propertyFormat == finalMapProperty_propertyFormat);
    }
    
    @Test
    public void testCreateContextual5() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        EnumValues _values = ((EnumValues) createInstance("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, beanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = beanPropertyWriter;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumSerializer expected = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Boolean _serializeAsIndex = true;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        EnumValues expected_values = expected._values;
        EnumValues actual_values = actual._values;
        Class actual_values_enumClass = ((Class) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_enumClass"));
        assertNull(actual_values_enumClass);
        
        java.lang.Enum[] actual_values_values = ((java.lang.Enum[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_values"));
        assertNull(actual_values_values);
        
        com.fasterxml.jackson.core.SerializableString[] actual_values_textual = ((com.fasterxml.jackson.core.SerializableString[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_textual"));
        assertNull(actual_values_textual);
        
        EnumMap actual_values_asMap = ((EnumMap) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_asMap"));
        assertNull(actual_values_asMap);
        
        Boolean expected_serializeAsIndex = expected._serializeAsIndex;
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertEquals(expected_serializeAsIndex, actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    @Test
    public void testCreateContextual6() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        EnumValues _values = ((EnumValues) createInstance("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Class _handledType = Object.class;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(multiView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER_FLOAT;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(multiView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class initialEnumSerializer_handledType = enumSerializer._handledType;
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumSerializer expected = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Boolean _serializeAsIndex = true;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        EnumValues expected_values = expected._values;
        EnumValues actual_values = actual._values;
        Class actual_values_enumClass = ((Class) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_enumClass"));
        assertNull(actual_values_enumClass);
        
        java.lang.Enum[] actual_values_values = ((java.lang.Enum[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_values"));
        assertNull(actual_values_values);
        
        com.fasterxml.jackson.core.SerializableString[] actual_values_textual = ((com.fasterxml.jackson.core.SerializableString[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_textual"));
        assertNull(actual_values_textual);
        
        EnumMap actual_values_asMap = ((EnumMap) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_asMap"));
        assertNull(actual_values_asMap);
        
        Boolean expected_serializeAsIndex = expected._serializeAsIndex;
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertEquals(expected_serializeAsIndex, actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
        Class finalEnumSerializer_handledType = enumSerializer._handledType;
        
        assertFalse(initialEnumSerializer_handledType == finalEnumSerializer_handledType);
    }
    
    @Test
    public void testCreateContextual7() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        EnumValues _values = ((EnumValues) createInstance("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.STRING;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, beanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = beanPropertyWriter;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumSerializer expected = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Boolean _serializeAsIndex = false;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        EnumValues expected_values = expected._values;
        EnumValues actual_values = actual._values;
        Class actual_values_enumClass = ((Class) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_enumClass"));
        assertNull(actual_values_enumClass);
        
        java.lang.Enum[] actual_values_values = ((java.lang.Enum[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_values"));
        assertNull(actual_values_values);
        
        com.fasterxml.jackson.core.SerializableString[] actual_values_textual = ((com.fasterxml.jackson.core.SerializableString[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_textual"));
        assertNull(actual_values_textual);
        
        EnumMap actual_values_asMap = ((EnumMap) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_asMap"));
        assertNull(actual_values_asMap);
        
        Boolean expected_serializeAsIndex = expected._serializeAsIndex;
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertEquals(expected_serializeAsIndex, actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    @Test
    public void testCreateContextual8() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        EnumValues _values = ((EnumValues) createInstance("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER_INT;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, beanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = beanPropertyWriter;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumSerializer expected = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Boolean _serializeAsIndex = true;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        EnumValues expected_values = expected._values;
        EnumValues actual_values = actual._values;
        Class actual_values_enumClass = ((Class) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_enumClass"));
        assertNull(actual_values_enumClass);
        
        java.lang.Enum[] actual_values_values = ((java.lang.Enum[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_values"));
        assertNull(actual_values_values);
        
        com.fasterxml.jackson.core.SerializableString[] actual_values_textual = ((com.fasterxml.jackson.core.SerializableString[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_textual"));
        assertNull(actual_values_textual);
        
        EnumMap actual_values_asMap = ((EnumMap) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_asMap"));
        assertNull(actual_values_asMap);
        
        Boolean expected_serializeAsIndex = expected._serializeAsIndex;
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertEquals(expected_serializeAsIndex, actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    @Test
    public void testCreateContextual9() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        EnumValues _values = ((EnumValues) createInstance("com.fasterxml.jackson.databind.util.EnumValues"));
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        MapType _declaredType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(multiView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NATURAL;
        setField(_propertyFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(multiView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        EnumSerializer actual = ((EnumSerializer) createContextualMethod.invoke(enumSerializer, createContextualMethodArguments));
        
        EnumSerializer expected = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_values", _values);
        Boolean _serializeAsIndex = false;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.EnumSerializer", "_serializeAsIndex", _serializeAsIndex);
        
        EnumValues expected_values = expected._values;
        EnumValues actual_values = actual._values;
        Class actual_values_enumClass = ((Class) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_enumClass"));
        assertNull(actual_values_enumClass);
        
        java.lang.Enum[] actual_values_values = ((java.lang.Enum[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_values"));
        assertNull(actual_values_values);
        
        com.fasterxml.jackson.core.SerializableString[] actual_values_textual = ((com.fasterxml.jackson.core.SerializableString[]) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_textual"));
        assertNull(actual_values_textual);
        
        EnumMap actual_values_asMap = ((EnumMap) getFieldValue(actual_values, "com.fasterxml.jackson.databind.util.EnumValues", "_asMap"));
        assertNull(actual_values_asMap);
        
        Boolean expected_serializeAsIndex = expected._serializeAsIndex;
        Boolean actual_serializeAsIndex = actual._serializeAsIndex;
        assertEquals(expected_serializeAsIndex, actual_serializeAsIndex);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual10() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride1 = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(class1, mutableConfigOverride1);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) annotatedMethod), ((Object) null));
        
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual11() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual12() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_property", _property);
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mapProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, mapPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = mapProperty;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual13() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Class _handledType = Object.class;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual14() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Class _handledType = Object.class;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(null, mutableConfigOverride);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual15() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Class _handledType = Object.class;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(_handledType, mutableConfigOverride);
        _overrides.put(_handledType, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual16() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            Class _handledType = Object.class;
            setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
            _overrides.put(_handledType, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BeanProperty.Std std = new BeanProperty.Std(null, null, null, null, null, null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
            enumSerializer.createContextual(impl, std);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual17() throws Throwable  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY1 = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            JsonFormat.Features empty1 = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty1);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            Class _handledType = Object.class;
            setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            _overrides.put(null, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
            Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            try {
                createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY1);
        }
    }
    
    @Test
    public void testCreateContextual18() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
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
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual19() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        Class _handledType = Object.class;
        setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(_handledType, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) annotatedConstructor), ((Object) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:425)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:426)
            com.fasterxml.jackson.databind.BeanProperty$Std.findPropertyFormat(BeanProperty.java:272)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.findFormatOverrides(StdSerializer.java:461)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:100) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual20() throws Throwable  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
        Class enumSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = enumSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(enumSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual21() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
            Class _handledType = Object.class;
            setField(enumSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
            _overrides.put(_handledType, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            AnnotatedField annotatedField = new AnnotatedField(null, null, null);
            BeanProperty.Std std = new BeanProperty.Std(null, null, null, null, annotatedField, null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:103) */
            enumSerializer.createContextual(impl, std);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer.getEnumValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEnumValues()
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#getEnumValues()}
 * @utbot.returnsFrom {@code return _values;}
 *  */
    @Test
    public void testGetEnumValues_Return_values() throws Exception  {
        EnumSerializer enumSerializer = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        
        EnumValues actual = enumSerializer.getEnumValues();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isShapeWrittenUsingIndex(java.lang.Class, com.fasterxml.jackson.annotation.JsonFormat$Value, boolean)
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): True}
 * @utbot.executesCondition {@code (shape == null): True}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_FormatEqualsNull() {
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.executesCondition {@code (shape == Shape.ANY): True}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_ShapeEqualsShapeANY() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(value, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.executesCondition {@code (shape == Shape.ANY): False}
 * @utbot.executesCondition {@code (shape == Shape.SCALAR): True}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_ShapeEqualsShapeSCALAR() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.SCALAR;
        setField(value, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.executesCondition {@code (shape == Shape.ANY): False}
 * @utbot.executesCondition {@code (shape == Shape.SCALAR): False}
 * @utbot.executesCondition {@code (shape == Shape.STRING): False}
 * @utbot.executesCondition {@code (shape == Shape.NATURAL): False}
 * @utbot.executesCondition {@code (shape.isNumeric()): True}
 * @utbot.executesCondition {@code (shape == Shape.ARRAY): False}
 * @utbot.executesCondition {@code (fromClass): True}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_FromClass() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NATURAL;
        setField(value, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.executesCondition {@code (shape == Shape.ANY): False}
 * @utbot.executesCondition {@code (shape == Shape.SCALAR): False}
 * @utbot.executesCondition {@code (shape == Shape.STRING): False}
 * @utbot.executesCondition {@code (shape == Shape.NATURAL): False}
 * @utbot.executesCondition {@code (shape.isNumeric()): True}
 * @utbot.executesCondition {@code (shape == Shape.ARRAY): True}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_ShapeEqualsShapeARRAY() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ARRAY;
        setField(value, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.executesCondition {@code (shape == Shape.ANY): False}
 * @utbot.executesCondition {@code (shape == Shape.SCALAR): False}
 * @utbot.executesCondition {@code (shape == Shape.STRING): False}
 * @utbot.executesCondition {@code (shape == Shape.NATURAL): False}
 * @utbot.executesCondition {@code (shape.isNumeric()): False}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_NotShapeIsNumeric() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.NUMBER;
        setField(value, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.executesCondition {@code (shape == Shape.ANY): False}
 * @utbot.executesCondition {@code (shape == Shape.SCALAR): False}
 * @utbot.executesCondition {@code (shape == Shape.STRING): True}
 * @utbot.returnsFrom {@code return Boolean.FALSE;}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_ShapeEqualsShapeSTRING() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.STRING;
        setField(value, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
        Boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link EnumSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.EnumSerializer#_isShapeWrittenUsingIndex(java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat.Value,boolean)}
 * @utbot.executesCondition {@code ((format == null)): False}
 * @utbot.executesCondition {@code (shape == null): True}
 *  */
    @Test
    public void test_isShapeWrittenUsingIndex_ShapeEqualsNull() throws Exception  {
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        
        Boolean actual = EnumSerializer._isShapeWrittenUsingIndex(null, value, false);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1082829873994699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1082829873994699.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1082829874002100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082829873994699.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082829874002100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1082829874643500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082829874643500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082829874647400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082829874643500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082829874647400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1082829875142300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082829875142300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082829875145400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082829875142300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082829875145400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1082829875340899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082829875340899.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082829875342899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082829875340899.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082829875342899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

